package ru.surf.users.navigation.actions;

import java.lang.System;

/**
 * Base actions for module
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lru/surf/users/navigation/actions/UsersNavActions;", "Lru/surf/users/navigation/actions/impl/UsersScreenActions;", "users_debug"})
public abstract interface UsersNavActions extends ru.surf.users.navigation.actions.impl.UsersScreenActions {
    
    /**
     * Base actions for module
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void toUser(@org.jetbrains.annotations.NotNull()
        ru.surf.users.navigation.actions.UsersNavActions $this, @org.jetbrains.annotations.NotNull()
        java.lang.String userId) {
        }
        
        @java.lang.Override()
        public static void toUsers(@org.jetbrains.annotations.NotNull()
        ru.surf.users.navigation.actions.UsersNavActions $this) {
        }
    }
}