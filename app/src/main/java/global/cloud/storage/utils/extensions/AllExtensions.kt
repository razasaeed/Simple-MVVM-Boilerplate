package global.cloud.storage.utils.extensions

import android.content.Context
import android.content.res.Configuration
import android.graphics.Bitmap
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.Uri
import android.os.Build
import android.os.Build.VERSION
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.bumptech.glide.request.RequestOptions
import global.cloud.storage.R
import global.cloud.storage.ui.data.Constants
import global.cloud.storage.utils.SafeClickListener
import java.io.ByteArrayOutputStream
import java.math.RoundingMode
import java.text.DecimalFormat


fun Context.showToast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

fun Context.isNightModeActive(): Boolean {
    val defaultNightMode = AppCompatDelegate.getDefaultNightMode()
    if (defaultNightMode == AppCompatDelegate.MODE_NIGHT_YES) {
        return true
    }
    if (defaultNightMode == AppCompatDelegate.MODE_NIGHT_NO) {
        return false
    }
    val currentNightMode = (this.resources.configuration.uiMode
            and Configuration.UI_MODE_NIGHT_MASK)
    when (currentNightMode) {
        Configuration.UI_MODE_NIGHT_NO -> return false
        Configuration.UI_MODE_NIGHT_YES -> return true
        Configuration.UI_MODE_NIGHT_UNDEFINED -> return false
    }
    return false
}

fun View.hide() {
    this.visibility = View.GONE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
    val safeClickListener = SafeClickListener {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
}


fun Long.getFileSize(): String {

    val n: Long = 1000
    var s = ""
    val kb = this / n.toDouble()
    val mb = kb / n
    val gb = mb / n
    val tb = gb / n
    if (this < n) {
        s = "$this Bytes"
    } else if (this >= n && this < n * n) {
        s = String.format("%.2f", kb) + " KB"
    } else if (this >= n * n && this < n * n * n) {
        s = String.format("%.2f", mb) + " MB"
    } else if (this >= n * n * n && this < n * n * n * n) {
        s = String.format("%.2f", gb) + " GB"
    } else if (this >= n * n * n * n) {
        s = String.format("%.2f", tb) + " TB"
    }
    return s

}

fun View.visible(isVisible: Boolean) {
    visibility = if (isVisible) View.VISIBLE else View.GONE
}

fun ImageView.loadImage(url: String, formattedToken: String) {

    val glideUrl = GlideUrl(
        url,
        LazyHeaders.Builder()
            .addHeader(Constants.AUTHORIZATION, "${Constants.BEARER} $formattedToken")
            .build()
    )

    Glide.with(this)
        .load(glideUrl)
        .timeout(Constants.TIMEOUT)
        .apply(RequestOptions().override(200, 200))
        .placeholder(R.drawable.image_placeholder)
        .error(R.drawable.image_placeholder)
        .fitCenter()
        .into(this)
}

fun ImageView.loadProfileImage(url: String, formattedToken: String) {

    val glideUrl = GlideUrl(
        url,
        LazyHeaders.Builder()
            .addHeader(Constants.AUTHORIZATION, "${Constants.BEARER} $formattedToken")
            .build()
    )

    Glide.with(this)
        .load(glideUrl)
        .timeout(Constants.TIMEOUT)
        .apply(RequestOptions().override(200, 200))
        .dontAnimate()
        .into(this)
}

fun Context.isNetworkAvailable(): Boolean {
    if (this == null) return false
    val connectivityManager = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        val capabilities = connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
        if (capabilities != null) {
            when {
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> {
                    return true
                }
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> {
                    return true
                }
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> {
                    return true
                }
            }
        }
    } else {
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected) {
            return true
        }
    }
    return false
}

fun EditText.afterTextChanged(afterTextChanged: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }

        override fun afterTextChanged(editable: Editable?) {
            afterTextChanged.invoke(editable.toString())
        }
    })
}

fun EditText.onTextChanged(onTextChanged: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            onTextChanged.invoke(s.toString())
        }

        override fun afterTextChanged(editable: Editable?) {
        }
    })
}

fun RecyclerView.scrollToTop() {
    Handler(Looper.getMainLooper()).postDelayed({
        //Do something after 100ms
        this.scrollToPosition(0)
    }, 300)
}

fun ScrollView.scrollToTop() {
    Handler(Looper.getMainLooper()).postDelayed({
        //Do something after 100ms
        this.scrollTo(0, this.bottom)
    }, 300)
}

fun Bitmap.getImageUriFromBitmap(context: Context): Uri{
    val bytes = ByteArrayOutputStream()
    this.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
    val path = MediaStore.Images.Media.insertImage(context.contentResolver, this, "Title", null)
    return Uri.parse(path.toString())
}

fun String.returnTitleWithFirstLetterCapital(): String {
    val sb: StringBuilder = StringBuilder(this)
    sb.setCharAt(0, sb[0].uppercaseChar())
    return sb.toString()
}

fun Context.showSoftKeyboard(view: View) {
    val imm: InputMethodManager = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
}

fun Double.roundDigit(): Double {
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.CEILING
    return df.format(this).toDouble()
}

fun <T> LiveData<T>.observeOnce(lifecycleOwner: LifecycleOwner, observer: Observer<T>) {
    observe(lifecycleOwner, object : Observer<T> {
        override fun onChanged(t: T?) {
            observer.onChanged(t)
            removeObserver(this)
        }
    })
}

public fun <T> Collection<T>.toMutableList(): MutableList<T> {
    return ArrayList(this)
}

fun Context.isAtLeastR(): Boolean {
    return VERSION.CODENAME.length == 1 && VERSION.CODENAME[0] >= 'R' && VERSION.CODENAME[0] <= 'Z'
}