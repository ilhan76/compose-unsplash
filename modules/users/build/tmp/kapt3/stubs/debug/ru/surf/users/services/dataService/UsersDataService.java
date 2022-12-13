package ru.surf.users.services.dataService;

import java.lang.System;

/**
 * Base service module for work with db room
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/surf/users/services/dataService/UsersDataService;", "Lru/surf/users/services/dataService/impl/UserModelDataService;", "db", "Lru/surf/users/base/UsersDatabase;", "(Lru/surf/users/base/UsersDatabase;)V", "getDb", "()Lru/surf/users/base/UsersDatabase;", "users_debug"})
public final class UsersDataService implements ru.surf.users.services.dataService.impl.UserModelDataService {
    @org.jetbrains.annotations.NotNull()
    private final ru.surf.users.base.UsersDatabase db = null;
    
    public UsersDataService(@org.jetbrains.annotations.NotNull()
    ru.surf.users.base.UsersDatabase db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.surf.users.base.UsersDatabase getDb() {
        return null;
    }
    
    /**
     * Performed when the user logs out
     */
    @java.lang.Override()
    public void clearCacheAfterLogout() {
    }
    
    /**
     * Remove all models
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object clearUserModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    /**
     * Get count models
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object countUserModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0) {
        return null;
    }
    
    /**
     * Get [Flow] model
     */
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<ru.surf.users.data.models.UserModel> getUserModel(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    /**
     * Fun for insert models
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertUserModel(@org.jetbrains.annotations.NotNull()
    ru.surf.users.data.models.UserModel[] models, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * Get [PagingSource] for paging list
     */
    @org.jetbrains.annotations.NotNull()
    public androidx.paging.PagingSource<java.lang.Integer, ru.surf.users.data.models.UserModel> pagingListUserModel() {
        return null;
    }
}