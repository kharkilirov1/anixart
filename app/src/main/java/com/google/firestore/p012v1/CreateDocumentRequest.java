package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class CreateDocumentRequest extends GeneratedMessageLite<CreateDocumentRequest, Builder> implements CreateDocumentRequestOrBuilder {
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final CreateDocumentRequest DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 4;
    public static final int DOCUMENT_ID_FIELD_NUMBER = 3;
    public static final int MASK_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<CreateDocumentRequest> PARSER;
    private Document document_;
    private DocumentMask mask_;
    private String parent_ = "";
    private String collectionId_ = "";
    private String documentId_ = "";

    /* renamed from: com.google.firestore.v1.CreateDocumentRequest$1 */
    public static /* synthetic */ class C21911 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23510a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23510a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23510a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23510a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23510a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23510a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23510a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23510a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CreateDocumentRequest, Builder> implements CreateDocumentRequestOrBuilder {
        public Builder() {
            super(CreateDocumentRequest.DEFAULT_INSTANCE);
        }

        public Builder(C21911 c21911) {
            super(CreateDocumentRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        CreateDocumentRequest createDocumentRequest = new CreateDocumentRequest();
        DEFAULT_INSTANCE = createDocumentRequest;
        GeneratedMessageLite.m13417F(CreateDocumentRequest.class, createDocumentRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t\u0005\t", new Object[]{"parent_", "collectionId_", "documentId_", "document_", "mask_"});
            case NEW_MUTABLE_INSTANCE:
                return new CreateDocumentRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<CreateDocumentRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (CreateDocumentRequest.class) {
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
