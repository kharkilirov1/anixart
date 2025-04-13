package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class RequestInfo extends GeneratedMessageLite<RequestInfo, Builder> implements RequestInfoOrBuilder {
    private static final RequestInfo DEFAULT_INSTANCE;
    private static volatile Parser<RequestInfo> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SERVING_DATA_FIELD_NUMBER = 2;
    private String requestId_ = "";
    private String servingData_ = "";

    /* renamed from: com.google.rpc.RequestInfo$1 */
    public static /* synthetic */ class C24261 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24465a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24465a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24465a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24465a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24465a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24465a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24465a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24465a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RequestInfo, Builder> implements RequestInfoOrBuilder {
        public Builder() {
            super(RequestInfo.DEFAULT_INSTANCE);
        }

        public Builder(C24261 c24261) {
            super(RequestInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        RequestInfo requestInfo = new RequestInfo();
        DEFAULT_INSTANCE = requestInfo;
        GeneratedMessageLite.m13417F(RequestInfo.class, requestInfo);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"requestId_", "servingData_"});
            case NEW_MUTABLE_INSTANCE:
                return new RequestInfo();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<RequestInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (RequestInfo.class) {
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
