package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class AuthenticationRule extends GeneratedMessageLite<AuthenticationRule, Builder> implements AuthenticationRuleOrBuilder {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    private static final AuthenticationRule DEFAULT_INSTANCE;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile Parser<AuthenticationRule> PARSER = null;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private OAuthRequirements oauth_;
    private String selector_ = "";
    private Internal.ProtobufList<AuthRequirement> requirements_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.AuthenticationRule$1 */
    public static /* synthetic */ class C14931 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20336a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20336a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20336a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20336a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20336a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20336a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20336a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20336a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthenticationRule, Builder> implements AuthenticationRuleOrBuilder {
        public Builder() {
            super(AuthenticationRule.DEFAULT_INSTANCE);
        }

        public Builder(C14931 c14931) {
            super(AuthenticationRule.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthenticationRule authenticationRule = new AuthenticationRule();
        DEFAULT_INSTANCE = authenticationRule;
        GeneratedMessageLite.m13417F(AuthenticationRule.class, authenticationRule);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0005\u0007\u0007\u001b", new Object[]{"selector_", "oauth_", "allowWithoutCredential_", "requirements_", AuthRequirement.class});
            case NEW_MUTABLE_INSTANCE:
                return new AuthenticationRule();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<AuthenticationRule> parser = PARSER;
                if (parser == null) {
                    synchronized (AuthenticationRule.class) {
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
