package ru.surf.core.logger.strategies.remote;

import java.lang.System;

/**
 * Logging strategy for [RemoteLogger] usage for messages with priority since Log.DEBUG
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002JA\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0002\u0010\u0013R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lru/surf/core/logger/strategies/remote/RemoteLoggerLoggingStrategy;", "Lru/surfstudio/android/logger/logging_strategies/LoggingStrategy;", "()V", "explicitTag", "Ljava/lang/ThreadLocal;", "", "tag", "getTag", "()Ljava/lang/String;", "log", "", "priority", "", "t", "", "message", "args", "", "", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "Companion", "core_debug"})
public final class RemoteLoggerLoggingStrategy implements ru.surfstudio.android.logger.logging_strategies.LoggingStrategy {
    private final java.lang.ThreadLocal<java.lang.String> explicitTag = null;
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.core.logger.strategies.remote.RemoteLoggerLoggingStrategy.Companion Companion = null;
    private static final java.lang.String REMOTE_LOGGER_LOG_FORMAT = "%s: %s";
    private static final int MINIMAL_LOG_PRIORITY = android.util.Log.DEBUG;
    
    public RemoteLoggerLoggingStrategy() {
        super();
    }
    
    private final java.lang.String getTag() {
        return null;
    }
    
    @java.lang.Override()
    public void log(int priority, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.Object... args) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lru/surf/core/logger/strategies/remote/RemoteLoggerLoggingStrategy$Companion;", "", "()V", "MINIMAL_LOG_PRIORITY", "", "REMOTE_LOGGER_LOG_FORMAT", "", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}