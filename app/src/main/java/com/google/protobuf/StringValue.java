package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class StringValue extends GeneratedMessageLite<StringValue, Builder> implements StringValueOrBuilder {
    private static final StringValue DEFAULT_INSTANCE;
    private static volatile Parser<StringValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* renamed from: com.google.protobuf.StringValue$1 */
    public static /* synthetic */ class C23971 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24364a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24364a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24364a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24364a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24364a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24364a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24364a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24364a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<StringValue, Builder> implements StringValueOrBuilder {
        public Builder() {
            super(StringValue.DEFAULT_INSTANCE);
        }

        public Builder(C23971 c23971) {
            super(StringValue.DEFAULT_INSTANCE);
        }
    }

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        GeneratedMessageLite.m13417F(StringValue.class, stringValue);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case NEW_MUTABLE_INSTANCE:
                return new StringValue();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<StringValue> parser = PARSER;
                if (parser == null) {
                    synchronized (StringValue.class) {
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
