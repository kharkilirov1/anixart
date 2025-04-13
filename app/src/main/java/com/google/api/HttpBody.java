package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class HttpBody extends GeneratedMessageLite<HttpBody, Builder> implements HttpBodyOrBuilder {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final HttpBody DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private static volatile Parser<HttpBody> PARSER;
    private String contentType_ = "";
    private ByteString data_ = ByteString.f23981c;
    private Internal.ProtobufList<Any> extensions_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.HttpBody$1 */
    public static /* synthetic */ class C15101 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20375a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20375a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20375a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20375a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20375a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20375a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20375a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20375a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<HttpBody, Builder> implements HttpBodyOrBuilder {
        public Builder() {
            super(HttpBody.DEFAULT_INSTANCE);
        }

        public Builder(C15101 c15101) {
            super(HttpBody.DEFAULT_INSTANCE);
        }
    }

    static {
        HttpBody httpBody = new HttpBody();
        DEFAULT_INSTANCE = httpBody;
        GeneratedMessageLite.m13417F(HttpBody.class, httpBody);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b", new Object[]{"contentType_", "data_", "extensions_", Any.class});
            case NEW_MUTABLE_INSTANCE:
                return new HttpBody();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<HttpBody> parser = PARSER;
                if (parser == null) {
                    synchronized (HttpBody.class) {
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
