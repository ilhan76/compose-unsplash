package ru.surf.core.data.dao;

import java.lang.System;

/**
 * Dao for model [SecurityModel]
 *
 * @author Vitaliy Zarubin
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\'J%\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\f\"\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lru/surf/core/data/dao/SecurityModelDao;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "", "getModel", "Lkotlinx/coroutines/flow/Flow;", "Lru/surf/core/data/models/SecurityModel;", "insertModels", "models", "", "([Lru/surf/core/data/models/SecurityModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface SecurityModelDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM SecurityModel LIMIT 1")
    public abstract kotlinx.coroutines.flow.Flow<ru.surf.core.data.models.SecurityModel> getModel();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertModels(@org.jetbrains.annotations.NotNull()
    ru.surf.core.data.models.SecurityModel[] models, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM SecurityModel")
    public abstract java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM SecurityModel")
    public abstract int count();
}