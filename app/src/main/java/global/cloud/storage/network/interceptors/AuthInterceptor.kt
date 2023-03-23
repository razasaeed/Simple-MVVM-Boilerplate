package global.cloud.storage.network.interceptors

import global.cloud.storage.ui.data.Constants
import global.cloud.storage.utils.PrefsUtils
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()
        requestBuilder.addHeader("Authorization", "Bearer ${getFormattedToken()}")
        return chain.proceed(requestBuilder.build())
    }

    private fun getFormattedToken(): String {
        return PrefsUtils().getFromPrefs<String>(Constants.USER_TOKEN).replace("JWT ", "")
    }
}