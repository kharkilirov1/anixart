package com.google.longrunning;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class ListOperationsRequest extends GeneratedMessageLite<ListOperationsRequest, Builder> implements ListOperationsRequestOrBuilder {
    private static final ListOperationsRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile Parser<ListOperationsRequest> PARSER;
    private int pageSize_;
    private String name_ = "";
    private String filter_ = "";
    private String pageToken_ = "";

    /* renamed from: com.google.longrunning.ListOperationsRequest$1 */
    public static /* synthetic */ class C23341 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23944a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23944a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23944a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23944a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23944a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23944a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23944a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23944a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListOperationsRequest, Builder> implements ListOperationsRequestOrBuilder {
        public Builder() {
            super(ListOperationsRequest.DEFAULT_INSTANCE);
        }

        public Builder(C23341 c23341) {
            super(ListOperationsRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        ListOperationsRequest listOperationsRequest = new ListOperationsRequest();
        DEFAULT_INSTANCE = listOperationsRequest;
        GeneratedMessageLite.m13417F(ListOperationsRequest.class, listOperationsRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ", new Object[]{"filter_", "pageSize_", "pageToken_", "name_"});
            case NEW_MUTABLE_INSTANCE:
                return new ListOperationsRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ListOperationsRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (ListOperationsRequest.class) {
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
