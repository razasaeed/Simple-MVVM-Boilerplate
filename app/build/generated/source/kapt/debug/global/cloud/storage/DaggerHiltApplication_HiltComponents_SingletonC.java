// Generated by Dagger (https://dagger.dev).
package global.cloud.storage;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import global.cloud.storage.di.AppModule;
import global.cloud.storage.di.AuthModule;
import global.cloud.storage.di.NetworkModule;
import global.cloud.storage.di.NetworkModule_ProvideRetrofitFactory;
import global.cloud.storage.ui.apps.AppsSelectionFragment;
import global.cloud.storage.ui.apps.AppsSelectionFragment_MembersInjector;
import global.cloud.storage.ui.apps.AppsSelectionViewModel;
import global.cloud.storage.ui.apps.AppsSelectionViewModel_Factory;
import global.cloud.storage.ui.apps.AppsSelectionViewModel_HiltModules_KeyModule_ProvideFactory;
import global.cloud.storage.ui.apps.AppsSelectionViewModel_MembersInjector;
import global.cloud.storage.ui.dashboard.DashboardFragment;
import global.cloud.storage.ui.dashboard.DashboardFragment_MembersInjector;
import global.cloud.storage.ui.dashboard.DashboardViewModel;
import global.cloud.storage.ui.dashboard.DashboardViewModel_HiltModules_KeyModule_ProvideFactory;
import global.cloud.storage.ui.main.MainActivity;
import global.cloud.storage.ui.main.MainActivity_MembersInjector;
import global.cloud.storage.ui.splash.SplashFragment;
import global.cloud.storage.ui.splash.SplashFragment_MembersInjector;
import global.cloud.storage.ui.splash.SplashViewModel;
import global.cloud.storage.ui.splash.SplashViewModel_HiltModules_KeyModule_ProvideFactory;
import global.cloud.storage.utils.FileUtils;
import global.cloud.storage.utils.PermissionUtils;
import global.cloud.storage.utils.PrefsUtils;
import global.cloud.storage.utils.StorageUtils;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerHiltApplication_HiltComponents_SingletonC extends HiltApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final NetworkModule networkModule;

  private final DaggerHiltApplication_HiltComponents_SingletonC singletonC = this;

  private Provider<PrefsUtils> prefsUtilsProvider;

  private Provider<PermissionUtils> permissionUtilsProvider;

  private Provider<FileUtils> fileUtilsProvider;

  private Provider<StorageUtils> storageUtilsProvider;

  private DaggerHiltApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam, NetworkModule networkModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.networkModule = networkModuleParam;
    initialize(applicationContextModuleParam, networkModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private PermissionUtils permissionUtils() {
    return new PermissionUtils(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private FileUtils fileUtils() {
    return new FileUtils(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private Retrofit retrofit() {
    return NetworkModule_ProvideRetrofitFactory.provideRetrofit(networkModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam,
      final NetworkModule networkModuleParam) {
    this.prefsUtilsProvider = DoubleCheck.provider(new SwitchingProvider<PrefsUtils>(singletonC, 0));
    this.permissionUtilsProvider = DoubleCheck.provider(new SwitchingProvider<PermissionUtils>(singletonC, 1));
    this.fileUtilsProvider = DoubleCheck.provider(new SwitchingProvider<FileUtils>(singletonC, 2));
    this.storageUtilsProvider = DoubleCheck.provider(new SwitchingProvider<StorageUtils>(singletonC, 3));
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  @Override
  public void injectHiltApplication(HiltApplication hiltApplication) {
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private NetworkModule networkModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder authModule(AuthModule authModule) {
      Preconditions.checkNotNull(authModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public HiltApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new DaggerHiltApplication_HiltComponents_SingletonC(applicationContextModule, networkModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements HiltApplication_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerHiltApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public HiltApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements HiltApplication_HiltComponents.ActivityC.Builder {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public HiltApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements HiltApplication_HiltComponents.FragmentC.Builder {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public HiltApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements HiltApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public HiltApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements HiltApplication_HiltComponents.ViewC.Builder {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public HiltApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements HiltApplication_HiltComponents.ViewModelC.Builder {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public HiltApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements HiltApplication_HiltComponents.ServiceC.Builder {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerHiltApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public HiltApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends HiltApplication_HiltComponents.ViewWithFragmentC {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends HiltApplication_HiltComponents.FragmentC {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    @Override
    public void injectAppsSelectionFragment(AppsSelectionFragment appsSelectionFragment) {
      injectAppsSelectionFragment2(appsSelectionFragment);
    }

    @Override
    public void injectDashboardFragment(DashboardFragment dashboardFragment) {
      injectDashboardFragment2(dashboardFragment);
    }

    @Override
    public void injectSplashFragment(SplashFragment splashFragment) {
      injectSplashFragment2(splashFragment);
    }

    private AppsSelectionFragment injectAppsSelectionFragment2(AppsSelectionFragment instance) {
      AppsSelectionFragment_MembersInjector.injectPermissionUtils(instance, singletonC.permissionUtilsProvider.get());
      AppsSelectionFragment_MembersInjector.injectFileUtils(instance, singletonC.fileUtilsProvider.get());
      return instance;
    }

    private DashboardFragment injectDashboardFragment2(DashboardFragment instance) {
      DashboardFragment_MembersInjector.injectPermissionUtils(instance, singletonC.permissionUtilsProvider.get());
      DashboardFragment_MembersInjector.injectPrefsUtils(instance, singletonC.prefsUtilsProvider.get());
      DashboardFragment_MembersInjector.injectStorageUtils(instance, singletonC.storageUtilsProvider.get());
      DashboardFragment_MembersInjector.injectFileUtils(instance, singletonC.fileUtilsProvider.get());
      return instance;
    }

    private SplashFragment injectSplashFragment2(SplashFragment instance) {
      SplashFragment_MembersInjector.injectPrefsUtils(instance, singletonC.prefsUtilsProvider.get());
      return instance;
    }
  }

  private static final class ViewCImpl extends HiltApplication_HiltComponents.ViewC {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends HiltApplication_HiltComponents.ActivityC {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(3).add(AppsSelectionViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(DashboardViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SplashViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
      injectMainActivity2(mainActivity);
    }

    private MainActivity injectMainActivity2(MainActivity instance) {
      MainActivity_MembersInjector.injectPrefsUtils(instance, singletonC.prefsUtilsProvider.get());
      return instance;
    }
  }

  private static final class ViewModelCImpl extends HiltApplication_HiltComponents.ViewModelC {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AppsSelectionViewModel> appsSelectionViewModelProvider;

    private Provider<DashboardViewModel> dashboardViewModelProvider;

    private Provider<SplashViewModel> splashViewModelProvider;

    private ViewModelCImpl(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    private AppsSelectionViewModel appsSelectionViewModel() {
      return injectAppsSelectionViewModel(AppsSelectionViewModel_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule)));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.appsSelectionViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
      this.dashboardViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 1);
      this.splashViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 2);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(3).put("global.cloud.storage.ui.apps.AppsSelectionViewModel", (Provider) appsSelectionViewModelProvider).put("global.cloud.storage.ui.dashboard.DashboardViewModel", (Provider) dashboardViewModelProvider).put("global.cloud.storage.ui.splash.SplashViewModel", (Provider) splashViewModelProvider).build();
    }

    private AppsSelectionViewModel injectAppsSelectionViewModel(AppsSelectionViewModel instance) {
      AppsSelectionViewModel_MembersInjector.injectRetrofitBuilder(instance, singletonC.retrofit());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // global.cloud.storage.ui.apps.AppsSelectionViewModel 
          return (T) viewModelCImpl.appsSelectionViewModel();

          case 1: // global.cloud.storage.ui.dashboard.DashboardViewModel 
          return (T) new DashboardViewModel();

          case 2: // global.cloud.storage.ui.splash.SplashViewModel 
          return (T) new SplashViewModel();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends HiltApplication_HiltComponents.ActivityRetainedC {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerHiltApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends HiltApplication_HiltComponents.ServiceC {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerHiltApplication_HiltComponents_SingletonC singletonC,
        Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerHiltApplication_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerHiltApplication_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // global.cloud.storage.utils.PrefsUtils 
        return (T) new PrefsUtils();

        case 1: // global.cloud.storage.utils.PermissionUtils 
        return (T) singletonC.permissionUtils();

        case 2: // global.cloud.storage.utils.FileUtils 
        return (T) singletonC.fileUtils();

        case 3: // global.cloud.storage.utils.StorageUtils 
        return (T) new StorageUtils();

        default: throw new AssertionError(id);
      }
    }
  }
}
