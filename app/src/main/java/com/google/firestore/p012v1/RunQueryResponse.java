package com.google.firestore.p012v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class RunQueryResponse extends GeneratedMessageLite<RunQueryResponse, Builder> implements RunQueryResponseOrBuilder {
    private static final RunQueryResponse DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<RunQueryResponse> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int SKIPPED_RESULTS_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private Document document_;
    private Timestamp readTime_;
    private int skippedResults_;
    private ByteString transaction_ = ByteString.f23981c;

    /* renamed from: com.google.firestore.v1.RunQueryResponse$1 */
    public static /* synthetic */ class C22161 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23563a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23563a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23563a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23563a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23563a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23563a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23563a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23563a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RunQueryResponse, Builder> implements RunQueryResponseOrBuilder {
        public Builder() {
            super(RunQueryResponse.DEFAULT_INSTANCE);
        }

        public Builder(C22161 c22161) {
            super(RunQueryResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        RunQueryResponse runQueryResponse = new RunQueryResponse();
        DEFAULT_INSTANCE = runQueryResponse;
        GeneratedMessageLite.m13417F(RunQueryResponse.class, runQueryResponse);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\n\u0003\t\u0004\u0004", new Object[]{"document_", "transaction_", "readTime_", "skippedResults_"});
            case NEW_MUTABLE_INSTANCE:
                return new RunQueryResponse();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<RunQueryResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (RunQueryResponse.class) {
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
