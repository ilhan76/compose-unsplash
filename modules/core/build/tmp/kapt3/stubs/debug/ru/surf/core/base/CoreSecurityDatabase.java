package ru.surf.core.base;

import java.lang.System;

/**
 * Database configuration [RoomDatabase]
 *
 * @author Vitaliy Zarubin
 */
@androidx.room.Database(entities = {ru.surf.core.data.models.SecurityModel.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lru/surf/core/base/CoreSecurityDatabase;", "Landroidx/room/RoomDatabase;", "()V", "securityModelDao", "Lru/surf/core/data/dao/SecurityModelDao;", "core_debug"})
public abstract class CoreSecurityDatabase extends androidx.room.RoomDatabase {
    
    public CoreSecurityDatabase() {
        super();
    }
    
    /**
     * Dao for model [SecurityModel]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ru.surf.core.data.dao.SecurityModelDao securityModelDao();
}