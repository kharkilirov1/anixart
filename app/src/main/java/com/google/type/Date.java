package com.google.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class Date extends GeneratedMessageLite<Date, Builder> implements DateOrBuilder {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final Date DEFAULT_INSTANCE;
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile Parser<Date> PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int month_;
    private int year_;

    /* renamed from: com.google.type.Date$1 */
    public static /* synthetic */ class C24331 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24492a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24492a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24492a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24492a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24492a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24492a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24492a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24492a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Date, Builder> implements DateOrBuilder {
        public Builder() {
            super(Date.DEFAULT_INSTANCE);
        }

        public Builder(C24331 c24331) {
            super(Date.DEFAULT_INSTANCE);
        }
    }

    static {
        Date date = new Date();
        DEFAULT_INSTANCE = date;
        GeneratedMessageLite.m13417F(Date.class, date);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"year_", "month_", "day_"});
            case NEW_MUTABLE_INSTANCE:
                return new Date();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Date> parser = PARSER;
                if (parser == null) {
                    synchronized (Date.class) {
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
