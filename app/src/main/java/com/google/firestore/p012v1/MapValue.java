package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class MapValue extends GeneratedMessageLite<MapValue, Builder> implements MapValueOrBuilder {
    private static final MapValue DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<MapValue> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.f24269c;

    /* renamed from: com.google.firestore.v1.MapValue$1 */
    public static /* synthetic */ class C22121 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23552a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23552a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23552a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23552a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23552a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23552a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23552a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23552a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MapValue, Builder> implements MapValueOrBuilder {
        public Builder() {
            super(MapValue.DEFAULT_INSTANCE);
        }

        /* renamed from: r */
        public Builder m12771r(String str, Value value) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(value);
            m13441n();
            ((MapFieldLite) MapValue.m12764I((MapValue) this.f24185c)).put(str, value);
            return this;
        }

        public Builder(C22121 c22121) {
            super(MapValue.DEFAULT_INSTANCE);
        }
    }

    public static final class FieldsDefaultEntryHolder {

        /* renamed from: a */
        public static final MapEntryLite<String, Value> f23553a = new MapEntryLite<>(WireFormat.FieldType.f24409l, "", WireFormat.FieldType.f24411n, Value.m12803P());
    }

    static {
        MapValue mapValue = new MapValue();
        DEFAULT_INSTANCE = mapValue;
        GeneratedMessageLite.m13417F(MapValue.class, mapValue);
    }

    /* renamed from: I */
    public static Map m12764I(MapValue mapValue) {
        MapFieldLite<String, Value> mapFieldLite = mapValue.fields_;
        if (!mapFieldLite.f24270b) {
            mapValue.fields_ = mapFieldLite.m13492c();
        }
        return mapValue.fields_;
    }

    /* renamed from: J */
    public static MapValue m12765J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: O */
    public static Builder m12766O() {
        return DEFAULT_INSTANCE.m13434o();
    }

    /* renamed from: K */
    public int m12767K() {
        return this.fields_.size();
    }

    /* renamed from: L */
    public Map<String, Value> m12768L() {
        return Collections.unmodifiableMap(this.fields_);
    }

    /* renamed from: M */
    public Value m12769M(String str, Value value) {
        Objects.requireNonNull(str);
        MapFieldLite<String, Value> mapFieldLite = this.fields_;
        if (mapFieldLite.containsKey(str)) {
            return mapFieldLite.get(str);
        }
        return null;
    }

    /* renamed from: N */
    public Value m12770N(String str) {
        Objects.requireNonNull(str);
        MapFieldLite<String, Value> mapFieldLite = this.fields_;
        if (mapFieldLite.containsKey(str)) {
            return mapFieldLite.get(str);
        }
        throw new IllegalArgumentException();
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", FieldsDefaultEntryHolder.f23553a});
            case NEW_MUTABLE_INSTANCE:
                return new MapValue();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<MapValue> parser = PARSER;
                if (parser == null) {
                    synchronized (MapValue.class) {
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
