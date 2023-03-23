package global.cloud.storage.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0011\u00a8\u0006\u0012"}, d2 = {"Lglobal/cloud/storage/utils/DialogUtils;", "", "()V", "exitDialog", "", "context", "Landroid/content/Context;", "listener", "Lglobal/cloud/storage/data/listeners/ExitDialogCallback;", "internetDisconnectDialog", "Lglobal/cloud/storage/data/listeners/InternetConnectionDialogCallback;", "permissionAllFilesDetailDialog", "Lglobal/cloud/storage/data/listeners/AllFilesPermissionDialogCallback;", "permissionDetailDialog", "Lglobal/cloud/storage/data/listeners/PermissionDialogCallback;", "privacyPolicyDialog", "storageNotReadyDialog", "Lglobal/cloud/storage/data/listeners/OpenSettingsDialogCallback;", "app_debug"})
public final class DialogUtils {
    @org.jetbrains.annotations.NotNull
    public static final global.cloud.storage.utils.DialogUtils INSTANCE = null;
    
    private DialogUtils() {
        super();
    }
    
    public final void privacyPolicyDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void permissionDetailDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    global.cloud.storage.data.listeners.PermissionDialogCallback listener) {
    }
    
    public final void permissionAllFilesDetailDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    global.cloud.storage.data.listeners.AllFilesPermissionDialogCallback listener) {
    }
    
    public final void exitDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    global.cloud.storage.data.listeners.ExitDialogCallback listener) {
    }
    
    public final void storageNotReadyDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    global.cloud.storage.data.listeners.OpenSettingsDialogCallback listener) {
    }
    
    public final void internetDisconnectDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    global.cloud.storage.data.listeners.InternetConnectionDialogCallback listener) {
    }
}