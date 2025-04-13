package com.google.longrunning;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class GetOperationRequest extends GeneratedMessageLite<GetOperationRequest, Builder> implements GetOperationRequestOrBuilder {
    private static final GetOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<GetOperationRequest> PARSER;
    private String name_ = "";

    /* renamed from: com.google.longrunning.GetOperationRequest$1 */
    public static /* synthetic */ class C23331 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23943a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23943a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23943a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23943a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23943a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23943a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23943a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23943a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<GetOperationRequest, Builder> implements GetOperationRequestOrBuilder {
        public Builder() {
            super(GetOperationRequest.DEFAULT_INSTANCE);
        }

        public Builder(C23331 c23331) {
            super(GetOperationRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        GetOperationRequest getOperationRequest = new GetOperationRequest();
        DEFAULT_INSTANCE = getOperationRequest;
        GeneratedMessageLite.m13417F(GetOperationRequest.class, getOperationRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case NEW_MUTABLE_INSTANCE:
                return new GetOperationRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<GetOperationRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (GetOperationRequest.class) {
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
