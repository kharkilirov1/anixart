package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class DocumentDelete extends GeneratedMessageLite<DocumentDelete, Builder> implements DocumentDeleteOrBuilder {
    private static final DocumentDelete DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentDelete> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    private Timestamp readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private Internal.IntList removedTargetIds_ = GeneratedMessageLite.m13420r();

    /* renamed from: com.google.firestore.v1.DocumentDelete$1 */
    public static /* synthetic */ class C21961 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23516a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23516a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23516a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23516a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23516a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23516a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23516a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23516a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DocumentDelete, Builder> implements DocumentDeleteOrBuilder {
        public Builder() {
            super(DocumentDelete.DEFAULT_INSTANCE);
        }

        public Builder(C21961 c21961) {
            super(DocumentDelete.DEFAULT_INSTANCE);
        }
    }

    static {
        DocumentDelete documentDelete = new DocumentDelete();
        DEFAULT_INSTANCE = documentDelete;
        GeneratedMessageLite.m13417F(DocumentDelete.class, documentDelete);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0001\u0000\u0001Ȉ\u0004\t\u0006'", new Object[]{"document_", "readTime_", "removedTargetIds_"});
            case NEW_MUTABLE_INSTANCE:
                return new DocumentDelete();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<DocumentDelete> parser = PARSER;
                if (parser == null) {
                    synchronized (DocumentDelete.class) {
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
