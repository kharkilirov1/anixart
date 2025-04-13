package com.google.firestore.p012v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.rpc.Status;

/* loaded from: classes2.dex */
public final class TargetChange extends GeneratedMessageLite<TargetChange, Builder> implements TargetChangeOrBuilder {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final TargetChange DEFAULT_INSTANCE;
    private static volatile Parser<TargetChange> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private Status cause_;
    private Timestamp readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private Internal.IntList targetIds_ = GeneratedMessageLite.m13420r();
    private ByteString resumeToken_ = ByteString.f23981c;

    /* renamed from: com.google.firestore.v1.TargetChange$1 */
    public static /* synthetic */ class C22231 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23608a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23608a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23608a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23608a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23608a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23608a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23608a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23608a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TargetChange, Builder> implements TargetChangeOrBuilder {
        public Builder() {
            super(TargetChange.DEFAULT_INSTANCE);
        }

        public Builder(C22231 c22231) {
            super(TargetChange.DEFAULT_INSTANCE);
        }
    }

    public enum TargetChangeType implements Internal.EnumLite {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f23616b;

        /* renamed from: com.google.firestore.v1.TargetChange$TargetChangeType$1 */
        public class C22241 implements Internal.EnumLiteMap<TargetChangeType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public TargetChangeType mo11029a(int i2) {
                return TargetChangeType.m12793a(i2);
            }
        }

        public static final class TargetChangeTypeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return TargetChangeType.m12793a(i2) != null;
            }
        }

        TargetChangeType(int i2) {
            this.f23616b = i2;
        }

        /* renamed from: a */
        public static TargetChangeType m12793a(int i2) {
            if (i2 == 0) {
                return NO_CHANGE;
            }
            if (i2 == 1) {
                return ADD;
            }
            if (i2 == 2) {
                return REMOVE;
            }
            if (i2 == 3) {
                return CURRENT;
            }
            if (i2 != 4) {
                return null;
            }
            return RESET;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f23616b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        TargetChange targetChange = new TargetChange();
        DEFAULT_INSTANCE = targetChange;
        GeneratedMessageLite.m13417F(TargetChange.class, targetChange);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003\t\u0004\n\u0006\t", new Object[]{"targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new TargetChange();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<TargetChange> parser = PARSER;
                if (parser == null) {
                    synchronized (TargetChange.class) {
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
