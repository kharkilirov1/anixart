package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class FloatValue extends GeneratedMessageLite<FloatValue, Builder> implements FloatValueOrBuilder {
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile Parser<FloatValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    /* renamed from: com.google.protobuf.FloatValue$1 */
    public static /* synthetic */ class C23751 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24181a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24181a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24181a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24181a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24181a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24181a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24181a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24181a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<FloatValue, Builder> implements FloatValueOrBuilder {
        public Builder() {
            super(FloatValue.DEFAULT_INSTANCE);
        }

        public Builder(C23751 c23751) {
            super(FloatValue.DEFAULT_INSTANCE);
        }
    }

    static {
        FloatValue floatValue = new FloatValue();
        DEFAULT_INSTANCE = floatValue;
        GeneratedMessageLite.m13417F(FloatValue.class, floatValue);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case NEW_MUTABLE_INSTANCE:
                return new FloatValue();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<FloatValue> parser = PARSER;
                if (parser == null) {
                    synchronized (FloatValue.class) {
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
