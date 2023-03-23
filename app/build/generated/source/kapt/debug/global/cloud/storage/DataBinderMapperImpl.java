package global.cloud.storage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import global.cloud.storage.databinding.ActivityDashboardBindingImpl;
import global.cloud.storage.databinding.ActivityDashboardBindingMdpiImpl;
import global.cloud.storage.databinding.ActivityMainBindingImpl;
import global.cloud.storage.databinding.ActivitySplashBindingImpl;
import global.cloud.storage.databinding.ActivityToolbarBindingImpl;
import global.cloud.storage.databinding.AppsCellBindingImpl;
import global.cloud.storage.databinding.AppsSelectionFragmentBindingImpl;
import global.cloud.storage.databinding.DeleteProgressLayoutBindingImpl;
import global.cloud.storage.databinding.DialogAllFilesAccessDetailBindingImpl;
import global.cloud.storage.databinding.DialogAttentionBindingImpl;
import global.cloud.storage.databinding.DialogPermissionDetailBindingImpl;
import global.cloud.storage.databinding.DialogPrivacyPolicyBindingImpl;
import global.cloud.storage.databinding.InternetConnectionDetailBindingImpl;
import global.cloud.storage.databinding.ItemLoadingStateBindingImpl;
import global.cloud.storage.databinding.LayoutSearchBindingImpl;
import global.cloud.storage.databinding.LayoutSelectAllBindingImpl;
import global.cloud.storage.databinding.LayoutStorageNotReadyBindingImpl;
import global.cloud.storage.databinding.MainButtonBindingImpl;
import global.cloud.storage.databinding.NoPermissionBindingImpl;
import global.cloud.storage.databinding.UploadProgressLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDASHBOARD = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYSPLASH = 3;

  private static final int LAYOUT_ACTIVITYTOOLBAR = 4;

  private static final int LAYOUT_APPSCELL = 5;

  private static final int LAYOUT_APPSSELECTIONFRAGMENT = 6;

  private static final int LAYOUT_DELETEPROGRESSLAYOUT = 7;

  private static final int LAYOUT_DIALOGALLFILESACCESSDETAIL = 8;

  private static final int LAYOUT_DIALOGATTENTION = 9;

  private static final int LAYOUT_DIALOGPERMISSIONDETAIL = 10;

  private static final int LAYOUT_DIALOGPRIVACYPOLICY = 11;

  private static final int LAYOUT_INTERNETCONNECTIONDETAIL = 12;

  private static final int LAYOUT_ITEMLOADINGSTATE = 13;

  private static final int LAYOUT_LAYOUTSEARCH = 14;

  private static final int LAYOUT_LAYOUTSELECTALL = 15;

  private static final int LAYOUT_LAYOUTSTORAGENOTREADY = 16;

  private static final int LAYOUT_MAINBUTTON = 17;

  private static final int LAYOUT_NOPERMISSION = 18;

  private static final int LAYOUT_UPLOADPROGRESSLAYOUT = 19;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(19);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.activity_dashboard, LAYOUT_ACTIVITYDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.activity_toolbar, LAYOUT_ACTIVITYTOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.apps_cell, LAYOUT_APPSCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.apps_selection_fragment, LAYOUT_APPSSELECTIONFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.delete_progress_layout, LAYOUT_DELETEPROGRESSLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.dialog_all_files_access_detail, LAYOUT_DIALOGALLFILESACCESSDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.dialog_attention, LAYOUT_DIALOGATTENTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.dialog_permission_detail, LAYOUT_DIALOGPERMISSIONDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.dialog_privacy_policy, LAYOUT_DIALOGPRIVACYPOLICY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.internet_connection_detail, LAYOUT_INTERNETCONNECTIONDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.item_loading_state, LAYOUT_ITEMLOADINGSTATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.layout_search, LAYOUT_LAYOUTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.layout_select_all, LAYOUT_LAYOUTSELECTALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.layout_storage_not_ready, LAYOUT_LAYOUTSTORAGENOTREADY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.main_button, LAYOUT_MAINBUTTON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.no_permission, LAYOUT_NOPERMISSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(global.cloud.storage.R.layout.upload_progress_layout, LAYOUT_UPLOADPROGRESSLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDASHBOARD: {
          if ("layout/activity_dashboard_0".equals(tag)) {
            return new ActivityDashboardBindingImpl(component, view);
          }
          if ("layout-mdpi/activity_dashboard_0".equals(tag)) {
            return new ActivityDashboardBindingMdpiImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTOOLBAR: {
          if ("layout/activity_toolbar_0".equals(tag)) {
            return new ActivityToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_APPSCELL: {
          if ("layout/apps_cell_0".equals(tag)) {
            return new AppsCellBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for apps_cell is invalid. Received: " + tag);
        }
        case  LAYOUT_APPSSELECTIONFRAGMENT: {
          if ("layout/apps_selection_fragment_0".equals(tag)) {
            return new AppsSelectionFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for apps_selection_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DELETEPROGRESSLAYOUT: {
          if ("layout/delete_progress_layout_0".equals(tag)) {
            return new DeleteProgressLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delete_progress_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGALLFILESACCESSDETAIL: {
          if ("layout/dialog_all_files_access_detail_0".equals(tag)) {
            return new DialogAllFilesAccessDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_all_files_access_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGATTENTION: {
          if ("layout/dialog_attention_0".equals(tag)) {
            return new DialogAttentionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_attention is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGPERMISSIONDETAIL: {
          if ("layout/dialog_permission_detail_0".equals(tag)) {
            return new DialogPermissionDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_permission_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGPRIVACYPOLICY: {
          if ("layout/dialog_privacy_policy_0".equals(tag)) {
            return new DialogPrivacyPolicyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_privacy_policy is invalid. Received: " + tag);
        }
        case  LAYOUT_INTERNETCONNECTIONDETAIL: {
          if ("layout/internet_connection_detail_0".equals(tag)) {
            return new InternetConnectionDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for internet_connection_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLOADINGSTATE: {
          if ("layout/item_loading_state_0".equals(tag)) {
            return new ItemLoadingStateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_loading_state is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSEARCH: {
          if ("layout/layout_search_0".equals(tag)) {
            return new LayoutSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_search is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSELECTALL: {
          if ("layout/layout_select_all_0".equals(tag)) {
            return new LayoutSelectAllBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_select_all is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSTORAGENOTREADY: {
          if ("layout/layout_storage_not_ready_0".equals(tag)) {
            return new LayoutStorageNotReadyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_storage_not_ready is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINBUTTON: {
          if ("layout/main_button_0".equals(tag)) {
            return new MainButtonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_button is invalid. Received: " + tag);
        }
        case  LAYOUT_NOPERMISSION: {
          if ("layout/no_permission_0".equals(tag)) {
            return new NoPermissionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for no_permission is invalid. Received: " + tag);
        }
        case  LAYOUT_UPLOADPROGRESSLAYOUT: {
          if ("layout/upload_progress_layout_0".equals(tag)) {
            return new UploadProgressLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for upload_progress_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(20);

    static {
      sKeys.put("layout/activity_dashboard_0", global.cloud.storage.R.layout.activity_dashboard);
      sKeys.put("layout-mdpi/activity_dashboard_0", global.cloud.storage.R.layout.activity_dashboard);
      sKeys.put("layout/activity_main_0", global.cloud.storage.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", global.cloud.storage.R.layout.activity_splash);
      sKeys.put("layout/activity_toolbar_0", global.cloud.storage.R.layout.activity_toolbar);
      sKeys.put("layout/apps_cell_0", global.cloud.storage.R.layout.apps_cell);
      sKeys.put("layout/apps_selection_fragment_0", global.cloud.storage.R.layout.apps_selection_fragment);
      sKeys.put("layout/delete_progress_layout_0", global.cloud.storage.R.layout.delete_progress_layout);
      sKeys.put("layout/dialog_all_files_access_detail_0", global.cloud.storage.R.layout.dialog_all_files_access_detail);
      sKeys.put("layout/dialog_attention_0", global.cloud.storage.R.layout.dialog_attention);
      sKeys.put("layout/dialog_permission_detail_0", global.cloud.storage.R.layout.dialog_permission_detail);
      sKeys.put("layout/dialog_privacy_policy_0", global.cloud.storage.R.layout.dialog_privacy_policy);
      sKeys.put("layout/internet_connection_detail_0", global.cloud.storage.R.layout.internet_connection_detail);
      sKeys.put("layout/item_loading_state_0", global.cloud.storage.R.layout.item_loading_state);
      sKeys.put("layout/layout_search_0", global.cloud.storage.R.layout.layout_search);
      sKeys.put("layout/layout_select_all_0", global.cloud.storage.R.layout.layout_select_all);
      sKeys.put("layout/layout_storage_not_ready_0", global.cloud.storage.R.layout.layout_storage_not_ready);
      sKeys.put("layout/main_button_0", global.cloud.storage.R.layout.main_button);
      sKeys.put("layout/no_permission_0", global.cloud.storage.R.layout.no_permission);
      sKeys.put("layout/upload_progress_layout_0", global.cloud.storage.R.layout.upload_progress_layout);
    }
  }
}
