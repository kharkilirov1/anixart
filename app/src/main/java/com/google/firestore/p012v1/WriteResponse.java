package com.google.firestore.p012v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class WriteResponse extends GeneratedMessageLite<WriteResponse, Builder> implements WriteResponseOrBuilder {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final WriteResponse DEFAULT_INSTANCE;
    private static volatile Parser<WriteResponse> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private Timestamp commitTime_;
    private String streamId_ = "";
    private ByteString streamToken_ = ByteString.f23981c;
    private Internal.ProtobufList<WriteResult> writeResults_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.firestore.v1.WriteResponse$1 */
    public static /* synthetic */ class C22301 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23644a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23644a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23644a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23644a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23644a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23644a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23644a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23644a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WriteResponse, Builder> implements WriteResponseOrBuilder {
        public Builder() {
            super(WriteResponse.DEFAULT_INSTANCE);
        }

        public Builder(C22301 c22301) {
            super(WriteResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        WriteResponse writeResponse = new WriteResponse();
        DEFAULT_INSTANCE = writeResponse;
        GeneratedMessageLite.m13417F(WriteResponse.class, writeResponse);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004\t", new Object[]{"streamId_", "streamToken_", "writeResults_", WriteResult.class, "commitTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new WriteResponse();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<WriteResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (WriteResponse.class) {
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
