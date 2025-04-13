package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class Field extends GeneratedMessageLite<Field, Builder> implements FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile Parser<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private Internal.ProtobufList<Option> options_ = ProtobufArrayList.f24313e;
    private String jsonName_ = "";
    private String defaultValue_ = "";

    /* renamed from: com.google.protobuf.Field$1 */
    public static /* synthetic */ class C23681 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24122a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24122a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24122a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24122a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24122a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24122a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24122a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24122a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Field, Builder> implements FieldOrBuilder {
        public Builder() {
            super(Field.DEFAULT_INSTANCE);
        }

        public Builder(C23681 c23681) {
            super(Field.DEFAULT_INSTANCE);
        }
    }

    public enum Cardinality implements Internal.EnumLite {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f24129b;

        /* renamed from: com.google.protobuf.Field$Cardinality$1 */
        public static class C23691 implements Internal.EnumLiteMap<Cardinality> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public Cardinality mo11029a(int i2) {
                return Cardinality.m13380a(i2);
            }
        }

        public static final class CardinalityVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return Cardinality.m13380a(i2) != null;
            }
        }

        Cardinality(int i2) {
            this.f24129b = i2;
        }

        /* renamed from: a */
        public static Cardinality m13380a(int i2) {
            if (i2 == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i2 == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i2 == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i2 != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f24129b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum Kind implements Internal.EnumLite {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f24151b;

        /* renamed from: com.google.protobuf.Field$Kind$1 */
        public static class C23701 implements Internal.EnumLiteMap<Kind> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public Kind mo11029a(int i2) {
                return Kind.m13381a(i2);
            }
        }

        public static final class KindVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return Kind.m13381a(i2) != null;
            }
        }

        Kind(int i2) {
            this.f24151b = i2;
        }

        /* renamed from: a */
        public static Kind m13381a(int i2) {
            switch (i2) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f24151b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.m13417F(Field.class, field);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case NEW_MUTABLE_INSTANCE:
                return new Field();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Field> parser = PARSER;
                if (parser == null) {
                    synchronized (Field.class) {
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
