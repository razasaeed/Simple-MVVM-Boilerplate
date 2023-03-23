package global.cloud.storage.utils

import android.util.Log
import com.orhanobut.hawk.Hawk
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PrefsUtils @Inject constructor () {

    fun <T> saveToPrefs(key: String?, value: T) {
        Hawk.put(key, value)
    }

    fun <T> getFromPrefs(key: String?): T {
        return Hawk.get(key)
    }

    fun <T> getFromPrefsWithDefault(key: String?, defaultValue: T): T {
        Log.e("value", Hawk.get(key, defaultValue).toString())
        return Hawk.get(key, defaultValue)
    }

    fun deleteAll() {
        Hawk.deleteAll()
    }

    fun deleteSingleValue(key: String?) {
        Hawk.delete(key)
    }

    fun checkKey(key: String?): Boolean {
        return Hawk.contains(key)
    }

}