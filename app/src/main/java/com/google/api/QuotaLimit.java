package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes.dex */
public final class QuotaLimit extends GeneratedMessageLite<QuotaLimit, Builder> implements QuotaLimitOrBuilder {
    private static final QuotaLimit DEFAULT_INSTANCE;
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile Parser<QuotaLimit> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private long defaultLimit_;
    private long freeTier_;
    private long maxLimit_;
    private MapFieldLite<String, Long> values_ = MapFieldLite.f24269c;
    private String name_ = "";
    private String description_ = "";
    private String duration_ = "";
    private String metric_ = "";
    private String unit_ = "";
    private String displayName_ = "";

    /* renamed from: com.google.api.QuotaLimit$1 */
    public static /* synthetic */ class C15331 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20439a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20439a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20439a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20439a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20439a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20439a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20439a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20439a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<QuotaLimit, Builder> implements QuotaLimitOrBuilder {
        public Builder() {
            super(QuotaLimit.DEFAULT_INSTANCE);
        }

        public Builder(C15331 c15331) {
            super(QuotaLimit.DEFAULT_INSTANCE);
        }
    }

    public static final class ValuesDefaultEntryHolder {

        /* renamed from: a */
        public static final MapEntryLite<String, Long> f20440a = new MapEntryLite<>(WireFormat.FieldType.f24409l, "", WireFormat.FieldType.f24403f, 0L);
    }

    static {
        QuotaLimit quotaLimit = new QuotaLimit();
        DEFAULT_INSTANCE = quotaLimit;
        GeneratedMessageLite.m13417F(QuotaLimit.class, quotaLimit);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\f\n\u0001\u0000\u0000\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0002\bȈ\tȈ\n2\fȈ", new Object[]{"description_", "defaultLimit_", "maxLimit_", "duration_", "name_", "freeTier_", "metric_", "unit_", "values_", ValuesDefaultEntryHolder.f20440a, "displayName_"});
            case NEW_MUTABLE_INSTANCE:
                return new QuotaLimit();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<QuotaLimit> parser = PARSER;
                if (parser == null) {
                    synchronized (QuotaLimit.class) {
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
