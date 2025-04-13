package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class Empty extends GeneratedMessageLite<Empty, Builder> implements EmptyOrBuilder {
    private static final Empty DEFAULT_INSTANCE;
    private static volatile Parser<Empty> PARSER;

    /* renamed from: com.google.protobuf.Empty$1 */
    public static /* synthetic */ class C23641 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24110a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24110a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24110a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24110a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24110a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24110a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24110a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24110a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Empty, Builder> implements EmptyOrBuilder {
        public Builder() {
            super(Empty.DEFAULT_INSTANCE);
        }

        public Builder(C23641 c23641) {
            super(Empty.DEFAULT_INSTANCE);
        }
    }

    static {
        Empty empty = new Empty();
        DEFAULT_INSTANCE = empty;
        GeneratedMessageLite.m13417F(Empty.class, empty);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new Empty();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Empty> parser = PARSER;
                if (parser == null) {
                    synchronized (Empty.class) {
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
