package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class AuthRequirement extends GeneratedMessageLite<AuthRequirement, Builder> implements AuthRequirementOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 2;
    private static final AuthRequirement DEFAULT_INSTANCE;
    private static volatile Parser<AuthRequirement> PARSER = null;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private String providerId_ = "";
    private String audiences_ = "";

    /* renamed from: com.google.api.AuthRequirement$1 */
    public static /* synthetic */ class C14911 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20334a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20334a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20334a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20334a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20334a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20334a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20334a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20334a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthRequirement, Builder> implements AuthRequirementOrBuilder {
        public Builder() {
            super(AuthRequirement.DEFAULT_INSTANCE);
        }

        public Builder(C14911 c14911) {
            super(AuthRequirement.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthRequirement authRequirement = new AuthRequirement();
        DEFAULT_INSTANCE = authRequirement;
        GeneratedMessageLite.m13417F(AuthRequirement.class, authRequirement);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"providerId_", "audiences_"});
            case NEW_MUTABLE_INSTANCE:
                return new AuthRequirement();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<AuthRequirement> parser = PARSER;
                if (parser == null) {
                    synchronized (AuthRequirement.class) {
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
