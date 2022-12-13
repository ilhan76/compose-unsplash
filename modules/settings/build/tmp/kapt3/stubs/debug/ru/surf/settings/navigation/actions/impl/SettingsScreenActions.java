package ru.surf.settings.navigation.actions.impl;

import java.lang.System;

/**
 * Custom actions for [SettingsScreen]
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lru/surf/settings/navigation/actions/impl/SettingsScreenActions;", "", "controller", "Landroidx/navigation/NavHostController;", "getController", "()Landroidx/navigation/NavHostController;", "toSettings", "", "settings_debug"})
public abstract interface SettingsScreenActions {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.navigation.NavHostController getController();
    
    public abstract void toSettings();
    
    /**
     * Custom actions for [SettingsScreen]
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        public static void toSettings(@org.jetbrains.annotations.NotNull()
        ru.surf.settings.navigation.actions.impl.SettingsScreenActions $this) {
        }
    }
}