package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class SourceContext extends GeneratedMessageLite<SourceContext, Builder> implements SourceContextOrBuilder {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<SourceContext> PARSER;
    private String fileName_ = "";

    /* renamed from: com.google.protobuf.SourceContext$1 */
    public static /* synthetic */ class C23961 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24363a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24363a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24363a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24363a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24363a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24363a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24363a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24363a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<SourceContext, Builder> implements SourceContextOrBuilder {
        public Builder() {
            super(SourceContext.DEFAULT_INSTANCE);
        }

        public Builder(C23961 c23961) {
            super(SourceContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SourceContext sourceContext = new SourceContext();
        DEFAULT_INSTANCE = sourceContext;
        GeneratedMessageLite.m13417F(SourceContext.class, sourceContext);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case NEW_MUTABLE_INSTANCE:
                return new SourceContext();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<SourceContext> parser = PARSER;
                if (parser == null) {
                    synchronized (SourceContext.class) {
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
