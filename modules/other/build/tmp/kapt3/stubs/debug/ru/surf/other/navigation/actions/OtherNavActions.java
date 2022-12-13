package ru.surf.other.navigation.actions;

import java.lang.System;

/**
 * Base actions for module
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003\u00a8\u0006\u0004"}, d2 = {"Lru/surf/other/navigation/actions/OtherNavActions;", "Lru/surf/other/navigation/actions/impl/SignInScreenActions;", "Lru/surf/other/navigation/actions/impl/SignUpScreenActions;", "Lru/surf/other/navigation/actions/impl/WelcomeScreenActions;", "other_debug"})
public abstract interface OtherNavActions extends ru.surf.other.navigation.actions.impl.SignInScreenActions, ru.surf.other.navigation.actions.impl.SignUpScreenActions, ru.surf.other.navigation.actions.impl.WelcomeScreenActions {
    
    /**
     * Base actions for module
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void toSignIn(@org.jetbrains.annotations.NotNull()
        ru.surf.other.navigation.actions.OtherNavActions $this) {
        }
        
        @java.lang.Override()
        public static void toSignUp(@org.jetbrains.annotations.NotNull()
        ru.surf.other.navigation.actions.OtherNavActions $this) {
        }
    }
}