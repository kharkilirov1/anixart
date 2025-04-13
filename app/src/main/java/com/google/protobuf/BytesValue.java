package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class BytesValue extends GeneratedMessageLite<BytesValue, Builder> implements BytesValueOrBuilder {
    private static final BytesValue DEFAULT_INSTANCE;
    private static volatile Parser<BytesValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private ByteString value_ = ByteString.f23981c;

    /* renamed from: com.google.protobuf.BytesValue$1 */
    public static /* synthetic */ class C23501 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23992a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23992a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23992a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23992a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23992a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23992a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23992a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23992a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BytesValue, Builder> implements BytesValueOrBuilder {
        public Builder() {
            super(BytesValue.DEFAULT_INSTANCE);
        }

        public Builder(C23501 c23501) {
            super(BytesValue.DEFAULT_INSTANCE);
        }
    }

    static {
        BytesValue bytesValue = new BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        GeneratedMessageLite.m13417F(BytesValue.class, bytesValue);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case NEW_MUTABLE_INSTANCE:
                return new BytesValue();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BytesValue> parser = PARSER;
                if (parser == null) {
                    synchronized (BytesValue.class) {
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
