package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Endpoint extends GeneratedMessageLite<Endpoint, Builder> implements EndpointOrBuilder {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    private static final Endpoint DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Endpoint> PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 101;
    private boolean allowCors_;
    private String name_ = "";
    private Internal.ProtobufList<String> aliases_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<String> features_ = GeneratedMessageLite.m13422t();
    private String target_ = "";

    /* renamed from: com.google.api.Endpoint$1 */
    public static /* synthetic */ class C15071 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20363a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20363a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20363a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20363a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20363a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20363a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20363a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20363a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Endpoint, Builder> implements EndpointOrBuilder {
        public Builder() {
            super(Endpoint.DEFAULT_INSTANCE);
        }

        public Builder(C15071 c15071) {
            super(Endpoint.DEFAULT_INSTANCE);
        }
    }

    static {
        Endpoint endpoint = new Endpoint();
        DEFAULT_INSTANCE = endpoint;
        GeneratedMessageLite.m13417F(Endpoint.class, endpoint);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001e\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0004Ț\u0005\u0007eȈ", new Object[]{"name_", "aliases_", "features_", "allowCors_", "target_"});
            case NEW_MUTABLE_INSTANCE:
                return new Endpoint();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Endpoint> parser = PARSER;
                if (parser == null) {
                    synchronized (Endpoint.class) {
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
