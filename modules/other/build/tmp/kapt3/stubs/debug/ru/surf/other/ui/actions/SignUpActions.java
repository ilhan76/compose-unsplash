package ru.surf.other.ui.actions;

import java.lang.System;

/**
 * Actions sealed class for screen [SignUpScreen]
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/surf/other/ui/actions/SignUpActions;", "", "()V", "SignUp", "SignUpValidate", "Lru/surf/other/ui/actions/SignUpActions$SignUpValidate;", "Lru/surf/other/ui/actions/SignUpActions$SignUp;", "other_debug"})
public abstract class SignUpActions {
    
    private SignUpActions() {
        super();
    }
    
    /**
     * Validate email in back-end side
     *
     * @property email string
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lru/surf/other/ui/actions/SignUpActions$SignUpValidate;", "Lru/surf/other/ui/actions/SignUpActions;", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "other_debug"})
    public static final class SignUpValidate extends ru.surf.other.ui.actions.SignUpActions {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String email = null;
        
        /**
         * Validate email in back-end side
         *
         * @property email string
         */
        @org.jetbrains.annotations.NotNull()
        public final ru.surf.other.ui.actions.SignUpActions.SignUpValidate copy(@org.jetbrains.annotations.NotNull()
        java.lang.String email) {
            return null;
        }
        
        /**
         * Validate email in back-end side
         *
         * @property email string
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Validate email in back-end side
         *
         * @property email string
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Validate email in back-end side
         *
         * @property email string
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SignUpValidate(@org.jetbrains.annotations.NotNull()
        java.lang.String email) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmail() {
            return null;
        }
    }
    
    /**
     * Action registration user
     *
     * @property email login email user
     * @property pass just password
     * @property fname string name user
     * @property lname string surname user
     * @property phoneWork string phone from work
     * @property phoneHome string phone form home
     * @property card string format ####-####-####-####
     * @property cvc string format ###
     * @property bio text about user
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006("}, d2 = {"Lru/surf/other/ui/actions/SignUpActions$SignUp;", "Lru/surf/other/ui/actions/SignUpActions;", "email", "", "pass", "fname", "lname", "phoneWork", "phoneHome", "card", "cvc", "bio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBio", "()Ljava/lang/String;", "getCard", "getCvc", "getEmail", "getFname", "getLname", "getPass", "getPhoneHome", "getPhoneWork", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "other_debug"})
    public static final class SignUp extends ru.surf.other.ui.actions.SignUpActions {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String email = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String pass = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fname = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lname = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String phoneWork = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String phoneHome = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String card = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String cvc = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String bio = null;
        
        /**
         * Action registration user
         *
         * @property email login email user
         * @property pass just password
         * @property fname string name user
         * @property lname string surname user
         * @property phoneWork string phone from work
         * @property phoneHome string phone form home
         * @property card string format ####-####-####-####
         * @property cvc string format ###
         * @property bio text about user
         */
        @org.jetbrains.annotations.NotNull()
        public final ru.surf.other.ui.actions.SignUpActions.SignUp copy(@org.jetbrains.annotations.NotNull()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        java.lang.String pass, @org.jetbrains.annotations.NotNull()
        java.lang.String fname, @org.jetbrains.annotations.NotNull()
        java.lang.String lname, @org.jetbrains.annotations.NotNull()
        java.lang.String phoneWork, @org.jetbrains.annotations.NotNull()
        java.lang.String phoneHome, @org.jetbrains.annotations.NotNull()
        java.lang.String card, @org.jetbrains.annotations.NotNull()
        java.lang.String cvc, @org.jetbrains.annotations.NotNull()
        java.lang.String bio) {
            return null;
        }
        
        /**
         * Action registration user
         *
         * @property email login email user
         * @property pass just password
         * @property fname string name user
         * @property lname string surname user
         * @property phoneWork string phone from work
         * @property phoneHome string phone form home
         * @property card string format ####-####-####-####
         * @property cvc string format ###
         * @property bio text about user
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Action registration user
         *
         * @property email login email user
         * @property pass just password
         * @property fname string name user
         * @property lname string surname user
         * @property phoneWork string phone from work
         * @property phoneHome string phone form home
         * @property card string format ####-####-####-####
         * @property cvc string format ###
         * @property bio text about user
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Action registration user
         *
         * @property email login email user
         * @property pass just password
         * @property fname string name user
         * @property lname string surname user
         * @property phoneWork string phone from work
         * @property phoneHome string phone form home
         * @property card string format ####-####-####-####
         * @property cvc string format ###
         * @property bio text about user
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SignUp(@org.jetbrains.annotations.NotNull()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        java.lang.String pass, @org.jetbrains.annotations.NotNull()
        java.lang.String fname, @org.jetbrains.annotations.NotNull()
        java.lang.String lname, @org.jetbrains.annotations.NotNull()
        java.lang.String phoneWork, @org.jetbrains.annotations.NotNull()
        java.lang.String phoneHome, @org.jetbrains.annotations.NotNull()
        java.lang.String card, @org.jetbrains.annotations.NotNull()
        java.lang.String cvc, @org.jetbrains.annotations.NotNull()
        java.lang.String bio) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmail() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPass() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFname() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLname() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhoneWork() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhoneHome() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCard() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCvc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBio() {
            return null;
        }
    }
}