package com.google.firebase.firestore.proto;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class UnknownDocument extends GeneratedMessageLite<UnknownDocument, Builder> implements UnknownDocumentOrBuilder {
    private static final UnknownDocument DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<UnknownDocument> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String name_ = "";
    private Timestamp version_;

    /* renamed from: com.google.firebase.firestore.proto.UnknownDocument$1 */
    public static /* synthetic */ class C21131 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22921a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22921a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22921a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22921a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22921a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22921a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22921a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22921a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<UnknownDocument, Builder> implements UnknownDocumentOrBuilder {
        public Builder() {
            super(UnknownDocument.DEFAULT_INSTANCE);
        }

        public Builder(C21131 c21131) {
            super(UnknownDocument.DEFAULT_INSTANCE);
        }
    }

    static {
        UnknownDocument unknownDocument = new UnknownDocument();
        DEFAULT_INSTANCE = unknownDocument;
        GeneratedMessageLite.m13417F(UnknownDocument.class, unknownDocument);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "version_"});
            case NEW_MUTABLE_INSTANCE:
                return new UnknownDocument();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<UnknownDocument> parser = PARSER;
                if (parser == null) {
                    synchronized (UnknownDocument.class) {
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
