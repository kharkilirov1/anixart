package com.google.longrunning;

import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class WaitOperationRequest extends GeneratedMessageLite<WaitOperationRequest, Builder> implements WaitOperationRequestOrBuilder {
    private static final WaitOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<WaitOperationRequest> PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 2;
    private String name_ = "";
    private Duration timeout_;

    /* renamed from: com.google.longrunning.WaitOperationRequest$1 */
    public static /* synthetic */ class C23381 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23949a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23949a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23949a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23949a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23949a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23949a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23949a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23949a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WaitOperationRequest, Builder> implements WaitOperationRequestOrBuilder {
        public Builder() {
            super(WaitOperationRequest.DEFAULT_INSTANCE);
        }

        public Builder(C23381 c23381) {
            super(WaitOperationRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        WaitOperationRequest waitOperationRequest = new WaitOperationRequest();
        DEFAULT_INSTANCE = waitOperationRequest;
        GeneratedMessageLite.m13417F(WaitOperationRequest.class, waitOperationRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "timeout_"});
            case NEW_MUTABLE_INSTANCE:
                return new WaitOperationRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<WaitOperationRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (WaitOperationRequest.class) {
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
