package ru.surf.core.logger.strategies.local;

import java.lang.System;

/**
 * Logging strategy with [Timber] usage
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JA\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f\"\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0004H\u0002\u00a8\u0006\u0010"}, d2 = {"Lru/surf/core/logger/strategies/local/TimberLoggingStrategy;", "Lru/surfstudio/android/logger/logging_strategies/LoggingStrategy;", "()V", "log", "", "priority", "", "t", "", "message", "", "args", "", "", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "setClickableLink", "core_debug"})
public final class TimberLoggingStrategy implements ru.surfstudio.android.logger.logging_strategies.LoggingStrategy {
    
    public TimberLoggingStrategy() {
        super();
    }
    
    @java.lang.Override()
    public void log(int priority, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.Object... args) {
    }
    
    private final void setClickableLink() {
    }
}