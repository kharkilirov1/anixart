package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class CustomHttpPattern extends GeneratedMessageLite<CustomHttpPattern, Builder> implements CustomHttpPatternOrBuilder {
    private static final CustomHttpPattern DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile Parser<CustomHttpPattern> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    private String kind_ = "";
    private String path_ = "";

    /* renamed from: com.google.api.CustomHttpPattern$1 */
    public static /* synthetic */ class C15031 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20358a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20358a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20358a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20358a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20358a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20358a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20358a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20358a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CustomHttpPattern, Builder> implements CustomHttpPatternOrBuilder {
        public Builder() {
            super(CustomHttpPattern.DEFAULT_INSTANCE);
        }

        public Builder(C15031 c15031) {
            super(CustomHttpPattern.DEFAULT_INSTANCE);
        }
    }

    static {
        CustomHttpPattern customHttpPattern = new CustomHttpPattern();
        DEFAULT_INSTANCE = customHttpPattern;
        GeneratedMessageLite.m13417F(CustomHttpPattern.class, customHttpPattern);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"kind_", "path_"});
            case NEW_MUTABLE_INSTANCE:
                return new CustomHttpPattern();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<CustomHttpPattern> parser = PARSER;
                if (parser == null) {
                    synchronized (CustomHttpPattern.class) {
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
