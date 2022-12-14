// Generated by Dagger (https://dagger.dev).
package ru.surf.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
import ru.surf.core.services.api.CoreApi;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ModuleNetwork_ProvideCoreApiFactory implements Factory<CoreApi> {
  private final Provider<Retrofit> retrofitProvider;

  public ModuleNetwork_ProvideCoreApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CoreApi get() {
    return provideCoreApi(retrofitProvider.get());
  }

  public static ModuleNetwork_ProvideCoreApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new ModuleNetwork_ProvideCoreApiFactory(retrofitProvider);
  }

  public static CoreApi provideCoreApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ModuleNetwork.INSTANCE.provideCoreApi(retrofit));
  }
}
