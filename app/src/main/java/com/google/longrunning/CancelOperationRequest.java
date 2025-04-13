package com.google.longrunning;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class CancelOperationRequest extends GeneratedMessageLite<CancelOperationRequest, Builder> implements CancelOperationRequestOrBuilder {
    private static final CancelOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<CancelOperationRequest> PARSER;
    private String name_ = "";

    /* renamed from: com.google.longrunning.CancelOperationRequest$1 */
    public static /* synthetic */ class C23311 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23941a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23941a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23941a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23941a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23941a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23941a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23941a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23941a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CancelOperationRequest, Builder> implements CancelOperationRequestOrBuilder {
        public Builder() {
            super(CancelOperationRequest.DEFAULT_INSTANCE);
        }

        public Builder(C23311 c23311) {
            super(CancelOperationRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        CancelOperationRequest cancelOperationRequest = new CancelOperationRequest();
        DEFAULT_INSTANCE = cancelOperationRequest;
        GeneratedMessageLite.m13417F(CancelOperationRequest.class, cancelOperationRequest);
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
                return new CancelOperationRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<CancelOperationRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (CancelOperationRequest.class) {
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
