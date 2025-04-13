package com.google.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class Money extends GeneratedMessageLite<Money, Builder> implements MoneyOrBuilder {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    private static final Money DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 3;
    private static volatile Parser<Money> PARSER = null;
    public static final int UNITS_FIELD_NUMBER = 2;
    private String currencyCode_ = "";
    private int nanos_;
    private long units_;

    /* renamed from: com.google.type.Money$1 */
    public static /* synthetic */ class C24391 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24509a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24509a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24509a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24509a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24509a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24509a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24509a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24509a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Money, Builder> implements MoneyOrBuilder {
        public Builder() {
            super(Money.DEFAULT_INSTANCE);
        }

        public Builder(C24391 c24391) {
            super(Money.DEFAULT_INSTANCE);
        }
    }

    static {
        Money money = new Money();
        DEFAULT_INSTANCE = money;
        GeneratedMessageLite.m13417F(Money.class, money);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"currencyCode_", "units_", "nanos_"});
            case NEW_MUTABLE_INSTANCE:
                return new Money();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Money> parser = PARSER;
                if (parser == null) {
                    synchronized (Money.class) {
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
