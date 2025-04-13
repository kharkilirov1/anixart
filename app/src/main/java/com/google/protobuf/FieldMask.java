package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class FieldMask extends GeneratedMessageLite<FieldMask, Builder> implements FieldMaskOrBuilder {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile Parser<FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> paths_ = ProtobufArrayList.f24313e;

    /* renamed from: com.google.protobuf.FieldMask$1 */
    public static /* synthetic */ class C23721 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24153a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24153a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24153a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24153a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24153a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24153a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24153a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24153a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<FieldMask, Builder> implements FieldMaskOrBuilder {
        public Builder() {
            super(FieldMask.DEFAULT_INSTANCE);
        }

        public Builder(C23721 c23721) {
            super(FieldMask.DEFAULT_INSTANCE);
        }
    }

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        GeneratedMessageLite.m13417F(FieldMask.class, fieldMask);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case NEW_MUTABLE_INSTANCE:
                return new FieldMask();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<FieldMask> parser = PARSER;
                if (parser == null) {
                    synchronized (FieldMask.class) {
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
