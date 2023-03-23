package global.cloud.storage.ui.dashboard

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.Settings
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.net.toUri
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import dagger.hilt.android.AndroidEntryPoint
import global.cloud.storage.R
import global.cloud.storage.base.BaseFragment
import androidx.navigation.fragment.findNavController
import com.permissionx.guolindev.PermissionX
import global.cloud.storage.ui.data.listeners.AllFilesPermissionDialogCallback
import global.cloud.storage.ui.data.listeners.ExitDialogCallback
import global.cloud.storage.ui.data.listeners.OpenSettingsDialogCallback
import global.cloud.storage.ui.data.listeners.PermissionDialogCallback
import global.cloud.storage.databinding.ActivityDashboardBinding
import global.cloud.storage.utils.*
import global.cloud.storage.utils.extensions.showToast
import javax.inject.Inject

@AndroidEntryPoint
class DashboardFragment : PermissionDialogCallback, BaseFragment<ActivityDashboardBinding, DashboardViewModel>(),
    AllFilesPermissionDialogCallback, OpenSettingsDialogCallback {

    @Inject
    lateinit var permissionUtils: PermissionUtils

    @Inject
    lateinit var prefsUtils: PrefsUtils

    @Inject
    lateinit var storageUtils: StorageUtils

    @Inject
    lateinit var fileUtils: FileUtils

    private lateinit var nextUri: Uri

    override val viewModel: DashboardViewModel by hiltNavGraphViewModels(R.id.main_navigation)

    override val layoutId: Int = R.layout.activity_dashboard


    private val askForPermission =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) {
            if (it[Manifest.permission.WRITE_EXTERNAL_STORAGE] == true
                && it[Manifest.permission.READ_EXTERNAL_STORAGE] == true
            ) {
                showMediaCount()
            } else if (it[Manifest.permission.READ_CONTACTS] == true) {
                showContactsCount()
            } else if (it[Manifest.permission.WRITE_EXTERNAL_STORAGE] != true
                && it[Manifest.permission.READ_EXTERNAL_STORAGE] != true) {
                DialogUtils.storageNotReadyDialog(requireActivity(), this)
            }
        }

    private val goToSettingsRequest =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {

            }
        }

    private fun showMediaCount() {
        permissionUtils.checkStoragePermissions {
            if (it) {
                binding.tvAppsSize.text = fileUtils.allAppsSize().toString()
                binding.tvVideosSize.text = fileUtils.allVideosSize().toString()
                binding.tvAudiosSize.text = fileUtils.allAudiosSize().toString()
                binding.tvImagesSize.text = fileUtils.allImagesSize().toString()
                binding.tvDocsSize.text = fileUtils.allDocsSize().toString()
            }
        }
    }

    private fun showContactsCount() {
        if (permissionUtils.checkForPermissions(Manifest.permission.READ_CONTACTS)) {
            binding.tvContactsSize.text = fileUtils.allContactsSize().toString()
        }
    }

    override fun onResume() {
        super.onResume()
        showMediaCount()
        if (permissionUtils.checkForPermissions(Manifest.permission.READ_CONTACTS)) {
            showContactsCount()
        }
    }

    override fun onReady(savedInstanceState: Bundle?) {
        binding.progressBar.max = storageUtils.getMaxValue()
        binding.progressBar.progress = storageUtils.getConsumedValue()
        binding.tvAvailableStorage.text = storageUtils.getAvailableInternalMemorySize()
        binding.tvTotal.text = storageUtils.getTotalInternalMemorySize()
        binding.tvUsed.text = storageUtils.usedMemorySize().toString()
        binding.tvSubTitle.text = resources.getString(R.string.phone_storage)

        if (
            permissionUtils.checkForPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE) &&
            permissionUtils.checkForPermissions(Manifest.permission.READ_EXTERNAL_STORAGE)

        ) {
            showMediaCount()
        } else if (
            permissionUtils.checkForPermissions(Manifest.permission.READ_CONTACTS)
        ) {
            showContactsCount()
        } else {
            askForPermission.launch(
                arrayOf(
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.READ_CONTACTS
                )
            )
        }

        binding.cvApps.setOnClickListener {
            nextUri = DeepLinks.APPS_SELECTION.toUri()
            permissionUtils.checkStoragePermissions {
                if (it) {
                    findNavController().navigate(nextUri)
                } else {
                    DialogUtils.permissionDetailDialog(requireActivity(), this)
                }
            }
        }

        requireActivity()
            .onBackPressedDispatcher
            .addCallback(this, object : OnBackPressedCallback(true), ExitDialogCallback {
                override fun handleOnBackPressed() {
                    DialogUtils.exitDialog(requireActivity(), this)
                }

                override fun onExitClick() {
                    requireActivity().finish()
                }
            })
    }

    private fun grantPermissions(toUri: Uri? = null){
        PermissionX.init(this)
            .permissions(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.READ_CONTACTS)
            .onExplainRequestReason { scope, deniedList ->

            }
            .onForwardToSettings { scope, deniedList ->
                DialogUtils.storageNotReadyDialog(requireActivity(), this)
            }
            .request { allGranted, grantedList, deniedList ->
                if (allGranted) {
                    activity?.showToast(activity?.resources?.getString(R.string.all_permissions_granted).toString())
                    toUri?.let {
                        if (it.toString() != "http") {
                            findNavController().navigate(it)
                        } else {
                            DialogUtils.permissionAllFilesDetailDialog(requireActivity(), this)
                        }
                    } ?: run {
                        if (Environment.isExternalStorageManager()) {
                            findNavController().navigate(DeepLinks.DOCS_SELECTION.toUri())
                        } else {
                            DialogUtils.permissionAllFilesDetailDialog(requireActivity(), this)
                        }
                    }
                } else {
                    DialogUtils.storageNotReadyDialog(requireActivity(), this)
                }
            }
    }

    override fun onAgreeClick() {
        grantPermissions(nextUri)
    }

    override fun onAllFilesAgreeClick() {
        val intent = Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION)
        val uri = Uri.fromParts(resources.getString(R.string.package_), requireActivity().packageName, null)
        intent.data = uri
        startActivity(intent)
    }

    override fun onOpenSettingsClick() {
        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
        val uri = Uri.fromParts("package", requireActivity().packageName, null)
        intent.data = uri
        goToSettingsRequest.launch(intent)
    }


}