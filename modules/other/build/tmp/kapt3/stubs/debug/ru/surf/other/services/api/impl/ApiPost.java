package ru.surf.other.services.api.impl;

import java.lang.System;

/**
 * The POST method is used to submit an entity to the specified resource, often causing a change in state or side effects on the server.
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lru/surf/other/services/api/impl/ApiPost;", "", "signIn", "Lretrofit2/Response;", "Lru/surf/other/data/responses/SignInResponse;", "request", "Lru/surf/other/data/requests/SignInRequest;", "(Lru/surf/other/data/requests/SignInRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInError", "signUp", "Lru/surf/other/data/responses/SignUpResponse;", "Lru/surf/other/data/requests/SignUpRequest;", "(Lru/surf/other/data/requests/SignUpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUpValidate", "Lru/surf/other/data/responses/SignUpValidateResponse;", "Lru/surf/other/data/requests/SignUpValidateRequest;", "(Lru/surf/other/data/requests/SignUpValidateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "other_debug"})
public abstract interface ApiPost {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "login_error")
    public abstract java.lang.Object signInError(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.surf.other.data.requests.SignInRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.surf.other.data.responses.SignInResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "login")
    public abstract java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.surf.other.data.requests.SignInRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.surf.other.data.responses.SignInResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "email_validate")
    public abstract java.lang.Object signUpValidate(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.surf.other.data.requests.SignUpValidateRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.surf.other.data.responses.SignUpValidateResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "registration")
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.surf.other.data.requests.SignUpRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.surf.other.data.responses.SignUpResponse>> continuation);
}