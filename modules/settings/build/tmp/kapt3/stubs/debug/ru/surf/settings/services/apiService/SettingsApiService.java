package ru.surf.settings.services.apiService;

import java.lang.System;

/**
 * Base services for query separate by HTTP methods
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lru/surf/settings/services/apiService/SettingsApiService;", "Lru/surf/settings/services/apiService/impl/ApiServiceDelete;", "Lru/surf/settings/services/apiService/impl/ApiServiceGet;", "Lru/surf/settings/services/apiService/impl/ApiServicePatch;", "Lru/surf/settings/services/apiService/impl/ApiServicePost;", "Lru/surf/settings/services/apiService/impl/ApiServicePut;", "api", "Lru/surf/settings/services/api/SettingsApi;", "(Lru/surf/settings/services/api/SettingsApi;)V", "getApi", "()Lru/surf/settings/services/api/SettingsApi;", "settings_debug"})
public final class SettingsApiService implements ru.surf.settings.services.apiService.impl.ApiServiceDelete, ru.surf.settings.services.apiService.impl.ApiServiceGet, ru.surf.settings.services.apiService.impl.ApiServicePatch, ru.surf.settings.services.apiService.impl.ApiServicePost, ru.surf.settings.services.apiService.impl.ApiServicePut {
    @org.jetbrains.annotations.NotNull()
    private final ru.surf.settings.services.api.SettingsApi api = null;
    
    public SettingsApiService(@org.jetbrains.annotations.NotNull()
    ru.surf.settings.services.api.SettingsApi api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.surf.settings.services.api.SettingsApi getApi() {
        return null;
    }
}