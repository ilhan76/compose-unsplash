package ru.surf.core.utils;

import java.lang.System;

/**
 * Base Constants for App
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lru/surf/core/utils/ConstantsApp;", "", "()V", "API_URL", "", "DEBUG_CREDENTIAL_LOGIN", "getDEBUG_CREDENTIAL_LOGIN", "()Ljava/lang/String;", "DEBUG_CREDENTIAL_PASSW", "getDEBUG_CREDENTIAL_PASSW", "DEBUG_DELAY", "", "core_debug"})
public final class ConstantsApp {
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.core.utils.ConstantsApp INSTANCE = null;
    
    /**
     * Api url
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_URL = "https://r2.mocker.surfstudio.ru/template/";
    
    /**
     * For simulate slow internet
     */
    public static final long DEBUG_DELAY = 1000L;
    
    private ConstantsApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDEBUG_CREDENTIAL_LOGIN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDEBUG_CREDENTIAL_PASSW() {
        return null;
    }
}