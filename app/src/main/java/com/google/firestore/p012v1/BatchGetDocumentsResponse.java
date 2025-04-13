package com.google.firestore.p012v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class BatchGetDocumentsResponse extends GeneratedMessageLite<BatchGetDocumentsResponse, Builder> implements BatchGetDocumentsResponseOrBuilder {
    private static final BatchGetDocumentsResponse DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile Parser<BatchGetDocumentsResponse> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private Timestamp readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private ByteString transaction_ = ByteString.f23981c;

    /* renamed from: com.google.firestore.v1.BatchGetDocumentsResponse$1 */
    public static /* synthetic */ class C21861 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23501a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23501a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23501a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23501a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23501a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23501a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23501a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23501a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BatchGetDocumentsResponse, Builder> implements BatchGetDocumentsResponseOrBuilder {
        public Builder() {
            super(BatchGetDocumentsResponse.DEFAULT_INSTANCE);
        }

        public Builder(C21861 c21861) {
            super(BatchGetDocumentsResponse.DEFAULT_INSTANCE);
        }
    }

    public enum ResultCase {
        FOUND(1),
        MISSING(2),
        RESULT_NOT_SET(0);

        ResultCase(int i2) {
        }
    }

    static {
        BatchGetDocumentsResponse batchGetDocumentsResponse = new BatchGetDocumentsResponse();
        DEFAULT_INSTANCE = batchGetDocumentsResponse;
        GeneratedMessageLite.m13417F(BatchGetDocumentsResponse.class, batchGetDocumentsResponse);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004\t", new Object[]{"result_", "resultCase_", Document.class, "transaction_", "readTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new BatchGetDocumentsResponse();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BatchGetDocumentsResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (BatchGetDocumentsResponse.class) {
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
