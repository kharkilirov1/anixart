package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* renamed from: com.google.protobuf.Value$1 */
    public static /* synthetic */ class C24091 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24398a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24398a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24398a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24398a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24398a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24398a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24398a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24398a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        public Builder() {
            super(Value.DEFAULT_INSTANCE);
        }

        public Builder(C24091 c24091) {
            super(Value.DEFAULT_INSTANCE);
        }
    }

    public enum KindCase {
        /* JADX INFO: Fake field, exist only in values array */
        NULL_VALUE(1),
        /* JADX INFO: Fake field, exist only in values array */
        NUMBER_VALUE(2),
        /* JADX INFO: Fake field, exist only in values array */
        STRING_VALUE(3),
        /* JADX INFO: Fake field, exist only in values array */
        BOOL_VALUE(4),
        /* JADX INFO: Fake field, exist only in values array */
        STRUCT_VALUE(5),
        /* JADX INFO: Fake field, exist only in values array */
        LIST_VALUE(6),
        /* JADX INFO: Fake field, exist only in values array */
        KIND_NOT_SET(0);

        KindCase(int i2) {
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.m13417F(Value.class, value);
    }

    /* renamed from: I */
    public static Value m13754I() {
        return DEFAULT_INSTANCE;
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case NEW_MUTABLE_INSTANCE:
                return new Value();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Value> parser = PARSER;
                if (parser == null) {
                    synchronized (Value.class) {
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
