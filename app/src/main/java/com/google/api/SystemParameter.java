package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class SystemParameter extends GeneratedMessageLite<SystemParameter, Builder> implements SystemParameterOrBuilder {
    private static final SystemParameter DEFAULT_INSTANCE;
    public static final int HTTP_HEADER_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<SystemParameter> PARSER = null;
    public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
    private String name_ = "";
    private String httpHeader_ = "";
    private String urlQueryParameter_ = "";

    /* renamed from: com.google.api.SystemParameter$1 */
    public static /* synthetic */ class C15391 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20451a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20451a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20451a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20451a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20451a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20451a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20451a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20451a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<SystemParameter, Builder> implements SystemParameterOrBuilder {
        public Builder() {
            super(SystemParameter.DEFAULT_INSTANCE);
        }

        public Builder(C15391 c15391) {
            super(SystemParameter.DEFAULT_INSTANCE);
        }
    }

    static {
        SystemParameter systemParameter = new SystemParameter();
        DEFAULT_INSTANCE = systemParameter;
        GeneratedMessageLite.m13417F(SystemParameter.class, systemParameter);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "httpHeader_", "urlQueryParameter_"});
            case NEW_MUTABLE_INSTANCE:
                return new SystemParameter();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<SystemParameter> parser = PARSER;
                if (parser == null) {
                    synchronized (SystemParameter.class) {
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
