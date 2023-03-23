package global.cloud.storage.ui.apps

import global.cloud.storage.models.AppsModel
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import global.cloud.storage.databinding.AppsCellBinding

class AppAdapter(
    private val callback: AppItemCallback
) : ListAdapter<AppsModel, AppViewHolder>(DiffAppsCallback) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): AppViewHolder {
        val binding = AppsCellBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AppViewHolder(binding, callback)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}