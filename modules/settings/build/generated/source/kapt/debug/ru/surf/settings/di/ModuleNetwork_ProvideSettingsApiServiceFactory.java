// Generated by Dagger (https://dagger.dev).
package ru.surf.settings.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import ru.surf.settings.services.api.SettingsApi;
import ru.surf.settings.services.apiService.SettingsApiService;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ModuleNetwork_ProvideSettingsApiServiceFactory implements Factory<SettingsApiService> {
  private final Provider<SettingsApi> apiProvider;

  public ModuleNetwork_ProvideSettingsApiServiceFactory(Provider<SettingsApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public SettingsApiService get() {
    return provideSettingsApiService(apiProvider.get());
  }

  public static ModuleNetwork_ProvideSettingsApiServiceFactory create(
      Provider<SettingsApi> apiProvider) {
    return new ModuleNetwork_ProvideSettingsApiServiceFactory(apiProvider);
  }

  public static SettingsApiService provideSettingsApiService(SettingsApi api) {
    return Preconditions.checkNotNullFromProvides(ModuleNetwork.INSTANCE.provideSettingsApiService(api));
  }
}
