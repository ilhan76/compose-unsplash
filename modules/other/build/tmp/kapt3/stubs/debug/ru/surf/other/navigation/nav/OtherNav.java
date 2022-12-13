package ru.surf.other.navigation.nav;

import java.lang.System;

/**
 * Base routing for module
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lru/surf/other/navigation/nav/OtherNav;", "", "()V", "SignInNav", "Lru/surf/other/navigation/nav/impl/SignInNavScreen;", "getSignInNav", "()Lru/surf/other/navigation/nav/impl/SignInNavScreen;", "SignUpNav", "Lru/surf/other/navigation/nav/impl/SignUpNavScreen;", "getSignUpNav", "()Lru/surf/other/navigation/nav/impl/SignUpNavScreen;", "WelcomeNav", "Lru/surf/other/navigation/nav/impl/WelcomeNavScreen;", "getWelcomeNav", "()Lru/surf/other/navigation/nav/impl/WelcomeNavScreen;", "other_debug"})
public final class OtherNav {
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.other.navigation.nav.OtherNav INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final ru.surf.other.navigation.nav.impl.WelcomeNavScreen WelcomeNav = null;
    @org.jetbrains.annotations.NotNull()
    private static final ru.surf.other.navigation.nav.impl.SignInNavScreen SignInNav = null;
    @org.jetbrains.annotations.NotNull()
    private static final ru.surf.other.navigation.nav.impl.SignUpNavScreen SignUpNav = null;
    
    private OtherNav() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.surf.other.navigation.nav.impl.WelcomeNavScreen getWelcomeNav() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.surf.other.navigation.nav.impl.SignInNavScreen getSignInNav() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.surf.other.navigation.nav.impl.SignUpNavScreen getSignUpNav() {
        return null;
    }
}