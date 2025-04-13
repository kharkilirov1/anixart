package com.google.type;

import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class Color extends GeneratedMessageLite<Color, Builder> implements ColorOrBuilder {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final Color DEFAULT_INSTANCE;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile Parser<Color> PARSER = null;
    public static final int RED_FIELD_NUMBER = 1;
    private FloatValue alpha_;
    private float blue_;
    private float green_;
    private float red_;

    /* renamed from: com.google.type.Color$1 */
    public static /* synthetic */ class C24321 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24491a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24491a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24491a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24491a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24491a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24491a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24491a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24491a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Color, Builder> implements ColorOrBuilder {
        public Builder() {
            super(Color.DEFAULT_INSTANCE);
        }

        public Builder(C24321 c24321) {
            super(Color.DEFAULT_INSTANCE);
        }
    }

    static {
        Color color = new Color();
        DEFAULT_INSTANCE = color;
        GeneratedMessageLite.m13417F(Color.class, color);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\t", new Object[]{"red_", "green_", "blue_", "alpha_"});
            case NEW_MUTABLE_INSTANCE:
                return new Color();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Color> parser = PARSER;
                if (parser == null) {
                    synchronized (Color.class) {
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
