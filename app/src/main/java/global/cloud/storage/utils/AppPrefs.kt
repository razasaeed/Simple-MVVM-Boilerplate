package global.cloud.storage.utils

import android.content.SharedPreferences
import global.cloud.storage.ui.data.Constants
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppPrefs @Inject constructor(private val pref: SharedPreferences?) {

    fun getFormattedToken(): SharedPreferenceLiveData<String> {
        return pref!!.liveData(Constants.USER_TOKEN, "")
    }

    fun getUserName(): SharedPreferenceLiveData<String> {
        return pref!!.liveData(Constants.USER_NAME, "")
    }

    fun getUserEmail(): SharedPreferenceLiveData<String> {
        return pref!!.liveData(Constants.EMAIL_ID, "")
    }

    fun saveFormattedToken(formattedToken: String) {
        pref?.edit()?.putString(Constants.USER_TOKEN, formattedToken)?.apply()
    }

    fun saveUserEmail (userEmail: String) {
        pref?.edit()?.putString(Constants.EMAIL_ID, userEmail)?.apply()
    }

    fun saveUserName (userName: String) {
        pref?.edit()?.putString(Constants.USER_NAME, userName)?.apply()
    }

    fun saveUserImage (userImage: String) {
        pref?.edit()?.putString(Constants.PHOTO_URL, userImage)?.apply()
    }

    fun saveShowPermissionDialog () {
        pref?.edit()?.putBoolean(Constants.SHOW_PERMISSION_DIALOG, true)?.apply()
    }

    fun checkKey(key: String): SharedPreferenceLiveData<Boolean> {
        return pref!!.liveData(key, false)
    }

    fun saveMode (mode: Boolean) {
        pref?.edit()?.putBoolean(Constants.DARK_MODE, mode)?.apply()
    }

    fun getMode(): SharedPreferenceLiveData<Boolean> {
        return pref!!.liveData(Constants.DARK_MODE, false)
    }

    fun deleteAll(): Boolean {
        return pref!!.edit().clear().commit()
    }

    private inline fun <reified T> SharedPreferences.liveData(
        key: String,
        default: T
    ): SharedPreferenceLiveData<T> {
        @Suppress("UNCHECKED_CAST")
        return object : SharedPreferenceLiveData<T>(this, key, default) {
            override fun getValueFromPreferences(key: String, defValue: T): T {
                return when (default) {
                    is String -> getString(key, default) as T
                    is Int -> getInt(key, default) as T
                    is Long -> getLong(key, default) as T
                    is Boolean -> getBoolean(key, default) as T
                    is Float -> getFloat(key, default) as T
                    is Set<*> -> getStringSet(key, default as Set<String>) as T
                    is MutableSet<*> -> getStringSet(key, default as MutableSet<String>) as T
                    else -> throw IllegalArgumentException("generic type not handled")
                }
            }
        }
    }
}