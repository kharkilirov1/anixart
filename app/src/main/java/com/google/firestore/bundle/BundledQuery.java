package com.google.firestore.bundle;

import com.google.firestore.p012v1.StructuredQuery;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class BundledQuery extends GeneratedMessageLite<BundledQuery, Builder> implements BundledQueryOrBuilder {
    private static final BundledQuery DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<BundledQuery> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    /* renamed from: com.google.firestore.bundle.BundledQuery$1 */
    public static /* synthetic */ class C21811 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23490a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23490a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23490a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23490a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23490a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23490a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23490a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23490a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BundledQuery, Builder> implements BundledQueryOrBuilder {
        public Builder() {
            super(BundledQuery.DEFAULT_INSTANCE);
        }

        public Builder(C21811 c21811) {
            super(BundledQuery.DEFAULT_INSTANCE);
        }
    }

    public enum LimitType implements Internal.EnumLite {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f23495b;

        /* renamed from: com.google.firestore.bundle.BundledQuery$LimitType$1 */
        public class C21821 implements Internal.EnumLiteMap<LimitType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public LimitType mo11029a(int i2) {
                if (i2 == 0) {
                    return LimitType.FIRST;
                }
                if (i2 != 1) {
                    return null;
                }
                return LimitType.LAST;
            }
        }

        public static final class LimitTypeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return (i2 != 0 ? i2 != 1 ? null : LimitType.LAST : LimitType.FIRST) != null;
            }
        }

        LimitType(int i2) {
            this.f23495b = i2;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f23495b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum QueryTypeCase {
        /* JADX INFO: Fake field, exist only in values array */
        STRUCTURED_QUERY(2),
        /* JADX INFO: Fake field, exist only in values array */
        QUERYTYPE_NOT_SET(0);

        QueryTypeCase(int i2) {
        }
    }

    static {
        BundledQuery bundledQuery = new BundledQuery();
        DEFAULT_INSTANCE = bundledQuery;
        GeneratedMessageLite.m13417F(BundledQuery.class, bundledQuery);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", StructuredQuery.class, "limitType_"});
            case NEW_MUTABLE_INSTANCE:
                return new BundledQuery();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BundledQuery> parser = PARSER;
                if (parser == null) {
                    synchronized (BundledQuery.class) {
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
