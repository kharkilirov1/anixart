package com.google.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class Quaternion extends GeneratedMessageLite<Quaternion, Builder> implements QuaternionOrBuilder {
    private static final Quaternion DEFAULT_INSTANCE;
    private static volatile Parser<Quaternion> PARSER = null;
    public static final int W_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;

    /* renamed from: w_ */
    private double f24511w_;

    /* renamed from: x_ */
    private double f24512x_;

    /* renamed from: y_ */
    private double f24513y_;

    /* renamed from: z_ */
    private double f24514z_;

    /* renamed from: com.google.type.Quaternion$1 */
    public static /* synthetic */ class C24411 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24515a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24515a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24515a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24515a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24515a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24515a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24515a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24515a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Quaternion, Builder> implements QuaternionOrBuilder {
        public Builder() {
            super(Quaternion.DEFAULT_INSTANCE);
        }

        public Builder(C24411 c24411) {
            super(Quaternion.DEFAULT_INSTANCE);
        }
    }

    static {
        Quaternion quaternion = new Quaternion();
        DEFAULT_INSTANCE = quaternion;
        GeneratedMessageLite.m13417F(Quaternion.class, quaternion);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000", new Object[]{"x_", "y_", "z_", "w_"});
            case NEW_MUTABLE_INSTANCE:
                return new Quaternion();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Quaternion> parser = PARSER;
                if (parser == null) {
                    synchronized (Quaternion.class) {
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
