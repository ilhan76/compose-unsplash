package ru.surf.other.data.requests;

import java.lang.System;

/**
 * @Body request registration user
 *
 * @property email login email user
 * @property password just password
 * @property fname string name user
 * @property lname string surname user
 * @property phoneWork string phone from work
 * @property phoneHome string phone form home
 * @property card string format ####-####-####-####
 * @property cvc string format ###
 * @property bio text about user
 *
 * @author Vitaliy Zarubin
 */
@androidx.compose.runtime.Immutable()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223Bs\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003Jc\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001J!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u00c7\u0001R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013\u00a8\u00064"}, d2 = {"Lru/surf/other/data/requests/SignUpRequest;", "", "seen1", "", "email", "", "password", "fname", "lname", "phoneWork", "phoneHome", "card", "cvc", "bio", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBio", "()Ljava/lang/String;", "getCard", "getCvc", "getEmail", "getFname", "getLname", "getPassword", "getPhoneHome", "getPhoneWork", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "other_debug"})
@kotlinx.serialization.Serializable()
public final class SignUpRequest {
    
    /**
     * @Body request registration user
     *
     * @property email login email user
     * @property password just password
     * @property fname string name user
     * @property lname string surname user
     * @property phoneWork string phone from work
     * @property phoneHome string phone form home
     * @property card string format ####-####-####-####
     * @property cvc string format ###
     * @property bio text about user
     *
     * @author Vitaliy Zarubin
     */
    @org.jetbrains.annotations.NotNull()
    public static final ru.surf.other.data.requests.SignUpRequest.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String password = null;
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
     * @Body request registration user
     *
     * @property email login email user
     * @property password just password
     * @property fname string name user
     * @property lname string surname user
     * @property phoneWork string phone from work
     * @property phoneHome string phone form home
     * @property card string format ####-####-####-####
     * @property cvc string format ###
     * @property bio text about user
     *
     * @author Vitaliy Zarubin
     */
    @org.jetbrains.annotations.NotNull()
    public final ru.surf.other.data.requests.SignUpRequest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
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
     * @Body request registration user
     *
     * @property email login email user
     * @property password just password
     * @property fname string name user
     * @property lname string surname user
     * @property phoneWork string phone from work
     * @property phoneHome string phone form home
     * @property card string format ####-####-####-####
     * @property cvc string format ###
     * @property bio text about user
     *
     * @author Vitaliy Zarubin
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * @Body request registration user
     *
     * @property email login email user
     * @property password just password
     * @property fname string name user
     * @property lname string surname user
     * @property phoneWork string phone from work
     * @property phoneHome string phone form home
     * @property card string format ####-####-####-####
     * @property cvc string format ###
     * @property bio text about user
     *
     * @author Vitaliy Zarubin
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @Body request registration user
     *
     * @property email login email user
     * @property password just password
     * @property fname string name user
     * @property lname string surname user
     * @property phoneWork string phone from work
     * @property phoneHome string phone form home
     * @property card string format ####-####-####-####
     * @property cvc string format ###
     * @property bio text about user
     *
     * @author Vitaliy Zarubin
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @Body request registration user
     *
     * @property email login email user
     * @property password just password
     * @property fname string name user
     * @property lname string surname user
     * @property phoneWork string phone from work
     * @property phoneHome string phone form home
     * @property card string format ####-####-####-####
     * @property cvc string format ###
     * @property bio text about user
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    ru.surf.other.data.requests.SignUpRequest self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public SignUpRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getPassword() {
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
    
    /**
     * @Body request registration user
     *
     * @property email login email user
     * @property password just password
     * @property fname string name user
     * @property lname string surname user
     * @property phoneWork string phone from work
     * @property phoneHome string phone form home
     * @property card string format ####-####-####-####
     * @property cvc string format ###
     * @property bio text about user
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lru/surf/other/data/requests/SignUpRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/surf/other/data/requests/SignUpRequest;", "other_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * @Body request registration user
         *
         * @property email login email user
         * @property password just password
         * @property fname string name user
         * @property lname string surname user
         * @property phoneWork string phone from work
         * @property phoneHome string phone form home
         * @property card string format ####-####-####-####
         * @property cvc string format ###
         * @property bio text about user
         *
         * @author Vitaliy Zarubin
         */
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<ru.surf.other.data.requests.SignUpRequest> serializer() {
            return null;
        }
    }
    
    /**
     * @Body request registration user
     *
     * @property email login email user
     * @property password just password
     * @property fname string name user
     * @property lname string surname user
     * @property phoneWork string phone from work
     * @property phoneHome string phone form home
     * @property card string format ####-####-####-####
     * @property cvc string format ###
     * @property bio text about user
     *
     * @author Vitaliy Zarubin
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"ru/surf/other/data/requests/SignUpRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lru/surf/other/data/requests/SignUpRequest;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "other_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<ru.surf.other.data.requests.SignUpRequest> {
        
        /**
         * @Body request registration user
         *
         * @property email login email user
         * @property password just password
         * @property fname string name user
         * @property lname string surname user
         * @property phoneWork string phone from work
         * @property phoneHome string phone form home
         * @property card string format ####-####-####-####
         * @property cvc string format ###
         * @property bio text about user
         *
         * @author Vitaliy Zarubin
         */
        @org.jetbrains.annotations.NotNull()
        public static final ru.surf.other.data.requests.SignUpRequest.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * @Body request registration user
         *
         * @property email login email user
         * @property password just password
         * @property fname string name user
         * @property lname string surname user
         * @property phoneWork string phone from work
         * @property phoneHome string phone form home
         * @property card string format ####-####-####-####
         * @property cvc string format ###
         * @property bio text about user
         *
         * @author Vitaliy Zarubin
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * @Body request registration user
         *
         * @property email login email user
         * @property password just password
         * @property fname string name user
         * @property lname string surname user
         * @property phoneWork string phone from work
         * @property phoneHome string phone form home
         * @property card string format ####-####-####-####
         * @property cvc string format ###
         * @property bio text about user
         *
         * @author Vitaliy Zarubin
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ru.surf.other.data.requests.SignUpRequest deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * @Body request registration user
         *
         * @property email login email user
         * @property password just password
         * @property fname string name user
         * @property lname string surname user
         * @property phoneWork string phone from work
         * @property phoneHome string phone form home
         * @property card string format ####-####-####-####
         * @property cvc string format ###
         * @property bio text about user
         *
         * @author Vitaliy Zarubin
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * @Body request registration user
         *
         * @property email login email user
         * @property password just password
         * @property fname string name user
         * @property lname string surname user
         * @property phoneWork string phone from work
         * @property phoneHome string phone form home
         * @property card string format ####-####-####-####
         * @property cvc string format ###
         * @property bio text about user
         *
         * @author Vitaliy Zarubin
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        ru.surf.other.data.requests.SignUpRequest value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}