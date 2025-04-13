package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class BoolValue extends GeneratedMessageLite<BoolValue, Builder> implements BoolValueOrBuilder {
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile Parser<BoolValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    /* renamed from: com.google.protobuf.BoolValue$1 */
    public static /* synthetic */ class C23461 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23978a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23978a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23978a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23978a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23978a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23978a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23978a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23978a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BoolValue, Builder> implements BoolValueOrBuilder {
        public Builder() {
            super(BoolValue.DEFAULT_INSTANCE);
        }

        public Builder(C23461 c23461) {
            super(BoolValue.DEFAULT_INSTANCE);
        }
    }

    static {
        BoolValue boolValue = new BoolValue();
        DEFAULT_INSTANCE = boolValue;
        GeneratedMessageLite.m13417F(BoolValue.class, boolValue);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case NEW_MUTABLE_INSTANCE:
                return new BoolValue();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BoolValue> parser = PARSER;
                if (parser == null) {
                    synchronized (BoolValue.class) {
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
