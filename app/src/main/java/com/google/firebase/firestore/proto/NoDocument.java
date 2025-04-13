package com.google.firebase.firestore.proto;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class NoDocument extends GeneratedMessageLite<NoDocument, Builder> implements NoDocumentOrBuilder {
    private static final NoDocument DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<NoDocument> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private String name_ = "";
    private Timestamp readTime_;

    /* renamed from: com.google.firebase.firestore.proto.NoDocument$1 */
    public static /* synthetic */ class C21101 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22914a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22914a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22914a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22914a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22914a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22914a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22914a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22914a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<NoDocument, Builder> implements NoDocumentOrBuilder {
        public Builder() {
            super(NoDocument.DEFAULT_INSTANCE);
        }

        public Builder(C21101 c21101) {
            super(NoDocument.DEFAULT_INSTANCE);
        }
    }

    static {
        NoDocument noDocument = new NoDocument();
        DEFAULT_INSTANCE = noDocument;
        GeneratedMessageLite.m13417F(NoDocument.class, noDocument);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "readTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new NoDocument();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<NoDocument> parser = PARSER;
                if (parser == null) {
                    synchronized (NoDocument.class) {
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
