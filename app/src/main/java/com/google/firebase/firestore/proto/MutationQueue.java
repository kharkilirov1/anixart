package com.google.firebase.firestore.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class MutationQueue extends GeneratedMessageLite<MutationQueue, Builder> implements MutationQueueOrBuilder {
    private static final MutationQueue DEFAULT_INSTANCE;
    public static final int LAST_ACKNOWLEDGED_BATCH_ID_FIELD_NUMBER = 1;
    public static final int LAST_STREAM_TOKEN_FIELD_NUMBER = 2;
    private static volatile Parser<MutationQueue> PARSER;
    private int lastAcknowledgedBatchId_;
    private ByteString lastStreamToken_ = ByteString.f23981c;

    /* renamed from: com.google.firebase.firestore.proto.MutationQueue$1 */
    public static /* synthetic */ class C21091 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22913a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22913a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22913a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22913a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22913a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22913a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22913a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22913a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MutationQueue, Builder> implements MutationQueueOrBuilder {
        public Builder() {
            super(MutationQueue.DEFAULT_INSTANCE);
        }

        public Builder(C21091 c21091) {
            super(MutationQueue.DEFAULT_INSTANCE);
        }
    }

    static {
        MutationQueue mutationQueue = new MutationQueue();
        DEFAULT_INSTANCE = mutationQueue;
        GeneratedMessageLite.m13417F(MutationQueue.class, mutationQueue);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"lastAcknowledgedBatchId_", "lastStreamToken_"});
            case NEW_MUTABLE_INSTANCE:
                return new MutationQueue();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<MutationQueue> parser = PARSER;
                if (parser == null) {
                    synchronized (MutationQueue.class) {
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
