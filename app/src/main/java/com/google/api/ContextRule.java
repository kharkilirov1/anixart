package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class ContextRule extends GeneratedMessageLite<ContextRule, Builder> implements ContextRuleOrBuilder {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final ContextRule DEFAULT_INSTANCE;
    private static volatile Parser<ContextRule> PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private Internal.ProtobufList<String> requested_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<String> provided_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<String> allowedRequestExtensions_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<String> allowedResponseExtensions_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.ContextRule$1 */
    public static /* synthetic */ class C15011 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20356a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20356a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20356a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20356a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20356a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20356a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20356a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20356a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ContextRule, Builder> implements ContextRuleOrBuilder {
        public Builder() {
            super(ContextRule.DEFAULT_INSTANCE);
        }

        public Builder(C15011 c15011) {
            super(ContextRule.DEFAULT_INSTANCE);
        }
    }

    static {
        ContextRule contextRule = new ContextRule();
        DEFAULT_INSTANCE = contextRule;
        GeneratedMessageLite.m13417F(ContextRule.class, contextRule);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ț\u0005Ț", new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"});
            case NEW_MUTABLE_INSTANCE:
                return new ContextRule();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ContextRule> parser = PARSER;
                if (parser == null) {
                    synchronized (ContextRule.class) {
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
