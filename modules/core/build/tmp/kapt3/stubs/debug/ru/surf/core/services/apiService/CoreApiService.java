package ru.surf.core.services.apiService;

import java.lang.System;

/**
 * Base services for query separate by HTTP methods
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lru/surf/core/services/apiService/CoreApiService;", "Lru/surf/core/services/apiService/impl/ApiServiceDelete;", "Lru/surf/core/services/apiService/impl/ApiServiceGet;", "Lru/surf/core/services/apiService/impl/ApiServicePatch;", "Lru/surf/core/services/apiService/impl/ApiServicePost;", "Lru/surf/core/services/apiService/impl/ApiServicePut;", "api", "Lru/surf/core/services/api/CoreApi;", "(Lru/surf/core/services/api/CoreApi;)V", "getApi", "()Lru/surf/core/services/api/CoreApi;", "core_debug"})
public final class CoreApiService implements ru.surf.core.services.apiService.impl.ApiServiceDelete, ru.surf.core.services.apiService.impl.ApiServiceGet, ru.surf.core.services.apiService.impl.ApiServicePatch, ru.surf.core.services.apiService.impl.ApiServicePost, ru.surf.core.services.apiService.impl.ApiServicePut {
    @org.jetbrains.annotations.NotNull()
    private final ru.surf.core.services.api.CoreApi api = null;
    
    public CoreApiService(@org.jetbrains.annotations.NotNull()
    ru.surf.core.services.api.CoreApi api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.surf.core.services.api.CoreApi getApi() {
        return null;
    }
    
    /**
     * Get list settings from back-end
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getListSettings(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<? extends java.util.List<ru.surf.core.data.models.SettingsModel>>> p0) {
        return null;
    }
}