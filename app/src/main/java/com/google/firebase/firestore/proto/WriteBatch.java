package com.google.firebase.firestore.proto;

import com.google.firestore.p012v1.Write;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class WriteBatch extends GeneratedMessageLite<WriteBatch, Builder> implements WriteBatchOrBuilder {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final WriteBatch DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile Parser<WriteBatch> PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private Timestamp localWriteTime_;
    private Internal.ProtobufList<Write> writes_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<Write> baseWrites_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.firebase.firestore.proto.WriteBatch$1 */
    public static /* synthetic */ class C21141 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22922a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22922a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22922a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22922a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22922a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22922a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22922a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22922a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WriteBatch, Builder> implements WriteBatchOrBuilder {
        public Builder() {
            super(WriteBatch.DEFAULT_INSTANCE);
        }

        public Builder(C21141 c21141) {
            super(WriteBatch.DEFAULT_INSTANCE);
        }
    }

    static {
        WriteBatch writeBatch = new WriteBatch();
        DEFAULT_INSTANCE = writeBatch;
        GeneratedMessageLite.m13417F(WriteBatch.class, writeBatch);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\t\u0004\u001b", new Object[]{"batchId_", "writes_", Write.class, "localWriteTime_", "baseWrites_", Write.class});
            case NEW_MUTABLE_INSTANCE:
                return new WriteBatch();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<WriteBatch> parser = PARSER;
                if (parser == null) {
                    synchronized (WriteBatch.class) {
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
