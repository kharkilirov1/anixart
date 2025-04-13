package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class AuthProvider extends GeneratedMessageLite<AuthProvider, Builder> implements AuthProviderOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final AuthProvider DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile Parser<AuthProvider> PARSER;
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private Internal.ProtobufList<JwtLocation> jwtLocations_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.AuthProvider$1 */
    public static /* synthetic */ class C14901 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20333a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20333a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20333a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20333a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20333a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20333a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20333a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20333a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthProvider, Builder> implements AuthProviderOrBuilder {
        public Builder() {
            super(AuthProvider.DEFAULT_INSTANCE);
        }

        public Builder(C14901 c14901) {
            super(AuthProvider.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthProvider authProvider = new AuthProvider();
        DEFAULT_INSTANCE = authProvider;
        GeneratedMessageLite.m13417F(AuthProvider.class, authProvider);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    /* renamed from: p */
    public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", JwtLocation.class});
            case NEW_MUTABLE_INSTANCE:
                return new AuthProvider();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<AuthProvider> parser = PARSER;
                if (parser == null) {
                    synchronized (AuthProvider.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
