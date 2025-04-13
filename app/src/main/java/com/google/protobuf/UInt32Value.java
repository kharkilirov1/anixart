package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class UInt32Value extends GeneratedMessageLite<UInt32Value, Builder> implements UInt32ValueOrBuilder {
    private static final UInt32Value DEFAULT_INSTANCE;
    private static volatile Parser<UInt32Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* renamed from: com.google.protobuf.UInt32Value$1 */
    public static /* synthetic */ class C24041 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24375a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24375a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24375a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24375a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24375a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24375a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24375a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24375a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<UInt32Value, Builder> implements UInt32ValueOrBuilder {
        public Builder() {
            super(UInt32Value.DEFAULT_INSTANCE);
        }

        public Builder(C24041 c24041) {
            super(UInt32Value.DEFAULT_INSTANCE);
        }
    }

    static {
        UInt32Value uInt32Value = new UInt32Value();
        DEFAULT_INSTANCE = uInt32Value;
        GeneratedMessageLite.m13417F(UInt32Value.class, uInt32Value);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case NEW_MUTABLE_INSTANCE:
                return new UInt32Value();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<UInt32Value> parser = PARSER;
                if (parser == null) {
                    synchronized (UInt32Value.class) {
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
