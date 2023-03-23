package global.cloud.storage.models

data class Files(
    val images: String,
    val ImageId: String,
    val ext: String,
    /*val name: String,*/
    var isSelected: Boolean = false
)