package global.cloud.storage.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0007J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007J\u0006\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\tJ0\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u0006\"\u0006\b\u0000\u0010\u001c\u0018\u0001*\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u0002H\u001cH\u0082\b\u00a2\u0006\u0002\u0010\u001eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lglobal/cloud/storage/utils/AppPrefs;", "", "pref", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "checkKey", "Lglobal/cloud/storage/utils/SharedPreferenceLiveData;", "", "key", "", "deleteAll", "getFormattedToken", "getMode", "getUserEmail", "getUserName", "saveFormattedToken", "", "formattedToken", "saveMode", "mode", "saveShowPermissionDialog", "saveUserEmail", "userEmail", "saveUserImage", "userImage", "saveUserName", "userName", "liveData", "T", "default", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)Lglobal/cloud/storage/utils/SharedPreferenceLiveData;", "app_debug"})
@javax.inject.Singleton
public final class AppPrefs {
    private final android.content.SharedPreferences pref = null;
    
    @javax.inject.Inject
    public AppPrefs(@org.jetbrains.annotations.Nullable
    android.content.SharedPreferences pref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.SharedPreferenceLiveData<java.lang.String> getFormattedToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.SharedPreferenceLiveData<java.lang.String> getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.SharedPreferenceLiveData<java.lang.String> getUserEmail() {
        return null;
    }
    
    public final void saveFormattedToken(@org.jetbrains.annotations.NotNull
    java.lang.String formattedToken) {
    }
    
    public final void saveUserEmail(@org.jetbrains.annotations.NotNull
    java.lang.String userEmail) {
    }
    
    public final void saveUserName(@org.jetbrains.annotations.NotNull
    java.lang.String userName) {
    }
    
    public final void saveUserImage(@org.jetbrains.annotations.NotNull
    java.lang.String userImage) {
    }
    
    public final void saveShowPermissionDialog() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.SharedPreferenceLiveData<java.lang.Boolean> checkKey(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return null;
    }
    
    public final void saveMode(boolean mode) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.utils.SharedPreferenceLiveData<java.lang.Boolean> getMode() {
        return null;
    }
    
    public final boolean deleteAll() {
        return false;
    }
}