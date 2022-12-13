package ru.surf.core.base;

import java.lang.System;

/**
 * Main [ViewModel] for app
 *
 * @property apiService service http query
 * @property dataService service db room
 * @property dataServices group services db room
 * @property preferences group services shared preference
 *
 * @author Vitaliy Zarubin
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b\u00a2\u0006\u0002\b\t0\u0007\u0012\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b\u00a2\u0006\u0002\b\t0\u0007\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001dJ\u0006\u0010\"\u001a\u00020\u001dR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b\u00a2\u0006\u0002\b\t0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0019\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b\u00a2\u0006\u0002\b\t0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lru/surf/core/base/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lru/surf/core/services/apiService/CoreApiService;", "dataService", "Lru/surf/core/services/dataService/CoreDataService;", "dataServices", "", "Lru/surf/core/interfaces/IAppDatabase;", "Lkotlin/jvm/JvmSuppressWildcards;", "preferences", "Lru/surf/core/interfaces/IAppPreferences;", "(Lru/surf/core/services/apiService/CoreApiService;Lru/surf/core/services/dataService/CoreDataService;Ljava/util/Set;Ljava/util/Set;)V", "_hasNetwork", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isReady", "_loading", "hasNetwork", "Lkotlinx/coroutines/flow/StateFlow;", "getHasNetwork", "()Lkotlinx/coroutines/flow/StateFlow;", "isLogin", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "isReady", "loading", "getLoading", "login", "", "userId", "", "token", "logout", "updateSettings", "core_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final ru.surf.core.services.apiService.CoreApiService apiService = null;
    private final ru.surf.core.services.dataService.CoreDataService dataService = null;
    private java.util.Set<ru.surf.core.interfaces.IAppDatabase> dataServices;
    private java.util.Set<ru.surf.core.interfaces.IAppPreferences> preferences;
    
    /**
     * [MutableStateFlow] for loading state
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loading = null;
    
    /**
     * [MutableStateFlow] for listen has network
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _hasNetwork = null;
    
    /**
     * [MutableStateFlow] for start app and end splash
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isReady = null;
    
    /**
     * Flow for listen change status user
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isLogin = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    ru.surf.core.services.apiService.CoreApiService apiService, @org.jetbrains.annotations.NotNull()
    ru.surf.core.services.dataService.CoreDataService dataService, @org.jetbrains.annotations.NotNull()
    java.util.Set<ru.surf.core.interfaces.IAppDatabase> dataServices, @org.jetbrains.annotations.NotNull()
    java.util.Set<ru.surf.core.interfaces.IAppPreferences> preferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getHasNetwork() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isReady() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isLogin() {
        return null;
    }
    
    /**
     * Update common for application settings
     */
    public final void updateSettings() {
    }
    
    /**
     * Update status user guest to member
     */
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    /**
     * Logout user
     */
    public final void logout() {
    }
}