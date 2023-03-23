package global.cloud.storage.models

data class AppsModel(
    var appName: String?,
    var size: Long?,
    val packageName: String?,
    val apkPath: String?,
    val firstInstallTime: Long?,
    var isSelected: Boolean = false
)