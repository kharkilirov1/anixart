package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class CommitResponse extends GeneratedMessageLite<CommitResponse, Builder> implements CommitResponseOrBuilder {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final CommitResponse DEFAULT_INSTANCE;
    private static volatile Parser<CommitResponse> PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private Timestamp commitTime_;
    private Internal.ProtobufList<WriteResult> writeResults_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.firestore.v1.CommitResponse$1 */
    public static /* synthetic */ class C21901 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23509a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23509a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23509a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23509a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23509a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23509a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23509a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23509a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CommitResponse, Builder> implements CommitResponseOrBuilder {
        public Builder() {
            super(CommitResponse.DEFAULT_INSTANCE);
        }

        public Builder(C21901 c21901) {
            super(CommitResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        CommitResponse commitResponse = new CommitResponse();
        DEFAULT_INSTANCE = commitResponse;
        GeneratedMessageLite.m13417F(CommitResponse.class, commitResponse);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"writeResults_", WriteResult.class, "commitTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new CommitResponse();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<CommitResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (CommitResponse.class) {
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
