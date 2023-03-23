package global.cloud.storage.models

data class FilesDataResponse(
    val totalDocs: Int,
    val limit: Int,
    val totalPages: Int,
    val page: Int,
    val pagingCounter: Int,
    val hasPrevPage: Boolean,
    val hasNextPage: Boolean,
    val prevPage: Int,
    val nextPage: Int,
    val files: List<Files>
)