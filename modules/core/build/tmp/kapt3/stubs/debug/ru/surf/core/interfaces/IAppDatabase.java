package ru.surf.core.interfaces;

import java.lang.System;

/**
 * Interface for services db root
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lru/surf/core/interfaces/IAppDatabase;", "", "db", "Landroidx/room/RoomDatabase;", "getDb", "()Landroidx/room/RoomDatabase;", "clearCacheAfterLogout", "", "core_debug"})
public abstract interface IAppDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.room.RoomDatabase getDb();
    
    public abstract void clearCacheAfterLogout();
}