package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Context extends GeneratedMessageLite<Context, Builder> implements ContextOrBuilder {
    private static final Context DEFAULT_INSTANCE;
    private static volatile Parser<Context> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<ContextRule> rules_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.Context$1 */
    public static /* synthetic */ class C15001 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20355a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20355a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20355a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20355a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20355a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20355a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20355a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20355a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Context, Builder> implements ContextOrBuilder {
        public Builder() {
            super(Context.DEFAULT_INSTANCE);
        }

        public Builder(C15001 c15001) {
            super(Context.DEFAULT_INSTANCE);
        }
    }

    static {
        Context context = new Context();
        DEFAULT_INSTANCE = context;
        GeneratedMessageLite.m13417F(Context.class, context);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", ContextRule.class});
            case NEW_MUTABLE_INSTANCE:
                return new Context();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Context> parser = PARSER;
                if (parser == null) {
                    synchronized (Context.class) {
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
