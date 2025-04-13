package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class Option extends GeneratedMessageLite<Option, Builder> implements OptionOrBuilder {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private Any value_;

    /* renamed from: com.google.protobuf.Option$1 */
    public static /* synthetic */ class C23911 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24306a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24306a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24306a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24306a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24306a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24306a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24306a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24306a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Option, Builder> implements OptionOrBuilder {
        public Builder() {
            super(Option.DEFAULT_INSTANCE);
        }

        public Builder(C23911 c23911) {
            super(Option.DEFAULT_INSTANCE);
        }
    }

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        GeneratedMessageLite.m13417F(Option.class, option);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case NEW_MUTABLE_INSTANCE:
                return new Option();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Option> parser = PARSER;
                if (parser == null) {
                    synchronized (Option.class) {
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
