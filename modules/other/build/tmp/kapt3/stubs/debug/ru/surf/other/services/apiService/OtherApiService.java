package ru.surf.other.services.apiService;

import java.lang.System;

/**
 * Base services for query separate by HTTP methods
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lru/surf/other/services/apiService/OtherApiService;", "Lru/surf/other/services/apiService/impl/ApiServiceDelete;", "Lru/surf/other/services/apiService/impl/ApiServiceGet;", "Lru/surf/other/services/apiService/impl/ApiServicePatch;", "Lru/surf/other/services/apiService/impl/ApiServicePost;", "Lru/surf/other/services/apiService/impl/ApiServicePut;", "api", "Lru/surf/other/services/api/OtherApi;", "(Lru/surf/other/services/api/OtherApi;)V", "getApi", "()Lru/surf/other/services/api/OtherApi;", "other_debug"})
public final class OtherApiService implements ru.surf.other.services.apiService.impl.ApiServiceDelete, ru.surf.other.services.apiService.impl.ApiServiceGet, ru.surf.other.services.apiService.impl.ApiServicePatch, ru.surf.other.services.apiService.impl.ApiServicePost, ru.surf.other.services.apiService.impl.ApiServicePut {
    @org.jetbrains.annotations.NotNull()
    private final ru.surf.other.services.api.OtherApi api = null;
    
    public OtherApiService(@org.jetbrains.annotations.NotNull()
    ru.surf.other.services.api.OtherApi api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.surf.other.services.api.OtherApi getApi() {
        return null;
    }
    
    /**
     * Query login user with callback if success. For example use random query with error response.
     *
     * @param email login user
     * @param pass it password
     *
     * @return response for get userId and token
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.other.data.responses.SignInResponse>> p2) {
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
    public java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    java.lang.String fname, @org.jetbrains.annotations.NotNull()
    java.lang.String lname, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneWork, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneHome, @org.jetbrains.annotations.NotNull()
    java.lang.String card, @org.jetbrains.annotations.NotNull()
    java.lang.String cvc, @org.jetbrains.annotations.NotNull()
    java.lang.String bio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.other.data.responses.SignUpResponse>> p9) {
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
    public java.lang.Object signUpValidate(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.surfstudio.compose.response.ResponseResult<ru.surf.other.data.responses.SignUpValidateResponse>> p1) {
        return null;
    }
}