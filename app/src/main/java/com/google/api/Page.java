package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Page extends GeneratedMessageLite<Page, Builder> implements PageOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Page DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Page> PARSER = null;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String name_ = "";
    private String content_ = "";
    private Internal.ProtobufList<Page> subpages_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.Page$1 */
    public static /* synthetic */ class C15281 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20427a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20427a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20427a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20427a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20427a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20427a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20427a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20427a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Page, Builder> implements PageOrBuilder {
        public Builder() {
            super(Page.DEFAULT_INSTANCE);
        }

        public Builder(C15281 c15281) {
            super(Page.DEFAULT_INSTANCE);
        }
    }

    static {
        Page page = new Page();
        DEFAULT_INSTANCE = page;
        GeneratedMessageLite.m13417F(Page.class, page);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "content_", "subpages_", Page.class});
            case NEW_MUTABLE_INSTANCE:
                return new Page();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Page> parser = PARSER;
                if (parser == null) {
                    synchronized (Page.class) {
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
