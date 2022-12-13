package ru.surf.users.services.api.impl;

import java.lang.System;

/**
 * The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lru/surf/users/services/api/impl/ApiGet;", "", "getListUsers", "Lretrofit2/Response;", "", "Lru/surf/users/data/responses/UserResponse;", "search", "", "offset", "", "limit", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "users_debug"})
public abstract interface ApiGet {
    
    /**
     * Get list users
     *
     * @param search for find users by name
     * @param offset mysql offset
     * @param offset mysql limit
     *
     * @see <a href="https://dev.mysql.com/doc/refman/8.0/en/select.html">SELECT Statement</a>
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getListUsers(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "search")
    java.lang.String search, @retrofit2.http.Query(value = "offset")
    int offset, @androidx.annotation.IntRange(from = 1L, to = 100L)
    @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<ru.surf.users.data.responses.UserResponse>>> continuation);
    
    /**
     * Update user model
     *
     * @param id user identifier
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users/{id}")
    public abstract java.lang.Object updateUser(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.surf.users.data.responses.UserResponse>> continuation);
    
    /**
     * The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}