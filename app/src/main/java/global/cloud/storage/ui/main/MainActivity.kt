package global.cloud.storage.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import global.cloud.storage.R
import global.cloud.storage.ui.data.Constants
import global.cloud.storage.databinding.ActivityMainBinding
import global.cloud.storage.utils.PrefsUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var prefsUtils: PrefsUtils
    private lateinit var navController: NavController
    lateinit var mainActivityMainBinding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel = MainViewModel()

        if (prefsUtils.checkKey(Constants.DARK_MODE)) {
            val darkModeStatus = prefsUtils.getFromPrefsWithDefault(Constants.DARK_MODE, false)
            if (darkModeStatus) {
                CoroutineScope(Dispatchers.Main).launch {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
            } else {
                CoroutineScope(Dispatchers.Main).launch {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
            }
        }

        installSplashScreen().apply {
            setVisible(
                mainViewModel.isLoading.value
            )
        }

        mainActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityMainBinding.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()

    }
}