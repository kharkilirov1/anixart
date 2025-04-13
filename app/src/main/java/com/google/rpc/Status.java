package com.google.rpc;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class Status extends GeneratedMessageLite<Status, Builder> implements StatusOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Status DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Status> PARSER;
    private int code_;
    private String message_ = "";
    private Internal.ProtobufList<Any> details_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.rpc.Status$1 */
    public static /* synthetic */ class C24291 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24468a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24468a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24468a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24468a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24468a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24468a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24468a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24468a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Status, Builder> implements StatusOrBuilder {
        public Builder() {
            super(Status.DEFAULT_INSTANCE);
        }

        public Builder(C24291 c24291) {
            super(Status.DEFAULT_INSTANCE);
        }
    }

    static {
        Status status = new Status();
        DEFAULT_INSTANCE = status;
        GeneratedMessageLite.m13417F(Status.class, status);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", Any.class});
            case NEW_MUTABLE_INSTANCE:
                return new Status();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Status> parser = PARSER;
                if (parser == null) {
                    synchronized (Status.class) {
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
