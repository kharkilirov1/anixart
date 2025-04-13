package com.google.firestore.p012v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class BeginTransactionResponse extends GeneratedMessageLite<BeginTransactionResponse, Builder> implements BeginTransactionResponseOrBuilder {
    private static final BeginTransactionResponse DEFAULT_INSTANCE;
    private static volatile Parser<BeginTransactionResponse> PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 1;
    private ByteString transaction_ = ByteString.f23981c;

    /* renamed from: com.google.firestore.v1.BeginTransactionResponse$1 */
    public static /* synthetic */ class C21881 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23507a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23507a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23507a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23507a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23507a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23507a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23507a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23507a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BeginTransactionResponse, Builder> implements BeginTransactionResponseOrBuilder {
        public Builder() {
            super(BeginTransactionResponse.DEFAULT_INSTANCE);
        }

        public Builder(C21881 c21881) {
            super(BeginTransactionResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        BeginTransactionResponse beginTransactionResponse = new BeginTransactionResponse();
        DEFAULT_INSTANCE = beginTransactionResponse;
        GeneratedMessageLite.m13417F(BeginTransactionResponse.class, beginTransactionResponse);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"transaction_"});
            case NEW_MUTABLE_INSTANCE:
                return new BeginTransactionResponse();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BeginTransactionResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (BeginTransactionResponse.class) {
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
