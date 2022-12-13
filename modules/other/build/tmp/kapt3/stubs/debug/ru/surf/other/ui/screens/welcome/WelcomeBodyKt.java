package ru.surf.other.ui.screens.welcome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\u0005\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a8\u0006\t"}, d2 = {"Preview", "", "WelcomeAnimation", "modifier", "Landroidx/compose/ui/Modifier;", "WelcomeBody", "onActions", "Lkotlin/Function1;", "Lru/surf/other/ui/actions/WelcomeActions;", "other_debug"})
public final class WelcomeBodyKt {
    
    /**
     * Page animation
     */
    @androidx.compose.runtime.Composable()
    public static final void WelcomeAnimation(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Body page [WelcomeScreen]
     *
     * @param onActions actions page
     *
     * @author Vitaliy Zarubin
     */
    @androidx.compose.runtime.Composable()
    public static final void WelcomeBody(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.surf.other.ui.actions.WelcomeActions, kotlin.Unit> onActions) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES, device = "id:Nexus 6")
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO, device = "id:pixel_4")
    private static final void Preview() {
    }
}