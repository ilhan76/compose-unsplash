package ru.surf.users.data.preferences;

import java.lang.System;

/**
 * Base service shared preference module
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lru/surf/users/data/preferences/UsersPreferences;", "Lru/surf/users/data/preferences/UsersPreferencesBase;", "Lru/surf/users/data/preferences/UsersPreferencesListCache;", "p", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getP", "()Landroid/content/SharedPreferences;", "clearCacheAfterLogout", "", "users_debug"})
public final class UsersPreferences implements ru.surf.users.data.preferences.UsersPreferencesBase, ru.surf.users.data.preferences.UsersPreferencesListCache {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences p = null;
    
    public UsersPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.SharedPreferences getP() {
        return null;
    }
    
    /**
     * Performed when the user logs out
     */
    @java.lang.Override()
    public void clearCacheAfterLogout() {
    }
    
    public long getLastUpdateListUsers() {
        return 0L;
    }
    
    public boolean isStartPage() {
        return false;
    }
    
    public void setLastUpdateListUsers(long value) {
    }
    
    public void setStartPage(boolean value) {
    }
}