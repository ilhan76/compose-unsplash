package ru.surf.core.services.apiService.impl;

import java.lang.System;

/**
 * The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lru/surf/core/services/apiService/impl/ApiServiceGet;", "", "api", "Lru/surf/core/services/api/CoreApi;", "getApi", "()Lru/surf/core/services/api/CoreApi;", "getListSettings", "Lru/surfstudio/compose/response/ResponseResult;", "", "Lru/surf/core/data/models/SettingsModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface ApiServiceGet {
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.surf.core.services.api.CoreApi getApi();
    
    /**
     * Get list settings from back-end
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getListSettings(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<? extends java.util.List<ru.surf.core.data.models.SettingsModel>>> continuation);
    
    /**
     * The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Get list settings from back-end
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object getListSettings(@org.jetbrains.annotations.NotNull()
        ru.surf.core.services.apiService.impl.ApiServiceGet $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<? extends java.util.List<ru.surf.core.data.models.SettingsModel>>> p1) {
            return null;
        }
    }
}