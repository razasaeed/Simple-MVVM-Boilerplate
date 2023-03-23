package global.cloud.storage.ui.apps;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0010\u0010\'\u001a\u00020\n2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020)H\u0002J(\u0010+\u001a\u00020#2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00142\u0006\u0010-\u001a\u00020.2\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020\bJ\u000e\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\nR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00063"}, d2 = {"Lglobal/cloud/storage/ui/apps/AppsSelectionViewModel;", "Lglobal/cloud/storage/base/BaseViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_appListObservable", "Landroidx/lifecycle/MutableLiveData;", "", "Lglobal/cloud/storage/models/AppsModel;", "_connectionError", "", "getApp", "()Landroid/app/Application;", "appListObservable", "Landroidx/lifecycle/LiveData;", "getAppListObservable", "()Landroidx/lifecycle/LiveData;", "connectionError", "getConnectionError", "myUserApps", "", "getMyUserApps", "()Ljava/util/List;", "retrofitBuilder", "Lretrofit2/Retrofit;", "getRetrofitBuilder", "()Lretrofit2/Retrofit;", "setRetrofitBuilder", "(Lretrofit2/Retrofit;)V", "selectAllItems", "getSelectAllItems", "()Z", "setSelectAllItems", "(Z)V", "getInstalledApps", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDebuggable", "pkgInfo", "Landroid/content/pm/PackageInfo;", "isSystemPackage", "processUserApps", "userApps", "pm", "Landroid/content/pm/PackageManager;", "selectApp", "item", "setSelectAll", "isSelect", "app_debug"})
public final class AppsSelectionViewModel extends global.cloud.storage.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.app.Application app = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _connectionError = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> connectionError = null;
    private boolean selectAllItems = false;
    @javax.inject.Inject
    public retrofit2.Retrofit retrofitBuilder;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<global.cloud.storage.models.AppsModel> myUserApps = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<global.cloud.storage.models.AppsModel>> _appListObservable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<global.cloud.storage.models.AppsModel>> appListObservable = null;
    
    @javax.inject.Inject
    public AppsSelectionViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Application getApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getConnectionError() {
        return null;
    }
    
    public final boolean getSelectAllItems() {
        return false;
    }
    
    public final void setSelectAllItems(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit getRetrofitBuilder() {
        return null;
    }
    
    public final void setRetrofitBuilder(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<global.cloud.storage.models.AppsModel> getMyUserApps() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<global.cloud.storage.models.AppsModel>> getAppListObservable() {
        return null;
    }
    
    public final void setSelectAll(boolean isSelect) {
    }
    
    public final void selectApp(@org.jetbrains.annotations.NotNull
    global.cloud.storage.models.AppsModel item) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getInstalledApps(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void processUserApps(java.util.List<android.content.pm.PackageInfo> userApps, android.content.pm.PackageManager pm, android.content.Context context) {
    }
    
    private final boolean isSystemPackage(android.content.pm.PackageInfo pkgInfo) {
        return false;
    }
    
    private final boolean isDebuggable(android.content.pm.PackageInfo pkgInfo) {
        return false;
    }
}