package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Authentication extends GeneratedMessageLite<Authentication, Builder> implements AuthenticationOrBuilder {
    private static final Authentication DEFAULT_INSTANCE;
    private static volatile Parser<Authentication> PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private Internal.ProtobufList<AuthenticationRule> rules_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<AuthProvider> providers_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.Authentication$1 */
    public static /* synthetic */ class C14921 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20335a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20335a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20335a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20335a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20335a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20335a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20335a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20335a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Authentication, Builder> implements AuthenticationOrBuilder {
        public Builder() {
            super(Authentication.DEFAULT_INSTANCE);
        }

        public Builder(C14921 c14921) {
            super(Authentication.DEFAULT_INSTANCE);
        }
    }

    static {
        Authentication authentication = new Authentication();
        DEFAULT_INSTANCE = authentication;
        GeneratedMessageLite.m13417F(Authentication.class, authentication);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"rules_", AuthenticationRule.class, "providers_", AuthProvider.class});
            case NEW_MUTABLE_INSTANCE:
                return new Authentication();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Authentication> parser = PARSER;
                if (parser == null) {
                    synchronized (Authentication.class) {
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
