package com.google.cloud.audit;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class AuthenticationInfo extends GeneratedMessageLite<AuthenticationInfo, Builder> implements AuthenticationInfoOrBuilder {
    private static final AuthenticationInfo DEFAULT_INSTANCE;
    private static volatile Parser<AuthenticationInfo> PARSER = null;
    public static final int PRINCIPAL_EMAIL_FIELD_NUMBER = 1;
    private String principalEmail_ = "";

    /* renamed from: com.google.cloud.audit.AuthenticationInfo$1 */
    public static /* synthetic */ class C15461 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20460a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20460a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20460a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20460a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20460a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20460a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20460a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20460a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthenticationInfo, Builder> implements AuthenticationInfoOrBuilder {
        public Builder() {
            super(AuthenticationInfo.DEFAULT_INSTANCE);
        }

        public Builder(C15461 c15461) {
            super(AuthenticationInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthenticationInfo authenticationInfo = new AuthenticationInfo();
        DEFAULT_INSTANCE = authenticationInfo;
        GeneratedMessageLite.m13417F(AuthenticationInfo.class, authenticationInfo);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"principalEmail_"});
            case NEW_MUTABLE_INSTANCE:
                return new AuthenticationInfo();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<AuthenticationInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (AuthenticationInfo.class) {
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
