package ru.surf.other.data.preferences;

import java.lang.System;

/**
 * Common service shared preference for module
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lru/surf/other/data/preferences/OtherPreferencesModule;", "Lru/surf/core/interfaces/IAppPreferences;", "p", "Landroid/content/SharedPreferences;", "getP", "()Landroid/content/SharedPreferences;", "clearCacheAfterLogout", "", "other_debug"})
public abstract interface OtherPreferencesModule extends ru.surf.core.interfaces.IAppPreferences {
    
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
    
    /**
     * Common service shared preference for module
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
        ru.surf.other.data.preferences.OtherPreferencesModule $this) {
        }
    }
}