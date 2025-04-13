package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class BeginTransactionRequest extends GeneratedMessageLite<BeginTransactionRequest, Builder> implements BeginTransactionRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final BeginTransactionRequest DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile Parser<BeginTransactionRequest> PARSER;
    private String database_ = "";
    private TransactionOptions options_;

    /* renamed from: com.google.firestore.v1.BeginTransactionRequest$1 */
    public static /* synthetic */ class C21871 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23506a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23506a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23506a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23506a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23506a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23506a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23506a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23506a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BeginTransactionRequest, Builder> implements BeginTransactionRequestOrBuilder {
        public Builder() {
            super(BeginTransactionRequest.DEFAULT_INSTANCE);
        }

        public Builder(C21871 c21871) {
            super(BeginTransactionRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        BeginTransactionRequest beginTransactionRequest = new BeginTransactionRequest();
        DEFAULT_INSTANCE = beginTransactionRequest;
        GeneratedMessageLite.m13417F(BeginTransactionRequest.class, beginTransactionRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"database_", "options_"});
            case NEW_MUTABLE_INSTANCE:
                return new BeginTransactionRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BeginTransactionRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (BeginTransactionRequest.class) {
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
