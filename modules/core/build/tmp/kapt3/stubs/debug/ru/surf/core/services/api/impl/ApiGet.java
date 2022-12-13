package ru.surf.core.services.api.impl;

import java.lang.System;

/**
 * The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lru/surf/core/services/api/impl/ApiGet;", "", "getListSettings", "Lretrofit2/Response;", "", "Lru/surf/core/data/responses/SettingsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface ApiGet {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "settings")
    public abstract java.lang.Object getListSettings(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<ru.surf.core.data.responses.SettingsResponse>>> continuation);
}