package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Backend extends GeneratedMessageLite<Backend, Builder> implements BackendOrBuilder {
    private static final Backend DEFAULT_INSTANCE;
    private static volatile Parser<Backend> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<BackendRule> rules_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.Backend$1 */
    public static /* synthetic */ class C14941 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20337a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20337a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20337a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20337a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20337a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20337a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20337a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20337a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Backend, Builder> implements BackendOrBuilder {
        public Builder() {
            super(Backend.DEFAULT_INSTANCE);
        }

        public Builder(C14941 c14941) {
            super(Backend.DEFAULT_INSTANCE);
        }
    }

    static {
        Backend backend = new Backend();
        DEFAULT_INSTANCE = backend;
        GeneratedMessageLite.m13417F(Backend.class, backend);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", BackendRule.class});
            case NEW_MUTABLE_INSTANCE:
                return new Backend();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Backend> parser = PARSER;
                if (parser == null) {
                    synchronized (Backend.class) {
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
