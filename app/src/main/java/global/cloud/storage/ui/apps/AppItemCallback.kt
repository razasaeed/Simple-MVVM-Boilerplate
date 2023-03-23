package global.cloud.storage.ui.apps

import global.cloud.storage.models.AppsModel

interface AppItemCallback {
    fun onAppClicked(folder: AppsModel, adapterPosition: Int)
}