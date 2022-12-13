package ru.surf.core.tests;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u0002H\f\"\u0006\b\u0000\u0010\f\u0018\u0001H\u0086\b\u00a2\u0006\u0002\u0010\rJM\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\'\u0010\u0013\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014\u00a2\u0006\u0002\b\u0017\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u000fH\u0007J\u001c\u0010\u001a\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lru/surf/core/tests/ApiAbstract;", "", "path", "", "(Ljava/lang/String;)V", "mockWebServer", "Lokhttp3/mockwebserver/MockWebServer;", "getMockWebServer", "()Lokhttp3/mockwebserver/MockWebServer;", "getPath", "()Ljava/lang/String;", "api", "T", "()Ljava/lang/Object;", "runBlockingApi", "", "fileName", "code", "", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;ILkotlin/jvm/functions/Function2;)V", "tearDown", "enqueueResponse", "core_debug"})
@org.junit.runner.RunWith(value = org.junit.runners.JUnit4.class)
public abstract class ApiAbstract {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String path = null;
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.mockwebserver.MockWebServer mockWebServer = null;
    
    public ApiAbstract() {
        super();
    }
    
    public ApiAbstract(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.mockwebserver.MockWebServer getMockWebServer() {
        return null;
    }
    
    private final void enqueueResponse(okhttp3.mockwebserver.MockWebServer $this$enqueueResponse, java.lang.String fileName, int code) {
    }
    
    public final <T extends java.lang.Object>void runBlockingApi(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, int code, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block) {
    }
    
    @org.junit.After()
    public final void tearDown() {
    }
}