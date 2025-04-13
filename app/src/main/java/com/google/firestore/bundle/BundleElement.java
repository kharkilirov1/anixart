package com.google.firestore.bundle;

import com.google.firestore.p012v1.Document;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class BundleElement extends GeneratedMessageLite<BundleElement, Builder> implements BundleElementOrBuilder {
    private static final BundleElement DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 4;
    public static final int DOCUMENT_METADATA_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 1;
    public static final int NAMED_QUERY_FIELD_NUMBER = 2;
    private static volatile Parser<BundleElement> PARSER;
    private int elementTypeCase_ = 0;
    private Object elementType_;

    /* renamed from: com.google.firestore.bundle.BundleElement$1 */
    public static /* synthetic */ class C21781 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23486a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23486a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23486a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23486a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23486a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23486a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23486a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23486a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BundleElement, Builder> implements BundleElementOrBuilder {
        public Builder() {
            super(BundleElement.DEFAULT_INSTANCE);
        }

        public Builder(C21781 c21781) {
            super(BundleElement.DEFAULT_INSTANCE);
        }
    }

    public enum ElementTypeCase {
        /* JADX INFO: Fake field, exist only in values array */
        METADATA(1),
        /* JADX INFO: Fake field, exist only in values array */
        NAMED_QUERY(2),
        /* JADX INFO: Fake field, exist only in values array */
        DOCUMENT_METADATA(3),
        /* JADX INFO: Fake field, exist only in values array */
        DOCUMENT(4),
        /* JADX INFO: Fake field, exist only in values array */
        ELEMENTTYPE_NOT_SET(0);

        ElementTypeCase(int i2) {
        }
    }

    static {
        BundleElement bundleElement = new BundleElement();
        DEFAULT_INSTANCE = bundleElement;
        GeneratedMessageLite.m13417F(BundleElement.class, bundleElement);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"elementType_", "elementTypeCase_", BundleMetadata.class, NamedQuery.class, BundledDocumentMetadata.class, Document.class});
            case NEW_MUTABLE_INSTANCE:
                return new BundleElement();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BundleElement> parser = PARSER;
                if (parser == null) {
                    synchronized (BundleElement.class) {
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
