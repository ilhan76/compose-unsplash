package ru.surf.other.ui.screens.signUp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001aj\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b28\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u000bH\u0003\u001ax\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b28\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u00a8\u0006\u0013"}, d2 = {"Preview", "", "SignUpForm", "state", "Lcom/google/accompanist/pager/PagerState;", "loading", "", "onActions", "Lkotlin/Function1;", "Lru/surf/other/ui/actions/SignUpActions;", "savedData", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "email", "pass", "SignUpFormCredential", "commonError", "other_debug"})
public final class SignUpFormCredentialKt {
    
    /**
     * Form page [SignUpBody]
     *
     * @param state page view state
     * @param loading state call query to api
     * @param commonError state error response
     * @param onActions actions page
     * @param savedData callback success result
     *
     * @author Vitaliy Zarubin
     */
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {com.google.accompanist.pager.ExperimentalPagerApi.class})
    public static final void SignUpFormCredential(@org.jetbrains.annotations.NotNull()
    com.google.accompanist.pager.PagerState state, boolean loading, @org.jetbrains.annotations.Nullable()
    java.lang.String commonError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.surf.other.ui.actions.SignUpActions, kotlin.Unit> onActions, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> savedData) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.ui.ExperimentalComposeUiApi.class, com.google.accompanist.pager.ExperimentalPagerApi.class})
    private static final void SignUpForm(com.google.accompanist.pager.PagerState state, boolean loading, kotlin.jvm.functions.Function1<? super ru.surf.other.ui.actions.SignUpActions, kotlin.Unit> onActions, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> savedData) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES, device = "id:Nexus 6")
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO, device = "id:pixel_4")
    @kotlin.OptIn(markerClass = {com.google.accompanist.pager.ExperimentalPagerApi.class})
    private static final void Preview() {
    }
}