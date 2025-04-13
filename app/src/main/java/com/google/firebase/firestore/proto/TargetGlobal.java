package com.google.firebase.firestore.proto;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class TargetGlobal extends GeneratedMessageLite<TargetGlobal, Builder> implements TargetGlobalOrBuilder {
    private static final TargetGlobal DEFAULT_INSTANCE;
    public static final int HIGHEST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 2;
    public static final int HIGHEST_TARGET_ID_FIELD_NUMBER = 1;
    public static final int LAST_REMOTE_SNAPSHOT_VERSION_FIELD_NUMBER = 3;
    private static volatile Parser<TargetGlobal> PARSER = null;
    public static final int TARGET_COUNT_FIELD_NUMBER = 4;
    private long highestListenSequenceNumber_;
    private int highestTargetId_;
    private Timestamp lastRemoteSnapshotVersion_;
    private int targetCount_;

    /* renamed from: com.google.firebase.firestore.proto.TargetGlobal$1 */
    public static /* synthetic */ class C21121 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22920a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22920a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22920a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22920a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22920a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22920a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22920a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22920a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TargetGlobal, Builder> implements TargetGlobalOrBuilder {
        public Builder() {
            super(TargetGlobal.DEFAULT_INSTANCE);
        }

        public Builder(C21121 c21121) {
            super(TargetGlobal.DEFAULT_INSTANCE);
        }
    }

    static {
        TargetGlobal targetGlobal = new TargetGlobal();
        DEFAULT_INSTANCE = targetGlobal;
        GeneratedMessageLite.m13417F(TargetGlobal.class, targetGlobal);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\t\u0004\u0004", new Object[]{"highestTargetId_", "highestListenSequenceNumber_", "lastRemoteSnapshotVersion_", "targetCount_"});
            case NEW_MUTABLE_INSTANCE:
                return new TargetGlobal();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<TargetGlobal> parser = PARSER;
                if (parser == null) {
                    synchronized (TargetGlobal.class) {
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
