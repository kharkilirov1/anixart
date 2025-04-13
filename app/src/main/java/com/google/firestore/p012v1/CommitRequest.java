package com.google.firestore.p012v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class CommitRequest extends GeneratedMessageLite<CommitRequest, Builder> implements CommitRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final CommitRequest DEFAULT_INSTANCE;
    private static volatile Parser<CommitRequest> PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private Internal.ProtobufList<Write> writes_ = GeneratedMessageLite.m13422t();
    private ByteString transaction_ = ByteString.f23981c;

    /* renamed from: com.google.firestore.v1.CommitRequest$1 */
    public static /* synthetic */ class C21891 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23508a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23508a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23508a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23508a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23508a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23508a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23508a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23508a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CommitRequest, Builder> implements CommitRequestOrBuilder {
        public Builder() {
            super(CommitRequest.DEFAULT_INSTANCE);
        }

        public Builder(C21891 c21891) {
            super(CommitRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        CommitRequest commitRequest = new CommitRequest();
        DEFAULT_INSTANCE = commitRequest;
        GeneratedMessageLite.m13417F(CommitRequest.class, commitRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", Write.class, "transaction_"});
            case NEW_MUTABLE_INSTANCE:
                return new CommitRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<CommitRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (CommitRequest.class) {
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
