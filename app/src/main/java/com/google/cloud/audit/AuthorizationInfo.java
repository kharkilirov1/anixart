package com.google.cloud.audit;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class AuthorizationInfo extends GeneratedMessageLite<AuthorizationInfo, Builder> implements AuthorizationInfoOrBuilder {
    private static final AuthorizationInfo DEFAULT_INSTANCE;
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile Parser<AuthorizationInfo> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String resource_ = "";
    private String permission_ = "";

    /* renamed from: com.google.cloud.audit.AuthorizationInfo$1 */
    public static /* synthetic */ class C15471 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20461a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20461a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20461a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20461a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20461a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20461a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20461a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20461a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthorizationInfo, Builder> implements AuthorizationInfoOrBuilder {
        public Builder() {
            super(AuthorizationInfo.DEFAULT_INSTANCE);
        }

        public Builder(C15471 c15471) {
            super(AuthorizationInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthorizationInfo authorizationInfo = new AuthorizationInfo();
        DEFAULT_INSTANCE = authorizationInfo;
        GeneratedMessageLite.m13417F(AuthorizationInfo.class, authorizationInfo);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"resource_", "permission_", "granted_"});
            case NEW_MUTABLE_INSTANCE:
                return new AuthorizationInfo();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<AuthorizationInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (AuthorizationInfo.class) {
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
