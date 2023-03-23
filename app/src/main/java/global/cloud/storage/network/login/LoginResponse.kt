package global.cloud.storage.network.login

import com.google.gson.annotations.SerializedName

class LoginResponse {

    @SerializedName("success")
    var success: Boolean = false
    @SerializedName("token")
    var token: String = ""

}