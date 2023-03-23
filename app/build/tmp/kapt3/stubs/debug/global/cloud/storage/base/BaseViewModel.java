package global.cloud.storage.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lglobal/cloud/storage/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_navigation", "Landroidx/lifecycle/MutableLiveData;", "Lglobal/cloud/storage/base/Event;", "Lglobal/cloud/storage/utils/navigation_utils/NavigationCommand;", "navigation", "Landroidx/lifecycle/LiveData;", "getNavigation", "()Landroidx/lifecycle/LiveData;", "navigate", "", "navDirections", "Landroidx/navigation/NavDirections;", "navigateBack", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<global.cloud.storage.base.Event<global.cloud.storage.utils.navigation_utils.NavigationCommand>> _navigation = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<global.cloud.storage.base.Event<global.cloud.storage.utils.navigation_utils.NavigationCommand>> getNavigation() {
        return null;
    }
    
    public final void navigate(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavDirections navDirections) {
    }
    
    public final void navigateBack() {
    }
}