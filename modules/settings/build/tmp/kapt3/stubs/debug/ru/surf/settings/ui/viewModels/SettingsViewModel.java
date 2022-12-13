package ru.surf.settings.ui.viewModels;

import java.lang.System;

/**
 * [ViewModel] for module
 *
 * @property apiService service http query
 * @property preferences service shared preference
 *
 * @author Vitaliy Zarubin
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lru/surf/settings/ui/viewModels/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lru/surf/settings/services/apiService/SettingsApiService;", "preferences", "Lru/surf/settings/data/preferences/SettingsPreferences;", "(Lru/surf/settings/services/apiService/SettingsApiService;Lru/surf/settings/data/preferences/SettingsPreferences;)V", "_loading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "loading", "Lkotlinx/coroutines/flow/StateFlow;", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "updateSettings", "", "settings_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    private final ru.surf.settings.services.apiService.SettingsApiService apiService = null;
    private final ru.surf.settings.data.preferences.SettingsPreferences preferences = null;
    
    /**
     * [MutableStateFlow] for loading state
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loading = null;
    
    @javax.inject.Inject()
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    ru.surf.settings.services.apiService.SettingsApiService apiService, @org.jetbrains.annotations.NotNull()
    ru.surf.settings.data.preferences.SettingsPreferences preferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoading() {
        return null;
    }
    
    /**
     * Function stub as an example of how it works
     */
    public final void updateSettings() {
    }
}