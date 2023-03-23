package global.cloud.storage.ui.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00048TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006%"}, d2 = {"Lglobal/cloud/storage/ui/splash/SplashFragment;", "Lglobal/cloud/storage/ui/splash/SplashDialogCallback;", "Lglobal/cloud/storage/base/BaseFragment;", "Lglobal/cloud/storage/databinding/ActivitySplashBinding;", "Lglobal/cloud/storage/ui/splash/SplashViewModel;", "()V", "TAG", "", "appUpdate", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "getAppUpdate", "()Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdate$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "prefsUtils", "Lglobal/cloud/storage/utils/PrefsUtils;", "getPrefsUtils", "()Lglobal/cloud/storage/utils/PrefsUtils;", "setPrefsUtils", "(Lglobal/cloud/storage/utils/PrefsUtils;)V", "viewModel", "getViewModel", "()Lglobal/cloud/storage/ui/splash/SplashViewModel;", "viewModel$delegate", "checkUpdate", "", "inProgressUpdate", "onAgreeClick", "onReady", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "proceedToNextScreen", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class SplashFragment extends global.cloud.storage.base.BaseFragment<global.cloud.storage.databinding.ActivitySplashBinding, global.cloud.storage.ui.splash.SplashViewModel> implements global.cloud.storage.ui.splash.SplashDialogCallback {
    @javax.inject.Inject
    public global.cloud.storage.utils.PrefsUtils prefsUtils;
    private final java.lang.String TAG = null;
    private final kotlin.Lazy appUpdate$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private final int layoutId = global.cloud.storage.R.layout.activity_splash;
    
    public SplashFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.PrefsUtils getPrefsUtils() {
        return null;
    }
    
    public final void setPrefsUtils(@org.jetbrains.annotations.NotNull
    global.cloud.storage.utils.PrefsUtils p0) {
    }
    
    private final com.google.android.play.core.appupdate.AppUpdateManager getAppUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected global.cloud.storage.ui.splash.SplashViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    protected void onReady(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onAgreeClick() {
    }
    
    private final void proceedToNextScreen() {
    }
    
    private final void checkUpdate() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    private final void inProgressUpdate() {
    }
}