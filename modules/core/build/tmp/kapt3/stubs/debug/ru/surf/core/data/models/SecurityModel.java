package ru.surf.core.data.models;

import java.lang.System;

/**
 * Model saved with encryption for access
 *
 * @property token singIn/Up string for authorization
 *
 * @author Vitaliy Zarubin
 */
@androidx.compose.runtime.Immutable()
@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lru/surf/core/data/models/SecurityModel;", "Lru/surf/core/interfaces/IModel;", "id", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core_debug"})
public final class SecurityModel implements ru.surf.core.interfaces.IModel {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String token = null;
    
    /**
     * Model saved with encryption for access
     *
     * @property token singIn/Up string for authorization
     *
     * @author Vitaliy Zarubin
     */
    @org.jetbrains.annotations.NotNull()
    public final ru.surf.core.data.models.SecurityModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    /**
     * Model saved with encryption for access
     *
     * @property token singIn/Up string for authorization
     *
     * @author Vitaliy Zarubin
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model saved with encryption for access
     *
     * @property token singIn/Up string for authorization
     *
     * @author Vitaliy Zarubin
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model saved with encryption for access
     *
     * @property token singIn/Up string for authorization
     *
     * @author Vitaliy Zarubin
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SecurityModel() {
        super();
    }
    
    public SecurityModel(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
}