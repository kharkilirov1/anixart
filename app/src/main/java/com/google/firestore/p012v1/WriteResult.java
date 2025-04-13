package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class WriteResult extends GeneratedMessageLite<WriteResult, Builder> implements WriteResultOrBuilder {
    private static final WriteResult DEFAULT_INSTANCE;
    private static volatile Parser<WriteResult> PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> transformResults_ = GeneratedMessageLite.m13422t();
    private Timestamp updateTime_;

    /* renamed from: com.google.firestore.v1.WriteResult$1 */
    public static /* synthetic */ class C22311 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23645a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23645a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23645a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23645a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23645a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23645a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23645a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23645a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WriteResult, Builder> implements WriteResultOrBuilder {
        public Builder() {
            super(WriteResult.DEFAULT_INSTANCE);
        }

        public Builder(C22311 c22311) {
            super(WriteResult.DEFAULT_INSTANCE);
        }
    }

    static {
        WriteResult writeResult = new WriteResult();
        DEFAULT_INSTANCE = writeResult;
        GeneratedMessageLite.m13417F(WriteResult.class, writeResult);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"updateTime_", "transformResults_", Value.class});
            case NEW_MUTABLE_INSTANCE:
                return new WriteResult();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<WriteResult> parser = PARSER;
                if (parser == null) {
                    synchronized (WriteResult.class) {
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
