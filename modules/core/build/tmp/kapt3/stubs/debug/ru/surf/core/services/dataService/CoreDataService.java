package ru.surf.core.services.dataService;

import java.lang.System;

/**
 * Base service module for work with db room
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lru/surf/core/services/dataService/CoreDataService;", "Lru/surf/core/services/dataService/impl/SecurityModelDataService;", "Lru/surf/core/services/dataService/impl/SettingsModelDataService;", "db", "Lru/surf/core/base/CoreDatabase;", "dbSecurity", "Lru/surf/core/base/CoreSecurityDatabase;", "(Lru/surf/core/base/CoreDatabase;Lru/surf/core/base/CoreSecurityDatabase;)V", "getDb", "()Lru/surf/core/base/CoreDatabase;", "getDbSecurity", "()Lru/surf/core/base/CoreSecurityDatabase;", "clearCacheAfterLogout", "", "core_debug"})
public final class CoreDataService implements ru.surf.core.services.dataService.impl.SecurityModelDataService, ru.surf.core.services.dataService.impl.SettingsModelDataService {
    @org.jetbrains.annotations.NotNull()
    private final ru.surf.core.base.CoreDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.surf.core.base.CoreSecurityDatabase dbSecurity = null;
    
    public CoreDataService(@org.jetbrains.annotations.NotNull()
    ru.surf.core.base.CoreDatabase db, @org.jetbrains.annotations.NotNull()
    ru.surf.core.base.CoreSecurityDatabase dbSecurity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.surf.core.base.CoreDatabase getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.surf.core.base.CoreSecurityDatabase getDbSecurity() {
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
    public java.lang.Object clearSecurityModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    /**
     * Remove all models
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object clearSettingsModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    /**
     * Get [Flow] model
     */
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<ru.surf.core.data.models.SecurityModel> getSecurityModel() {
        return null;
    }
    
    /**
     * Get [Flow] model
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSettingsModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<ru.surf.core.data.models.SettingsModel>>> p0) {
        return null;
    }
    
    /**
     * Fun for insert models
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertSecurityModel(@org.jetbrains.annotations.NotNull()
    ru.surf.core.data.models.SecurityModel[] models, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * Fun for insert models
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertSettingsModel(@org.jetbrains.annotations.NotNull()
    ru.surf.core.data.models.SettingsModel[] models, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * Check user is login
     */
    public boolean isLogin() {
        return false;
    }
}