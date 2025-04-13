package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class DeleteDocumentRequest extends GeneratedMessageLite<DeleteDocumentRequest, Builder> implements DeleteDocumentRequestOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 2;
    private static final DeleteDocumentRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<DeleteDocumentRequest> PARSER;
    private Precondition currentDocument_;
    private String name_ = "";

    /* renamed from: com.google.firestore.v1.DeleteDocumentRequest$1 */
    public static /* synthetic */ class C21931 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23512a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23512a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23512a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23512a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23512a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23512a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23512a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23512a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DeleteDocumentRequest, Builder> implements DeleteDocumentRequestOrBuilder {
        public Builder() {
            super(DeleteDocumentRequest.DEFAULT_INSTANCE);
        }

        public Builder(C21931 c21931) {
            super(DeleteDocumentRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        DeleteDocumentRequest deleteDocumentRequest = new DeleteDocumentRequest();
        DEFAULT_INSTANCE = deleteDocumentRequest;
        GeneratedMessageLite.m13417F(DeleteDocumentRequest.class, deleteDocumentRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "currentDocument_"});
            case NEW_MUTABLE_INSTANCE:
                return new DeleteDocumentRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<DeleteDocumentRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (DeleteDocumentRequest.class) {
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
