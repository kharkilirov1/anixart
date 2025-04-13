package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class Target extends GeneratedMessageLite<Target, Builder> implements TargetOrBuilder {
    private static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile Parser<Target> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    /* renamed from: com.google.firestore.v1.Target$1 */
    public static /* synthetic */ class C22221 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23604a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23604a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23604a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23604a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23604a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23604a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23604a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23604a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Target, Builder> implements TargetOrBuilder {
        public Builder() {
            super(Target.DEFAULT_INSTANCE);
        }

        public Builder(C22221 c22221) {
            super(Target.DEFAULT_INSTANCE);
        }
    }

    public static final class DocumentsTarget extends GeneratedMessageLite<DocumentsTarget, Builder> implements DocumentsTargetOrBuilder {
        private static final DocumentsTarget DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile Parser<DocumentsTarget> PARSER;
        private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.m13422t();

        public static final class Builder extends GeneratedMessageLite.Builder<DocumentsTarget, Builder> implements DocumentsTargetOrBuilder {
            public Builder() {
                super(DocumentsTarget.DEFAULT_INSTANCE);
            }

            public Builder(C22221 c22221) {
                super(DocumentsTarget.DEFAULT_INSTANCE);
            }
        }

        static {
            DocumentsTarget documentsTarget = new DocumentsTarget();
            DEFAULT_INSTANCE = documentsTarget;
            GeneratedMessageLite.m13417F(DocumentsTarget.class, documentsTarget);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
                case NEW_MUTABLE_INSTANCE:
                    return new DocumentsTarget();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<DocumentsTarget> parser = PARSER;
                    if (parser == null) {
                        synchronized (DocumentsTarget.class) {
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

    public interface DocumentsTargetOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class QueryTarget extends GeneratedMessageLite<QueryTarget, Builder> implements QueryTargetOrBuilder {
        private static final QueryTarget DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile Parser<QueryTarget> PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<QueryTarget, Builder> implements QueryTargetOrBuilder {
            public Builder() {
                super(QueryTarget.DEFAULT_INSTANCE);
            }

            public Builder(C22221 c22221) {
                super(QueryTarget.DEFAULT_INSTANCE);
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
            QueryTarget queryTarget = new QueryTarget();
            DEFAULT_INSTANCE = queryTarget;
            GeneratedMessageLite.m13417F(QueryTarget.class, queryTarget);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", StructuredQuery.class});
                case NEW_MUTABLE_INSTANCE:
                    return new QueryTarget();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<QueryTarget> parser = PARSER;
                    if (parser == null) {
                        synchronized (QueryTarget.class) {
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

    public interface QueryTargetOrBuilder extends MessageLiteOrBuilder {
    }

    public enum ResumeTypeCase {
        /* JADX INFO: Fake field, exist only in values array */
        RESUME_TOKEN(4),
        /* JADX INFO: Fake field, exist only in values array */
        READ_TIME(11),
        /* JADX INFO: Fake field, exist only in values array */
        RESUMETYPE_NOT_SET(0);

        ResumeTypeCase(int i2) {
        }
    }

    public enum TargetTypeCase {
        /* JADX INFO: Fake field, exist only in values array */
        QUERY(2),
        /* JADX INFO: Fake field, exist only in values array */
        DOCUMENTS(3),
        /* JADX INFO: Fake field, exist only in values array */
        TARGETTYPE_NOT_SET(0);

        TargetTypeCase(int i2) {
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        GeneratedMessageLite.m13417F(Target.class, target);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0006\u0002\u0000\u0002\u000b\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", QueryTarget.class, DocumentsTarget.class, "targetId_", "once_", Timestamp.class});
            case NEW_MUTABLE_INSTANCE:
                return new Target();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Target> parser = PARSER;
                if (parser == null) {
                    synchronized (Target.class) {
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
