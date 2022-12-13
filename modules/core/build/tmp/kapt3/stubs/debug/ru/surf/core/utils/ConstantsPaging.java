package ru.surf.core.utils;

import java.lang.System;

/**
 * Constants for paging lists
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/surf/core/utils/ConstantsPaging;", "", "()V", "CACHE_TIMEOUT", "", "getCACHE_TIMEOUT", "()J", "MAX_PAGE_SIZE", "", "PAGE_LIMIT", "core_debug"})
public final class ConstantsPaging {
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.core.utils.ConstantsPaging INSTANCE = null;
    
    /**
     * Lists refresh once per hour
     */
    private static final long CACHE_TIMEOUT = 0L;
    
    /**
     * Max count list items
     */
    public static final int MAX_PAGE_SIZE = 100;
    
    /**
     * Query page size
     */
    public static final int PAGE_LIMIT = 5;
    
    private ConstantsPaging() {
        super();
    }
    
    public final long getCACHE_TIMEOUT() {
        return 0L;
    }
}