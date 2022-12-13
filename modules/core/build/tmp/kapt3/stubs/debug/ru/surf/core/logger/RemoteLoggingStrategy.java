package ru.surf.core.logger;

import java.lang.System;

/**
 * Interface of logging strategies for remote server
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001c\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\tH&J&\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\u0011"}, d2 = {"Lru/surf/core/logger/RemoteLoggingStrategy;", "", "clearUser", "", "logError", "e", "", "logKeyValue", "key", "", "value", "logMessage", "message", "setUser", "id", "username", "email", "core_debug"})
public abstract interface RemoteLoggingStrategy {
    
    public abstract void setUser(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String email);
    
    public abstract void clearUser();
    
    public abstract void logError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable e);
    
    public abstract void logMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public abstract void logKeyValue(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value);
}