package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class Any extends GeneratedMessageLite<Any, Builder> implements AnyOrBuilder {
    private static final Any DEFAULT_INSTANCE;
    private static volatile Parser<Any> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.f23981c;

    /* renamed from: com.google.protobuf.Any$1 */
    public static /* synthetic */ class C23411 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23958a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23958a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23958a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23958a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23958a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23958a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23958a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23958a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Any, Builder> implements AnyOrBuilder {
        public Builder() {
            super(Any.DEFAULT_INSTANCE);
        }

        public Builder(C23411 c23411) {
            super(Any.DEFAULT_INSTANCE);
        }
    }

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        GeneratedMessageLite.m13417F(Any.class, any);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case NEW_MUTABLE_INSTANCE:
                return new Any();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Any> parser = PARSER;
                if (parser == null) {
                    synchronized (Any.class) {
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
