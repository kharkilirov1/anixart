package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class Enum extends GeneratedMessageLite<Enum, Builder> implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private Internal.ProtobufList<EnumValue> enumvalue_;
    private String name_ = "";
    private Internal.ProtobufList<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    /* renamed from: com.google.protobuf.Enum$1 */
    public static /* synthetic */ class C23651 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24111a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24111a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24111a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24111a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24111a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24111a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24111a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24111a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Enum, Builder> implements EnumOrBuilder {
        public Builder() {
            super(Enum.DEFAULT_INSTANCE);
        }

        public Builder(C23651 c23651) {
            super(Enum.DEFAULT_INSTANCE);
        }
    }

    static {
        Enum r0 = new Enum();
        DEFAULT_INSTANCE = r0;
        GeneratedMessageLite.m13417F(Enum.class, r0);
    }

    public Enum() {
        ProtobufArrayList<Object> protobufArrayList = ProtobufArrayList.f24313e;
        this.enumvalue_ = protobufArrayList;
        this.options_ = protobufArrayList;
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
            case NEW_MUTABLE_INSTANCE:
                return new Enum();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Enum> parser = PARSER;
                if (parser == null) {
                    synchronized (Enum.class) {
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
