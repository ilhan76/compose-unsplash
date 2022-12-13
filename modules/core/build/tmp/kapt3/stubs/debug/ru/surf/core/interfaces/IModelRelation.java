package ru.surf.core.interfaces;

import java.lang.System;

/**
 * Interface for model relations
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lru/surf/core/interfaces/IModelRelation;", "", "id", "", "getId", "()Ljava/lang/String;", "ownerId", "getOwnerId", "core_debug"})
public abstract interface IModelRelation {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getOwnerId();
}