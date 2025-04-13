package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class DocumentChange extends GeneratedMessageLite<DocumentChange, Builder> implements DocumentChangeOrBuilder {
    private static final DocumentChange DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentChange> PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private Document document_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private Internal.IntList targetIds_ = GeneratedMessageLite.m13420r();
    private Internal.IntList removedTargetIds_ = GeneratedMessageLite.m13420r();

    /* renamed from: com.google.firestore.v1.DocumentChange$1 */
    public static /* synthetic */ class C21951 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23515a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23515a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23515a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23515a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23515a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23515a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23515a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23515a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DocumentChange, Builder> implements DocumentChangeOrBuilder {
        public Builder() {
            super(DocumentChange.DEFAULT_INSTANCE);
        }

        public Builder(C21951 c21951) {
            super(DocumentChange.DEFAULT_INSTANCE);
        }
    }

    static {
        DocumentChange documentChange = new DocumentChange();
        DEFAULT_INSTANCE = documentChange;
        GeneratedMessageLite.m13417F(DocumentChange.class, documentChange);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0002\u0000\u0001\t\u0005'\u0006'", new Object[]{"document_", "targetIds_", "removedTargetIds_"});
            case NEW_MUTABLE_INSTANCE:
                return new DocumentChange();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<DocumentChange> parser = PARSER;
                if (parser == null) {
                    synchronized (DocumentChange.class) {
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
