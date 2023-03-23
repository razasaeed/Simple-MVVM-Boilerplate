package global.cloud.storage.network.login

import io.reactivex.Observable
import retrofit2.http.*

interface LoginService {

    @Headers("Content-Type: application/json")
    @POST("api/login")
    fun postLogin(
        @Body rawJsonString: LoginRequest
    ): Observable<LoginResponse>

}