package com.google.rpc;

import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class RetryInfo extends GeneratedMessageLite<RetryInfo, Builder> implements RetryInfoOrBuilder {
    private static final RetryInfo DEFAULT_INSTANCE;
    private static volatile Parser<RetryInfo> PARSER = null;
    public static final int RETRY_DELAY_FIELD_NUMBER = 1;
    private Duration retryDelay_;

    /* renamed from: com.google.rpc.RetryInfo$1 */
    public static /* synthetic */ class C24281 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24467a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24467a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24467a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24467a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24467a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24467a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24467a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24467a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RetryInfo, Builder> implements RetryInfoOrBuilder {
        public Builder() {
            super(RetryInfo.DEFAULT_INSTANCE);
        }

        public Builder(C24281 c24281) {
            super(RetryInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        RetryInfo retryInfo = new RetryInfo();
        DEFAULT_INSTANCE = retryInfo;
        GeneratedMessageLite.m13417F(RetryInfo.class, retryInfo);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"retryDelay_"});
            case NEW_MUTABLE_INSTANCE:
                return new RetryInfo();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<RetryInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (RetryInfo.class) {
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
