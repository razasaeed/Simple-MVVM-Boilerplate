// Generated by Dagger (https://dagger.dev).
package global.cloud.storage.ui.apps;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import global.cloud.storage.utils.FileUtils;
import global.cloud.storage.utils.PermissionUtils;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppsSelectionFragment_MembersInjector implements MembersInjector<AppsSelectionFragment> {
  private final Provider<PermissionUtils> permissionUtilsProvider;

  private final Provider<FileUtils> fileUtilsProvider;

  public AppsSelectionFragment_MembersInjector(Provider<PermissionUtils> permissionUtilsProvider,
      Provider<FileUtils> fileUtilsProvider) {
    this.permissionUtilsProvider = permissionUtilsProvider;
    this.fileUtilsProvider = fileUtilsProvider;
  }

  public static MembersInjector<AppsSelectionFragment> create(
      Provider<PermissionUtils> permissionUtilsProvider, Provider<FileUtils> fileUtilsProvider) {
    return new AppsSelectionFragment_MembersInjector(permissionUtilsProvider, fileUtilsProvider);
  }

  @Override
  public void injectMembers(AppsSelectionFragment instance) {
    injectPermissionUtils(instance, permissionUtilsProvider.get());
    injectFileUtils(instance, fileUtilsProvider.get());
  }

  @InjectedFieldSignature("global.cloud.storage.ui.apps.AppsSelectionFragment.permissionUtils")
  public static void injectPermissionUtils(AppsSelectionFragment instance,
      PermissionUtils permissionUtils) {
    instance.permissionUtils = permissionUtils;
  }

  @InjectedFieldSignature("global.cloud.storage.ui.apps.AppsSelectionFragment.fileUtils")
  public static void injectFileUtils(AppsSelectionFragment instance, FileUtils fileUtils) {
    instance.fileUtils = fileUtils;
  }
}
