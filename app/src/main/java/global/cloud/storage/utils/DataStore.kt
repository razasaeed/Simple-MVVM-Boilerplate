package global.cloud.storage.utils

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

object DataStore {

    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

    private val USER_TOKEN = stringPreferencesKey("USER_TOKEN")
    private val EMAIL_ID = stringPreferencesKey("EMAIL_ID")
    private val USER_NAME = stringPreferencesKey("USER_NAME")
    private val PHOTO_URL = stringPreferencesKey("PHOTO_URL")
    private val IS_FIRST_TIME = booleanPreferencesKey("is_first_time")
    private val DARK_MODE = booleanPreferencesKey("dark_mode")

    suspend fun setUserToken(context: Context, token: String) {
        context.dataStore.edit { setting ->
            setting[USER_TOKEN] = token
        }
    }

    fun getUserToken(context: Context): Flow<String> {
        return context.dataStore.data.map { setting ->
            setting[USER_TOKEN] ?: "undefined"
        }
    }

    suspend fun setUserEmail(context: Context, email: String) {
        context.dataStore.edit { setting ->
            setting[EMAIL_ID] = email
        }
    }

    fun getUserEmail(context: Context): Flow<String> {
        return context.dataStore.data.map { setting ->
            (setting[EMAIL_ID] ?: "undefined")
        }
    }

    suspend fun setUserName(context: Context, name: String) {
        context.dataStore.edit { setting ->
            setting[USER_NAME] = name
        }
    }

    fun getUserName(context: Context): Flow<String> {
        return context.dataStore.data.map { setting ->
            setting[USER_NAME] ?: "undefined"
        }
    }

    suspend fun setUserPhoto(context: Context, url: String) {
        context.dataStore.edit { setting ->
            setting[PHOTO_URL] = url
        }
    }

    fun getUserPhoto(context: Context): Flow<String> {
        return context.dataStore.data.map { setting ->
            setting[PHOTO_URL] ?: "undefined"
        }
    }

    suspend fun setIsFirstTime(context: Context, isFirstTime: Boolean) {
        context.dataStore.edit { setting ->
            setting[IS_FIRST_TIME] = isFirstTime
        }
    }

    fun getIsFirstTime(context: Context): Flow<Boolean> {
        return context.dataStore.data.map { setting ->
            setting[IS_FIRST_TIME] ?: true
        }
    }

    suspend fun setDarkMode(context: Context, isFirstTime: Boolean) {
        context.dataStore.edit { setting ->
            setting[DARK_MODE] = isFirstTime
        }
    }

    fun getDarkMode(context: Context): Flow<Boolean> {
        return context.dataStore.data.map { setting ->
            setting[DARK_MODE] ?: false
        }
    }
}