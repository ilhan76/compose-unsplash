package ru.surf.core.di;

import java.lang.System;

/**
 * Dagger Module with Retrofit
 *
 * @author Vitaliy Zarubin
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/surf/core/di/HttpClientModule;", "", "()V", "json", "Lkotlinx/serialization/json/Json;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "core_debug"})
@dagger.Module()
public final class HttpClientModule {
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.core.di.HttpClientModule INSTANCE = null;
    
    /**
     * Builder of the [Json] instance provided by `Json { ... }` factory function.
     */
    private static final kotlinx.serialization.json.Json json = null;
    
    private HttpClientModule() {
        super();
    }
    
    /**
     * Factory for [calls][Call], which can be used to send HTTP requests and read their responses.
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    /**
     * Retrofit adapts a Java interface to HTTP calls by using annotations on the declared methods to define how requests are made.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
}