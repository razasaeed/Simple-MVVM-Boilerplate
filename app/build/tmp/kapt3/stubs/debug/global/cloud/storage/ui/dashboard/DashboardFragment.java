package global.cloud.storage.ui.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u0014\u00102\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u00105\u001a\u000203H\u0016J\b\u00106\u001a\u000203H\u0016J\b\u00107\u001a\u000203H\u0016J\u0012\u00108\u001a\u0002032\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\b\u0010;\u001a\u000203H\u0016J\b\u0010<\u001a\u000203H\u0002J\b\u0010=\u001a\u000203H\u0002R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001b\u0010-\u001a\u00020\u00048TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/\u00a8\u0006>"}, d2 = {"Lglobal/cloud/storage/ui/dashboard/DashboardFragment;", "Lglobal/cloud/storage/data/listeners/PermissionDialogCallback;", "Lglobal/cloud/storage/base/BaseFragment;", "Lglobal/cloud/storage/databinding/ActivityDashboardBinding;", "Lglobal/cloud/storage/ui/dashboard/DashboardViewModel;", "Lglobal/cloud/storage/data/listeners/AllFilesPermissionDialogCallback;", "Lglobal/cloud/storage/data/listeners/OpenSettingsDialogCallback;", "()V", "askForPermission", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "fileUtils", "Lglobal/cloud/storage/utils/FileUtils;", "getFileUtils", "()Lglobal/cloud/storage/utils/FileUtils;", "setFileUtils", "(Lglobal/cloud/storage/utils/FileUtils;)V", "goToSettingsRequest", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "layoutId", "", "getLayoutId", "()I", "nextUri", "Landroid/net/Uri;", "permissionUtils", "Lglobal/cloud/storage/utils/PermissionUtils;", "getPermissionUtils", "()Lglobal/cloud/storage/utils/PermissionUtils;", "setPermissionUtils", "(Lglobal/cloud/storage/utils/PermissionUtils;)V", "prefsUtils", "Lglobal/cloud/storage/utils/PrefsUtils;", "getPrefsUtils", "()Lglobal/cloud/storage/utils/PrefsUtils;", "setPrefsUtils", "(Lglobal/cloud/storage/utils/PrefsUtils;)V", "storageUtils", "Lglobal/cloud/storage/utils/StorageUtils;", "getStorageUtils", "()Lglobal/cloud/storage/utils/StorageUtils;", "setStorageUtils", "(Lglobal/cloud/storage/utils/StorageUtils;)V", "viewModel", "getViewModel", "()Lglobal/cloud/storage/ui/dashboard/DashboardViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "grantPermissions", "", "toUri", "onAgreeClick", "onAllFilesAgreeClick", "onOpenSettingsClick", "onReady", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showContactsCount", "showMediaCount", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class DashboardFragment extends global.cloud.storage.base.BaseFragment<global.cloud.storage.databinding.ActivityDashboardBinding, global.cloud.storage.ui.dashboard.DashboardViewModel> implements global.cloud.storage.data.listeners.PermissionDialogCallback, global.cloud.storage.data.listeners.AllFilesPermissionDialogCallback, global.cloud.storage.data.listeners.OpenSettingsDialogCallback {
    @javax.inject.Inject
    public global.cloud.storage.utils.PermissionUtils permissionUtils;
    @javax.inject.Inject
    public global.cloud.storage.utils.PrefsUtils prefsUtils;
    @javax.inject.Inject
    public global.cloud.storage.utils.StorageUtils storageUtils;
    @javax.inject.Inject
    public global.cloud.storage.utils.FileUtils fileUtils;
    private android.net.Uri nextUri;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private final int layoutId = global.cloud.storage.R.layout.activity_dashboard;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> askForPermission = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> goToSettingsRequest = null;
    
    public DashboardFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.PermissionUtils getPermissionUtils() {
        return null;
    }
    
    public final void setPermissionUtils(@org.jetbrains.annotations.NotNull
    global.cloud.storage.utils.PermissionUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.PrefsUtils getPrefsUtils() {
        return null;
    }
    
    public final void setPrefsUtils(@org.jetbrains.annotations.NotNull
    global.cloud.storage.utils.PrefsUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.StorageUtils getStorageUtils() {
        return null;
    }
    
    public final void setStorageUtils(@org.jetbrains.annotations.NotNull
    global.cloud.storage.utils.StorageUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.FileUtils getFileUtils() {
        return null;
    }
    
    public final void setFileUtils(@org.jetbrains.annotations.NotNull
    global.cloud.storage.utils.FileUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected global.cloud.storage.ui.dashboard.DashboardViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected int getLayoutId() {
        return 0;
    }
    
    private final void showMediaCount() {
    }
    
    private final void showContactsCount() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    protected void onReady(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void grantPermissions(android.net.Uri toUri) {
    }
    
    @java.lang.Override
    public void onAgreeClick() {
    }
    
    @java.lang.Override
    public void onAllFilesAgreeClick() {
    }
    
    @java.lang.Override
    public void onOpenSettingsClick() {
    }
}