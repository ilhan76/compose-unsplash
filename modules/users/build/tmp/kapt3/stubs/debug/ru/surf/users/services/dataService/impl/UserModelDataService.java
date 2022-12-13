package ru.surf.users.services.dataService.impl;

import java.lang.System;

/**
 * Service part for work with model [UserModel]
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016J\u0011\u0010\n\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J%\u0010\u0013\u001a\u00020\t2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0015\"\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u0018H\u0016R\u000b\u0010\u0002\u001a\u00020\u00038BX\u0082\u0004R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lru/surf/users/services/dataService/impl/UserModelDataService;", "Lru/surf/core/interfaces/IAppDatabase;", "dao", "Lru/surf/users/data/dao/UserModelDao;", "db", "Lru/surf/users/base/UsersDatabase;", "getDb", "()Lru/surf/users/base/UsersDatabase;", "clearCacheAfterLogout", "", "clearUserModel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countUserModel", "", "getUserModel", "Lkotlinx/coroutines/flow/Flow;", "Lru/surf/users/data/models/UserModel;", "userId", "", "insertUserModel", "models", "", "([Lru/surf/users/data/models/UserModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pagingListUserModel", "Landroidx/paging/PagingSource;", "users_debug"})
public abstract interface UserModelDataService extends ru.surf.core.interfaces.IAppDatabase {
    
    /**
     * Base room db
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract ru.surf.users.base.UsersDatabase getDb();
    
    /**
     * Performed when the user logs out
     */
    @java.lang.Override()
    public abstract void clearCacheAfterLogout();
    
    /**
     * Get [Flow] model
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<ru.surf.users.data.models.UserModel> getUserModel(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    /**
     * Get [PagingSource] for paging list
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.PagingSource<java.lang.Integer, ru.surf.users.data.models.UserModel> pagingListUserModel();
    
    /**
     * Fun for insert models
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertUserModel(@org.jetbrains.annotations.NotNull()
    ru.surf.users.data.models.UserModel[] models, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Remove all models
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearUserModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Get count models
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object countUserModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    /**
     * Service part for work with model [UserModel]
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        private static ru.surf.users.data.dao.UserModelDao getDao(ru.surf.users.services.dataService.impl.UserModelDataService $this) {
            return null;
        }
        
        /**
         * Performed when the user logs out
         */
        @java.lang.Override()
        public static void clearCacheAfterLogout(@org.jetbrains.annotations.NotNull()
        ru.surf.users.services.dataService.impl.UserModelDataService $this) {
        }
        
        /**
         * Get [Flow] model
         */
        @org.jetbrains.annotations.NotNull()
        public static kotlinx.coroutines.flow.Flow<ru.surf.users.data.models.UserModel> getUserModel(@org.jetbrains.annotations.NotNull()
        ru.surf.users.services.dataService.impl.UserModelDataService $this, @org.jetbrains.annotations.NotNull()
        java.lang.String userId) {
            return null;
        }
        
        /**
         * Get [PagingSource] for paging list
         */
        @org.jetbrains.annotations.NotNull()
        public static androidx.paging.PagingSource<java.lang.Integer, ru.surf.users.data.models.UserModel> pagingListUserModel(@org.jetbrains.annotations.NotNull()
        ru.surf.users.services.dataService.impl.UserModelDataService $this) {
            return null;
        }
        
        /**
         * Fun for insert models
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object insertUserModel(@org.jetbrains.annotations.NotNull()
        ru.surf.users.services.dataService.impl.UserModelDataService $this, @org.jetbrains.annotations.NotNull()
        ru.surf.users.data.models.UserModel[] models, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
        
        /**
         * Remove all models
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object clearUserModel(@org.jetbrains.annotations.NotNull()
        ru.surf.users.services.dataService.impl.UserModelDataService $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
            return null;
        }
        
        /**
         * Get count models
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object countUserModel(@org.jetbrains.annotations.NotNull()
        ru.surf.users.services.dataService.impl.UserModelDataService $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.lang.Integer> p1) {
            return null;
        }
    }
}