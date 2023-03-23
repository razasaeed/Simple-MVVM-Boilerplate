package global.cloud.storage.databinding;
import global.cloud.storage.R;
import global.cloud.storage.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDashboardBindingMdpiImpl extends ActivityDashboardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.gl_top, 1);
        sViewsWithIds.put(R.id.gl_second_top, 2);
        sViewsWithIds.put(R.id.tv_title, 3);
        sViewsWithIds.put(R.id.iv_plans, 4);
        sViewsWithIds.put(R.id.cl_main, 5);
        sViewsWithIds.put(R.id.gl_inner_card, 6);
        sViewsWithIds.put(R.id.cl_inner_main, 7);
        sViewsWithIds.put(R.id.tv_sub_title, 8);
        sViewsWithIds.put(R.id.tv_total, 9);
        sViewsWithIds.put(R.id.tv_used, 10);
        sViewsWithIds.put(R.id.progress_bar, 11);
        sViewsWithIds.put(R.id.tv_available, 12);
        sViewsWithIds.put(R.id.tv_available_storage, 13);
        sViewsWithIds.put(R.id.guideline_center, 14);
        sViewsWithIds.put(R.id.cv_audios, 15);
        sViewsWithIds.put(R.id.iv_music, 16);
        sViewsWithIds.put(R.id.tv_audios_size, 17);
        sViewsWithIds.put(R.id.cv_videos, 18);
        sViewsWithIds.put(R.id.iv_videos, 19);
        sViewsWithIds.put(R.id.tv_videos_size, 20);
        sViewsWithIds.put(R.id.cv_contacts, 21);
        sViewsWithIds.put(R.id.iv_contact, 22);
        sViewsWithIds.put(R.id.tv_contacts_size, 23);
        sViewsWithIds.put(R.id.cv_images, 24);
        sViewsWithIds.put(R.id.iv_image, 25);
        sViewsWithIds.put(R.id.tv_images_size, 26);
        sViewsWithIds.put(R.id.cv_documents, 27);
        sViewsWithIds.put(R.id.iv_doc, 28);
        sViewsWithIds.put(R.id.tv_docs_size, 29);
        sViewsWithIds.put(R.id.cv_apps, 30);
        sViewsWithIds.put(R.id.iv_app, 31);
        sViewsWithIds.put(R.id.tv_apps_size, 32);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDashboardBindingMdpiImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private ActivityDashboardBindingMdpiImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[30]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[21]
            , (androidx.cardview.widget.CardView) bindings[27]
            , (androidx.cardview.widget.CardView) bindings[24]
            , (androidx.cardview.widget.CardView) bindings[18]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[14]
            , (android.widget.ImageView) bindings[31]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ProgressBar) bindings[11]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[20]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}