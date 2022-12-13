package ru.surf.core.services.dataService.impl;

import java.lang.System;

/**
 * Service part for work with model [SettingsModel]
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016J\u0011\u0010\n\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\u0010\u001a\u00020\t2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0012\"\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000b\u0010\u0002\u001a\u00020\u00038BX\u0082\u0004R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lru/surf/core/services/dataService/impl/SettingsModelDataService;", "Lru/surf/core/interfaces/IAppDatabase;", "dao", "Lru/surf/core/data/dao/SettingsModelDao;", "db", "Lru/surf/core/base/CoreDatabase;", "getDb", "()Lru/surf/core/base/CoreDatabase;", "clearCacheAfterLogout", "", "clearSettingsModel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSettingsModel", "Lkotlinx/coroutines/flow/Flow;", "", "Lru/surf/core/data/models/SettingsModel;", "insertSettingsModel", "models", "", "([Lru/surf/core/data/models/SettingsModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface SettingsModelDataService extends ru.surf.core.interfaces.IAppDatabase {
    
    /**
     * Base room db
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract ru.surf.core.base.CoreDatabase getDb();
    
    /**
     * Performed when the user logs out
     */
    @java.lang.Override()
    public abstract void clearCacheAfterLogout();
    
    /**
     * Fun for insert models
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSettingsModel(@org.jetbrains.annotations.NotNull()
    ru.surf.core.data.models.SettingsModel[] models, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Get [Flow] model
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSettingsModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<ru.surf.core.data.models.SettingsModel>>> continuation);
    
    /**
     * Remove all models
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearSettingsModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Service part for work with model [SettingsModel]
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        private static ru.surf.core.data.dao.SettingsModelDao getDao(ru.surf.core.services.dataService.impl.SettingsModelDataService $this) {
            return null;
        }
        
        /**
         * Performed when the user logs out
         */
        @java.lang.Override()
        public static void clearCacheAfterLogout(@org.jetbrains.annotations.NotNull()
        ru.surf.core.services.dataService.impl.SettingsModelDataService $this) {
        }
        
        /**
         * Fun for insert models
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object insertSettingsModel(@org.jetbrains.annotations.NotNull()
        ru.surf.core.services.dataService.impl.SettingsModelDataService $this, @org.jetbrains.annotations.NotNull()
        ru.surf.core.data.models.SettingsModel[] models, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
        
        /**
         * Get [Flow] model
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object getSettingsModel(@org.jetbrains.annotations.NotNull()
        ru.surf.core.services.dataService.impl.SettingsModelDataService $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<ru.surf.core.data.models.SettingsModel>>> p1) {
            return null;
        }
        
        /**
         * Remove all models
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object clearSettingsModel(@org.jetbrains.annotations.NotNull()
        ru.surf.core.services.dataService.impl.SettingsModelDataService $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
            return null;
        }
    }
}