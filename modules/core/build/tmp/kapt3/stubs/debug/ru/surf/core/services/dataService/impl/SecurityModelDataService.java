package ru.surf.core.services.dataService.impl;

import java.lang.System;

/**
 * Service part for work with model [SecurityModel]
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016J\u0011\u0010\n\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016J%\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0011\"\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000b\u0010\u0002\u001a\u00020\u00038BX\u0082\u0004R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lru/surf/core/services/dataService/impl/SecurityModelDataService;", "Lru/surf/core/interfaces/IAppDatabase;", "dao", "Lru/surf/core/data/dao/SecurityModelDao;", "dbSecurity", "Lru/surf/core/base/CoreSecurityDatabase;", "getDbSecurity", "()Lru/surf/core/base/CoreSecurityDatabase;", "clearCacheAfterLogout", "", "clearSecurityModel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSecurityModel", "Lkotlinx/coroutines/flow/Flow;", "Lru/surf/core/data/models/SecurityModel;", "insertSecurityModel", "models", "", "([Lru/surf/core/data/models/SecurityModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isLogin", "", "core_debug"})
public abstract interface SecurityModelDataService extends ru.surf.core.interfaces.IAppDatabase {
    
    /**
     * Base room db
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ru.surf.core.base.CoreSecurityDatabase getDbSecurity();
    
    /**
     * Performed when the user logs out
     */
    @java.lang.Override()
    public abstract void clearCacheAfterLogout();
    
    /**
     * Fun for insert models
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSecurityModel(@org.jetbrains.annotations.NotNull()
    ru.surf.core.data.models.SecurityModel[] models, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Get [Flow] model
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<ru.surf.core.data.models.SecurityModel> getSecurityModel();
    
    /**
     * Remove all models
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearSecurityModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Check user is login
     */
    public abstract boolean isLogin();
    
    /**
     * Service part for work with model [SecurityModel]
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        private static ru.surf.core.data.dao.SecurityModelDao getDao(ru.surf.core.services.dataService.impl.SecurityModelDataService $this) {
            return null;
        }
        
        /**
         * Performed when the user logs out
         */
        @java.lang.Override()
        public static void clearCacheAfterLogout(@org.jetbrains.annotations.NotNull()
        ru.surf.core.services.dataService.impl.SecurityModelDataService $this) {
        }
        
        /**
         * Fun for insert models
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object insertSecurityModel(@org.jetbrains.annotations.NotNull()
        ru.surf.core.services.dataService.impl.SecurityModelDataService $this, @org.jetbrains.annotations.NotNull()
        ru.surf.core.data.models.SecurityModel[] models, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
        
        /**
         * Get [Flow] model
         */
        @org.jetbrains.annotations.NotNull()
        public static kotlinx.coroutines.flow.Flow<ru.surf.core.data.models.SecurityModel> getSecurityModel(@org.jetbrains.annotations.NotNull()
        ru.surf.core.services.dataService.impl.SecurityModelDataService $this) {
            return null;
        }
        
        /**
         * Remove all models
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object clearSecurityModel(@org.jetbrains.annotations.NotNull()
        ru.surf.core.services.dataService.impl.SecurityModelDataService $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
            return null;
        }
        
        /**
         * Check user is login
         */
        public static boolean isLogin(@org.jetbrains.annotations.NotNull()
        ru.surf.core.services.dataService.impl.SecurityModelDataService $this) {
            return false;
        }
    }
}