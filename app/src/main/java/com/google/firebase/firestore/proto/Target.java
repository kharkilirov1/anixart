package com.google.firebase.firestore.proto;

import com.google.firestore.p012v1.Target;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class Target extends GeneratedMessageLite<Target, Builder> implements TargetOrBuilder {
    private static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile Parser<Target> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private Timestamp lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private Timestamp snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private ByteString resumeToken_ = ByteString.f23981c;

    /* renamed from: com.google.firebase.firestore.proto.Target$1 */
    public static /* synthetic */ class C21111 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22915a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22915a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22915a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22915a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22915a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22915a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22915a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22915a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Target, Builder> implements TargetOrBuilder {
        public Builder() {
            super(Target.DEFAULT_INSTANCE);
        }

        public Builder(C21111 c21111) {
            super(Target.DEFAULT_INSTANCE);
        }
    }

    public enum TargetTypeCase {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);

        TargetTypeCase(int i2) {
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        GeneratedMessageLite.m13417F(Target.class, target);
    }

    /* renamed from: I */
    public static void m12475I(Target target) {
        target.lastLimboFreeSnapshotVersion_ = null;
    }

    /* renamed from: K */
    public static Target m12476K(byte[] bArr) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.m13414C(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: J */
    public Timestamp m12477J() {
        Timestamp timestamp = this.snapshotVersion_;
        return timestamp == null ? Timestamp.m13641I() : timestamp;
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\t", new Object[]{"targetType_", "targetTypeCase_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", Target.QueryTarget.class, Target.DocumentsTarget.class, "lastLimboFreeSnapshotVersion_"});
            case NEW_MUTABLE_INSTANCE:
                return new Target();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Target> parser = PARSER;
                if (parser == null) {
                    synchronized (Target.class) {
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
