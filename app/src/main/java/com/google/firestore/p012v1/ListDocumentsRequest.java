package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class ListDocumentsRequest extends GeneratedMessageLite<ListDocumentsRequest, Builder> implements ListDocumentsRequestOrBuilder {
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final ListDocumentsRequest DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 7;
    public static final int ORDER_BY_FIELD_NUMBER = 6;
    public static final int PAGE_SIZE_FIELD_NUMBER = 3;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<ListDocumentsRequest> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 10;
    public static final int SHOW_MISSING_FIELD_NUMBER = 12;
    public static final int TRANSACTION_FIELD_NUMBER = 8;
    private Object consistencySelector_;
    private DocumentMask mask_;
    private int pageSize_;
    private boolean showMissing_;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";
    private String collectionId_ = "";
    private String pageToken_ = "";
    private String orderBy_ = "";

    /* renamed from: com.google.firestore.v1.ListDocumentsRequest$1 */
    public static /* synthetic */ class C22081 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23538a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23538a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23538a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23538a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23538a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23538a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23538a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23538a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListDocumentsRequest, Builder> implements ListDocumentsRequestOrBuilder {
        public Builder() {
            super(ListDocumentsRequest.DEFAULT_INSTANCE);
        }

        public Builder(C22081 c22081) {
            super(ListDocumentsRequest.DEFAULT_INSTANCE);
        }
    }

    public enum ConsistencySelectorCase {
        /* JADX INFO: Fake field, exist only in values array */
        TRANSACTION(8),
        /* JADX INFO: Fake field, exist only in values array */
        READ_TIME(10),
        /* JADX INFO: Fake field, exist only in values array */
        CONSISTENCYSELECTOR_NOT_SET(0);

        ConsistencySelectorCase(int i2) {
        }
    }

    static {
        ListDocumentsRequest listDocumentsRequest = new ListDocumentsRequest();
        DEFAULT_INSTANCE = listDocumentsRequest;
        GeneratedMessageLite.m13417F(ListDocumentsRequest.class, listDocumentsRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\f\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\t\b=\u0000\n<\u0000\f\u0007", new Object[]{"consistencySelector_", "consistencySelectorCase_", "parent_", "collectionId_", "pageSize_", "pageToken_", "orderBy_", "mask_", Timestamp.class, "showMissing_"});
            case NEW_MUTABLE_INSTANCE:
                return new ListDocumentsRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ListDocumentsRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (ListDocumentsRequest.class) {
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
