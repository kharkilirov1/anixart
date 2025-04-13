package com.google.firestore.bundle;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class BundledDocumentMetadata extends GeneratedMessageLite<BundledDocumentMetadata, Builder> implements BundledDocumentMetadataOrBuilder {
    private static final BundledDocumentMetadata DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<BundledDocumentMetadata> PARSER = null;
    public static final int QUERIES_FIELD_NUMBER = 4;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private boolean exists_;
    private String name_ = "";
    private Internal.ProtobufList<String> queries_ = GeneratedMessageLite.m13422t();
    private Timestamp readTime_;

    /* renamed from: com.google.firestore.bundle.BundledDocumentMetadata$1 */
    public static /* synthetic */ class C21801 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23489a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23489a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23489a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23489a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23489a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23489a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23489a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23489a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BundledDocumentMetadata, Builder> implements BundledDocumentMetadataOrBuilder {
        public Builder() {
            super(BundledDocumentMetadata.DEFAULT_INSTANCE);
        }

        public Builder(C21801 c21801) {
            super(BundledDocumentMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        BundledDocumentMetadata bundledDocumentMetadata = new BundledDocumentMetadata();
        DEFAULT_INSTANCE = bundledDocumentMetadata;
        GeneratedMessageLite.m13417F(BundledDocumentMetadata.class, bundledDocumentMetadata);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\u0007\u0004Ț", new Object[]{"name_", "readTime_", "exists_", "queries_"});
            case NEW_MUTABLE_INSTANCE:
                return new BundledDocumentMetadata();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BundledDocumentMetadata> parser = PARSER;
                if (parser == null) {
                    synchronized (BundledDocumentMetadata.class) {
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
