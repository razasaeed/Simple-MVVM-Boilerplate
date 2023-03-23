package global.cloud.storage.ui.apps

import androidx.recyclerview.widget.DiffUtil
import global.cloud.storage.models.AppsModel

object DiffAppsCallback : DiffUtil.ItemCallback<AppsModel>() {
    override fun areItemsTheSame(oldItem: AppsModel, newItem: AppsModel): Boolean {
        return oldItem.packageName == newItem.packageName
    }

    override fun areContentsTheSame(oldItem: AppsModel, newItem: AppsModel): Boolean {
        return oldItem.apkPath == newItem.apkPath
                && oldItem.isSelected == newItem.isSelected
                && oldItem.appName == newItem.appName
                && oldItem.firstInstallTime == newItem.firstInstallTime
                && oldItem.size == newItem.size
    }
}