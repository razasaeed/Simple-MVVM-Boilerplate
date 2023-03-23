package global.cloud.storage.network.fetch_files

import global.cloud.storage.models.FilesDataResponse
import retrofit2.http.*

interface FetchFilesService {

    @GET("api/download/{type}")
    suspend fun fetchFiles(
        @Path("type") type: String,
        @Query("page") page: Int,
        @Query("limit") limit: Int
    ): FilesDataResponse

}