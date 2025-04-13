package com.google.longrunning;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class ListOperationsResponse extends GeneratedMessageLite<ListOperationsResponse, Builder> implements ListOperationsResponseOrBuilder {
    private static final ListOperationsResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile Parser<ListOperationsResponse> PARSER;
    private Internal.ProtobufList<Operation> operations_ = GeneratedMessageLite.m13422t();
    private String nextPageToken_ = "";

    /* renamed from: com.google.longrunning.ListOperationsResponse$1 */
    public static /* synthetic */ class C23351 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23945a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23945a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23945a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23945a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23945a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23945a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23945a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23945a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListOperationsResponse, Builder> implements ListOperationsResponseOrBuilder {
        public Builder() {
            super(ListOperationsResponse.DEFAULT_INSTANCE);
        }

        public Builder(C23351 c23351) {
            super(ListOperationsResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        ListOperationsResponse listOperationsResponse = new ListOperationsResponse();
        DEFAULT_INSTANCE = listOperationsResponse;
        GeneratedMessageLite.m13417F(ListOperationsResponse.class, listOperationsResponse);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"operations_", Operation.class, "nextPageToken_"});
            case NEW_MUTABLE_INSTANCE:
                return new ListOperationsResponse();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ListOperationsResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (ListOperationsResponse.class) {
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
