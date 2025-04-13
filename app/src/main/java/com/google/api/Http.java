package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Http extends GeneratedMessageLite<Http, Builder> implements HttpOrBuilder {
    private static final Http DEFAULT_INSTANCE;
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    private static volatile Parser<Http> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private boolean fullyDecodeReservedExpansion_;
    private Internal.ProtobufList<HttpRule> rules_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.Http$1 */
    public static /* synthetic */ class C15091 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20374a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20374a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20374a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20374a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20374a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20374a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20374a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20374a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Http, Builder> implements HttpOrBuilder {
        public Builder() {
            super(Http.DEFAULT_INSTANCE);
        }

        public Builder(C15091 c15091) {
            super(Http.DEFAULT_INSTANCE);
        }
    }

    static {
        Http http = new Http();
        DEFAULT_INSTANCE = http;
        GeneratedMessageLite.m13417F(Http.class, http);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"rules_", HttpRule.class, "fullyDecodeReservedExpansion_"});
            case NEW_MUTABLE_INSTANCE:
                return new Http();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Http> parser = PARSER;
                if (parser == null) {
                    synchronized (Http.class) {
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
