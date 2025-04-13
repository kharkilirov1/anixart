package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class SystemParameterRule extends GeneratedMessageLite<SystemParameterRule, Builder> implements SystemParameterRuleOrBuilder {
    private static final SystemParameterRule DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile Parser<SystemParameterRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private Internal.ProtobufList<SystemParameter> parameters_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.SystemParameterRule$1 */
    public static /* synthetic */ class C15401 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20452a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20452a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20452a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20452a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20452a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20452a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20452a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20452a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<SystemParameterRule, Builder> implements SystemParameterRuleOrBuilder {
        public Builder() {
            super(SystemParameterRule.DEFAULT_INSTANCE);
        }

        public Builder(C15401 c15401) {
            super(SystemParameterRule.DEFAULT_INSTANCE);
        }
    }

    static {
        SystemParameterRule systemParameterRule = new SystemParameterRule();
        DEFAULT_INSTANCE = systemParameterRule;
        GeneratedMessageLite.m13417F(SystemParameterRule.class, systemParameterRule);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"selector_", "parameters_", SystemParameter.class});
            case NEW_MUTABLE_INSTANCE:
                return new SystemParameterRule();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<SystemParameterRule> parser = PARSER;
                if (parser == null) {
                    synchronized (SystemParameterRule.class) {
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
