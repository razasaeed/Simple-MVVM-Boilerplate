package global.cloud.storage.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lglobal/cloud/storage/utils/FileUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "allAppsSize", "", "allAudiosSize", "allContactsSize", "allDocsSize", "allImagesSize", "allVideosSize", "getFileFromUri", "Ljava/io/File;", "uri", "Landroid/net/Uri;", "isDebuggable", "", "pkgInfo", "Landroid/content/pm/PackageInfo;", "isSystemPackage", "app_debug"})
@javax.inject.Singleton
public final class FileUtils {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    
    @javax.inject.Inject
    public FileUtils(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final int allAudiosSize() {
        return 0;
    }
    
    public final int allVideosSize() {
        return 0;
    }
    
    public final int allImagesSize() {
        return 0;
    }
    
    public final int allContactsSize() {
        return 0;
    }
    
    public final int allAppsSize() {
        return 0;
    }
    
    private final boolean isSystemPackage(android.content.pm.PackageInfo pkgInfo) {
        return false;
    }
    
    private final boolean isDebuggable(android.content.pm.PackageInfo pkgInfo) {
        return false;
    }
    
    public final int allDocsSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.io.File getFileFromUri(@org.jetbrains.annotations.Nullable
    android.net.Uri uri) {
        return null;
    }
}