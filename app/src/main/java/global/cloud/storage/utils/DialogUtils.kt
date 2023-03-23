package global.cloud.storage.utils

import android.app.Dialog
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import global.cloud.storage.R
import global.cloud.storage.ui.data.listeners.*
import global.cloud.storage.databinding.*
import global.cloud.storage.utils.extensions.hide

object DialogUtils {

    fun privacyPolicyDialog(context: Context) {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        val binding: DialogPrivacyPolicyBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.dialog_privacy_policy,
            null,
            false
        )
        dialog.setContentView(binding.root)
        val width = (context.resources.displayMetrics.widthPixels * 0.90).toInt()
        dialog.window?.setLayout(width, WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val ss = SpannableString(context.resources.getString(R.string.privacy_dialog_condition))
        val clickableSpan: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                dialog.dismiss()
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = true
                ds.color = context.resources.getColor(R.color.maincolor)
            }
        }
        ss.setSpan(clickableSpan, 20, 34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.tvCondition.text = ss
        binding.tvCondition.movementMethod = LinkMovementMethod.getInstance()
        binding.tvCondition.highlightColor = Color.TRANSPARENT

        binding.ivClose.setOnClickListener {
            dialog.dismiss()
        }

        binding.btnAgree.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }

    fun permissionDetailDialog(context: Context, listener: PermissionDialogCallback) {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        val binding: DialogPermissionDetailBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.dialog_permission_detail,
            null,
            false
        )
        dialog.setContentView(binding.root)
        val width = (context.resources.displayMetrics.widthPixels * 0.90).toInt()
        val height = (context.resources.displayMetrics.heightPixels * 0.30).toInt()
        dialog.window?.setLayout(width, WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        binding.btnCancel.setOnClickListener {
            dialog.dismiss()
        }

        binding.btnOk.setOnClickListener {
            listener.onAgreeClick()
            dialog.dismiss()
        }

        dialog.show()
    }

    fun permissionAllFilesDetailDialog(context: Context, listener: AllFilesPermissionDialogCallback) {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        val binding: DialogAllFilesAccessDetailBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.dialog_all_files_access_detail,
            null,
            false
        )
        dialog.setContentView(binding.root)
        val width = (context.resources.displayMetrics.widthPixels * 0.90).toInt()
        val height = (context.resources.displayMetrics.heightPixels * 0.30).toInt()
        dialog.window?.setLayout(width, WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        binding.btnCancel.setOnClickListener {
            dialog.dismiss()
        }

        binding.btnOk.setOnClickListener {
            listener.onAllFilesAgreeClick()
            dialog.dismiss()
        }

        dialog.show()
    }

    fun exitDialog(context: Context, listener: ExitDialogCallback) {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        val binding: DialogAttentionBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.dialog_attention,
            null,
            false
        )
        dialog.setContentView(binding.root)
        val width = (context.resources.displayMetrics.widthPixels * 0.90).toInt()
        dialog.window?.setLayout(width, WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        binding.flTitle.hide()
        binding.btnCancel.backgroundTintList = ColorStateList.valueOf(context.resources.getColor(R.color.maincolor))
        binding.btnDelete.backgroundTintList = ColorStateList.valueOf(context.resources.getColor(R.color.maincolor))

        binding.tvDescription.text = context.resources.getString(R.string.are_you_sure_exit)
        binding.tvYes.text = context.resources.getString(R.string.exit)
        binding.tvCancel.setTextColor(context.resources.getColor(R.color.maincolor))

        binding.btnCancel.setOnClickListener {
            dialog.dismiss()
        }

        binding.btnDelete.setOnClickListener {
            listener.onExitClick()
            dialog.dismiss()
        }

        dialog.show()
    }

    fun storageNotReadyDialog(context: Context, listener: OpenSettingsDialogCallback) {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        val binding: LayoutStorageNotReadyBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.layout_storage_not_ready,
            null,
            false
        )
        dialog.setContentView(binding.root)
        val width = (context.resources.displayMetrics.widthPixels * 0.90).toInt()
        dialog.window?.setLayout(width, WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        binding.ivClose.setOnClickListener {
            dialog.dismiss()
        }

        binding.btnOpenSettings.setOnClickListener {
            listener.onOpenSettingsClick()
            dialog.dismiss()
        }

        dialog.show()
    }

    fun internetDisconnectDialog(context: Context, listener: InternetConnectionDialogCallback) {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        val binding: InternetConnectionDetailBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.internet_connection_detail,
            null,
            false
        )
        dialog.setContentView(binding.root)
        val width = (context.resources.displayMetrics.widthPixels * 0.90).toInt()
        dialog.window?.setLayout(width, WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        binding.btnCancel.setOnClickListener {
            dialog.dismiss()
        }

        binding.btnOk.setOnClickListener {
            listener.onTryAgainClick()
            dialog.dismiss()
        }

        dialog.show()
    }

}