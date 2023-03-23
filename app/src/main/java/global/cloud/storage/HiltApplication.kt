package global.cloud.storage

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatDelegate
import com.orhanobut.hawk.Hawk
import dagger.hilt.android.HiltAndroidApp
import global.cloud.storage.ui.data.Constants
import global.cloud.storage.utils.PrefsUtils

@HiltAndroidApp
class HiltApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        Hawk.init(this)
            .build()
        if (!PrefsUtils().checkKey(Constants.DARK_MODE)) {
            checkDarkMode(this)
        }
    }

    private fun checkDarkMode(context: Context) {
        val nightModeFlags: Int = context.resources.configuration.uiMode and
                Configuration.UI_MODE_NIGHT_MASK
        when (nightModeFlags) {
            Configuration.UI_MODE_NIGHT_YES -> {
                PrefsUtils().saveToPrefs(Constants.DARK_MODE, true)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            Configuration.UI_MODE_NIGHT_NO -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                PrefsUtils().saveToPrefs(Constants.DARK_MODE, false)
            }
            Configuration.UI_MODE_NIGHT_UNDEFINED -> {
                PrefsUtils().saveToPrefs(Constants.DARK_MODE, false)
            }
        }

    }

    companion object {
        private var instance: HiltApplication? = null
        fun getInstance(): HiltApplication? {
            if (instance == null) {
                synchronized(HiltApplication::class.java) {
                    if (instance == null) instance = HiltApplication()
                }
            }
            // Return the instance
            return instance
        }
    }

}