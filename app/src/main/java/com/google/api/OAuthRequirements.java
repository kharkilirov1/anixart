package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class OAuthRequirements extends GeneratedMessageLite<OAuthRequirements, Builder> implements OAuthRequirementsOrBuilder {
    public static final int CANONICAL_SCOPES_FIELD_NUMBER = 1;
    private static final OAuthRequirements DEFAULT_INSTANCE;
    private static volatile Parser<OAuthRequirements> PARSER;
    private String canonicalScopes_ = "";

    /* renamed from: com.google.api.OAuthRequirements$1 */
    public static /* synthetic */ class C15271 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20426a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20426a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20426a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20426a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20426a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20426a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20426a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20426a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<OAuthRequirements, Builder> implements OAuthRequirementsOrBuilder {
        public Builder() {
            super(OAuthRequirements.DEFAULT_INSTANCE);
        }

        public Builder(C15271 c15271) {
            super(OAuthRequirements.DEFAULT_INSTANCE);
        }
    }

    static {
        OAuthRequirements oAuthRequirements = new OAuthRequirements();
        DEFAULT_INSTANCE = oAuthRequirements;
        GeneratedMessageLite.m13417F(OAuthRequirements.class, oAuthRequirements);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"canonicalScopes_"});
            case NEW_MUTABLE_INSTANCE:
                return new OAuthRequirements();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<OAuthRequirements> parser = PARSER;
                if (parser == null) {
                    synchronized (OAuthRequirements.class) {
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
