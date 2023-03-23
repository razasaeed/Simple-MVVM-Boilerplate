package global.cloud.storage.ui.apps

import android.graphics.drawable.Drawable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import global.cloud.storage.R
import global.cloud.storage.databinding.AppsCellBinding
import global.cloud.storage.models.AppsModel
import global.cloud.storage.utils.extensions.getFileSize
import java.lang.NullPointerException

class AppViewHolder(
    private val binding: AppsCellBinding,
    private val callback: AppItemCallback
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(
        item: AppsModel
    ) {
        binding.apply {
            val icon: Drawable? =
                try {
                    itemView.context.packageManager.getApplicationIcon(
                        item.packageName ?: ""
                    )
                } catch (ex: NullPointerException) {
                    null
                }
            Glide.with(itemView.context).load(icon).placeholder(R.drawable.app_placeholder)
                .into(ivAppIcon)

            tvAppName.text = item.appName

            val size = item.size?.getFileSize()
            tvAppSize.text = size

            if (item.isSelected) {
                ivAppsSelection.setImageResource(R.drawable.ic_select_filled)
            } else {
                ivAppsSelection.setImageResource(R.drawable.unchecked)
            }
            root.setOnClickListener {
                callback.onAppClicked(item, adapterPosition)
            }
        }
    }
}