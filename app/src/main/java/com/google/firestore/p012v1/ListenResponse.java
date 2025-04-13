package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class ListenResponse extends GeneratedMessageLite<ListenResponse, Builder> implements ListenResponseOrBuilder {
    private static final ListenResponse DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile Parser<ListenResponse> PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    /* renamed from: com.google.firestore.v1.ListenResponse$1 */
    public static /* synthetic */ class C22111 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23544a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23544a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23544a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23544a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23544a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23544a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23544a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23544a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListenResponse, Builder> implements ListenResponseOrBuilder {
        public Builder() {
            super(ListenResponse.DEFAULT_INSTANCE);
        }

        public Builder(C22111 c22111) {
            super(ListenResponse.DEFAULT_INSTANCE);
        }
    }

    public enum ResponseTypeCase {
        TARGET_CHANGE(2),
        DOCUMENT_CHANGE(3),
        DOCUMENT_DELETE(4),
        DOCUMENT_REMOVE(6),
        FILTER(5),
        RESPONSETYPE_NOT_SET(0);

        ResponseTypeCase(int i2) {
        }
    }

    static {
        ListenResponse listenResponse = new ListenResponse();
        DEFAULT_INSTANCE = listenResponse;
        GeneratedMessageLite.m13417F(ListenResponse.class, listenResponse);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", TargetChange.class, DocumentChange.class, DocumentDelete.class, ExistenceFilter.class, DocumentRemove.class});
            case NEW_MUTABLE_INSTANCE:
                return new ListenResponse();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ListenResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (ListenResponse.class) {
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
