package ru.surf.users.data.preferences;

import java.lang.System;

/**
 * Lists service shared preference for module
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\b\u0010\r\u001a\u00020\u000eH\u0016R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lru/surf/users/data/preferences/UsersPreferencesListCache;", "Lru/surf/core/interfaces/IAppPreferences;", "value", "", "lastUpdateListUsers", "getLastUpdateListUsers", "()J", "setLastUpdateListUsers", "(J)V", "p", "Landroid/content/SharedPreferences;", "getP", "()Landroid/content/SharedPreferences;", "clearCacheAfterLogout", "", "KEYS", "users_debug"})
public abstract interface UsersPreferencesListCache extends ru.surf.core.interfaces.IAppPreferences {
    
    /**
     * Store private, primitive data in key-value pairs [SharedPreferences]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract android.content.SharedPreferences getP();
    
    /**
     * Performed when the user logs out
     */
    @java.lang.Override()
    public abstract void clearCacheAfterLogout();
    
    public abstract long getLastUpdateListUsers();
    
    public abstract void setLastUpdateListUsers(long value);
    
    /**
     * We put the keys in enum
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2 = {"Lru/surf/users/data/preferences/UsersPreferencesListCache$KEYS;", "", "(Ljava/lang/String;I)V", "LAST_UPDATE_LIST_USERS", "users_debug"})
    public static enum KEYS {
        /*public static final*/ LAST_UPDATE_LIST_USERS /* = new LAST_UPDATE_LIST_USERS() */;
        
        KEYS() {
        }
    }
    
    /**
     * Lists service shared preference for module
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Performed when the user logs out
         */
        @java.lang.Override()
        public static void clearCacheAfterLogout(@org.jetbrains.annotations.NotNull()
        ru.surf.users.data.preferences.UsersPreferencesListCache $this) {
        }
        
        public static long getLastUpdateListUsers(@org.jetbrains.annotations.NotNull()
        ru.surf.users.data.preferences.UsersPreferencesListCache $this) {
            return 0L;
        }
        
        public static void setLastUpdateListUsers(@org.jetbrains.annotations.NotNull()
        ru.surf.users.data.preferences.UsersPreferencesListCache $this, long value) {
        }
    }
}