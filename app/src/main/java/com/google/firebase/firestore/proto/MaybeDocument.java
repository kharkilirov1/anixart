package com.google.firebase.firestore.proto;

import com.google.firestore.p012v1.Document;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class MaybeDocument extends GeneratedMessageLite<MaybeDocument, Builder> implements MaybeDocumentOrBuilder {
    private static final MaybeDocument DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<MaybeDocument> PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* renamed from: com.google.firebase.firestore.proto.MaybeDocument$1 */
    public static /* synthetic */ class C21081 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22907a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22907a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22907a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22907a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22907a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22907a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22907a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22907a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MaybeDocument, Builder> implements MaybeDocumentOrBuilder {
        public Builder() {
            super(MaybeDocument.DEFAULT_INSTANCE);
        }

        public Builder(C21081 c21081) {
            super(MaybeDocument.DEFAULT_INSTANCE);
        }
    }

    public enum DocumentTypeCase {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);

        DocumentTypeCase(int i2) {
        }
    }

    static {
        MaybeDocument maybeDocument = new MaybeDocument();
        DEFAULT_INSTANCE = maybeDocument;
        GeneratedMessageLite.m13417F(MaybeDocument.class, maybeDocument);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", NoDocument.class, Document.class, UnknownDocument.class, "hasCommittedMutations_"});
            case NEW_MUTABLE_INSTANCE:
                return new MaybeDocument();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<MaybeDocument> parser = PARSER;
                if (parser == null) {
                    synchronized (MaybeDocument.class) {
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
