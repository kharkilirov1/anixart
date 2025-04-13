package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class Help extends GeneratedMessageLite<Help, Builder> implements HelpOrBuilder {
    private static final Help DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile Parser<Help> PARSER;
    private Internal.ProtobufList<Link> links_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.rpc.Help$1 */
    public static /* synthetic */ class C24221 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24461a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24461a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24461a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24461a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24461a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24461a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24461a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24461a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Help, Builder> implements HelpOrBuilder {
        public Builder() {
            super(Help.DEFAULT_INSTANCE);
        }

        public Builder(C24221 c24221) {
            super(Help.DEFAULT_INSTANCE);
        }
    }

    public static final class Link extends GeneratedMessageLite<Link, Builder> implements LinkOrBuilder {
        private static final Link DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        private static volatile Parser<Link> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private String description_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<Link, Builder> implements LinkOrBuilder {
            public Builder() {
                super(Link.DEFAULT_INSTANCE);
            }

            public Builder(C24221 c24221) {
                super(Link.DEFAULT_INSTANCE);
            }
        }

        static {
            Link link = new Link();
            DEFAULT_INSTANCE = link;
            GeneratedMessageLite.m13417F(Link.class, link);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"description_", "url_"});
                case NEW_MUTABLE_INSTANCE:
                    return new Link();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Link> parser = PARSER;
                    if (parser == null) {
                        synchronized (Link.class) {
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

    public interface LinkOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        Help help = new Help();
        DEFAULT_INSTANCE = help;
        GeneratedMessageLite.m13417F(Help.class, help);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"links_", Link.class});
            case NEW_MUTABLE_INSTANCE:
                return new Help();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Help> parser = PARSER;
                if (parser == null) {
                    synchronized (Help.class) {
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
