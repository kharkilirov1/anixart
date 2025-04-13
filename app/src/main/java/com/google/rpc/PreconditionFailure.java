package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class PreconditionFailure extends GeneratedMessageLite<PreconditionFailure, Builder> implements PreconditionFailureOrBuilder {
    private static final PreconditionFailure DEFAULT_INSTANCE;
    private static volatile Parser<PreconditionFailure> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Violation> violations_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.rpc.PreconditionFailure$1 */
    public static /* synthetic */ class C24241 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24463a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24463a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24463a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24463a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24463a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24463a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24463a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24463a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<PreconditionFailure, Builder> implements PreconditionFailureOrBuilder {
        public Builder() {
            super(PreconditionFailure.DEFAULT_INSTANCE);
        }

        public Builder(C24241 c24241) {
            super(PreconditionFailure.DEFAULT_INSTANCE);
        }
    }

    public static final class Violation extends GeneratedMessageLite<Violation, Builder> implements ViolationOrBuilder {
        private static final Violation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        private static volatile Parser<Violation> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String type_ = "";
        private String subject_ = "";
        private String description_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<Violation, Builder> implements ViolationOrBuilder {
            public Builder() {
                super(Violation.DEFAULT_INSTANCE);
            }

            public Builder(C24241 c24241) {
                super(Violation.DEFAULT_INSTANCE);
            }
        }

        static {
            Violation violation = new Violation();
            DEFAULT_INSTANCE = violation;
            GeneratedMessageLite.m13417F(Violation.class, violation);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "subject_", "description_"});
                case NEW_MUTABLE_INSTANCE:
                    return new Violation();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Violation> parser = PARSER;
                    if (parser == null) {
                        synchronized (Violation.class) {
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

    public interface ViolationOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        PreconditionFailure preconditionFailure = new PreconditionFailure();
        DEFAULT_INSTANCE = preconditionFailure;
        GeneratedMessageLite.m13417F(PreconditionFailure.class, preconditionFailure);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"violations_", Violation.class});
            case NEW_MUTABLE_INSTANCE:
                return new PreconditionFailure();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<PreconditionFailure> parser = PARSER;
                if (parser == null) {
                    synchronized (PreconditionFailure.class) {
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
