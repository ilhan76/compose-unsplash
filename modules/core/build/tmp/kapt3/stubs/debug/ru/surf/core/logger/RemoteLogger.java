package ru.surf.core.logger;

import java.lang.System;

/**
 * Object for logging to remote server which supports different logging strategies
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u001c\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\rH\u0002J\u0018\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0007J \u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lru/surf/core/logger/RemoteLogger;", "", "()V", "REMOTE_LOGGING_STRATEGIES", "Ljava/util/HashMap;", "Lkotlin/reflect/KClass;", "Lru/surf/core/logger/RemoteLoggingStrategy;", "addRemoteLoggingStrategy", "strategy", "clearUser", "", "forEachRemoteLoggingStrategyOrWithDefault", "action", "Lkotlin/Function1;", "getRemoteLoggingStrategies", "logError", "e", "", "logMessage", "message", "", "removeRemoteLoggingStrategies", "setCustomKey", "key", "value", "setUser", "id", "username", "email", "core_debug"})
public final class RemoteLogger {
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.core.logger.RemoteLogger INSTANCE = null;
    private static final java.util.HashMap<kotlin.reflect.KClass<?>, ru.surf.core.logger.RemoteLoggingStrategy> REMOTE_LOGGING_STRATEGIES = null;
    
    private RemoteLogger() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.HashMap<kotlin.reflect.KClass<?>, ru.surf.core.logger.RemoteLoggingStrategy> getRemoteLoggingStrategies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final ru.surf.core.logger.RemoteLoggingStrategy addRemoteLoggingStrategy(@org.jetbrains.annotations.NotNull()
    ru.surf.core.logger.RemoteLoggingStrategy strategy) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final ru.surf.core.logger.RemoteLoggingStrategy removeRemoteLoggingStrategies(@org.jetbrains.annotations.NotNull()
    ru.surf.core.logger.RemoteLoggingStrategy strategy) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setUser(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void clearUser() {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setCustomKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void logError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void logMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void forEachRemoteLoggingStrategyOrWithDefault(kotlin.jvm.functions.Function1<? super ru.surf.core.logger.RemoteLoggingStrategy, kotlin.Unit> action) {
    }
}