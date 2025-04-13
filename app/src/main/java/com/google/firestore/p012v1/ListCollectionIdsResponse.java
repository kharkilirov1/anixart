package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class ListCollectionIdsResponse extends GeneratedMessageLite<ListCollectionIdsResponse, Builder> implements ListCollectionIdsResponseOrBuilder {
    public static final int COLLECTION_IDS_FIELD_NUMBER = 1;
    private static final ListCollectionIdsResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile Parser<ListCollectionIdsResponse> PARSER;
    private Internal.ProtobufList<String> collectionIds_ = GeneratedMessageLite.m13422t();
    private String nextPageToken_ = "";

    /* renamed from: com.google.firestore.v1.ListCollectionIdsResponse$1 */
    public static /* synthetic */ class C22071 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23537a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23537a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23537a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23537a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23537a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23537a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23537a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23537a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListCollectionIdsResponse, Builder> implements ListCollectionIdsResponseOrBuilder {
        public Builder() {
            super(ListCollectionIdsResponse.DEFAULT_INSTANCE);
        }

        public Builder(C22071 c22071) {
            super(ListCollectionIdsResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        ListCollectionIdsResponse listCollectionIdsResponse = new ListCollectionIdsResponse();
        DEFAULT_INSTANCE = listCollectionIdsResponse;
        GeneratedMessageLite.m13417F(ListCollectionIdsResponse.class, listCollectionIdsResponse);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"collectionIds_", "nextPageToken_"});
            case NEW_MUTABLE_INSTANCE:
                return new ListCollectionIdsResponse();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ListCollectionIdsResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (ListCollectionIdsResponse.class) {
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
