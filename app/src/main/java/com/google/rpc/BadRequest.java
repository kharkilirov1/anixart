package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class BadRequest extends GeneratedMessageLite<BadRequest, Builder> implements BadRequestOrBuilder {
    private static final BadRequest DEFAULT_INSTANCE;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile Parser<BadRequest> PARSER;
    private Internal.ProtobufList<FieldViolation> fieldViolations_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.rpc.BadRequest$1 */
    public static /* synthetic */ class C24181 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24437a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24437a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24437a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24437a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24437a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24437a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24437a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24437a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BadRequest, Builder> implements BadRequestOrBuilder {
        public Builder() {
            super(BadRequest.DEFAULT_INSTANCE);
        }

        public Builder(C24181 c24181) {
            super(BadRequest.DEFAULT_INSTANCE);
        }
    }

    public static final class FieldViolation extends GeneratedMessageLite<FieldViolation, Builder> implements FieldViolationOrBuilder {
        private static final FieldViolation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile Parser<FieldViolation> PARSER;
        private String field_ = "";
        private String description_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<FieldViolation, Builder> implements FieldViolationOrBuilder {
            public Builder() {
                super(FieldViolation.DEFAULT_INSTANCE);
            }

            public Builder(C24181 c24181) {
                super(FieldViolation.DEFAULT_INSTANCE);
            }
        }

        static {
            FieldViolation fieldViolation = new FieldViolation();
            DEFAULT_INSTANCE = fieldViolation;
            GeneratedMessageLite.m13417F(FieldViolation.class, fieldViolation);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"field_", "description_"});
                case NEW_MUTABLE_INSTANCE:
                    return new FieldViolation();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FieldViolation> parser = PARSER;
                    if (parser == null) {
                        synchronized (FieldViolation.class) {
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

    public interface FieldViolationOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        BadRequest badRequest = new BadRequest();
        DEFAULT_INSTANCE = badRequest;
        GeneratedMessageLite.m13417F(BadRequest.class, badRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fieldViolations_", FieldViolation.class});
            case NEW_MUTABLE_INSTANCE:
                return new BadRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BadRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (BadRequest.class) {
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
