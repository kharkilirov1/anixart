package com.google.firestore.p012v1;

import com.google.firestore.p012v1.MapValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.NullValue;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final Value DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile Parser<Value> PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* renamed from: com.google.firestore.v1.Value$1 */
    public static /* synthetic */ class C22271 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23621a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23621a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23621a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23621a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23621a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23621a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23621a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23621a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        public Builder() {
            super(Value.DEFAULT_INSTANCE);
        }

        /* renamed from: r */
        public Builder m12816r(double d) {
            m13441n();
            Value.m12802L((Value) this.f24185c, d);
            return this;
        }

        /* renamed from: s */
        public Builder m12817s(MapValue.Builder builder) {
            m13441n();
            Value.m12800J((Value) this.f24185c, builder.mo13437A());
            return this;
        }

        /* renamed from: t */
        public Builder m12818t(MapValue mapValue) {
            m13441n();
            Value.m12800J((Value) this.f24185c, mapValue);
            return this;
        }

        public Builder(C22271 c22271) {
            super(Value.DEFAULT_INSTANCE);
        }
    }

    public enum ValueTypeCase {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        VALUETYPE_NOT_SET(0);

        ValueTypeCase(int i2) {
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.m13417F(Value.class, value);
    }

    /* renamed from: I */
    public static void m12799I(Value value, String str) {
        Objects.requireNonNull(value);
        Objects.requireNonNull(str);
        value.valueTypeCase_ = 17;
        value.valueType_ = str;
    }

    /* renamed from: J */
    public static void m12800J(Value value, MapValue mapValue) {
        Objects.requireNonNull(value);
        Objects.requireNonNull(mapValue);
        value.valueType_ = mapValue;
        value.valueTypeCase_ = 6;
    }

    /* renamed from: K */
    public static void m12801K(Value value, NullValue nullValue) {
        Objects.requireNonNull(value);
        value.valueType_ = Integer.valueOf(nullValue.mo11028x());
        value.valueTypeCase_ = 11;
    }

    /* renamed from: L */
    public static void m12802L(Value value, double d) {
        value.valueTypeCase_ = 3;
        value.valueType_ = Double.valueOf(d);
    }

    /* renamed from: P */
    public static Value m12803P() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Y */
    public static Builder m12804Y() {
        return DEFAULT_INSTANCE.m13434o();
    }

    /* renamed from: M */
    public ArrayValue m12805M() {
        return this.valueTypeCase_ == 9 ? (ArrayValue) this.valueType_ : ArrayValue.m12735I();
    }

    /* renamed from: N */
    public boolean m12806N() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    /* renamed from: O */
    public ByteString m12807O() {
        return this.valueTypeCase_ == 18 ? (ByteString) this.valueType_ : ByteString.f23981c;
    }

    /* renamed from: Q */
    public double m12808Q() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: R */
    public LatLng m12809R() {
        return this.valueTypeCase_ == 8 ? (LatLng) this.valueType_ : LatLng.m13788I();
    }

    /* renamed from: S */
    public long m12810S() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    /* renamed from: T */
    public MapValue m12811T() {
        return this.valueTypeCase_ == 6 ? (MapValue) this.valueType_ : MapValue.m12765J();
    }

    /* renamed from: U */
    public String m12812U() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    /* renamed from: V */
    public String m12813V() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    /* renamed from: W */
    public Timestamp m12814W() {
        return this.valueTypeCase_ == 10 ? (Timestamp) this.valueType_ : Timestamp.m13641I();
    }

    /* renamed from: X */
    public ValueTypeCase m12815X() {
        int i2 = this.valueTypeCase_;
        if (i2 == 0) {
            return ValueTypeCase.VALUETYPE_NOT_SET;
        }
        if (i2 == 1) {
            return ValueTypeCase.BOOLEAN_VALUE;
        }
        if (i2 == 2) {
            return ValueTypeCase.INTEGER_VALUE;
        }
        if (i2 == 3) {
            return ValueTypeCase.DOUBLE_VALUE;
        }
        if (i2 == 5) {
            return ValueTypeCase.REFERENCE_VALUE;
        }
        if (i2 == 6) {
            return ValueTypeCase.MAP_VALUE;
        }
        if (i2 == 17) {
            return ValueTypeCase.STRING_VALUE;
        }
        if (i2 == 18) {
            return ValueTypeCase.BYTES_VALUE;
        }
        switch (i2) {
            case 8:
                return ValueTypeCase.GEO_POINT_VALUE;
            case 9:
                return ValueTypeCase.ARRAY_VALUE;
            case 10:
                return ValueTypeCase.TIMESTAMP_VALUE;
            case 11:
                return ValueTypeCase.NULL_VALUE;
            default:
                return null;
        }
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", MapValue.class, LatLng.class, ArrayValue.class, Timestamp.class});
            case NEW_MUTABLE_INSTANCE:
                return new Value();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Value> parser = PARSER;
                if (parser == null) {
                    synchronized (Value.class) {
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
