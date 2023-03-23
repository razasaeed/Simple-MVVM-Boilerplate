// Generated by data binding compiler. Do not edit!
package global.cloud.storage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import global.cloud.storage.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDashboardBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clInnerMain;

  @NonNull
  public final ConstraintLayout clMain;

  @NonNull
  public final CardView cvApps;

  @NonNull
  public final CardView cvAudios;

  @NonNull
  public final CardView cvContacts;

  @NonNull
  public final CardView cvDocuments;

  @NonNull
  public final CardView cvImages;

  @NonNull
  public final CardView cvVideos;

  @NonNull
  public final Guideline glInnerCard;

  @NonNull
  public final Guideline glSecondTop;

  @NonNull
  public final Guideline glTop;

  @NonNull
  public final Guideline guidelineCenter;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-mdpi/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final ImageView ivApp;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-mdpi/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final ImageView ivContact;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-mdpi/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final ImageView ivDoc;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-mdpi/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final ImageView ivImage;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-mdpi/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final ImageView ivMusic;

  @NonNull
  public final ImageView ivPlans;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-mdpi/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final ImageView ivVideos;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView tvAppsSize;

  @NonNull
  public final TextView tvAudiosSize;

  @NonNull
  public final TextView tvAvailable;

  @NonNull
  public final TextView tvAvailableStorage;

  @NonNull
  public final TextView tvContactsSize;

  @NonNull
  public final TextView tvDocsSize;

  @NonNull
  public final TextView tvImagesSize;

  @NonNull
  public final TextView tvSubTitle;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView tvTotal;

  @NonNull
  public final TextView tvUsed;

  @NonNull
  public final TextView tvVideosSize;

  protected ActivityDashboardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clInnerMain, ConstraintLayout clMain, CardView cvApps, CardView cvAudios,
      CardView cvContacts, CardView cvDocuments, CardView cvImages, CardView cvVideos,
      Guideline glInnerCard, Guideline glSecondTop, Guideline glTop, Guideline guidelineCenter,
      ImageView ivApp, ImageView ivContact, ImageView ivDoc, ImageView ivImage, ImageView ivMusic,
      ImageView ivPlans, ImageView ivVideos, ProgressBar progressBar, TextView tvAppsSize,
      TextView tvAudiosSize, TextView tvAvailable, TextView tvAvailableStorage,
      TextView tvContactsSize, TextView tvDocsSize, TextView tvImagesSize, TextView tvSubTitle,
      TextView tvTitle, TextView tvTotal, TextView tvUsed, TextView tvVideosSize) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clInnerMain = clInnerMain;
    this.clMain = clMain;
    this.cvApps = cvApps;
    this.cvAudios = cvAudios;
    this.cvContacts = cvContacts;
    this.cvDocuments = cvDocuments;
    this.cvImages = cvImages;
    this.cvVideos = cvVideos;
    this.glInnerCard = glInnerCard;
    this.glSecondTop = glSecondTop;
    this.glTop = glTop;
    this.guidelineCenter = guidelineCenter;
    this.ivApp = ivApp;
    this.ivContact = ivContact;
    this.ivDoc = ivDoc;
    this.ivImage = ivImage;
    this.ivMusic = ivMusic;
    this.ivPlans = ivPlans;
    this.ivVideos = ivVideos;
    this.progressBar = progressBar;
    this.tvAppsSize = tvAppsSize;
    this.tvAudiosSize = tvAudiosSize;
    this.tvAvailable = tvAvailable;
    this.tvAvailableStorage = tvAvailableStorage;
    this.tvContactsSize = tvContactsSize;
    this.tvDocsSize = tvDocsSize;
    this.tvImagesSize = tvImagesSize;
    this.tvSubTitle = tvSubTitle;
    this.tvTitle = tvTitle;
    this.tvTotal = tvTotal;
    this.tvUsed = tvUsed;
    this.tvVideosSize = tvVideosSize;
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_dashboard, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDashboardBinding>inflateInternal(inflater, R.layout.activity_dashboard, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_dashboard, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDashboardBinding>inflateInternal(inflater, R.layout.activity_dashboard, null, false, component);
  }

  public static ActivityDashboardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityDashboardBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDashboardBinding)bind(component, view, R.layout.activity_dashboard);
  }
}