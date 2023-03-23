package global.cloud.storage.ui.apps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020\'H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020\u00048TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b#\u0010$\u00a8\u0006/"}, d2 = {"Lglobal/cloud/storage/ui/apps/AppsSelectionFragment;", "Lglobal/cloud/storage/data/listeners/UploadProgressDialogCallback;", "Lglobal/cloud/storage/base/BaseFragment;", "Lglobal/cloud/storage/databinding/AppsSelectionFragmentBinding;", "Lglobal/cloud/storage/ui/apps/AppsSelectionViewModel;", "Lglobal/cloud/storage/data/listeners/InternetConnectionDialogCallback;", "()V", "appAdapter", "Lglobal/cloud/storage/ui/apps/AppAdapter;", "getAppAdapter", "()Lglobal/cloud/storage/ui/apps/AppAdapter;", "appAdapter$delegate", "Lkotlin/Lazy;", "appCallback", "Lglobal/cloud/storage/ui/apps/AppItemCallback;", "getAppCallback", "()Lglobal/cloud/storage/ui/apps/AppItemCallback;", "appCallback$delegate", "fileUtils", "Lglobal/cloud/storage/utils/FileUtils;", "getFileUtils", "()Lglobal/cloud/storage/utils/FileUtils;", "setFileUtils", "(Lglobal/cloud/storage/utils/FileUtils;)V", "layoutId", "", "getLayoutId", "()I", "permissionUtils", "Lglobal/cloud/storage/utils/PermissionUtils;", "getPermissionUtils", "()Lglobal/cloud/storage/utils/PermissionUtils;", "setPermissionUtils", "(Lglobal/cloud/storage/utils/PermissionUtils;)V", "viewModel", "getViewModel", "()Lglobal/cloud/storage/ui/apps/AppsSelectionViewModel;", "viewModel$delegate", "observe", "", "onDoneClick", "dialog", "Landroid/app/Dialog;", "onReady", "savedInstanceState", "Landroid/os/Bundle;", "onTryAgainClick", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AppsSelectionFragment extends global.cloud.storage.base.BaseFragment<global.cloud.storage.databinding.AppsSelectionFragmentBinding, global.cloud.storage.ui.apps.AppsSelectionViewModel> implements global.cloud.storage.data.listeners.UploadProgressDialogCallback, global.cloud.storage.data.listeners.InternetConnectionDialogCallback {
    private final kotlin.Lazy appCallback$delegate = null;
    private final kotlin.Lazy appAdapter$delegate = null;
    @javax.inject.Inject
    public global.cloud.storage.utils.PermissionUtils permissionUtils;
    @javax.inject.Inject
    public global.cloud.storage.utils.FileUtils fileUtils;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private final int layoutId = global.cloud.storage.R.layout.apps_selection_fragment;
    
    public AppsSelectionFragment() {
        super();
    }
    
    private final global.cloud.storage.ui.apps.AppItemCallback getAppCallback() {
        return null;
    }
    
    private final global.cloud.storage.ui.apps.AppAdapter getAppAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.PermissionUtils getPermissionUtils() {
        return null;
    }
    
    public final void setPermissionUtils(@org.jetbrains.annotations.NotNull
    global.cloud.storage.utils.PermissionUtils p0) {
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
    protected global.cloud.storage.ui.apps.AppsSelectionViewModel getViewModel() {
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
    
    private final void observe() {
    }
    
    @java.lang.Override
    public void onTryAgainClick() {
    }
    
    @java.lang.Override
    public void onDoneClick(@org.jetbrains.annotations.NotNull
    android.app.Dialog dialog) {
    }
}