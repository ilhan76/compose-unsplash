package ru.surf.core.ui.actions;

import java.lang.System;

/**
 * Actions sealed class for screen [StatusScreen]
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lru/surf/core/ui/actions/UnknownHostActions;", "", "()V", "Repeat", "Lru/surf/core/ui/actions/UnknownHostActions$Repeat;", "core_debug"})
public abstract class UnknownHostActions {
    
    private UnknownHostActions() {
        super();
    }
    
    /**
     * Check network status
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/surf/core/ui/actions/UnknownHostActions$Repeat;", "Lru/surf/core/ui/actions/UnknownHostActions;", "()V", "core_debug"})
    public static final class Repeat extends ru.surf.core.ui.actions.UnknownHostActions {
        @org.jetbrains.annotations.NotNull()
        public static final ru.surf.core.ui.actions.UnknownHostActions.Repeat INSTANCE = null;
        
        private Repeat() {
            super();
        }
    }
}