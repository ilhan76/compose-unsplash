package ru.surf.core.logger.strategies.remote;

import java.lang.System;

/**
 * Logging strategy for Firebase Crashlytics
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u0012"}, d2 = {"Lru/surf/core/logger/strategies/remote/FirebaseCrashlyticsRemoteLoggingStrategy;", "Lru/surf/core/logger/RemoteLoggingStrategy;", "()V", "clearUser", "", "logError", "e", "", "logKeyValue", "key", "", "value", "logMessage", "message", "setUser", "id", "username", "email", "core_debug"})
public final class FirebaseCrashlyticsRemoteLoggingStrategy implements ru.surf.core.logger.RemoteLoggingStrategy {
    
    public FirebaseCrashlyticsRemoteLoggingStrategy() {
        super();
    }
    
    @java.lang.Override()
    public void setUser(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String email) {
    }
    
    @java.lang.Override()
    public void clearUser() {
    }
    
    @java.lang.Override()
    public void logError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable e) {
    }
    
    @java.lang.Override()
    public void logMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void logKeyValue(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
}