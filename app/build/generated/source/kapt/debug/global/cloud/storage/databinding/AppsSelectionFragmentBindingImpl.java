package global.cloud.storage.databinding;
import global.cloud.storage.R;
import global.cloud.storage.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AppsSelectionFragmentBindingImpl extends AppsSelectionFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(0, 
            new String[] {"activity_toolbar", "layout_search", "layout_select_all", "main_button"},
            new int[] {1, 2, 3, 4},
            new int[] {global.cloud.storage.R.layout.activity_toolbar,
                global.cloud.storage.R.layout.layout_search,
                global.cloud.storage.R.layout.layout_select_all,
                global.cloud.storage.R.layout.main_button});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.pb_wait, 5);
        sViewsWithIds.put(R.id.rv_apps, 6);
        sViewsWithIds.put(R.id.tv_no_data, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AppsSelectionFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private AppsSelectionFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (global.cloud.storage.databinding.LayoutSelectAllBinding) bindings[3]
            , (global.cloud.storage.databinding.MainButtonBinding) bindings[4]
            , (android.widget.ProgressBar) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (global.cloud.storage.databinding.LayoutSearchBinding) bindings[2]
            , (global.cloud.storage.databinding.ActivityToolbarBinding) bindings[1]
            , (android.widget.TextView) bindings[7]
            );
        setContainedBinding(this.include);
        setContainedBinding(this.includeButton);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.search);
        setContainedBinding(this.toolbar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        toolbar.invalidateAll();
        search.invalidateAll();
        include.invalidateAll();
        includeButton.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (toolbar.hasPendingBindings()) {
            return true;
        }
        if (search.hasPendingBindings()) {
            return true;
        }
        if (include.hasPendingBindings()) {
            return true;
        }
        if (includeButton.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((global.cloud.storage.ui.apps.AppsSelectionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable global.cloud.storage.ui.apps.AppsSelectionViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolbar.setLifecycleOwner(lifecycleOwner);
        search.setLifecycleOwner(lifecycleOwner);
        include.setLifecycleOwner(lifecycleOwner);
        includeButton.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeButton((global.cloud.storage.databinding.MainButtonBinding) object, fieldId);
            case 1 :
                return onChangeSearch((global.cloud.storage.databinding.LayoutSearchBinding) object, fieldId);
            case 2 :
                return onChangeInclude((global.cloud.storage.databinding.LayoutSelectAllBinding) object, fieldId);
            case 3 :
                return onChangeToolbar((global.cloud.storage.databinding.ActivityToolbarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeButton(global.cloud.storage.databinding.MainButtonBinding IncludeButton, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearch(global.cloud.storage.databinding.LayoutSearchBinding Search, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeInclude(global.cloud.storage.databinding.LayoutSelectAllBinding Include, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeToolbar(global.cloud.storage.databinding.ActivityToolbarBinding Toolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(toolbar);
        executeBindingsOn(search);
        executeBindingsOn(include);
        executeBindingsOn(includeButton);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeButton
        flag 1 (0x2L): search
        flag 2 (0x3L): include
        flag 3 (0x4L): toolbar
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}