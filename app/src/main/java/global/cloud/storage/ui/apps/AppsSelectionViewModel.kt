package global.cloud.storage.ui.apps

import android.app.Application
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import global.cloud.storage.base.BaseViewModel
import global.cloud.storage.models.AppsModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import java.io.File
import javax.inject.Inject

@HiltViewModel
class AppsSelectionViewModel @Inject constructor(val app: Application): BaseViewModel() {

    private val _connectionError = MutableLiveData<Boolean>(false)
    val connectionError: LiveData<Boolean> = _connectionError

    var selectAllItems: Boolean = false
    @Inject
    lateinit var retrofitBuilder: Retrofit

    val myUserApps = mutableListOf<AppsModel>()

    private val _appListObservable = MutableLiveData<List<AppsModel>>()
    val appListObservable: LiveData<List<AppsModel>> = _appListObservable

    fun setSelectAll(isSelect: Boolean) {
        _appListObservable.postValue(myUserApps.map { it.copy(isSelected = isSelect) })
    }

    fun selectApp(item: AppsModel) {
        val update = _appListObservable.value?.map {
            if (it.packageName == item.packageName) it.copy(isSelected = !item.isSelected)
            else it.copy()
        }
        _appListObservable.postValue(update!!)
    }

    suspend fun getInstalledApps(context: Context) {

        val userApps: ArrayList<PackageInfo?> = ArrayList()
        val packs: List<PackageInfo> = context.packageManager.getInstalledPackages(0)

        userApps.addAll(packs.filter {
            !isSystemPackage(it) && !isDebuggable(it)
        }.map { it })

        viewModelScope.launch(Dispatchers.Default) {
            launch {

                processUserApps(userApps, context.packageManager, context)
            }

        }

    }

    private fun processUserApps(
        userApps: MutableList<PackageInfo?>,
        pm: PackageManager,
        context: Context
    ) {
        userApps.forEach { i ->
            val p = i
            p?.let {
                val appName = p.applicationInfo.loadLabel(context.packageManager).toString()
                val packagesName = p.packageName
                val installationTime = p.firstInstallTime
                val file = File(p.applicationInfo.publicSourceDir)
                val size: Long = file.length()

                if (context.packageName != packagesName) {

                    myUserApps += AppsModel(appName, size, packagesName, file.path, installationTime)
                }

            }

        }
        _appListObservable.postValue(myUserApps)
    }


    private fun isSystemPackage(pkgInfo: PackageInfo): Boolean {
        return pkgInfo.applicationInfo.flags and ApplicationInfo.FLAG_SYSTEM != 0
    }

    private fun isDebuggable(pkgInfo: PackageInfo): Boolean {
        return pkgInfo.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0
    }

}