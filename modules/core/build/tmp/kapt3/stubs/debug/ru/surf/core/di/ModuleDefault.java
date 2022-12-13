package ru.surf.core.di;

import java.lang.System;

/**
 * Dagger Module base for module (core)
 *
 * @author Vitaliy Zarubin
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u001c\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020\rH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lru/surf/core/di/ModuleDefault;", "", "()V", "migrations", "", "Landroidx/room/migration/Migration;", "password", "", "provideAppDatabase", "Lru/surf/core/base/CoreDatabase;", "application", "Landroid/app/Application;", "provideCoreSecurityDatabase", "Lru/surf/core/base/CoreSecurityDatabase;", "context", "Landroid/content/Context;", "provideSharedPreferences", "Lru/surf/core/data/preferences/CorePreferences;", "provideUsersDataService", "Lru/surf/core/services/dataService/CoreDataService;", "db", "dbSecurity", "core_debug"})
@dagger.Module()
public final class ModuleDefault {
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.core.di.ModuleDefault INSTANCE = null;
    
    /**
     * Base encryption key
     */
    private static final java.lang.String password = "iyQtXqqG03I6UP1cHAqJ";
    
    /**
     * List with migrations for the database
     */
    private static final java.util.List<androidx.room.migration.Migration> migrations = null;
    
    private ModuleDefault() {
        super();
    }
    
    /**
     * Database with encryption and migrations
     */
    @org.jetbrains.annotations.NotNull()
    @ru.surf.core.base.CoreDatabaseSecurityQualifier()
    @dagger.Provides()
    public final ru.surf.core.base.CoreSecurityDatabase provideCoreSecurityDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    /**
     * A database that doesn't need migrations and encryption
     */
    @org.jetbrains.annotations.NotNull()
    @ru.surf.core.base.CoreDatabaseQualifier()
    @dagger.Provides()
    public final ru.surf.core.base.CoreDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    /**
     * Database management service
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.surf.core.services.dataService.CoreDataService provideUsersDataService(@org.jetbrains.annotations.NotNull()
    @ru.surf.core.base.CoreDatabaseQualifier()
    ru.surf.core.base.CoreDatabase db, @org.jetbrains.annotations.NotNull()
    @ru.surf.core.base.CoreDatabaseSecurityQualifier()
    ru.surf.core.base.CoreSecurityDatabase dbSecurity) {
        return null;
    }
    
    /**
     * Shared preferences service
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.surf.core.data.preferences.CorePreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
}