package com.google.geo.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.type.LatLng;

/* loaded from: classes2.dex */
public final class Viewport extends GeneratedMessageLite<Viewport, Builder> implements ViewportOrBuilder {
    private static final Viewport DEFAULT_INSTANCE;
    public static final int HIGH_FIELD_NUMBER = 2;
    public static final int LOW_FIELD_NUMBER = 1;
    private static volatile Parser<Viewport> PARSER;
    private LatLng high_;
    private LatLng low_;

    /* renamed from: com.google.geo.type.Viewport$1 */
    public static /* synthetic */ class C22321 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23646a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23646a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23646a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23646a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23646a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23646a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23646a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23646a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Viewport, Builder> implements ViewportOrBuilder {
        public Builder() {
            super(Viewport.DEFAULT_INSTANCE);
        }

        public Builder(C22321 c22321) {
            super(Viewport.DEFAULT_INSTANCE);
        }
    }

    static {
        Viewport viewport = new Viewport();
        DEFAULT_INSTANCE = viewport;
        GeneratedMessageLite.m13417F(Viewport.class, viewport);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"low_", "high_"});
            case NEW_MUTABLE_INSTANCE:
                return new Viewport();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Viewport> parser = PARSER;
                if (parser == null) {
                    synchronized (Viewport.class) {
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
