package ru.surf.other.ui.screens.signIn;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001a@\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Preview", "", "SignInBody", "loading", "", "commonError", "", "onActions", "Lkotlin/Function1;", "Lru/surf/other/ui/actions/SignInActions;", "backDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "other_debug"})
public final class SignInBodyKt {
    
    /**
     * Body page [SignInScreen]
     *
     * @param loading state call query to api
     * @param commonError state error response
     * @param onActions actions page
     * @param backDispatcher dispatcher press back
     *
     * @author Vitaliy Zarubin
     */
    @androidx.compose.runtime.Composable()
    public static final void SignInBody(boolean loading, @org.jetbrains.annotations.Nullable()
    java.lang.String commonError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.surf.other.ui.actions.SignInActions, kotlin.Unit> onActions, @org.jetbrains.annotations.Nullable()
    androidx.activity.OnBackPressedDispatcher backDispatcher) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES, device = "id:Nexus 6")
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO, device = "id:pixel_4")
    private static final void Preview() {
    }
}