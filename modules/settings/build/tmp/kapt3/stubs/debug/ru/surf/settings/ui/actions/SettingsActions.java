package ru.surf.settings.ui.actions;

import java.lang.System;

/**
 * Actions sealed class for screen [SettingsScreen]
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/surf/settings/ui/actions/SettingsActions;", "", "()V", "OpenMenu", "UpdateSettings", "Lru/surf/settings/ui/actions/SettingsActions$OpenMenu;", "Lru/surf/settings/ui/actions/SettingsActions$UpdateSettings;", "settings_debug"})
public abstract class SettingsActions {
    
    private SettingsActions() {
        super();
    }
    
    /**
     * Action open menu
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/surf/settings/ui/actions/SettingsActions$OpenMenu;", "Lru/surf/settings/ui/actions/SettingsActions;", "()V", "settings_debug"})
    public static final class OpenMenu extends ru.surf.settings.ui.actions.SettingsActions {
        @org.jetbrains.annotations.NotNull()
        public static final ru.surf.settings.ui.actions.SettingsActions.OpenMenu INSTANCE = null;
        
        private OpenMenu() {
            super();
        }
    }
    
    /**
     * Action call update settings
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/surf/settings/ui/actions/SettingsActions$UpdateSettings;", "Lru/surf/settings/ui/actions/SettingsActions;", "()V", "settings_debug"})
    public static final class UpdateSettings extends ru.surf.settings.ui.actions.SettingsActions {
        @org.jetbrains.annotations.NotNull()
        public static final ru.surf.settings.ui.actions.SettingsActions.UpdateSettings INSTANCE = null;
        
        private UpdateSettings() {
            super();
        }
    }
}