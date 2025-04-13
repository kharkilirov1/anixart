package com.google.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class Fraction extends GeneratedMessageLite<Fraction, Builder> implements FractionOrBuilder {
    private static final Fraction DEFAULT_INSTANCE;
    public static final int DENOMINATOR_FIELD_NUMBER = 2;
    public static final int NUMERATOR_FIELD_NUMBER = 1;
    private static volatile Parser<Fraction> PARSER;
    private long denominator_;
    private long numerator_;

    /* renamed from: com.google.type.Fraction$1 */
    public static /* synthetic */ class C24371 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24507a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24507a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24507a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24507a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24507a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24507a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24507a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24507a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Fraction, Builder> implements FractionOrBuilder {
        public Builder() {
            super(Fraction.DEFAULT_INSTANCE);
        }

        public Builder(C24371 c24371) {
            super(Fraction.DEFAULT_INSTANCE);
        }
    }

    static {
        Fraction fraction = new Fraction();
        DEFAULT_INSTANCE = fraction;
        GeneratedMessageLite.m13417F(Fraction.class, fraction);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"numerator_", "denominator_"});
            case NEW_MUTABLE_INSTANCE:
                return new Fraction();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Fraction> parser = PARSER;
                if (parser == null) {
                    synchronized (Fraction.class) {
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
