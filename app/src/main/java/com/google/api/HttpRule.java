package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class HttpRule extends GeneratedMessageLite<HttpRule, Builder> implements HttpRuleOrBuilder {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    private static final HttpRule DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile Parser<HttpRule> PARSER = null;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object pattern_;
    private int patternCase_ = 0;
    private String selector_ = "";
    private String body_ = "";
    private String responseBody_ = "";
    private Internal.ProtobufList<HttpRule> additionalBindings_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.HttpRule$1 */
    public static /* synthetic */ class C15111 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20376a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20376a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20376a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20376a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20376a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20376a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20376a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20376a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<HttpRule, Builder> implements HttpRuleOrBuilder {
        public Builder() {
            super(HttpRule.DEFAULT_INSTANCE);
        }

        public Builder(C15111 c15111) {
            super(HttpRule.DEFAULT_INSTANCE);
        }
    }

    public enum PatternCase {
        /* JADX INFO: Fake field, exist only in values array */
        GET(2),
        /* JADX INFO: Fake field, exist only in values array */
        PUT(3),
        /* JADX INFO: Fake field, exist only in values array */
        POST(4),
        /* JADX INFO: Fake field, exist only in values array */
        DELETE(5),
        /* JADX INFO: Fake field, exist only in values array */
        PATCH(6),
        /* JADX INFO: Fake field, exist only in values array */
        CUSTOM(8),
        /* JADX INFO: Fake field, exist only in values array */
        PATTERN_NOT_SET(0);

        PatternCase(int i2) {
        }
    }

    static {
        HttpRule httpRule = new HttpRule();
        DEFAULT_INSTANCE = httpRule;
        GeneratedMessageLite.m13417F(HttpRule.class, httpRule);
    }

    /* renamed from: I */
    public static HttpRule m11053I() {
        return DEFAULT_INSTANCE;
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȉ\b<\u0000\u000b\u001b\fȈ", new Object[]{"pattern_", "patternCase_", "selector_", "body_", CustomHttpPattern.class, "additionalBindings_", HttpRule.class, "responseBody_"});
            case NEW_MUTABLE_INSTANCE:
                return new HttpRule();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<HttpRule> parser = PARSER;
                if (parser == null) {
                    synchronized (HttpRule.class) {
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
