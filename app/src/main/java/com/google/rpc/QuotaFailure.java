package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class QuotaFailure extends GeneratedMessageLite<QuotaFailure, Builder> implements QuotaFailureOrBuilder {
    private static final QuotaFailure DEFAULT_INSTANCE;
    private static volatile Parser<QuotaFailure> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Violation> violations_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.rpc.QuotaFailure$1 */
    public static /* synthetic */ class C24251 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24464a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24464a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24464a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24464a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24464a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24464a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24464a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24464a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<QuotaFailure, Builder> implements QuotaFailureOrBuilder {
        public Builder() {
            super(QuotaFailure.DEFAULT_INSTANCE);
        }

        public Builder(C24251 c24251) {
            super(QuotaFailure.DEFAULT_INSTANCE);
        }
    }

    public static final class Violation extends GeneratedMessageLite<Violation, Builder> implements ViolationOrBuilder {
        private static final Violation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static volatile Parser<Violation> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 1;
        private String subject_ = "";
        private String description_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<Violation, Builder> implements ViolationOrBuilder {
            public Builder() {
                super(Violation.DEFAULT_INSTANCE);
            }

            public Builder(C24251 c24251) {
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"subject_", "description_"});
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
        QuotaFailure quotaFailure = new QuotaFailure();
        DEFAULT_INSTANCE = quotaFailure;
        GeneratedMessageLite.m13417F(QuotaFailure.class, quotaFailure);
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
                return new QuotaFailure();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<QuotaFailure> parser = PARSER;
                if (parser == null) {
                    synchronized (QuotaFailure.class) {
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
