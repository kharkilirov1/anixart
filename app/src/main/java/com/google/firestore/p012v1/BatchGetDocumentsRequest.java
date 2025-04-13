package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class BatchGetDocumentsRequest extends GeneratedMessageLite<BatchGetDocumentsRequest, Builder> implements BatchGetDocumentsRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final BatchGetDocumentsRequest DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile Parser<BatchGetDocumentsRequest> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private Object consistencySelector_;
    private DocumentMask mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";
    private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.firestore.v1.BatchGetDocumentsRequest$1 */
    public static /* synthetic */ class C21851 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23499a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23499a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23499a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23499a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23499a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23499a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23499a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23499a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BatchGetDocumentsRequest, Builder> implements BatchGetDocumentsRequestOrBuilder {
        public Builder() {
            super(BatchGetDocumentsRequest.DEFAULT_INSTANCE);
        }

        public Builder(C21851 c21851) {
            super(BatchGetDocumentsRequest.DEFAULT_INSTANCE);
        }
    }

    public enum ConsistencySelectorCase {
        /* JADX INFO: Fake field, exist only in values array */
        TRANSACTION(4),
        /* JADX INFO: Fake field, exist only in values array */
        NEW_TRANSACTION(5),
        /* JADX INFO: Fake field, exist only in values array */
        READ_TIME(7),
        /* JADX INFO: Fake field, exist only in values array */
        CONSISTENCYSELECTOR_NOT_SET(0);

        ConsistencySelectorCase(int i2) {
        }
    }

    static {
        BatchGetDocumentsRequest batchGetDocumentsRequest = new BatchGetDocumentsRequest();
        DEFAULT_INSTANCE = batchGetDocumentsRequest;
        GeneratedMessageLite.m13417F(BatchGetDocumentsRequest.class, batchGetDocumentsRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\t\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "database_", "documents_", "mask_", TransactionOptions.class, Timestamp.class});
            case NEW_MUTABLE_INSTANCE:
                return new BatchGetDocumentsRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BatchGetDocumentsRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (BatchGetDocumentsRequest.class) {
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
