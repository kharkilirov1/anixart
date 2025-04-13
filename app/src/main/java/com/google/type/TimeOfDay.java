package com.google.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class TimeOfDay extends GeneratedMessageLite<TimeOfDay, Builder> implements TimeOfDayOrBuilder {
    private static final TimeOfDay DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 1;
    public static final int MINUTES_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 4;
    private static volatile Parser<TimeOfDay> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 3;
    private int hours_;
    private int minutes_;
    private int nanos_;
    private int seconds_;

    /* renamed from: com.google.type.TimeOfDay$1 */
    public static /* synthetic */ class C24421 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24516a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24516a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24516a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24516a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24516a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24516a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24516a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24516a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TimeOfDay, Builder> implements TimeOfDayOrBuilder {
        public Builder() {
            super(TimeOfDay.DEFAULT_INSTANCE);
        }

        public Builder(C24421 c24421) {
            super(TimeOfDay.DEFAULT_INSTANCE);
        }
    }

    static {
        TimeOfDay timeOfDay = new TimeOfDay();
        DEFAULT_INSTANCE = timeOfDay;
        GeneratedMessageLite.m13417F(TimeOfDay.class, timeOfDay);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"hours_", "minutes_", "seconds_", "nanos_"});
            case NEW_MUTABLE_INSTANCE:
                return new TimeOfDay();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<TimeOfDay> parser = PARSER;
                if (parser == null) {
                    synchronized (TimeOfDay.class) {
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
