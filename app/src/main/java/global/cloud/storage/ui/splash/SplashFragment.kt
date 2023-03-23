package global.cloud.storage.ui.splash

import android.os.Bundle
import android.util.Log
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import androidx.navigation.fragment.findNavController
import com.google.android.play.core.appupdate.AppUpdateManager
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.UpdateAvailability
import dagger.hilt.android.AndroidEntryPoint
import global.cloud.storage.R
import global.cloud.storage.base.BaseFragment
import global.cloud.storage.ui.data.Constants
import global.cloud.storage.databinding.ActivitySplashBinding
import global.cloud.storage.utils.DialogUtils
import global.cloud.storage.utils.PrefsUtils
import javax.inject.Inject

@AndroidEntryPoint
class SplashFragment : SplashDialogCallback,
    BaseFragment<ActivitySplashBinding, SplashViewModel>() {

    @Inject
    lateinit var prefsUtils: PrefsUtils
    private val TAG = SplashFragment::class.simpleName
    private val appUpdate: AppUpdateManager by lazy { AppUpdateManagerFactory.create(requireActivity()) }
    override val viewModel: SplashViewModel by hiltNavGraphViewModels(R.id.main_navigation)
    override val layoutId: Int = R.layout.activity_splash

    override fun onReady(savedInstanceState: Bundle?) {
        checkUpdate()

        binding.btnProceed.setOnClickListener {
            if (!prefsUtils.checkKey(Constants.SHOW_PERMISSION_DIALOG)) {
                DialogUtils.privacyPolicyDialog(requireContext())
            } else {
                proceedToNextScreen()
            }
        }

    }

    override fun onAgreeClick() {
        prefsUtils.saveToPrefs(Constants.SHOW_PERMISSION_DIALOG, false)
        proceedToNextScreen()
    }

    private fun proceedToNextScreen() {
        findNavController().popBackStack()
        findNavController().navigate(R.id.dashboardFragment)
    }

    private fun checkUpdate() {
        appUpdate.appUpdateInfo.addOnSuccessListener { updateInfo ->
            if (updateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE
                && updateInfo.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)
            ) {
                appUpdate.startUpdateFlowForResult(
                    updateInfo,
                    AppUpdateType.IMMEDIATE,
                    requireActivity(),
                    Constants.UPDATE_REQUEST_CODE
                )
            }
        }.addOnFailureListener {
            Log.e(TAG, "failed to check for update: $it")
        }
    }

    override fun onResume() {
        super.onResume()
        inProgressUpdate()
    }

    private fun inProgressUpdate() {
        appUpdate.appUpdateInfo.addOnSuccessListener { updateInfo ->
            if (updateInfo.updateAvailability() == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS) {
                appUpdate.startUpdateFlowForResult(
                    updateInfo,
                    AppUpdateType.IMMEDIATE,
                    requireActivity(),
                    Constants.UPDATE_REQUEST_CODE
                )
            }
        }
    }

}