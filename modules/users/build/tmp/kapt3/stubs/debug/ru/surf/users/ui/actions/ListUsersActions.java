package ru.surf.users.ui.actions;

import java.lang.System;

/**
 * Actions sealed class for screen [ListUsersScreen]
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lru/surf/users/ui/actions/ListUsersActions;", "", "()V", "OpenMenu", "Search", "ToViewUser", "Lru/surf/users/ui/actions/ListUsersActions$OpenMenu;", "Lru/surf/users/ui/actions/ListUsersActions$Search;", "Lru/surf/users/ui/actions/ListUsersActions$ToViewUser;", "users_debug"})
public abstract class ListUsersActions {
    
    private ListUsersActions() {
        super();
    }
    
    /**
     * Open main menu
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/surf/users/ui/actions/ListUsersActions$OpenMenu;", "Lru/surf/users/ui/actions/ListUsersActions;", "()V", "users_debug"})
    public static final class OpenMenu extends ru.surf.users.ui.actions.ListUsersActions {
        @org.jetbrains.annotations.NotNull()
        public static final ru.surf.users.ui.actions.ListUsersActions.OpenMenu INSTANCE = null;
        
        private OpenMenu() {
            super();
        }
    }
    
    /**
     * Find models by name
     *
     * @param text search text for query
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/surf/users/ui/actions/ListUsersActions$Search;", "Lru/surf/users/ui/actions/ListUsersActions;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "users_debug"})
    public static final class Search extends ru.surf.users.ui.actions.ListUsersActions {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String text = null;
        
        public Search(@org.jetbrains.annotations.Nullable()
        java.lang.String text) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getText() {
            return null;
        }
    }
    
    /**
     * Open page view user
     *
     * @param userId user identifier
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/surf/users/ui/actions/ListUsersActions$ToViewUser;", "Lru/surf/users/ui/actions/ListUsersActions;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "users_debug"})
    public static final class ToViewUser extends ru.surf.users.ui.actions.ListUsersActions {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String userId = null;
        
        public ToViewUser(@org.jetbrains.annotations.NotNull()
        java.lang.String userId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserId() {
            return null;
        }
    }
}