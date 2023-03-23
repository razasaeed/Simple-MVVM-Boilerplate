package global.cloud.storage.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u000e\u0010\u0013\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u000e\u0010\u0016\u001a\u00020\u0017X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u0017X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\rR\u000e\u0010 \u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lglobal/cloud/storage/data/Constants;", "", "()V", "APK", "", "AUTHORIZATION", "BEARER", "CONNECT_TIMEOUT", "", "DARK_MODE", "DOC", "EMAIL_ID", "getEMAIL_ID", "()Ljava/lang/String;", "PDF", "PHOTO_URL", "getPHOTO_URL", "PREF_NAME", "getPREF_NAME", "READ_TIMEOUT", "SHOW_PERMISSION_DIALOG", "getSHOW_PERMISSION_DIALOG", "TIMEOUT", "", "TYPE_APPS", "UPDATE_REQUEST_CODE", "getUPDATE_REQUEST_CODE", "()I", "USER_NAME", "getUSER_NAME", "USER_TOKEN", "getUSER_TOKEN", "WRITE_TIMEOUT", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull
    public static final global.cloud.storage.data.Constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EMAIL_ID = "EMAIL_ID";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String USER_NAME = "USER_NAME";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PHOTO_URL = "PHOTO_URL";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String USER_TOKEN = "USER_TOKEN";
    private static final int UPDATE_REQUEST_CODE = 100;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SHOW_PERMISSION_DIALOG = "SHOW_PERMISSION_DIALOG";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PREF_NAME = "Cloud_Storage";
    public static final long CONNECT_TIMEOUT = 60L;
    public static final long READ_TIMEOUT = 60L;
    public static final long WRITE_TIMEOUT = 60L;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TYPE_APPS = "apps";
    public static final int TIMEOUT = 60000;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AUTHORIZATION = "Authorization";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BEARER = "Bearer";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PDF = "pdf";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String APK = "apk";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DOC = "doc";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DARK_MODE = "dark_mode";
    
    private Constants() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEMAIL_ID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUSER_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPHOTO_URL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUSER_TOKEN() {
        return null;
    }
    
    public final int getUPDATE_REQUEST_CODE() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSHOW_PERMISSION_DIALOG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPREF_NAME() {
        return null;
    }
}