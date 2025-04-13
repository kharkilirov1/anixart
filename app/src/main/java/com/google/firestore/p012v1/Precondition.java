package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class Precondition extends GeneratedMessageLite<Precondition, Builder> implements PreconditionOrBuilder {
    private static final Precondition DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile Parser<Precondition> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    /* renamed from: com.google.firestore.v1.Precondition$1 */
    public static /* synthetic */ class C22131 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23554a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23554a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23554a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23554a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23554a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23554a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23554a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23554a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Precondition, Builder> implements PreconditionOrBuilder {
        public Builder() {
            super(Precondition.DEFAULT_INSTANCE);
        }

        public Builder(C22131 c22131) {
            super(Precondition.DEFAULT_INSTANCE);
        }
    }

    public enum ConditionTypeCase {
        EXISTS(1),
        UPDATE_TIME(2),
        CONDITIONTYPE_NOT_SET(0);

        ConditionTypeCase(int i2) {
        }
    }

    static {
        Precondition precondition = new Precondition();
        DEFAULT_INSTANCE = precondition;
        GeneratedMessageLite.m13417F(Precondition.class, precondition);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", Timestamp.class});
            case NEW_MUTABLE_INSTANCE:
                return new Precondition();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Precondition> parser = PARSER;
                if (parser == null) {
                    synchronized (Precondition.class) {
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
