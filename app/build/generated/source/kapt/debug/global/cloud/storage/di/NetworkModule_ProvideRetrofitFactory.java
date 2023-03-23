// Generated by Dagger (https://dagger.dev).
package global.cloud.storage.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<Context> contextProvider;

  public NetworkModule_ProvideRetrofitFactory(NetworkModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, contextProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(NetworkModule module,
      Provider<Context> contextProvider) {
    return new NetworkModule_ProvideRetrofitFactory(module, contextProvider);
  }

  public static Retrofit provideRetrofit(NetworkModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit(context));
  }
}