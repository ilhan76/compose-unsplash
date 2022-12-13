package ru.surf.core.forms.validate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"PASSWORD_VALIDATION_REGEX", "", "getErrorIsLong", "Lkotlin/Function1;", "Landroid/content/Context;", "target", "getErrorIsNotMatches", "getErrorIsSmall", "core_debug"})
public final class PasswordStateValidateRequiredKt {
    
    /**
     * Regex check password
     */
    private static final java.lang.String PASSWORD_VALIDATION_REGEX = "^[0-9_A-z]+$";
    
    /**
     * Validate length password for [PasswordStateValidateRequired]
     *
     * @author Vitaliy Zarubin
     */
    private static final kotlin.jvm.functions.Function1<android.content.Context, java.lang.String> getErrorIsSmall(java.lang.String target) {
        return null;
    }
    
    /**
     * Validate length password for [PasswordStateValidateRequired]
     *
     * @author Vitaliy Zarubin
     */
    private static final kotlin.jvm.functions.Function1<android.content.Context, java.lang.String> getErrorIsLong(java.lang.String target) {
        return null;
    }
    
    /**
     * Check password by regex [PasswordStateValidateRequired]
     *
     * @author Vitaliy Zarubin
     */
    private static final kotlin.jvm.functions.Function1<android.content.Context, java.lang.String> getErrorIsNotMatches(java.lang.String target) {
        return null;
    }
}