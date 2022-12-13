package ru.surf.users.ui.screens.listUsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aP\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007\u00a8\u0006\r"}, d2 = {"ListUsersBody", "", "search", "", "items", "Landroidx/paging/compose/LazyPagingItems;", "Lru/surf/users/data/models/UserModel;", "searchItems", "onActions", "Lkotlin/Function1;", "Lru/surf/users/ui/actions/ListUsersActions;", "localMainViewModel", "Lru/surf/core/base/MainViewModel;", "users_debug"})
public final class ListUsersBodyKt {
    
    /**
     * Body page [ListUsersScreen]
     *
     * @param search state call query to api
     * @param items list paging list [LazyPagingItems]
     * @param searchItems searching list paging list [LazyPagingItems]
     * @param onActions actions page
     *
     * @author Vitaliy Zarubin
     */
    @androidx.compose.runtime.Composable()
    public static final void ListUsersBody(@org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    androidx.paging.compose.LazyPagingItems<ru.surf.users.data.models.UserModel> items, @org.jetbrains.annotations.NotNull()
    androidx.paging.compose.LazyPagingItems<ru.surf.users.data.models.UserModel> searchItems, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.surf.users.ui.actions.ListUsersActions, kotlin.Unit> onActions, @org.jetbrains.annotations.Nullable()
    ru.surf.core.base.MainViewModel localMainViewModel) {
    }
}