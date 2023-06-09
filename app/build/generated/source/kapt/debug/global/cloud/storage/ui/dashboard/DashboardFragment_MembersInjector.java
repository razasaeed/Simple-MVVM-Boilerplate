// Generated by Dagger (https://dagger.dev).
package global.cloud.storage.ui.dashboard;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import global.cloud.storage.utils.FileUtils;
import global.cloud.storage.utils.PermissionUtils;
import global.cloud.storage.utils.PrefsUtils;
import global.cloud.storage.utils.StorageUtils;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DashboardFragment_MembersInjector implements MembersInjector<DashboardFragment> {
  private final Provider<PermissionUtils> permissionUtilsProvider;

  private final Provider<PrefsUtils> prefsUtilsProvider;

  private final Provider<StorageUtils> storageUtilsProvider;

  private final Provider<FileUtils> fileUtilsProvider;

  public DashboardFragment_MembersInjector(Provider<PermissionUtils> permissionUtilsProvider,
      Provider<PrefsUtils> prefsUtilsProvider, Provider<StorageUtils> storageUtilsProvider,
      Provider<FileUtils> fileUtilsProvider) {
    this.permissionUtilsProvider = permissionUtilsProvider;
    this.prefsUtilsProvider = prefsUtilsProvider;
    this.storageUtilsProvider = storageUtilsProvider;
    this.fileUtilsProvider = fileUtilsProvider;
  }

  public static MembersInjector<DashboardFragment> create(
      Provider<PermissionUtils> permissionUtilsProvider, Provider<PrefsUtils> prefsUtilsProvider,
      Provider<StorageUtils> storageUtilsProvider, Provider<FileUtils> fileUtilsProvider) {
    return new DashboardFragment_MembersInjector(permissionUtilsProvider, prefsUtilsProvider, storageUtilsProvider, fileUtilsProvider);
  }

  @Override
  public void injectMembers(DashboardFragment instance) {
    injectPermissionUtils(instance, permissionUtilsProvider.get());
    injectPrefsUtils(instance, prefsUtilsProvider.get());
    injectStorageUtils(instance, storageUtilsProvider.get());
    injectFileUtils(instance, fileUtilsProvider.get());
  }

  @InjectedFieldSignature("global.cloud.storage.ui.dashboard.DashboardFragment.permissionUtils")
  public static void injectPermissionUtils(DashboardFragment instance,
      PermissionUtils permissionUtils) {
    instance.permissionUtils = permissionUtils;
  }

  @InjectedFieldSignature("global.cloud.storage.ui.dashboard.DashboardFragment.prefsUtils")
  public static void injectPrefsUtils(DashboardFragment instance, PrefsUtils prefsUtils) {
    instance.prefsUtils = prefsUtils;
  }

  @InjectedFieldSignature("global.cloud.storage.ui.dashboard.DashboardFragment.storageUtils")
  public static void injectStorageUtils(DashboardFragment instance, StorageUtils storageUtils) {
    instance.storageUtils = storageUtils;
  }

  @InjectedFieldSignature("global.cloud.storage.ui.dashboard.DashboardFragment.fileUtils")
  public static void injectFileUtils(DashboardFragment instance, FileUtils fileUtils) {
    instance.fileUtils = fileUtils;
  }
}
