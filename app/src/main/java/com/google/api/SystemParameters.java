package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class SystemParameters extends GeneratedMessageLite<SystemParameters, Builder> implements SystemParametersOrBuilder {
    private static final SystemParameters DEFAULT_INSTANCE;
    private static volatile Parser<SystemParameters> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<SystemParameterRule> rules_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.SystemParameters$1 */
    public static /* synthetic */ class C15411 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20453a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20453a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20453a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20453a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20453a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20453a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20453a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20453a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<SystemParameters, Builder> implements SystemParametersOrBuilder {
        public Builder() {
            super(SystemParameters.DEFAULT_INSTANCE);
        }

        public Builder(C15411 c15411) {
            super(SystemParameters.DEFAULT_INSTANCE);
        }
    }

    static {
        SystemParameters systemParameters = new SystemParameters();
        DEFAULT_INSTANCE = systemParameters;
        GeneratedMessageLite.m13417F(SystemParameters.class, systemParameters);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", SystemParameterRule.class});
            case NEW_MUTABLE_INSTANCE:
                return new SystemParameters();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<SystemParameters> parser = PARSER;
                if (parser == null) {
                    synchronized (SystemParameters.class) {
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
