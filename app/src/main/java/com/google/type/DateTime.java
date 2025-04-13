package com.google.type;

import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class DateTime extends GeneratedMessageLite<DateTime, Builder> implements DateTimeOrBuilder {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final DateTime DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile Parser<DateTime> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    /* renamed from: com.google.type.DateTime$1 */
    public static /* synthetic */ class C24341 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24493a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24493a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24493a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24493a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24493a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24493a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24493a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24493a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DateTime, Builder> implements DateTimeOrBuilder {
        public Builder() {
            super(DateTime.DEFAULT_INSTANCE);
        }

        public Builder(C24341 c24341) {
            super(DateTime.DEFAULT_INSTANCE);
        }
    }

    public enum TimeOffsetCase {
        /* JADX INFO: Fake field, exist only in values array */
        UTC_OFFSET(8),
        /* JADX INFO: Fake field, exist only in values array */
        TIME_ZONE(9),
        /* JADX INFO: Fake field, exist only in values array */
        TIMEOFFSET_NOT_SET(0);

        TimeOffsetCase(int i2) {
        }
    }

    static {
        DateTime dateTime = new DateTime();
        DEFAULT_INSTANCE = dateTime;
        GeneratedMessageLite.m13417F(DateTime.class, dateTime);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"timeOffset_", "timeOffsetCase_", "year_", "month_", "day_", "hours_", "minutes_", "seconds_", "nanos_", Duration.class, TimeZone.class});
            case NEW_MUTABLE_INSTANCE:
                return new DateTime();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<DateTime> parser = PARSER;
                if (parser == null) {
                    synchronized (DateTime.class) {
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
