package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class ArrayValue extends GeneratedMessageLite<ArrayValue, Builder> implements ArrayValueOrBuilder {
    private static final ArrayValue DEFAULT_INSTANCE;
    private static volatile Parser<ArrayValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.firestore.v1.ArrayValue$1 */
    public static /* synthetic */ class C21841 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23498a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23498a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23498a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23498a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23498a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23498a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23498a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23498a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ArrayValue, Builder> implements ArrayValueOrBuilder {
        public Builder() {
            super(ArrayValue.DEFAULT_INSTANCE);
        }

        public Builder(C21841 c21841) {
            super(ArrayValue.DEFAULT_INSTANCE);
        }
    }

    static {
        ArrayValue arrayValue = new ArrayValue();
        DEFAULT_INSTANCE = arrayValue;
        GeneratedMessageLite.m13417F(ArrayValue.class, arrayValue);
    }

    /* renamed from: I */
    public static ArrayValue m12735I() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public Value m12736J(int i2) {
        return this.values_.get(i2);
    }

    /* renamed from: K */
    public int m12737K() {
        return this.values_.size();
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case NEW_MUTABLE_INSTANCE:
                return new ArrayValue();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ArrayValue> parser = PARSER;
                if (parser == null) {
                    synchronized (ArrayValue.class) {
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
