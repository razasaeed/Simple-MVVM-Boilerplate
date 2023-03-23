package global.cloud.storage.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010 \u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010!\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J!\u0010$\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J!\u0010&\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\'\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J!\u0010(\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lglobal/cloud/storage/utils/DataStore;", "", "()V", "DARK_MODE", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "EMAIL_ID", "", "IS_FIRST_TIME", "PHOTO_URL", "USER_NAME", "USER_TOKEN", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getDarkMode", "Lkotlinx/coroutines/flow/Flow;", "context", "getIsFirstTime", "getUserEmail", "getUserName", "getUserPhoto", "getUserToken", "setDarkMode", "", "isFirstTime", "(Landroid/content/Context;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setIsFirstTime", "setUserEmail", "email", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserName", "name", "setUserPhoto", "url", "setUserToken", "token", "app_debug"})
public final class DataStore {
    @org.jetbrains.annotations.NotNull
    public static final global.cloud.storage.utils.DataStore INSTANCE = null;
    private static final kotlin.properties.ReadOnlyProperty dataStore$delegate = null;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> USER_TOKEN = null;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> EMAIL_ID = null;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> USER_NAME = null;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> PHOTO_URL = null;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> IS_FIRST_TIME = null;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> DARK_MODE = null;
    
    private DataStore() {
        super();
    }
    
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore(android.content.Context $this$dataStore) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setUserToken(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getUserToken(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setUserEmail(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getUserEmail(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setUserName(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getUserName(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setUserPhoto(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getUserPhoto(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setIsFirstTime(@org.jetbrains.annotations.NotNull
    android.content.Context context, boolean isFirstTime, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getIsFirstTime(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setDarkMode(@org.jetbrains.annotations.NotNull
    android.content.Context context, boolean isFirstTime, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getDarkMode(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}