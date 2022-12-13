package ru.surf.users.services.apiService.impl;

import java.lang.System;

/**
 * The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J1\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0010\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lru/surf/users/services/apiService/impl/ApiServiceGet;", "", "api", "Lru/surf/users/services/api/UsersApi;", "getApi", "()Lru/surf/users/services/api/UsersApi;", "getListUsers", "Lru/surfstudio/compose/response/ResponseResult;", "", "Lru/surf/users/data/models/UserModel;", "offset", "", "search", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getViewUser", "userId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "users_debug"})
public abstract interface ApiServiceGet {
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.surf.users.services.api.UsersApi getApi();
    
    /**
     * Get list models [UserModel]
     *
     * @param offset mysql offset
     * @param search find models by name
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getListUsers(int offset, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<? extends java.util.List<ru.surf.users.data.models.UserModel>>> continuation);
    
    /**
     * Update view with model [UserModel]
     *
     * @param userId string user identifier
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getViewUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.users.data.models.UserModel>> continuation);
    
    /**
     * The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Get list models [UserModel]
         *
         * @param offset mysql offset
         * @param search find models by name
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object getListUsers(@org.jetbrains.annotations.NotNull()
        ru.surf.users.services.apiService.impl.ApiServiceGet $this, int offset, @org.jetbrains.annotations.Nullable()
        java.lang.String search, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<? extends java.util.List<ru.surf.users.data.models.UserModel>>> p3) {
            return null;
        }
        
        /**
         * Update view with model [UserModel]
         *
         * @param userId string user identifier
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object getViewUser(@org.jetbrains.annotations.NotNull()
        ru.surf.users.services.apiService.impl.ApiServiceGet $this, @org.jetbrains.annotations.NotNull()
        java.lang.String userId, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.users.data.models.UserModel>> p2) {
            return null;
        }
    }
}