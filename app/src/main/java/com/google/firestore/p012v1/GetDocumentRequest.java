package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class GetDocumentRequest extends GeneratedMessageLite<GetDocumentRequest, Builder> implements GetDocumentRequestOrBuilder {
    private static final GetDocumentRequest DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<GetDocumentRequest> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 5;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private Object consistencySelector_;
    private DocumentMask mask_;
    private int consistencySelectorCase_ = 0;
    private String name_ = "";

    /* renamed from: com.google.firestore.v1.GetDocumentRequest$1 */
    public static /* synthetic */ class C22051 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23534a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23534a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23534a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23534a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23534a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23534a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23534a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23534a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<GetDocumentRequest, Builder> implements GetDocumentRequestOrBuilder {
        public Builder() {
            super(GetDocumentRequest.DEFAULT_INSTANCE);
        }

        public Builder(C22051 c22051) {
            super(GetDocumentRequest.DEFAULT_INSTANCE);
        }
    }

    public enum ConsistencySelectorCase {
        /* JADX INFO: Fake field, exist only in values array */
        TRANSACTION(3),
        /* JADX INFO: Fake field, exist only in values array */
        READ_TIME(5),
        /* JADX INFO: Fake field, exist only in values array */
        CONSISTENCYSELECTOR_NOT_SET(0);

        ConsistencySelectorCase(int i2) {
        }
    }

    static {
        GetDocumentRequest getDocumentRequest = new GetDocumentRequest();
        DEFAULT_INSTANCE = getDocumentRequest;
        GeneratedMessageLite.m13417F(GetDocumentRequest.class, getDocumentRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003=\u0000\u0005<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "name_", "mask_", Timestamp.class});
            case NEW_MUTABLE_INSTANCE:
                return new GetDocumentRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<GetDocumentRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (GetDocumentRequest.class) {
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
