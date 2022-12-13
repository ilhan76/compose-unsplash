package ru.surf.other.ui.viewModels;

import java.lang.System;

/**
 * [ViewModel] for module
 *
 * @property apiService service http query
 *
 * @author Vitaliy Zarubin
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JN\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000726\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00140\u0018J\u0086\u0001\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000726\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00140\u0018J\u000e\u0010%\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\b\u0010&\u001a\u00020\u0014H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lru/surf/other/ui/viewModels/OtherViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lru/surf/other/services/apiService/OtherApiService;", "(Lru/surf/other/services/apiService/OtherApiService;)V", "_commonError", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_commonSuccess", "", "_loading", "commonError", "Lkotlinx/coroutines/flow/StateFlow;", "getCommonError", "()Lkotlinx/coroutines/flow/StateFlow;", "commonSuccess", "getCommonSuccess", "loading", "getLoading", "signIn", "", "email", "pass", "success", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "userId", "token", "signUp", "fname", "lname", "phoneWork", "phoneHome", "card", "cvc", "bio", "signUpValidate", "startQuery", "other_debug"})
public final class OtherViewModel extends androidx.lifecycle.ViewModel {
    private final ru.surf.other.services.apiService.OtherApiService apiService = null;
    
    /**
     * [MutableStateFlow] for errors state
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _commonError = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _commonSuccess = null;
    
    /**
     * [MutableStateFlow] for loading state
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _loading = null;
    
    @javax.inject.Inject()
    public OtherViewModel(@org.jetbrains.annotations.NotNull()
    ru.surf.other.services.apiService.OtherApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getCommonError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getCommonSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLoading() {
        return null;
    }
    
    /**
     * Clear state before query
     */
    private final void startQuery() {
    }
    
    /**
     * Query login user with callback if success
     *
     * @param email login user
     * @param pass it password
     * @param success callback if success with data user identifier and token
     */
    public final void signIn(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> success) {
    }
    
    /**
     * Query validate user email for registration
     *
     * @param email login user
     */
    public final void signUpValidate(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
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
     * @param success callback if success with data user identifier and token
     */
    public final void signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    java.lang.String fname, @org.jetbrains.annotations.NotNull()
    java.lang.String lname, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneWork, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneHome, @org.jetbrains.annotations.NotNull()
    java.lang.String card, @org.jetbrains.annotations.NotNull()
    java.lang.String cvc, @org.jetbrains.annotations.NotNull()
    java.lang.String bio, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> success) {
    }
}