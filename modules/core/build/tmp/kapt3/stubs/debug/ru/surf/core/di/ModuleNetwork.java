package ru.surf.core.di;

import java.lang.System;

/**
 * Module Dagger responsible for api services
 *
 * @author Vitaliy Zarubin
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lru/surf/core/di/ModuleNetwork;", "", "()V", "provideCoreApi", "Lru/surf/core/services/api/CoreApi;", "retrofit", "Lretrofit2/Retrofit;", "provideUsersApiService", "Lru/surf/core/services/apiService/CoreApiService;", "api", "core_debug"})
@dagger.Module()
public final class ModuleNetwork {
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.core.di.ModuleNetwork INSTANCE = null;
    
    private ModuleNetwork() {
        super();
    }
    
    /**
     * HTTP API into a interface
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.surf.core.services.api.CoreApi provideCoreApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * HTTP query service
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.surf.core.services.apiService.CoreApiService provideUsersApiService(@org.jetbrains.annotations.NotNull()
    ru.surf.core.services.api.CoreApi api) {
        return null;
    }
}