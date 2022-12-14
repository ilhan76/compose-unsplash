// Generated by Dagger (https://dagger.dev).
package ru.surf.users.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import ru.surf.users.services.api.UsersApi;
import ru.surf.users.services.apiService.UsersApiService;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ModuleNetwork_ProvideUsersApiServiceFactory implements Factory<UsersApiService> {
  private final Provider<UsersApi> apiProvider;

  public ModuleNetwork_ProvideUsersApiServiceFactory(Provider<UsersApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public UsersApiService get() {
    return provideUsersApiService(apiProvider.get());
  }

  public static ModuleNetwork_ProvideUsersApiServiceFactory create(Provider<UsersApi> apiProvider) {
    return new ModuleNetwork_ProvideUsersApiServiceFactory(apiProvider);
  }

  public static UsersApiService provideUsersApiService(UsersApi api) {
    return Preconditions.checkNotNullFromProvides(ModuleNetwork.INSTANCE.provideUsersApiService(api));
  }
}
