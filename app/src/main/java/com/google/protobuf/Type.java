package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class Type extends GeneratedMessageLite<Type, Builder> implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser<Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private Internal.ProtobufList<Field> fields_;
    private String name_ = "";
    private Internal.ProtobufList<String> oneofs_;
    private Internal.ProtobufList<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    /* renamed from: com.google.protobuf.Type$1 */
    public static /* synthetic */ class C24031 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24374a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24374a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24374a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24374a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24374a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24374a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24374a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24374a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Type, Builder> implements TypeOrBuilder {
        public Builder() {
            super(Type.DEFAULT_INSTANCE);
        }

        public Builder(C24031 c24031) {
            super(Type.DEFAULT_INSTANCE);
        }
    }

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        GeneratedMessageLite.m13417F(Type.class, type);
    }

    public Type() {
        ProtobufArrayList<Object> protobufArrayList = ProtobufArrayList.f24313e;
        this.fields_ = protobufArrayList;
        this.oneofs_ = protobufArrayList;
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
            case NEW_MUTABLE_INSTANCE:
                return new Type();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Type> parser = PARSER;
                if (parser == null) {
                    synchronized (Type.class) {
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
