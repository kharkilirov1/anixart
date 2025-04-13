package com.google.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class LatLng extends GeneratedMessageLite<LatLng, Builder> implements LatLngOrBuilder {
    private static final LatLng DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile Parser<LatLng> PARSER;
    private double latitude_;
    private double longitude_;

    /* renamed from: com.google.type.LatLng$1 */
    public static /* synthetic */ class C24381 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24508a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24508a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24508a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24508a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24508a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24508a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24508a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24508a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LatLng, Builder> implements LatLngOrBuilder {
        public Builder() {
            super(LatLng.DEFAULT_INSTANCE);
        }

        public Builder(C24381 c24381) {
            super(LatLng.DEFAULT_INSTANCE);
        }
    }

    static {
        LatLng latLng = new LatLng();
        DEFAULT_INSTANCE = latLng;
        GeneratedMessageLite.m13417F(LatLng.class, latLng);
    }

    /* renamed from: I */
    public static LatLng m13788I() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public double m13789J() {
        return this.latitude_;
    }

    /* renamed from: K */
    public double m13790K() {
        return this.longitude_;
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case NEW_MUTABLE_INSTANCE:
                return new LatLng();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<LatLng> parser = PARSER;
                if (parser == null) {
                    synchronized (LatLng.class) {
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
