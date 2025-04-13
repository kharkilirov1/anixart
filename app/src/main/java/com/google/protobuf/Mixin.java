package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class Mixin extends GeneratedMessageLite<Mixin, Builder> implements MixinOrBuilder {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Mixin> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* renamed from: com.google.protobuf.Mixin$1 */
    public static /* synthetic */ class C23871 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24298a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24298a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24298a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24298a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24298a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24298a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24298a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24298a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Mixin, Builder> implements MixinOrBuilder {
        public Builder() {
            super(Mixin.DEFAULT_INSTANCE);
        }

        public Builder(C23871 c23871) {
            super(Mixin.DEFAULT_INSTANCE);
        }
    }

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        GeneratedMessageLite.m13417F(Mixin.class, mixin);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case NEW_MUTABLE_INSTANCE:
                return new Mixin();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Mixin> parser = PARSER;
                if (parser == null) {
                    synchronized (Mixin.class) {
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
