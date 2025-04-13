package com.google.firestore.p012v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class RollbackRequest extends GeneratedMessageLite<RollbackRequest, Builder> implements RollbackRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final RollbackRequest DEFAULT_INSTANCE;
    private static volatile Parser<RollbackRequest> PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private String database_ = "";
    private ByteString transaction_ = ByteString.f23981c;

    /* renamed from: com.google.firestore.v1.RollbackRequest$1 */
    public static /* synthetic */ class C22141 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23559a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23559a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23559a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23559a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23559a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23559a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23559a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23559a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RollbackRequest, Builder> implements RollbackRequestOrBuilder {
        public Builder() {
            super(RollbackRequest.DEFAULT_INSTANCE);
        }

        public Builder(C22141 c22141) {
            super(RollbackRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        RollbackRequest rollbackRequest = new RollbackRequest();
        DEFAULT_INSTANCE = rollbackRequest;
        GeneratedMessageLite.m13417F(RollbackRequest.class, rollbackRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"database_", "transaction_"});
            case NEW_MUTABLE_INSTANCE:
                return new RollbackRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<RollbackRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (RollbackRequest.class) {
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
