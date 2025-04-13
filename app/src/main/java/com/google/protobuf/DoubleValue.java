package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class DoubleValue extends GeneratedMessageLite<DoubleValue, Builder> implements DoubleValueOrBuilder {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static volatile Parser<DoubleValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    /* renamed from: com.google.protobuf.DoubleValue$1 */
    public static /* synthetic */ class C23621 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24108a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24108a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24108a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24108a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24108a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24108a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24108a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24108a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DoubleValue, Builder> implements DoubleValueOrBuilder {
        public Builder() {
            super(DoubleValue.DEFAULT_INSTANCE);
        }

        public Builder(C23621 c23621) {
            super(DoubleValue.DEFAULT_INSTANCE);
        }
    }

    static {
        DoubleValue doubleValue = new DoubleValue();
        DEFAULT_INSTANCE = doubleValue;
        GeneratedMessageLite.m13417F(DoubleValue.class, doubleValue);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case NEW_MUTABLE_INSTANCE:
                return new DoubleValue();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<DoubleValue> parser = PARSER;
                if (parser == null) {
                    synchronized (DoubleValue.class) {
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
