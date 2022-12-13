package ru.surf.core.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"LocalBackPressedDispatcher", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/OnBackPressedDispatcher;", "getLocalBackPressedDispatcher", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalMainViewModel", "Lru/surf/core/base/MainViewModel;", "getLocalMainViewModel", "core_debug"})
public final class LocalStaticKt {
    
    /**
     * [MainViewModel] Can be used in CompositionLocalProvider to provide values.
     *
     * @author Vitaliy Zarubin
     */
    @org.jetbrains.annotations.NotNull()
    private static final androidx.compose.runtime.ProvidableCompositionLocal<ru.surf.core.base.MainViewModel> LocalMainViewModel = null;
    
    /**
     * [OnBackPressedDispatcher] Can be used in CompositionLocalProvider to provide values.
     *
     * @author Vitaliy Zarubin
     */
    @org.jetbrains.annotations.NotNull()
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.activity.OnBackPressedDispatcher> LocalBackPressedDispatcher = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.runtime.ProvidableCompositionLocal<ru.surf.core.base.MainViewModel> getLocalMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.activity.OnBackPressedDispatcher> getLocalBackPressedDispatcher() {
        return null;
    }
}