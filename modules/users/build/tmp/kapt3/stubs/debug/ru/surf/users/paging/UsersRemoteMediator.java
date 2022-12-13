package ru.surf.users.paging;

import java.lang.System;

/**
 * Paging list with room cache [RemoteMediator]
 *
 * @param apiService query service module
 * @param dataService service room db
 * @param preferences service shared preferences
 *
 * @author Vitaliy Zarubin
 * @see <a href="https://developer.android.com/reference/kotlin/androidx/paging/RemoteMediator">RemoteMediator</a>
 */
@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ-\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lru/surf/users/paging/UsersRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lru/surf/users/data/models/UserModel;", "apiService", "Lru/surf/users/services/apiService/UsersApiService;", "dataService", "Lru/surf/users/services/dataService/UsersDataService;", "preferences", "Lru/surf/users/data/preferences/UsersPreferences;", "(Lru/surf/users/services/apiService/UsersApiService;Lru/surf/users/services/dataService/UsersDataService;Lru/surf/users/data/preferences/UsersPreferences;)V", "initialize", "Landroidx/paging/RemoteMediator$InitializeAction;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "users_debug"})
public final class UsersRemoteMediator extends androidx.paging.RemoteMediator<java.lang.Integer, ru.surf.users.data.models.UserModel> {
    private final ru.surf.users.services.apiService.UsersApiService apiService = null;
    private final ru.surf.users.services.dataService.UsersDataService dataService = null;
    private final ru.surf.users.data.preferences.UsersPreferences preferences = null;
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.users.paging.UsersRemoteMediator.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Integer key;
    
    public UsersRemoteMediator(@org.jetbrains.annotations.NotNull()
    ru.surf.users.services.apiService.UsersApiService apiService, @org.jetbrains.annotations.NotNull()
    ru.surf.users.services.dataService.UsersDataService dataService, @org.jetbrains.annotations.NotNull()
    ru.surf.users.data.preferences.UsersPreferences preferences) {
        super();
    }
    
    /**
     * Timeout cache for refresh list at start
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object initialize(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.InitializeAction> continuation) {
        return null;
    }
    
    /**
     * Base logic
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, ru.surf.users.data.models.UserModel> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation) {
        return null;
    }
    
    /**
     * Static key for offset-limit paging
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lru/surf/users/paging/UsersRemoteMediator$Companion;", "", "()V", "key", "", "getKey", "()Ljava/lang/Integer;", "setKey", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "users_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getKey() {
            return null;
        }
        
        public final void setKey(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
    }
}