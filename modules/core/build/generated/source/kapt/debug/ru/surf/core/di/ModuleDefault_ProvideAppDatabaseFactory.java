// Generated by Dagger (https://dagger.dev).
package ru.surf.core.di;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import ru.surf.core.base.CoreDatabase;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ModuleDefault_ProvideAppDatabaseFactory implements Factory<CoreDatabase> {
  private final Provider<Application> applicationProvider;

  public ModuleDefault_ProvideAppDatabaseFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public CoreDatabase get() {
    return provideAppDatabase(applicationProvider.get());
  }

  public static ModuleDefault_ProvideAppDatabaseFactory create(
      Provider<Application> applicationProvider) {
    return new ModuleDefault_ProvideAppDatabaseFactory(applicationProvider);
  }

  public static CoreDatabase provideAppDatabase(Application application) {
    return Preconditions.checkNotNullFromProvides(ModuleDefault.INSTANCE.provideAppDatabase(application));
  }
}
