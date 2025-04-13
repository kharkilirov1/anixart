package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class DocumentTransform extends GeneratedMessageLite<DocumentTransform, Builder> implements DocumentTransformOrBuilder {
    private static final DocumentTransform DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile Parser<DocumentTransform> PARSER;
    private String document_ = "";
    private Internal.ProtobufList<FieldTransform> fieldTransforms_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.firestore.v1.DocumentTransform$1 */
    public static /* synthetic */ class C21991 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23519a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23519a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23519a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23519a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23519a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23519a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23519a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23519a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DocumentTransform, Builder> implements DocumentTransformOrBuilder {
        public Builder() {
            super(DocumentTransform.DEFAULT_INSTANCE);
        }

        public Builder(C21991 c21991) {
            super(DocumentTransform.DEFAULT_INSTANCE);
        }
    }

    public static final class FieldTransform extends GeneratedMessageLite<FieldTransform, Builder> implements FieldTransformOrBuilder {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final FieldTransform DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile Parser<FieldTransform> PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<FieldTransform, Builder> implements FieldTransformOrBuilder {
            public Builder() {
                super(FieldTransform.DEFAULT_INSTANCE);
            }

            public Builder(C21991 c21991) {
                super(FieldTransform.DEFAULT_INSTANCE);
            }
        }

        public enum ServerValue implements Internal.EnumLite {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);


            /* renamed from: b */
            public final int f23524b;

            /* renamed from: com.google.firestore.v1.DocumentTransform$FieldTransform$ServerValue$1 */
            public class C22001 implements Internal.EnumLiteMap<ServerValue> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public ServerValue mo11029a(int i2) {
                    return ServerValue.m12754a(i2);
                }
            }

            public static final class ServerValueVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return ServerValue.m12754a(i2) != null;
                }
            }

            ServerValue(int i2) {
                this.f23524b = i2;
            }

            /* renamed from: a */
            public static ServerValue m12754a(int i2) {
                if (i2 == 0) {
                    return SERVER_VALUE_UNSPECIFIED;
                }
                if (i2 != 1) {
                    return null;
                }
                return REQUEST_TIME;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                if (this != UNRECOGNIZED) {
                    return this.f23524b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        public enum TransformTypeCase {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);

            TransformTypeCase(int i2) {
            }
        }

        static {
            FieldTransform fieldTransform = new FieldTransform();
            DEFAULT_INSTANCE = fieldTransform;
            GeneratedMessageLite.m13417F(FieldTransform.class, fieldTransform);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", Value.class, Value.class, Value.class, ArrayValue.class, ArrayValue.class});
                case NEW_MUTABLE_INSTANCE:
                    return new FieldTransform();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FieldTransform> parser = PARSER;
                    if (parser == null) {
                        synchronized (FieldTransform.class) {
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

    public interface FieldTransformOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        DocumentTransform documentTransform = new DocumentTransform();
        DEFAULT_INSTANCE = documentTransform;
        GeneratedMessageLite.m13417F(DocumentTransform.class, documentTransform);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", FieldTransform.class});
            case NEW_MUTABLE_INSTANCE:
                return new DocumentTransform();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<DocumentTransform> parser = PARSER;
                if (parser == null) {
                    synchronized (DocumentTransform.class) {
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
