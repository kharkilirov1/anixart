package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Documentation extends GeneratedMessageLite<Documentation, Builder> implements DocumentationOrBuilder {
    private static final Documentation DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile Parser<Documentation> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String summary_ = "";
    private Internal.ProtobufList<Page> pages_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<DocumentationRule> rules_ = GeneratedMessageLite.m13422t();
    private String documentationRootUrl_ = "";
    private String overview_ = "";

    /* renamed from: com.google.api.Documentation$1 */
    public static /* synthetic */ class C15051 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20361a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20361a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20361a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20361a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20361a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20361a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20361a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20361a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Documentation, Builder> implements DocumentationOrBuilder {
        public Builder() {
            super(Documentation.DEFAULT_INSTANCE);
        }

        public Builder(C15051 c15051) {
            super(Documentation.DEFAULT_INSTANCE);
        }
    }

    static {
        Documentation documentation = new Documentation();
        DEFAULT_INSTANCE = documentation;
        GeneratedMessageLite.m13417F(Documentation.class, documentation);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005\u001b", new Object[]{"summary_", "overview_", "rules_", DocumentationRule.class, "documentationRootUrl_", "pages_", Page.class});
            case NEW_MUTABLE_INSTANCE:
                return new Documentation();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Documentation> parser = PARSER;
                if (parser == null) {
                    synchronized (Documentation.class) {
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
