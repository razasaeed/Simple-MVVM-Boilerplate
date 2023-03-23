package global.cloud.storage.utils

import android.content.ContentResolver
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.net.Uri
import android.os.Build
import android.provider.ContactsContract
import android.provider.DocumentsContract
import android.provider.MediaStore
import android.util.Log
import android.webkit.MimeTypeMap
import dagger.hilt.android.qualifiers.ApplicationContext
import global.cloud.storage.ui.data.Constants
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FileUtils @Inject constructor(@ApplicationContext val context: Context) {

    fun allAudiosSize(): Int {

        val collection =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                MediaStore.Audio.Media.getContentUri(
                    MediaStore.VOLUME_EXTERNAL
                )
            } else {
                MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            }

        val sortOrder = "${MediaStore.Audio.Media.DISPLAY_NAME} ASC"

        val query = context.contentResolver.query(
            collection,
            null,
            null,
            null,
            sortOrder
        )

        return query?.count.let { it } ?: run {0}
    }

    fun allVideosSize(): Int {

        val collection =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                MediaStore.Video.Media.getContentUri(
                    MediaStore.VOLUME_EXTERNAL
                )
            } else {
                MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            }

        val sortOrder = "${MediaStore.Video.Media.DISPLAY_NAME} ASC"

        val query = context.contentResolver.query(
            collection,
            null,
            null,
            null,
            sortOrder
        )

        return query?.count.let { it } ?: run {0}
    }

    fun allImagesSize(): Int {

        val collection =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                MediaStore.Images.Media.getContentUri(
                    MediaStore.VOLUME_EXTERNAL
                )
            } else {
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            }

        val sortOrder = "${MediaStore.Images.Media.DISPLAY_NAME} ASC"

        val query = context.contentResolver.query(
            collection,
            null,
            null,
            null,
            sortOrder
        )

        return query?.count.let { it } ?: run {0}
    }

    fun allContactsSize(): Int {
        val SELECTION = arrayOf(
            ContactsContract.CommonDataKinds.Phone.CONTACT_ID,
            ContactsContract.Contacts.DISPLAY_NAME,
            ContactsContract.CommonDataKinds.Phone.NUMBER
        )

        val cr: ContentResolver = context.contentResolver

        val query = cr.query(
            ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
            SELECTION,
            null,
            null,
            ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME + " ASC"
        )

        return query?.count.let { it } ?: run {0}

    }

    fun allAppsSize(): Int {

        val userApps: ArrayList<PackageInfo?> = ArrayList()
        val packs: List<PackageInfo> = context.packageManager.getInstalledPackages(0)

        userApps.addAll(packs.filter {
            !isSystemPackage(it) && !isDebuggable(it)
        }.map { it })

        return userApps.size.let { it } ?: run {0}
    }

    private fun isSystemPackage(pkgInfo: PackageInfo): Boolean {
        return pkgInfo.applicationInfo.flags and ApplicationInfo.FLAG_SYSTEM != 0
    }

    private fun isDebuggable(pkgInfo: PackageInfo): Boolean {
        return pkgInfo.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0
    }

    fun allDocsSize(): Int {

        val collection = MediaStore.Files.getContentUri("external")

        val projection = arrayOf(
            MediaStore.Files.FileColumns._ID,
            MediaStore.Files.FileColumns.DISPLAY_NAME,
            MediaStore.Files.FileColumns.DATA,
            MediaStore.Files.FileColumns.SIZE
        )

        val mimeType = MimeTypeMap.getSingleton().getMimeTypeFromExtension(Constants.PDF)
        val mimeType2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(Constants.APK)
        val mimeType3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(Constants.DOC)
        val selectionMimeType = MediaStore.Files.FileColumns.MIME_TYPE + " IN(?,?,?)"

        val selectionArgsPdf = arrayOf(mimeType,mimeType2,mimeType3)
        val sortOrder = "${MediaStore.Files.FileColumns.DISPLAY_NAME} ASC"

        val query = context.contentResolver.query(
            collection,
            projection,
            selectionMimeType,
            selectionArgsPdf,
            sortOrder
        )

        return query?.count ?: 0

    }

    fun getFileFromUri(uri: Uri?): File? {
        uri ?: return null
        uri.path ?: return null

        var newUriString = uri.toString()
        newUriString = newUriString.replace(
            "content://com.android.providers.downloads.documents/",
            "content://com.android.providers.media.documents/"
        )
        newUriString = newUriString.replace(
            "/msf%3A", "/image%3A"
        )
        val newUri = Uri.parse(newUriString)

        var realPath = String()
        val databaseUri: Uri
        val selection: String?
        val selectionArgs: Array<String>?
        if (newUri.path?.contains("/document/image:") == true) {
            databaseUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            selection = "_id=?"
            selectionArgs = arrayOf(DocumentsContract.getDocumentId(newUri).split(":")[1])
        } else {
            databaseUri = newUri
            selection = null
            selectionArgs = null
        }
        try {
            val column = "_data"
            val projection = arrayOf(column)
            val cursor = context.contentResolver.query(
                databaseUri,
                projection,
                selection,
                selectionArgs,
                null
            )
            cursor?.let {
                if (it.moveToFirst()) {
                    val columnIndex = cursor.getColumnIndexOrThrow(column)
                    realPath = cursor.getString(columnIndex)
                }
                cursor.close()
            }
        } catch (e: Exception) {
            Log.i("GetFileUri Exception:", e.message ?: "")
        }
        val path = realPath.ifEmpty {
            when {
                newUri.path?.contains("/document/raw:") == true -> newUri.path?.replace(
                    "/document/raw:",
                    ""
                )
                newUri.path?.contains("/document/primary:") == true -> newUri.path?.replace(
                    "/document/primary:",
                    "/storage/emulated/0/"
                )
                else -> return null
            }
        }
        return if (path.isNullOrEmpty()) null else File(path)
    }

}