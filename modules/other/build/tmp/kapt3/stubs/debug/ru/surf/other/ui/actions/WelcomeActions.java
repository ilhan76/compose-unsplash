package ru.surf.other.ui.actions;

import java.lang.System;

/**
 * Actions sealed class for screen [WelcomeScreen]
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/surf/other/ui/actions/WelcomeActions;", "", "()V", "ToSignIn", "ToSignUp", "Lru/surf/other/ui/actions/WelcomeActions$ToSignIn;", "Lru/surf/other/ui/actions/WelcomeActions$ToSignUp;", "other_debug"})
public abstract class WelcomeActions {
    
    private WelcomeActions() {
        super();
    }
    
    /**
     * Action for navigation to page SignIn
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/surf/other/ui/actions/WelcomeActions$ToSignIn;", "Lru/surf/other/ui/actions/WelcomeActions;", "()V", "other_debug"})
    public static final class ToSignIn extends ru.surf.other.ui.actions.WelcomeActions {
        @org.jetbrains.annotations.NotNull()
        public static final ru.surf.other.ui.actions.WelcomeActions.ToSignIn INSTANCE = null;
        
        private ToSignIn() {
            super();
        }
    }
    
    /**
     * Action for navigation to page SignUp
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/surf/other/ui/actions/WelcomeActions$ToSignUp;", "Lru/surf/other/ui/actions/WelcomeActions;", "()V", "other_debug"})
    public static final class ToSignUp extends ru.surf.other.ui.actions.WelcomeActions {
        @org.jetbrains.annotations.NotNull()
        public static final ru.surf.other.ui.actions.WelcomeActions.ToSignUp INSTANCE = null;
        
        private ToSignUp() {
            super();
        }
    }
}