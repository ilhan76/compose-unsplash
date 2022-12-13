package ru.surf.users.ui.screens.viewUser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001aP\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Preview", "", "ViewUserBody", "id", "", "model", "Lru/surf/users/data/models/UserModel;", "loading", "", "error404", "onActions", "Lkotlin/Function1;", "Lru/surf/users/ui/actions/ViewUserActions;", "backDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "users_debug"})
public final class ViewUserBodyKt {
    
    /**
     * Body page [ViewUserScreen]
     *
     * @param id user identifier
     * @param model data db room [UserModel]
     * @param loading state call query to api
     * @param error404 state if model not found
     * @param onActions actions page
     * @param backDispatcher dispatcher press back
     *
     * @author Vitaliy Zarubin
     */
    @androidx.compose.runtime.Composable()
    public static final void ViewUserBody(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    ru.surf.users.data.models.UserModel model, boolean loading, boolean error404, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.surf.users.ui.actions.ViewUserActions, kotlin.Unit> onActions, @org.jetbrains.annotations.Nullable()
    androidx.activity.OnBackPressedDispatcher backDispatcher) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES, device = "id:Nexus 6")
    @androidx.compose.ui.tooling.preview.Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO, device = "id:pixel_4")
    private static final void Preview() {
    }
}