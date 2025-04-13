package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class RunQueryRequest extends GeneratedMessageLite<RunQueryRequest, Builder> implements RunQueryRequestOrBuilder {
    private static final RunQueryRequest DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 6;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<RunQueryRequest> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 5;
    private Object consistencySelector_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";

    /* renamed from: com.google.firestore.v1.RunQueryRequest$1 */
    public static /* synthetic */ class C22151 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23560a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23560a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23560a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23560a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23560a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23560a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23560a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23560a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RunQueryRequest, Builder> implements RunQueryRequestOrBuilder {
        public Builder() {
            super(RunQueryRequest.DEFAULT_INSTANCE);
        }

        public Builder(C22151 c22151) {
            super(RunQueryRequest.DEFAULT_INSTANCE);
        }
    }

    public enum ConsistencySelectorCase {
        /* JADX INFO: Fake field, exist only in values array */
        TRANSACTION(5),
        /* JADX INFO: Fake field, exist only in values array */
        NEW_TRANSACTION(6),
        /* JADX INFO: Fake field, exist only in values array */
        READ_TIME(7),
        /* JADX INFO: Fake field, exist only in values array */
        CONSISTENCYSELECTOR_NOT_SET(0);

        ConsistencySelectorCase(int i2) {
        }
    }

    public enum QueryTypeCase {
        /* JADX INFO: Fake field, exist only in values array */
        STRUCTURED_QUERY(2),
        /* JADX INFO: Fake field, exist only in values array */
        QUERYTYPE_NOT_SET(0);

        QueryTypeCase(int i2) {
        }
    }

    static {
        RunQueryRequest runQueryRequest = new RunQueryRequest();
        DEFAULT_INSTANCE = runQueryRequest;
        GeneratedMessageLite.m13417F(RunQueryRequest.class, runQueryRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0005=\u0001\u0006<\u0001\u0007<\u0001", new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", StructuredQuery.class, TransactionOptions.class, Timestamp.class});
            case NEW_MUTABLE_INSTANCE:
                return new RunQueryRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<RunQueryRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (RunQueryRequest.class) {
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
