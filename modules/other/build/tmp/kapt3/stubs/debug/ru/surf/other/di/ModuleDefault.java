package ru.surf.other.di;

import java.lang.System;

/**
 * Dagger Module base for module (other)
 *
 * @author Vitaliy Zarubin
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lru/surf/other/di/ModuleDefault;", "", "()V", "provideOtherPreferences", "Lru/surf/other/data/preferences/OtherPreferences;", "corePreferences", "Lru/surf/core/data/preferences/CorePreferences;", "other_debug"})
@dagger.Module()
public final class ModuleDefault {
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.other.di.ModuleDefault INSTANCE = null;
    
    private ModuleDefault() {
        super();
    }
    
    /**
     * Shared preferences service
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.surf.other.data.preferences.OtherPreferences provideOtherPreferences(@org.jetbrains.annotations.NotNull()
    ru.surf.core.data.preferences.CorePreferences corePreferences) {
        return null;
    }
}