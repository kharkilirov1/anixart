package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class DocumentRemove extends GeneratedMessageLite<DocumentRemove, Builder> implements DocumentRemoveOrBuilder {
    private static final DocumentRemove DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentRemove> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 2;
    private Timestamp readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private Internal.IntList removedTargetIds_ = GeneratedMessageLite.m13420r();

    /* renamed from: com.google.firestore.v1.DocumentRemove$1 */
    public static /* synthetic */ class C21981 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23518a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23518a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23518a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23518a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23518a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23518a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23518a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23518a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DocumentRemove, Builder> implements DocumentRemoveOrBuilder {
        public Builder() {
            super(DocumentRemove.DEFAULT_INSTANCE);
        }

        public Builder(C21981 c21981) {
            super(DocumentRemove.DEFAULT_INSTANCE);
        }
    }

    static {
        DocumentRemove documentRemove = new DocumentRemove();
        DEFAULT_INSTANCE = documentRemove;
        GeneratedMessageLite.m13417F(DocumentRemove.class, documentRemove);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0002'\u0004\t", new Object[]{"document_", "removedTargetIds_", "readTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new DocumentRemove();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<DocumentRemove> parser = PARSER;
                if (parser == null) {
                    synchronized (DocumentRemove.class) {
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
