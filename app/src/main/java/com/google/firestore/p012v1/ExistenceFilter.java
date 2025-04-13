package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class ExistenceFilter extends GeneratedMessageLite<ExistenceFilter, Builder> implements ExistenceFilterOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final ExistenceFilter DEFAULT_INSTANCE;
    private static volatile Parser<ExistenceFilter> PARSER = null;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int count_;
    private int targetId_;

    /* renamed from: com.google.firestore.v1.ExistenceFilter$1 */
    public static /* synthetic */ class C22011 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23533a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23533a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23533a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23533a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23533a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23533a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23533a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23533a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ExistenceFilter, Builder> implements ExistenceFilterOrBuilder {
        public Builder() {
            super(ExistenceFilter.DEFAULT_INSTANCE);
        }

        public Builder(C22011 c22011) {
            super(ExistenceFilter.DEFAULT_INSTANCE);
        }
    }

    static {
        ExistenceFilter existenceFilter = new ExistenceFilter();
        DEFAULT_INSTANCE = existenceFilter;
        GeneratedMessageLite.m13417F(ExistenceFilter.class, existenceFilter);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"targetId_", "count_"});
            case NEW_MUTABLE_INSTANCE:
                return new ExistenceFilter();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ExistenceFilter> parser = PARSER;
                if (parser == null) {
                    synchronized (ExistenceFilter.class) {
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
