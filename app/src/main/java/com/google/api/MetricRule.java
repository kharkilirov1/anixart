package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes.dex */
public final class MetricRule extends GeneratedMessageLite<MetricRule, Builder> implements MetricRuleOrBuilder {
    private static final MetricRule DEFAULT_INSTANCE;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile Parser<MetricRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private MapFieldLite<String, Long> metricCosts_ = MapFieldLite.f24269c;
    private String selector_ = "";

    /* renamed from: com.google.api.MetricRule$1 */
    public static /* synthetic */ class C15221 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20418a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20418a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20418a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20418a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20418a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20418a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20418a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20418a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MetricRule, Builder> implements MetricRuleOrBuilder {
        public Builder() {
            super(MetricRule.DEFAULT_INSTANCE);
        }

        public Builder(C15221 c15221) {
            super(MetricRule.DEFAULT_INSTANCE);
        }
    }

    public static final class MetricCostsDefaultEntryHolder {

        /* renamed from: a */
        public static final MapEntryLite<String, Long> f20419a = new MapEntryLite<>(WireFormat.FieldType.f24409l, "", WireFormat.FieldType.f24403f, 0L);
    }

    static {
        MetricRule metricRule = new MetricRule();
        DEFAULT_INSTANCE = metricRule;
        GeneratedMessageLite.m13417F(MetricRule.class, metricRule);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"selector_", "metricCosts_", MetricCostsDefaultEntryHolder.f20419a});
            case NEW_MUTABLE_INSTANCE:
                return new MetricRule();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<MetricRule> parser = PARSER;
                if (parser == null) {
                    synchronized (MetricRule.class) {
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
