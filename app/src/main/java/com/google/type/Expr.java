package com.google.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class Expr extends GeneratedMessageLite<Expr, Builder> implements ExprOrBuilder {
    private static final Expr DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile Parser<Expr> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String expression_ = "";
    private String title_ = "";
    private String description_ = "";
    private String location_ = "";

    /* renamed from: com.google.type.Expr$1 */
    public static /* synthetic */ class C24361 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24506a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24506a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24506a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24506a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24506a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24506a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24506a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24506a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Expr, Builder> implements ExprOrBuilder {
        public Builder() {
            super(Expr.DEFAULT_INSTANCE);
        }

        public Builder(C24361 c24361) {
            super(Expr.DEFAULT_INSTANCE);
        }
    }

    static {
        Expr expr = new Expr();
        DEFAULT_INSTANCE = expr;
        GeneratedMessageLite.m13417F(Expr.class, expr);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"expression_", "title_", "description_", "location_"});
            case NEW_MUTABLE_INSTANCE:
                return new Expr();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Expr> parser = PARSER;
                if (parser == null) {
                    synchronized (Expr.class) {
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
