package global.cloud.storage.utils

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PermissionUtils @Inject constructor (@ApplicationContext val context: Context) {

    fun checkForPermissions(permission: String): Boolean {
        return ContextCompat.checkSelfPermission(
            context,
            permission
        ) == PackageManager.PERMISSION_GRANTED
    }

    fun checkStoragePermissions(isPermissionAllowed: (Boolean) -> Unit) {
        if (!checkForPermissions(Manifest.permission.READ_EXTERNAL_STORAGE)) {
            isPermissionAllowed(false)
        } else {
            isPermissionAllowed(true)
        }
    }

}