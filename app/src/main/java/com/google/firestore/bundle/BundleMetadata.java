package com.google.firestore.bundle;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class BundleMetadata extends GeneratedMessageLite<BundleMetadata, Builder> implements BundleMetadataOrBuilder {
    public static final int CREATE_TIME_FIELD_NUMBER = 2;
    private static final BundleMetadata DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<BundleMetadata> PARSER = null;
    public static final int TOTAL_BYTES_FIELD_NUMBER = 5;
    public static final int TOTAL_DOCUMENTS_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 3;
    private Timestamp createTime_;
    private String id_ = "";
    private long totalBytes_;
    private int totalDocuments_;
    private int version_;

    /* renamed from: com.google.firestore.bundle.BundleMetadata$1 */
    public static /* synthetic */ class C21791 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23488a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23488a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23488a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23488a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23488a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23488a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23488a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23488a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BundleMetadata, Builder> implements BundleMetadataOrBuilder {
        public Builder() {
            super(BundleMetadata.DEFAULT_INSTANCE);
        }

        public Builder(C21791 c21791) {
            super(BundleMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        BundleMetadata bundleMetadata = new BundleMetadata();
        DEFAULT_INSTANCE = bundleMetadata;
        GeneratedMessageLite.m13417F(BundleMetadata.class, bundleMetadata);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u000b\u0004\u000b\u0005\u0003", new Object[]{"id_", "createTime_", "version_", "totalDocuments_", "totalBytes_"});
            case NEW_MUTABLE_INSTANCE:
                return new BundleMetadata();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BundleMetadata> parser = PARSER;
                if (parser == null) {
                    synchronized (BundleMetadata.class) {
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
