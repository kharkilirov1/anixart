package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class Timestamp extends GeneratedMessageLite<Timestamp, Builder> implements TimestampOrBuilder {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser<Timestamp> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: com.google.protobuf.Timestamp$1 */
    public static /* synthetic */ class C24021 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24373a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24373a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24373a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24373a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24373a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24373a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24373a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24373a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Timestamp, Builder> implements TimestampOrBuilder {
        public Builder() {
            super(Timestamp.DEFAULT_INSTANCE);
        }

        public Builder(C24021 c24021) {
            super(Timestamp.DEFAULT_INSTANCE);
        }
    }

    static {
        Timestamp timestamp = new Timestamp();
        DEFAULT_INSTANCE = timestamp;
        GeneratedMessageLite.m13417F(Timestamp.class, timestamp);
    }

    /* renamed from: I */
    public static Timestamp m13641I() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public int m13642J() {
        return this.nanos_;
    }

    /* renamed from: K */
    public long m13643K() {
        return this.seconds_;
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case NEW_MUTABLE_INSTANCE:
                return new Timestamp();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Timestamp> parser = PARSER;
                if (parser == null) {
                    synchronized (Timestamp.class) {
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
