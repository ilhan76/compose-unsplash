package ru.surf.other.ui.screens.signUp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001aQ\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Preview", "", "SignUpBody", "loading", "", "commonError", "", "commonSuccess", "onActions", "Lkotlin/Function1;", "Lru/surf/other/ui/actions/SignUpActions;", "backDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "(ZLjava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Landroidx/activity/OnBackPressedDispatcher;)V", "other_debug"})
public final class SignUpBodyKt {
    
    /**
     * Body page [SignUpScreen]
     *
     * @param loading state call query to api
     * @param commonError state error response
     * @param commonSuccess state success validate email
     * @param onActions actions page
     * @param backDispatcher dispatcher press back
     *
     * @author Vitaliy Zarubin
     */
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {com.google.accompanist.pager.ExperimentalPagerApi.class, androidx.compose.ui.ExperimentalComposeUiApi.class})
    public static final void SignUpBody(boolean loading, @org.jetbrains.annotations.Nullable()
    java.lang.String commonError, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean commonSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.surf.other.ui.actions.SignUpActions, kotlin.Unit> onActions, @org.jetbrains.annotations.Nullable()
    androidx.activity.OnBackPressedDispatcher backDispatcher) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES, device = "id:Nexus 6")
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO, device = "id:pixel_4")
    private static final void Preview() {
    }
}