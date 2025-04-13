package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class LocalizedMessage extends GeneratedMessageLite<LocalizedMessage, Builder> implements LocalizedMessageOrBuilder {
    private static final LocalizedMessage DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<LocalizedMessage> PARSER;
    private String locale_ = "";
    private String message_ = "";

    /* renamed from: com.google.rpc.LocalizedMessage$1 */
    public static /* synthetic */ class C24231 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24462a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24462a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24462a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24462a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24462a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24462a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24462a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24462a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LocalizedMessage, Builder> implements LocalizedMessageOrBuilder {
        public Builder() {
            super(LocalizedMessage.DEFAULT_INSTANCE);
        }

        public Builder(C24231 c24231) {
            super(LocalizedMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        LocalizedMessage localizedMessage = new LocalizedMessage();
        DEFAULT_INSTANCE = localizedMessage;
        GeneratedMessageLite.m13417F(LocalizedMessage.class, localizedMessage);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"locale_", "message_"});
            case NEW_MUTABLE_INSTANCE:
                return new LocalizedMessage();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<LocalizedMessage> parser = PARSER;
                if (parser == null) {
                    synchronized (LocalizedMessage.class) {
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
