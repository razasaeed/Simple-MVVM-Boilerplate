package global.cloud.storage.network.login

data class LoginRequest(
    val provider: String?,
    val providerId: String?,
    val authToken: String?
)