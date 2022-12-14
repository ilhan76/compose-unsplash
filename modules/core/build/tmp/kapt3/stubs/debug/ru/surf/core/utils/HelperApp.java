package ru.surf.core.utils;

import java.lang.System;

/**
 * Helpers for app
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0006\u0010\u0005\u00a8\u0006\t"}, d2 = {"Lru/surf/core/utils/HelperApp;", "", "()V", "isNotRunningTest", "", "()Z", "isRunningTest", "isRunningTest$delegate", "Lkotlin/Lazy;", "core_debug"})
public final class HelperApp {
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.core.utils.HelperApp INSTANCE = null;
    
    /**
     * Check is test running
     */
    private static final kotlin.Lazy isRunningTest$delegate = null;
    
    /**
     * Check is test running
     */
    private static final boolean isNotRunningTest = false;
    
    private HelperApp() {
        super();
    }
    
    /**
     * Check is test running
     */
    private final boolean isRunningTest() {
        return false;
    }
    
    public final boolean isNotRunningTest() {
        return false;
    }
}