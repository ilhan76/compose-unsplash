package ru.surf.users.ui.viewModels;

import java.lang.System;

/**
 * [ViewModel] for module
 *
 * @property apiService service http query
 * @property dataService service db room
 * @property preferences service shared preference
 *
 * @author Vitaliy Zarubin
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\"\u001a\u00020\u000eJ\u000e\u0010#\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u000eJ\u0010\u0010\u001d\u001a\u00020$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001a\u00a8\u0006%"}, d2 = {"Lru/surf/users/ui/viewModels/UsersViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lru/surf/users/services/apiService/UsersApiService;", "dataService", "Lru/surf/users/services/dataService/UsersDataService;", "preferences", "Lru/surf/users/data/preferences/UsersPreferences;", "(Lru/surf/users/services/apiService/UsersApiService;Lru/surf/users/services/dataService/UsersDataService;Lru/surf/users/data/preferences/UsersPreferences;)V", "_error404", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_loading", "_search", "", "error404", "Lkotlinx/coroutines/flow/StateFlow;", "getError404", "()Lkotlinx/coroutines/flow/StateFlow;", "listUsers", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lru/surf/users/data/models/UserModel;", "getListUsers$annotations", "()V", "getListUsers", "()Lkotlinx/coroutines/flow/Flow;", "loading", "getLoading", "search", "getSearch", "searchListUsers", "getSearchListUsers", "getUser", "userId", "getViewUser", "", "users_debug"})
public final class UsersViewModel extends androidx.lifecycle.ViewModel {
    private final ru.surf.users.services.apiService.UsersApiService apiService = null;
    private final ru.surf.users.services.dataService.UsersDataService dataService = null;
    private final ru.surf.users.data.preferences.UsersPreferences preferences = null;
    
    /**
     * [MutableStateFlow] state 404 response
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _error404 = null;
    
    /**
     * [MutableStateFlow] for loading state
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loading = null;
    
    /**
     * [MutableStateFlow] for search query
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _search = null;
    
    /**
     * [StateFlow] for [_search]
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> search = null;
    
    /**
     * List with paging [RemoteMediator]
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<ru.surf.users.data.models.UserModel>> listUsers = null;
    
    /**
     * List with paging [PagingSource]
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<ru.surf.users.data.models.UserModel>> searchListUsers = null;
    
    @javax.inject.Inject()
    public UsersViewModel(@org.jetbrains.annotations.NotNull()
    ru.surf.users.services.apiService.UsersApiService apiService, @org.jetbrains.annotations.NotNull()
    ru.surf.users.services.dataService.UsersDataService dataService, @org.jetbrains.annotations.NotNull()
    ru.surf.users.data.preferences.UsersPreferences preferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getError404() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<ru.surf.users.data.models.UserModel>> getListUsers() {
        return null;
    }
    
    /**
     * List with paging [RemoteMediator]
     */
    @kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
    @java.lang.Deprecated()
    public static void getListUsers$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<ru.surf.users.data.models.UserModel>> getSearchListUsers() {
        return null;
    }
    
    public final void search(@org.jetbrains.annotations.Nullable()
    java.lang.String search) {
    }
    
    /**
     * [Flow] room for view page
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<ru.surf.users.data.models.UserModel> getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    /**
     * Update view with model [UserModel]
     *
     * @param userId string user identifier
     */
    public final void getViewUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
}