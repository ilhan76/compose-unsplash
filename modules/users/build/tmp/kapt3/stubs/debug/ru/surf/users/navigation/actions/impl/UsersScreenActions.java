package ru.surf.users.navigation.actions.impl;

import java.lang.System;

/**
 * Custom actions for [ListUsersScreen], [ViewUserScreen]
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lru/surf/users/navigation/actions/impl/UsersScreenActions;", "", "controller", "Landroidx/navigation/NavHostController;", "getController", "()Landroidx/navigation/NavHostController;", "toUser", "", "userId", "", "toUsers", "users_debug"})
public abstract interface UsersScreenActions {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.navigation.NavHostController getController();
    
    public abstract void toUsers();
    
    public abstract void toUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    /**
     * Custom actions for [ListUsersScreen], [ViewUserScreen]
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        public static void toUsers(@org.jetbrains.annotations.NotNull()
        ru.surf.users.navigation.actions.impl.UsersScreenActions $this) {
        }
        
        public static void toUser(@org.jetbrains.annotations.NotNull()
        ru.surf.users.navigation.actions.impl.UsersScreenActions $this, @org.jetbrains.annotations.NotNull()
        java.lang.String userId) {
        }
    }
}