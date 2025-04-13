package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class Duration extends GeneratedMessageLite<Duration, Builder> implements DurationOrBuilder {
    private static final Duration DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser<Duration> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: com.google.protobuf.Duration$1 */
    public static /* synthetic */ class C23631 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24109a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24109a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24109a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24109a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24109a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24109a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24109a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24109a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Duration, Builder> implements DurationOrBuilder {
        public Builder() {
            super(Duration.DEFAULT_INSTANCE);
        }

        public Builder(C23631 c23631) {
            super(Duration.DEFAULT_INSTANCE);
        }
    }

    static {
        Duration duration = new Duration();
        DEFAULT_INSTANCE = duration;
        GeneratedMessageLite.m13417F(Duration.class, duration);
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
                return new Duration();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Duration> parser = PARSER;
                if (parser == null) {
                    synchronized (Duration.class) {
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
