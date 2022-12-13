package ru.surf.users.base;

import java.lang.System;

/**
 * Database configuration [RoomDatabase]
 *
 * @author Vitaliy Zarubin
 */
@androidx.room.Database(entities = {ru.surf.users.data.models.UserModel.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lru/surf/users/base/UsersDatabase;", "Landroidx/room/RoomDatabase;", "()V", "daoUserModel", "Lru/surf/users/data/dao/UserModelDao;", "users_debug"})
public abstract class UsersDatabase extends androidx.room.RoomDatabase {
    
    public UsersDatabase() {
        super();
    }
    
    /**
     * Dao for model [UserModel]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ru.surf.users.data.dao.UserModelDao daoUserModel();
}