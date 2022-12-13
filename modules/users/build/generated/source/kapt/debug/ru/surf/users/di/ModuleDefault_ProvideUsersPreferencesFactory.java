// Generated by Dagger (https://dagger.dev).
package ru.surf.users.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import ru.surf.core.data.preferences.CorePreferences;
import ru.surf.users.data.preferences.UsersPreferences;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ModuleDefault_ProvideUsersPreferencesFactory implements Factory<UsersPreferences> {
  private final Provider<CorePreferences> corePreferencesProvider;

  public ModuleDefault_ProvideUsersPreferencesFactory(
      Provider<CorePreferences> corePreferencesProvider) {
    this.corePreferencesProvider = corePreferencesProvider;
  }

  @Override
  public UsersPreferences get() {
    return provideUsersPreferences(corePreferencesProvider.get());
  }

  public static ModuleDefault_ProvideUsersPreferencesFactory create(
      Provider<CorePreferences> corePreferencesProvider) {
    return new ModuleDefault_ProvideUsersPreferencesFactory(corePreferencesProvider);
  }

  public static UsersPreferences provideUsersPreferences(CorePreferences corePreferences) {
    return Preconditions.checkNotNullFromProvides(ModuleDefault.INSTANCE.provideUsersPreferences(corePreferences));
  }
}
