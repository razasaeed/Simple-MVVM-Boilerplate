package global.cloud.storage.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001b\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u0002H\u000b\u00a2\u0006\u0002\u0010\u000fJ#\u0010\u0010\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u0002H\u000b\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lglobal/cloud/storage/utils/PrefsUtils;", "", "()V", "checkKey", "", "key", "", "deleteAll", "", "deleteSingleValue", "getFromPrefs", "T", "(Ljava/lang/String;)Ljava/lang/Object;", "getFromPrefsWithDefault", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "saveToPrefs", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "app_debug"})
@javax.inject.Singleton
public final class PrefsUtils {
    
    @javax.inject.Inject
    public PrefsUtils() {
        super();
    }
    
    public final <T extends java.lang.Object>void saveToPrefs(@org.jetbrains.annotations.Nullable
    java.lang.String key, T value) {
    }
    
    public final <T extends java.lang.Object>T getFromPrefs(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return null;
    }
    
    public final <T extends java.lang.Object>T getFromPrefsWithDefault(@org.jetbrains.annotations.Nullable
    java.lang.String key, T defaultValue) {
        return null;
    }
    
    public final void deleteAll() {
    }
    
    public final void deleteSingleValue(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
    }
    
    public final boolean checkKey(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return false;
    }
}