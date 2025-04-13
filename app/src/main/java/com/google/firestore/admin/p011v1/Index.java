package com.google.firestore.admin.p011v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class Index extends GeneratedMessageLite<Index, Builder> implements IndexOrBuilder {
    private static final Index DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Index> PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private Internal.ProtobufList<IndexField> fields_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.firestore.admin.v1.Index$1 */
    public static /* synthetic */ class C21731 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23460a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23460a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23460a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23460a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23460a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23460a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23460a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23460a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Index, Builder> implements IndexOrBuilder {
        public Builder() {
            super(Index.DEFAULT_INSTANCE);
        }

        public Builder(C21731 c21731) {
            super(Index.DEFAULT_INSTANCE);
        }
    }

    public static final class IndexField extends GeneratedMessageLite<IndexField, Builder> implements IndexFieldOrBuilder {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final IndexField DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile Parser<IndexField> PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        public enum ArrayConfig implements Internal.EnumLite {
            ARRAY_CONFIG_UNSPECIFIED(0),
            CONTAINS(1),
            UNRECOGNIZED(-1);


            /* renamed from: b */
            public final int f23465b;

            /* renamed from: com.google.firestore.admin.v1.Index$IndexField$ArrayConfig$1 */
            public class C21741 implements Internal.EnumLiteMap<ArrayConfig> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public ArrayConfig mo11029a(int i2) {
                    if (i2 == 0) {
                        return ArrayConfig.ARRAY_CONFIG_UNSPECIFIED;
                    }
                    if (i2 != 1) {
                        return null;
                    }
                    return ArrayConfig.CONTAINS;
                }
            }

            public static final class ArrayConfigVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return (i2 != 0 ? i2 != 1 ? null : ArrayConfig.CONTAINS : ArrayConfig.ARRAY_CONFIG_UNSPECIFIED) != null;
                }
            }

            ArrayConfig(int i2) {
                this.f23465b = i2;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                if (this != UNRECOGNIZED) {
                    return this.f23465b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<IndexField, Builder> implements IndexFieldOrBuilder {
            public Builder() {
                super(IndexField.DEFAULT_INSTANCE);
            }

            public Builder(C21731 c21731) {
                super(IndexField.DEFAULT_INSTANCE);
            }
        }

        public enum Order implements Internal.EnumLite {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);


            /* renamed from: b */
            public final int f23471b;

            /* renamed from: com.google.firestore.admin.v1.Index$IndexField$Order$1 */
            public class C21751 implements Internal.EnumLiteMap<Order> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public Order mo11029a(int i2) {
                    return Order.m12726a(i2);
                }
            }

            public static final class OrderVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return Order.m12726a(i2) != null;
                }
            }

            Order(int i2) {
                this.f23471b = i2;
            }

            /* renamed from: a */
            public static Order m12726a(int i2) {
                if (i2 == 0) {
                    return ORDER_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return ASCENDING;
                }
                if (i2 != 2) {
                    return null;
                }
                return DESCENDING;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                if (this != UNRECOGNIZED) {
                    return this.f23471b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        public enum ValueModeCase {
            /* JADX INFO: Fake field, exist only in values array */
            ORDER(2),
            /* JADX INFO: Fake field, exist only in values array */
            ARRAY_CONFIG(3),
            /* JADX INFO: Fake field, exist only in values array */
            VALUEMODE_NOT_SET(0);

            ValueModeCase(int i2) {
            }
        }

        static {
            IndexField indexField = new IndexField();
            DEFAULT_INSTANCE = indexField;
            GeneratedMessageLite.m13417F(IndexField.class, indexField);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
                case NEW_MUTABLE_INSTANCE:
                    return new IndexField();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<IndexField> parser = PARSER;
                    if (parser == null) {
                        synchronized (IndexField.class) {
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

    public interface IndexFieldOrBuilder extends MessageLiteOrBuilder {
    }

    public enum QueryScope implements Internal.EnumLite {
        QUERY_SCOPE_UNSPECIFIED(0),
        COLLECTION(1),
        COLLECTION_GROUP(2),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f23478b;

        /* renamed from: com.google.firestore.admin.v1.Index$QueryScope$1 */
        public class C21761 implements Internal.EnumLiteMap<QueryScope> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public QueryScope mo11029a(int i2) {
                return QueryScope.m12727a(i2);
            }
        }

        public static final class QueryScopeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return QueryScope.m12727a(i2) != null;
            }
        }

        QueryScope(int i2) {
            this.f23478b = i2;
        }

        /* renamed from: a */
        public static QueryScope m12727a(int i2) {
            if (i2 == 0) {
                return QUERY_SCOPE_UNSPECIFIED;
            }
            if (i2 == 1) {
                return COLLECTION;
            }
            if (i2 != 2) {
                return null;
            }
            return COLLECTION_GROUP;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f23478b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum State implements Internal.EnumLite {
        STATE_UNSPECIFIED(0),
        CREATING(1),
        READY(2),
        NEEDS_REPAIR(3),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f23485b;

        /* renamed from: com.google.firestore.admin.v1.Index$State$1 */
        public class C21771 implements Internal.EnumLiteMap<State> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public State mo11029a(int i2) {
                return State.m12728a(i2);
            }
        }

        public static final class StateVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return State.m12728a(i2) != null;
            }
        }

        State(int i2) {
            this.f23485b = i2;
        }

        /* renamed from: a */
        public static State m12728a(int i2) {
            if (i2 == 0) {
                return STATE_UNSPECIFIED;
            }
            if (i2 == 1) {
                return CREATING;
            }
            if (i2 == 2) {
                return READY;
            }
            if (i2 != 3) {
                return null;
            }
            return NEEDS_REPAIR;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f23485b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Index index = new Index();
        DEFAULT_INSTANCE = index;
        GeneratedMessageLite.m13417F(Index.class, index);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", IndexField.class, "state_"});
            case NEW_MUTABLE_INSTANCE:
                return new Index();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Index> parser = PARSER;
                if (parser == null) {
                    synchronized (Index.class) {
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
