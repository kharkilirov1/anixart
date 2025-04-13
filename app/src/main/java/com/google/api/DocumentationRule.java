package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class DocumentationRule extends GeneratedMessageLite<DocumentationRule, Builder> implements DocumentationRuleOrBuilder {
    private static final DocumentationRule DEFAULT_INSTANCE;
    public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser<DocumentationRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private String description_ = "";
    private String deprecationDescription_ = "";

    /* renamed from: com.google.api.DocumentationRule$1 */
    public static /* synthetic */ class C15061 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20362a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20362a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20362a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20362a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20362a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20362a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20362a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20362a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DocumentationRule, Builder> implements DocumentationRuleOrBuilder {
        public Builder() {
            super(DocumentationRule.DEFAULT_INSTANCE);
        }

        public Builder(C15061 c15061) {
            super(DocumentationRule.DEFAULT_INSTANCE);
        }
    }

    static {
        DocumentationRule documentationRule = new DocumentationRule();
        DEFAULT_INSTANCE = documentationRule;
        GeneratedMessageLite.m13417F(DocumentationRule.class, documentationRule);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"selector_", "description_", "deprecationDescription_"});
            case NEW_MUTABLE_INSTANCE:
                return new DocumentationRule();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<DocumentationRule> parser = PARSER;
                if (parser == null) {
                    synchronized (DocumentationRule.class) {
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
