package com.google.longrunning;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class DeleteOperationRequest extends GeneratedMessageLite<DeleteOperationRequest, Builder> implements DeleteOperationRequestOrBuilder {
    private static final DeleteOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<DeleteOperationRequest> PARSER;
    private String name_ = "";

    /* renamed from: com.google.longrunning.DeleteOperationRequest$1 */
    public static /* synthetic */ class C23321 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23942a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23942a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23942a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23942a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23942a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23942a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23942a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23942a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DeleteOperationRequest, Builder> implements DeleteOperationRequestOrBuilder {
        public Builder() {
            super(DeleteOperationRequest.DEFAULT_INSTANCE);
        }

        public Builder(C23321 c23321) {
            super(DeleteOperationRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        DeleteOperationRequest deleteOperationRequest = new DeleteOperationRequest();
        DEFAULT_INSTANCE = deleteOperationRequest;
        GeneratedMessageLite.m13417F(DeleteOperationRequest.class, deleteOperationRequest);
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
                return new DeleteOperationRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<DeleteOperationRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (DeleteOperationRequest.class) {
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
