package ru.surf.users.di;

import java.lang.System;

/**
 * Dagger Module base for module (users)
 *
 * @author Vitaliy Zarubin
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lru/surf/users/di/ModuleDefault;", "", "()V", "provideUsersDataService", "Lru/surf/users/services/dataService/UsersDataService;", "db", "Lru/surf/users/base/UsersDatabase;", "provideUsersDatabase", "application", "Landroid/app/Application;", "provideUsersPreferences", "Lru/surf/users/data/preferences/UsersPreferences;", "corePreferences", "Lru/surf/core/data/preferences/CorePreferences;", "users_debug"})
@dagger.Module()
public final class ModuleDefault {
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.users.di.ModuleDefault INSTANCE = null;
    
    private ModuleDefault() {
        super();
    }
    
    /**
     * A database that doesn't need migrations and encryption
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.surf.users.base.UsersDatabase provideUsersDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    /**
     * Database management service
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.surf.users.services.dataService.UsersDataService provideUsersDataService(@org.jetbrains.annotations.NotNull()
    ru.surf.users.base.UsersDatabase db) {
        return null;
    }
    
    /**
     * Shared preferences service
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.surf.users.data.preferences.UsersPreferences provideUsersPreferences(@org.jetbrains.annotations.NotNull()
    ru.surf.core.data.preferences.CorePreferences corePreferences) {
        return null;
    }
}