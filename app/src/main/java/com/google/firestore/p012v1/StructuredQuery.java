package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class StructuredQuery extends GeneratedMessageLite<StructuredQuery, Builder> implements StructuredQueryOrBuilder {
    private static final StructuredQuery DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile Parser<StructuredQuery> PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private Cursor endAt_;
    private Int32Value limit_;
    private int offset_;
    private Projection select_;
    private Cursor startAt_;
    private Filter where_;
    private Internal.ProtobufList<CollectionSelector> from_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<Order> orderBy_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.firestore.v1.StructuredQuery$1 */
    public static /* synthetic */ class C22171 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23564a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23564a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23564a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23564a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23564a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23564a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23564a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23564a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<StructuredQuery, Builder> implements StructuredQueryOrBuilder {
        public Builder() {
            super(StructuredQuery.DEFAULT_INSTANCE);
        }

        public Builder(C22171 c22171) {
            super(StructuredQuery.DEFAULT_INSTANCE);
        }
    }

    public static final class CollectionSelector extends GeneratedMessageLite<CollectionSelector, Builder> implements CollectionSelectorOrBuilder {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final CollectionSelector DEFAULT_INSTANCE;
        private static volatile Parser<CollectionSelector> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<CollectionSelector, Builder> implements CollectionSelectorOrBuilder {
            public Builder() {
                super(CollectionSelector.DEFAULT_INSTANCE);
            }

            public Builder(C22171 c22171) {
                super(CollectionSelector.DEFAULT_INSTANCE);
            }
        }

        static {
            CollectionSelector collectionSelector = new CollectionSelector();
            DEFAULT_INSTANCE = collectionSelector;
            GeneratedMessageLite.m13417F(CollectionSelector.class, collectionSelector);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
                case NEW_MUTABLE_INSTANCE:
                    return new CollectionSelector();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<CollectionSelector> parser = PARSER;
                    if (parser == null) {
                        synchronized (CollectionSelector.class) {
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

    public interface CollectionSelectorOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class CompositeFilter extends GeneratedMessageLite<CompositeFilter, Builder> implements CompositeFilterOrBuilder {
        private static final CompositeFilter DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile Parser<CompositeFilter> PARSER;
        private Internal.ProtobufList<Filter> filters_ = GeneratedMessageLite.m13422t();
        private int op_;

        public static final class Builder extends GeneratedMessageLite.Builder<CompositeFilter, Builder> implements CompositeFilterOrBuilder {
            public Builder() {
                super(CompositeFilter.DEFAULT_INSTANCE);
            }

            public Builder(C22171 c22171) {
                super(CompositeFilter.DEFAULT_INSTANCE);
            }
        }

        public enum Operator implements Internal.EnumLite {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            UNRECOGNIZED(-1);


            /* renamed from: b */
            public final int f23569b;

            /* renamed from: com.google.firestore.v1.StructuredQuery$CompositeFilter$Operator$1 */
            public class C22181 implements Internal.EnumLiteMap<Operator> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public Operator mo11029a(int i2) {
                    return Operator.m12779a(i2);
                }
            }

            public static final class OperatorVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return Operator.m12779a(i2) != null;
                }
            }

            Operator(int i2) {
                this.f23569b = i2;
            }

            /* renamed from: a */
            public static Operator m12779a(int i2) {
                if (i2 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i2 != 1) {
                    return null;
                }
                return AND;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                if (this != UNRECOGNIZED) {
                    return this.f23569b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            CompositeFilter compositeFilter = new CompositeFilter();
            DEFAULT_INSTANCE = compositeFilter;
            GeneratedMessageLite.m13417F(CompositeFilter.class, compositeFilter);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", Filter.class});
                case NEW_MUTABLE_INSTANCE:
                    return new CompositeFilter();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<CompositeFilter> parser = PARSER;
                    if (parser == null) {
                        synchronized (CompositeFilter.class) {
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

    public interface CompositeFilterOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Direction implements Internal.EnumLite {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f23575b;

        /* renamed from: com.google.firestore.v1.StructuredQuery$Direction$1 */
        public class C22191 implements Internal.EnumLiteMap<Direction> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public Direction mo11029a(int i2) {
                return Direction.m12780a(i2);
            }
        }

        public static final class DirectionVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return Direction.m12780a(i2) != null;
            }
        }

        Direction(int i2) {
            this.f23575b = i2;
        }

        /* renamed from: a */
        public static Direction m12780a(int i2) {
            if (i2 == 0) {
                return DIRECTION_UNSPECIFIED;
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
                return this.f23575b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class FieldFilter extends GeneratedMessageLite<FieldFilter, Builder> implements FieldFilterOrBuilder {
        private static final FieldFilter DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile Parser<FieldFilter> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private FieldReference field_;
        private int op_;
        private Value value_;

        public static final class Builder extends GeneratedMessageLite.Builder<FieldFilter, Builder> implements FieldFilterOrBuilder {
            public Builder() {
                super(FieldFilter.DEFAULT_INSTANCE);
            }

            public Builder(C22171 c22171) {
                super(FieldFilter.DEFAULT_INSTANCE);
            }
        }

        public enum Operator implements Internal.EnumLite {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);


            /* renamed from: b */
            public final int f23589b;

            /* renamed from: com.google.firestore.v1.StructuredQuery$FieldFilter$Operator$1 */
            public class C22201 implements Internal.EnumLiteMap<Operator> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public Operator mo11029a(int i2) {
                    return Operator.m12782a(i2);
                }
            }

            public static final class OperatorVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return Operator.m12782a(i2) != null;
                }
            }

            Operator(int i2) {
                this.f23589b = i2;
            }

            /* renamed from: a */
            public static Operator m12782a(int i2) {
                switch (i2) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                if (this != UNRECOGNIZED) {
                    return this.f23589b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            FieldFilter fieldFilter = new FieldFilter();
            DEFAULT_INSTANCE = fieldFilter;
            GeneratedMessageLite.m13417F(FieldFilter.class, fieldFilter);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"field_", "op_", "value_"});
                case NEW_MUTABLE_INSTANCE:
                    return new FieldFilter();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FieldFilter> parser = PARSER;
                    if (parser == null) {
                        synchronized (FieldFilter.class) {
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

    public interface FieldFilterOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class FieldReference extends GeneratedMessageLite<FieldReference, Builder> implements FieldReferenceOrBuilder {
        private static final FieldReference DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile Parser<FieldReference> PARSER;
        private String fieldPath_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<FieldReference, Builder> implements FieldReferenceOrBuilder {
            public Builder() {
                super(FieldReference.DEFAULT_INSTANCE);
            }

            public Builder(C22171 c22171) {
                super(FieldReference.DEFAULT_INSTANCE);
            }
        }

        static {
            FieldReference fieldReference = new FieldReference();
            DEFAULT_INSTANCE = fieldReference;
            GeneratedMessageLite.m13417F(FieldReference.class, fieldReference);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case NEW_MUTABLE_INSTANCE:
                    return new FieldReference();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FieldReference> parser = PARSER;
                    if (parser == null) {
                        synchronized (FieldReference.class) {
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

    public interface FieldReferenceOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Filter extends GeneratedMessageLite<Filter, Builder> implements FilterOrBuilder {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final Filter DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile Parser<Filter> PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        public static final class Builder extends GeneratedMessageLite.Builder<Filter, Builder> implements FilterOrBuilder {
            public Builder() {
                super(Filter.DEFAULT_INSTANCE);
            }

            public Builder(C22171 c22171) {
                super(Filter.DEFAULT_INSTANCE);
            }
        }

        public enum FilterTypeCase {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);

            FilterTypeCase(int i2) {
            }
        }

        static {
            Filter filter = new Filter();
            DEFAULT_INSTANCE = filter;
            GeneratedMessageLite.m13417F(Filter.class, filter);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", CompositeFilter.class, FieldFilter.class, UnaryFilter.class});
                case NEW_MUTABLE_INSTANCE:
                    return new Filter();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Filter> parser = PARSER;
                    if (parser == null) {
                        synchronized (Filter.class) {
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

    public interface FilterOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Order extends GeneratedMessageLite<Order, Builder> implements OrderOrBuilder {
        private static final Order DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile Parser<Order> PARSER;
        private int direction_;
        private FieldReference field_;

        public static final class Builder extends GeneratedMessageLite.Builder<Order, Builder> implements OrderOrBuilder {
            public Builder() {
                super(Order.DEFAULT_INSTANCE);
            }

            public Builder(C22171 c22171) {
                super(Order.DEFAULT_INSTANCE);
            }
        }

        static {
            Order order = new Order();
            DEFAULT_INSTANCE = order;
            GeneratedMessageLite.m13417F(Order.class, order);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"field_", "direction_"});
                case NEW_MUTABLE_INSTANCE:
                    return new Order();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Order> parser = PARSER;
                    if (parser == null) {
                        synchronized (Order.class) {
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

    public interface OrderOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Projection extends GeneratedMessageLite<Projection, Builder> implements ProjectionOrBuilder {
        private static final Projection DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile Parser<Projection> PARSER;
        private Internal.ProtobufList<FieldReference> fields_ = GeneratedMessageLite.m13422t();

        public static final class Builder extends GeneratedMessageLite.Builder<Projection, Builder> implements ProjectionOrBuilder {
            public Builder() {
                super(Projection.DEFAULT_INSTANCE);
            }

            public Builder(C22171 c22171) {
                super(Projection.DEFAULT_INSTANCE);
            }
        }

        static {
            Projection projection = new Projection();
            DEFAULT_INSTANCE = projection;
            GeneratedMessageLite.m13417F(Projection.class, projection);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", FieldReference.class});
                case NEW_MUTABLE_INSTANCE:
                    return new Projection();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Projection> parser = PARSER;
                    if (parser == null) {
                        synchronized (Projection.class) {
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

    public interface ProjectionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class UnaryFilter extends GeneratedMessageLite<UnaryFilter, Builder> implements UnaryFilterOrBuilder {
        private static final UnaryFilter DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile Parser<UnaryFilter> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        public static final class Builder extends GeneratedMessageLite.Builder<UnaryFilter, Builder> implements UnaryFilterOrBuilder {
            public Builder() {
                super(UnaryFilter.DEFAULT_INSTANCE);
            }

            public Builder(C22171 c22171) {
                super(UnaryFilter.DEFAULT_INSTANCE);
            }
        }

        public enum OperandTypeCase {
            /* JADX INFO: Fake field, exist only in values array */
            FIELD(2),
            /* JADX INFO: Fake field, exist only in values array */
            OPERANDTYPE_NOT_SET(0);

            OperandTypeCase(int i2) {
            }
        }

        public enum Operator implements Internal.EnumLite {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);


            /* renamed from: b */
            public final int f23603b;

            /* renamed from: com.google.firestore.v1.StructuredQuery$UnaryFilter$Operator$1 */
            public class C22211 implements Internal.EnumLiteMap<Operator> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public Operator mo11029a(int i2) {
                    return Operator.m12788a(i2);
                }
            }

            public static final class OperatorVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return Operator.m12788a(i2) != null;
                }
            }

            Operator(int i2) {
                this.f23603b = i2;
            }

            /* renamed from: a */
            public static Operator m12788a(int i2) {
                if (i2 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i2 == 2) {
                    return IS_NAN;
                }
                if (i2 == 3) {
                    return IS_NULL;
                }
                if (i2 == 4) {
                    return IS_NOT_NAN;
                }
                if (i2 != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                if (this != UNRECOGNIZED) {
                    return this.f23603b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            UnaryFilter unaryFilter = new UnaryFilter();
            DEFAULT_INSTANCE = unaryFilter;
            GeneratedMessageLite.m13417F(UnaryFilter.class, unaryFilter);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", FieldReference.class});
                case NEW_MUTABLE_INSTANCE:
                    return new UnaryFilter();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<UnaryFilter> parser = PARSER;
                    if (parser == null) {
                        synchronized (UnaryFilter.class) {
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

    public interface UnaryFilterOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        StructuredQuery structuredQuery = new StructuredQuery();
        DEFAULT_INSTANCE = structuredQuery;
        GeneratedMessageLite.m13417F(StructuredQuery.class, structuredQuery);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\b\t", new Object[]{"select_", "from_", CollectionSelector.class, "where_", "orderBy_", Order.class, "limit_", "offset_", "startAt_", "endAt_"});
            case NEW_MUTABLE_INSTANCE:
                return new StructuredQuery();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<StructuredQuery> parser = PARSER;
                if (parser == null) {
                    synchronized (StructuredQuery.class) {
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
