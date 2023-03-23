package global.cloud.storage.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lglobal/cloud/storage/ui/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mainActivityMainBinding", "Lglobal/cloud/storage/databinding/ActivityMainBinding;", "getMainActivityMainBinding", "()Lglobal/cloud/storage/databinding/ActivityMainBinding;", "setMainActivityMainBinding", "(Lglobal/cloud/storage/databinding/ActivityMainBinding;)V", "mainViewModel", "Lglobal/cloud/storage/ui/main/MainViewModel;", "navController", "Landroidx/navigation/NavController;", "prefsUtils", "Lglobal/cloud/storage/utils/PrefsUtils;", "getPrefsUtils", "()Lglobal/cloud/storage/utils/PrefsUtils;", "setPrefsUtils", "(Lglobal/cloud/storage/utils/PrefsUtils;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject
    public global.cloud.storage.utils.PrefsUtils prefsUtils;
    private androidx.navigation.NavController navController;
    public global.cloud.storage.databinding.ActivityMainBinding mainActivityMainBinding;
    private global.cloud.storage.ui.main.MainViewModel mainViewModel;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.PrefsUtils getPrefsUtils() {
        return null;
    }
    
    public final void setPrefsUtils(@org.jetbrains.annotations.NotNull
    global.cloud.storage.utils.PrefsUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.databinding.ActivityMainBinding getMainActivityMainBinding() {
        return null;
    }
    
    public final void setMainActivityMainBinding(@org.jetbrains.annotations.NotNull
    global.cloud.storage.databinding.ActivityMainBinding p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}