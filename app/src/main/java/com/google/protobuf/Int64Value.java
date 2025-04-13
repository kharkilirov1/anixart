package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class Int64Value extends GeneratedMessageLite<Int64Value, Builder> implements Int64ValueOrBuilder {
    private static final Int64Value DEFAULT_INSTANCE;
    private static volatile Parser<Int64Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* renamed from: com.google.protobuf.Int64Value$1 */
    public static /* synthetic */ class C23781 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24206a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24206a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24206a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24206a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24206a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24206a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24206a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24206a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Int64Value, Builder> implements Int64ValueOrBuilder {
        public Builder() {
            super(Int64Value.DEFAULT_INSTANCE);
        }

        public Builder(C23781 c23781) {
            super(Int64Value.DEFAULT_INSTANCE);
        }
    }

    static {
        Int64Value int64Value = new Int64Value();
        DEFAULT_INSTANCE = int64Value;
        GeneratedMessageLite.m13417F(Int64Value.class, int64Value);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case NEW_MUTABLE_INSTANCE:
                return new Int64Value();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Int64Value> parser = PARSER;
                if (parser == null) {
                    synchronized (Int64Value.class) {
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
