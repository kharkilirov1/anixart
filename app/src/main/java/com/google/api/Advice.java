package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Advice extends GeneratedMessageLite<Advice, Builder> implements AdviceOrBuilder {
    private static final Advice DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser<Advice> PARSER;
    private String description_ = "";

    /* renamed from: com.google.api.Advice$1 */
    public static /* synthetic */ class C14891 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20332a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20332a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20332a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20332a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20332a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20332a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20332a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20332a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Advice, Builder> implements AdviceOrBuilder {
        public Builder() {
            super(Advice.DEFAULT_INSTANCE);
        }

        public Builder(C14891 c14891) {
            super(Advice.DEFAULT_INSTANCE);
        }
    }

    static {
        Advice advice = new Advice();
        DEFAULT_INSTANCE = advice;
        GeneratedMessageLite.m13417F(Advice.class, advice);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"description_"});
            case NEW_MUTABLE_INSTANCE:
                return new Advice();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Advice> parser = PARSER;
                if (parser == null) {
                    synchronized (Advice.class) {
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
