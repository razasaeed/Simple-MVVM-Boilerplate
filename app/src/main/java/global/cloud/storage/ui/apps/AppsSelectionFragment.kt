package global.cloud.storage.ui.apps

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import global.cloud.storage.R
import global.cloud.storage.base.BaseFragment
import global.cloud.storage.ui.data.listeners.InternetConnectionDialogCallback
import global.cloud.storage.ui.data.listeners.UploadProgressDialogCallback
import global.cloud.storage.databinding.AppsSelectionFragmentBinding
import global.cloud.storage.models.AppsModel
import global.cloud.storage.utils.DialogUtils
import global.cloud.storage.utils.FileUtils
import global.cloud.storage.utils.PermissionUtils
import global.cloud.storage.utils.extensions.*
import kotlinx.coroutines.*
import javax.inject.Inject

@AndroidEntryPoint
class AppsSelectionFragment :
    UploadProgressDialogCallback, BaseFragment<AppsSelectionFragmentBinding, AppsSelectionViewModel>(),
    InternetConnectionDialogCallback {

    private val appCallback by lazy {
        object : AppItemCallback {
            override fun onAppClicked(app: AppsModel, adapterPosition: Int) {
                viewModel.selectApp(app)
            }
        }
    }
    private val appAdapter by lazy { AppAdapter(appCallback) }

    @Inject
    lateinit var permissionUtils: PermissionUtils

    @Inject
    lateinit var fileUtils: FileUtils

    override val viewModel: AppsSelectionViewModel by activityViewModels()

    override val layoutId: Int = R.layout.apps_selection_fragment

    override fun onReady(savedInstanceState: Bundle?) {
        activity?.let {
            binding.toolbar.ivBack.setOnClickListener {
                viewModel.navigateBack()
            }
            binding.pbWait.visible()
            binding.toolbar.tvTitle.text = resources.getString(R.string.apps)
            binding.rvApps.adapter = appAdapter
            observe()
            viewLifecycleOwner.lifecycleScope.launch(Dispatchers.Default) {
                viewModel.getInstalledApps(it)
            }

            binding.search.etSearch.onTextChanged { text ->
                if(text.isNotEmpty() && text.startsWith(" ")) {
                    requireActivity().showToast(requireActivity().resources.getString(R.string.space_not_allowed))
                    binding.search.etSearch.setText("")
                }
            }

            binding.search.etSearch.afterTextChanged { text ->
                binding.includeButton.btnUpload.hide()
                if (text.isEmpty()) {
                    binding.include.rootSelectAll.visible()
                    binding.tvNoData.hide()
                    binding.rvApps.visible()
                    appAdapter.submitList(viewModel.myUserApps)
                    binding.rvApps.scrollToTop()

                } else {
                    binding.include.cbSelectAll.setImageResource(R.drawable.ic_select_circle)
                    binding.include.rootSelectAll.hide()
                    val filterdeList = viewModel.myUserApps.filter { it.appName?.lowercase()?.contains(text.lowercase()) == true }
                    if (filterdeList.isEmpty()) {
                        binding.tvNoData.visible()
                        binding.pbWait.hide()
                        binding.rvApps.hide()
                    } else {
                        binding.pbWait.hide()
                        binding.tvNoData.hide()
                        binding.rvApps.visible()
                        appAdapter.submitList(filterdeList)
                    }
                }
            }

            binding.include.rootSelectAll.setSafeOnClickListener {
                if (viewModel.selectAllItems) {
                    viewModel.setSelectAll(false)
                    binding.include.cbSelectAll.setImageResource(R.drawable.ic_select_circle)
                    viewModel.selectAllItems = false
                } else {
                    viewModel.setSelectAll(true)
                    binding.include.cbSelectAll.setImageResource(R.drawable.ic_selected_filled)
                    viewModel.selectAllItems = true
                }
            }

            binding.includeButton.btnUpload.setOnClickListener {
            }

        }
    }

    private fun observe() {
        viewModel.appListObservable.observe(viewLifecycleOwner) {
            if (it.isNotEmpty()) {
                binding.rvApps.visible()
                binding.pbWait.hide()
                binding.tvNoData.hide()
                binding.include.rootSelectAll.visible()
            } else {
                binding.rvApps.hide()
                binding.pbWait.hide()
                binding.tvNoData.visible()
                binding.include.rootSelectAll.hide()
            }
            val selectedFiles = it.filter { item ->  item.isSelected } ?: listOf()
            if (selectedFiles.isNotEmpty()) {
                binding.includeButton.btnUpload.visible()
            } else {
                binding.includeButton.btnUpload.hide()
            }
            if (selectedFiles.size == viewModel.myUserApps.size) {
                binding.include.cbSelectAll.setImageResource(R.drawable.ic_selected_filled)
            } else {
                viewModel.selectAllItems = false
                binding.include.cbSelectAll.setImageResource(R.drawable.ic_select_circle)
            }
            binding.include.tvSelectionCount.text = "${selectedFiles.size ?: 0}/${viewModel.myUserApps.size ?: 0}"
            if (it.isEmpty()) binding.tvNoData.visible()
            else binding.tvNoData.hide()
            appAdapter.submitList(it)
        }

        viewModel.connectionError.observe(viewLifecycleOwner) {
            if (it) {
                binding.tvNoData.hide()
                DialogUtils.internetDisconnectDialog(requireActivity(), this)
            }
        }
    }

    override fun onTryAgainClick() {
    }

    override fun onDoneClick(dialog: Dialog) {
        dialog.dismiss()
    }

}