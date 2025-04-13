package com.google.firestore.bundle;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class NamedQuery extends GeneratedMessageLite<NamedQuery, Builder> implements NamedQueryOrBuilder {
    public static final int BUNDLED_QUERY_FIELD_NUMBER = 2;
    private static final NamedQuery DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<NamedQuery> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    private BundledQuery bundledQuery_;
    private String name_ = "";
    private Timestamp readTime_;

    /* renamed from: com.google.firestore.bundle.NamedQuery$1 */
    public static /* synthetic */ class C21831 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23497a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23497a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23497a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23497a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23497a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23497a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23497a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23497a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<NamedQuery, Builder> implements NamedQueryOrBuilder {
        public Builder() {
            super(NamedQuery.DEFAULT_INSTANCE);
        }

        public Builder(C21831 c21831) {
            super(NamedQuery.DEFAULT_INSTANCE);
        }
    }

    static {
        NamedQuery namedQuery = new NamedQuery();
        DEFAULT_INSTANCE = namedQuery;
        GeneratedMessageLite.m13417F(NamedQuery.class, namedQuery);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t", new Object[]{"name_", "bundledQuery_", "readTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new NamedQuery();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<NamedQuery> parser = PARSER;
                if (parser == null) {
                    synchronized (NamedQuery.class) {
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
