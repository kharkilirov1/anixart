package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class DocumentMask extends GeneratedMessageLite<DocumentMask, Builder> implements DocumentMaskOrBuilder {
    private static final DocumentMask DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentMask> PARSER;
    private Internal.ProtobufList<String> fieldPaths_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.firestore.v1.DocumentMask$1 */
    public static /* synthetic */ class C21971 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23517a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23517a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23517a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23517a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23517a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23517a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23517a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23517a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DocumentMask, Builder> implements DocumentMaskOrBuilder {
        public Builder() {
            super(DocumentMask.DEFAULT_INSTANCE);
        }

        public Builder(C21971 c21971) {
            super(DocumentMask.DEFAULT_INSTANCE);
        }
    }

    static {
        DocumentMask documentMask = new DocumentMask();
        DEFAULT_INSTANCE = documentMask;
        GeneratedMessageLite.m13417F(DocumentMask.class, documentMask);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case NEW_MUTABLE_INSTANCE:
                return new DocumentMask();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<DocumentMask> parser = PARSER;
                if (parser == null) {
                    synchronized (DocumentMask.class) {
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
