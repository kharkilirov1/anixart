package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class EnumValue extends GeneratedMessageLite<EnumValue, Builder> implements EnumValueOrBuilder {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<EnumValue> PARSER;
    private int number_;
    private String name_ = "";
    private Internal.ProtobufList<Option> options_ = ProtobufArrayList.f24313e;

    /* renamed from: com.google.protobuf.EnumValue$1 */
    public static /* synthetic */ class C23661 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24112a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24112a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24112a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24112a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24112a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24112a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24112a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24112a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<EnumValue, Builder> implements EnumValueOrBuilder {
        public Builder() {
            super(EnumValue.DEFAULT_INSTANCE);
        }

        public Builder(C23661 c23661) {
            super(EnumValue.DEFAULT_INSTANCE);
        }
    }

    static {
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        GeneratedMessageLite.m13417F(EnumValue.class, enumValue);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
            case NEW_MUTABLE_INSTANCE:
                return new EnumValue();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<EnumValue> parser = PARSER;
                if (parser == null) {
                    synchronized (EnumValue.class) {
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
