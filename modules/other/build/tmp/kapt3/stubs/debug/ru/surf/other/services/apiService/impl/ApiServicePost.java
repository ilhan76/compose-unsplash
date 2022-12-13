package ru.surf.other.services.apiService.impl;

import java.lang.System;

/**
 * The POST method is used to submit an entity to the specified resource, often causing a change in state or side effects on the server.
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ_\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lru/surf/other/services/apiService/impl/ApiServicePost;", "", "api", "Lru/surf/other/services/api/OtherApi;", "getApi", "()Lru/surf/other/services/api/OtherApi;", "signIn", "Lru/surfstudio/compose/response/ResponseResult;", "Lru/surf/other/data/responses/SignInResponse;", "email", "", "pass", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lru/surf/other/data/responses/SignUpResponse;", "fname", "lname", "phoneWork", "phoneHome", "card", "cvc", "bio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUpValidate", "Lru/surf/other/data/responses/SignUpValidateResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "other_debug"})
public abstract interface ApiServicePost {
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.surf.other.services.api.OtherApi getApi();
    
    /**
     * Query login user with callback if success. For example use random query with error response.
     *
     * @param email login user
     * @param pass it password
     *
     * @return response for get userId and token
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.other.data.responses.SignInResponse>> continuation);
    
    /**
     * Query validate user email for registration
     *
     * @param email login user
     *
     * @return response for check is success validate
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signUpValidate(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.other.data.responses.SignUpValidateResponse>> continuation);
    
    /**
     * Query registration
     *
     * @param email login email user
     * @param pass just password
     * @param fname string name user
     * @param lname string surname user
     * @param phoneWork string phone from work
     * @param phoneHome string phone form home
     * @param card string format ####-####-####-####
     * @param cvc string format ###
     * @param bio text about user
     *
     * @return response for get userId and token
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    java.lang.String fname, @org.jetbrains.annotations.NotNull()
    java.lang.String lname, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneWork, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneHome, @org.jetbrains.annotations.NotNull()
    java.lang.String card, @org.jetbrains.annotations.NotNull()
    java.lang.String cvc, @org.jetbrains.annotations.NotNull()
    java.lang.String bio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.other.data.responses.SignUpResponse>> continuation);
    
    /**
     * The POST method is used to submit an entity to the specified resource, often causing a change in state or side effects on the server.
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Query login user with callback if success. For example use random query with error response.
         *
         * @param email login user
         * @param pass it password
         *
         * @return response for get userId and token
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
        ru.surf.other.services.apiService.impl.ApiServicePost $this, @org.jetbrains.annotations.NotNull()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        java.lang.String pass, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.other.data.responses.SignInResponse>> p3) {
            return null;
        }
        
        /**
         * Query validate user email for registration
         *
         * @param email login user
         *
         * @return response for check is success validate
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object signUpValidate(@org.jetbrains.annotations.NotNull()
        ru.surf.other.services.apiService.impl.ApiServicePost $this, @org.jetbrains.annotations.NotNull()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.other.data.responses.SignUpValidateResponse>> p2) {
            return null;
        }
        
        /**
         * Query registration
         *
         * @param email login email user
         * @param pass just password
         * @param fname string name user
         * @param lname string surname user
         * @param phoneWork string phone from work
         * @param phoneHome string phone form home
         * @param card string format ####-####-####-####
         * @param cvc string format ###
         * @param bio text about user
         *
         * @return response for get userId and token
         */
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
        ru.surf.other.services.apiService.impl.ApiServicePost $this, @org.jetbrains.annotations.NotNull()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        java.lang.String pass, @org.jetbrains.annotations.NotNull()
        java.lang.String fname, @org.jetbrains.annotations.NotNull()
        java.lang.String lname, @org.jetbrains.annotations.NotNull()
        java.lang.String phoneWork, @org.jetbrains.annotations.NotNull()
        java.lang.String phoneHome, @org.jetbrains.annotations.NotNull()
        java.lang.String card, @org.jetbrains.annotations.NotNull()
        java.lang.String cvc, @org.jetbrains.annotations.NotNull()
        java.lang.String bio, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.other.data.responses.SignUpResponse>> p10) {
            return null;
        }
    }
}