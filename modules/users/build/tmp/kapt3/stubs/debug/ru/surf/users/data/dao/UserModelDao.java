package ru.surf.users.data.dao;

import java.lang.System;

/**
 * Dao for model [UserModel]
 *
 * @author Vitaliy Zarubin
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\'J%\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000e\"\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0011H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lru/surf/users/data/dao/UserModelDao;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "", "getModel", "Lkotlinx/coroutines/flow/Flow;", "Lru/surf/users/data/models/UserModel;", "id", "", "insertModels", "models", "", "([Lru/surf/users/data/models/UserModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pagingSource", "Landroidx/paging/PagingSource;", "users_debug"})
public abstract interface UserModelDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM UserModel ORDER BY CAST(id AS INT)")
    public abstract androidx.paging.PagingSource<java.lang.Integer, ru.surf.users.data.models.UserModel> pagingSource();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM UserModel WHERE id = :id")
    public abstract kotlinx.coroutines.flow.Flow<ru.surf.users.data.models.UserModel> getModel(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertModels(@org.jetbrains.annotations.NotNull()
    ru.surf.users.data.models.UserModel[] models, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM UserModel")
    public abstract java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COUNT(*) FROM UserModel")
    public abstract java.lang.Object count(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
}