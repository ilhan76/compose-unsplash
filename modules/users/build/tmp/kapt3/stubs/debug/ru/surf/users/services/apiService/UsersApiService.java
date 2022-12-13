package ru.surf.users.services.apiService;

import java.lang.System;

/**
 * Base services for query separate by HTTP methods
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lru/surf/users/services/apiService/UsersApiService;", "Lru/surf/users/services/apiService/impl/ApiServiceDelete;", "Lru/surf/users/services/apiService/impl/ApiServiceGet;", "Lru/surf/users/services/apiService/impl/ApiServicePatch;", "Lru/surf/users/services/apiService/impl/ApiServicePost;", "Lru/surf/users/services/apiService/impl/ApiServicePut;", "api", "Lru/surf/users/services/api/UsersApi;", "(Lru/surf/users/services/api/UsersApi;)V", "getApi", "()Lru/surf/users/services/api/UsersApi;", "users_debug"})
public final class UsersApiService implements ru.surf.users.services.apiService.impl.ApiServiceDelete, ru.surf.users.services.apiService.impl.ApiServiceGet, ru.surf.users.services.apiService.impl.ApiServicePatch, ru.surf.users.services.apiService.impl.ApiServicePost, ru.surf.users.services.apiService.impl.ApiServicePut {
    @org.jetbrains.annotations.NotNull()
    private final ru.surf.users.services.api.UsersApi api = null;
    
    public UsersApiService(@org.jetbrains.annotations.NotNull()
    ru.surf.users.services.api.UsersApi api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.surf.users.services.api.UsersApi getApi() {
        return null;
    }
    
    /**
     * Get list models [UserModel]
     *
     * @param offset mysql offset
     * @param search find models by name
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getListUsers(int offset, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<? extends java.util.List<ru.surf.users.data.models.UserModel>>> p2) {
        return null;
    }
    
    /**
     * Update view with model [UserModel]
     *
     * @param userId string user identifier
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getViewUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.users.data.models.UserModel>> p1) {
        return null;
    }
}