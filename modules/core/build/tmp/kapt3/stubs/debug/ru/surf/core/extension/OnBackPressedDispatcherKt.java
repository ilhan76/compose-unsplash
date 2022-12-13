package ru.surf.core.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"EmitByStatus", "", "Landroidx/activity/OnBackPressedDispatcher;", "status", "", "emit", "Lkotlin/Function0;", "core_debug"})
public final class OnBackPressedDispatcherKt {
    
    /**
     * Listen status for enable [OnBackPressedCallback]
     *
     * @param status state enable handleOnBackPressed
     * @param emit lambda for emit is enable
     *
     * @sample ru.surf.template.drawer.SetBackDispatcherAppDrawer
     *
     * @author Vitaliy Zarubin
     */
    @androidx.compose.runtime.Composable()
    public static final void EmitByStatus(@org.jetbrains.annotations.NotNull()
    androidx.activity.OnBackPressedDispatcher $this$EmitByStatus, boolean status, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> emit) {
    }
}