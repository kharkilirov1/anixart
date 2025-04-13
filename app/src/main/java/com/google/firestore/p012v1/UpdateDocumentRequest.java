package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class UpdateDocumentRequest extends GeneratedMessageLite<UpdateDocumentRequest, Builder> implements UpdateDocumentRequestOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final UpdateDocumentRequest DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int MASK_FIELD_NUMBER = 3;
    private static volatile Parser<UpdateDocumentRequest> PARSER = null;
    public static final int UPDATE_MASK_FIELD_NUMBER = 2;
    private Precondition currentDocument_;
    private Document document_;
    private DocumentMask mask_;
    private DocumentMask updateMask_;

    /* renamed from: com.google.firestore.v1.UpdateDocumentRequest$1 */
    public static /* synthetic */ class C22261 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23620a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23620a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23620a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23620a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23620a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23620a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23620a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23620a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<UpdateDocumentRequest, Builder> implements UpdateDocumentRequestOrBuilder {
        public Builder() {
            super(UpdateDocumentRequest.DEFAULT_INSTANCE);
        }

        public Builder(C22261 c22261) {
            super(UpdateDocumentRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        UpdateDocumentRequest updateDocumentRequest = new UpdateDocumentRequest();
        DEFAULT_INSTANCE = updateDocumentRequest;
        GeneratedMessageLite.m13417F(UpdateDocumentRequest.class, updateDocumentRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"document_", "updateMask_", "mask_", "currentDocument_"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateDocumentRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<UpdateDocumentRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (UpdateDocumentRequest.class) {
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
