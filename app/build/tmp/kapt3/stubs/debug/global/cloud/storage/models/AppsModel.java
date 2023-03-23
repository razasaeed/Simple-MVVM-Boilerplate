package global.cloud.storage.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\nH\u00c6\u0003JT\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lglobal/cloud/storage/models/AppsModel;", "", "appName", "", "size", "", "packageName", "apkPath", "firstInstallTime", "isSelected", "", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Z)V", "getApkPath", "()Ljava/lang/String;", "getAppName", "setAppName", "(Ljava/lang/String;)V", "getFirstInstallTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "setSelected", "(Z)V", "getPackageName", "getSize", "setSize", "(Ljava/lang/Long;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Z)Lglobal/cloud/storage/models/AppsModel;", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class AppsModel {
    @org.jetbrains.annotations.Nullable
    private java.lang.String appName;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long size;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String packageName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String apkPath = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long firstInstallTime = null;
    private boolean isSelected;
    
    @org.jetbrains.annotations.NotNull
    public final global.cloud.storage.models.AppsModel copy(@org.jetbrains.annotations.Nullable
    java.lang.String appName, @org.jetbrains.annotations.Nullable
    java.lang.Long size, @org.jetbrains.annotations.Nullable
    java.lang.String packageName, @org.jetbrains.annotations.Nullable
    java.lang.String apkPath, @org.jetbrains.annotations.Nullable
    java.lang.Long firstInstallTime, boolean isSelected) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public AppsModel(@org.jetbrains.annotations.Nullable
    java.lang.String appName, @org.jetbrains.annotations.Nullable
    java.lang.Long size, @org.jetbrains.annotations.Nullable
    java.lang.String packageName, @org.jetbrains.annotations.Nullable
    java.lang.String apkPath, @org.jetbrains.annotations.Nullable
    java.lang.Long firstInstallTime, boolean isSelected) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAppName() {
        return null;
    }
    
    public final void setAppName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getSize() {
        return null;
    }
    
    public final void setSize(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPackageName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getApkPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getFirstInstallTime() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
}