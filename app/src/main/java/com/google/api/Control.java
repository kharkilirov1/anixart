package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Control extends GeneratedMessageLite<Control, Builder> implements ControlOrBuilder {
    private static final Control DEFAULT_INSTANCE;
    public static final int ENVIRONMENT_FIELD_NUMBER = 1;
    private static volatile Parser<Control> PARSER;
    private String environment_ = "";

    /* renamed from: com.google.api.Control$1 */
    public static /* synthetic */ class C15021 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20357a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20357a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20357a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20357a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20357a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20357a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20357a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20357a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Control, Builder> implements ControlOrBuilder {
        public Builder() {
            super(Control.DEFAULT_INSTANCE);
        }

        public Builder(C15021 c15021) {
            super(Control.DEFAULT_INSTANCE);
        }
    }

    static {
        Control control = new Control();
        DEFAULT_INSTANCE = control;
        GeneratedMessageLite.m13417F(Control.class, control);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"environment_"});
            case NEW_MUTABLE_INSTANCE:
                return new Control();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Control> parser = PARSER;
                if (parser == null) {
                    synchronized (Control.class) {
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
