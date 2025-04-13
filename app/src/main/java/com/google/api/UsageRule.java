package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class UsageRule extends GeneratedMessageLite<UsageRule, Builder> implements UsageRuleOrBuilder {
    public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
    private static final UsageRule DEFAULT_INSTANCE;
    private static volatile Parser<UsageRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    public static final int SKIP_SERVICE_CONTROL_FIELD_NUMBER = 3;
    private boolean allowUnregisteredCalls_;
    private String selector_ = "";
    private boolean skipServiceControl_;

    /* renamed from: com.google.api.UsageRule$1 */
    public static /* synthetic */ class C15431 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20455a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20455a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20455a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20455a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20455a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20455a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20455a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20455a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<UsageRule, Builder> implements UsageRuleOrBuilder {
        public Builder() {
            super(UsageRule.DEFAULT_INSTANCE);
        }

        public Builder(C15431 c15431) {
            super(UsageRule.DEFAULT_INSTANCE);
        }
    }

    static {
        UsageRule usageRule = new UsageRule();
        DEFAULT_INSTANCE = usageRule;
        GeneratedMessageLite.m13417F(UsageRule.class, usageRule);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"selector_", "allowUnregisteredCalls_", "skipServiceControl_"});
            case NEW_MUTABLE_INSTANCE:
                return new UsageRule();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<UsageRule> parser = PARSER;
                if (parser == null) {
                    synchronized (UsageRule.class) {
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
