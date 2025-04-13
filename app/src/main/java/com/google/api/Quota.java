package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Quota extends GeneratedMessageLite<Quota, Builder> implements QuotaOrBuilder {
    private static final Quota DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile Parser<Quota> PARSER;
    private Internal.ProtobufList<QuotaLimit> limits_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<MetricRule> metricRules_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.Quota$1 */
    public static /* synthetic */ class C15321 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20438a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20438a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20438a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20438a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20438a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20438a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20438a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20438a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Quota, Builder> implements QuotaOrBuilder {
        public Builder() {
            super(Quota.DEFAULT_INSTANCE);
        }

        public Builder(C15321 c15321) {
            super(Quota.DEFAULT_INSTANCE);
        }
    }

    static {
        Quota quota = new Quota();
        DEFAULT_INSTANCE = quota;
        GeneratedMessageLite.m13417F(Quota.class, quota);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"limits_", QuotaLimit.class, "metricRules_", MetricRule.class});
            case NEW_MUTABLE_INSTANCE:
                return new Quota();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Quota> parser = PARSER;
                if (parser == null) {
                    synchronized (Quota.class) {
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
