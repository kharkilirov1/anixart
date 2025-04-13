package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;

/* loaded from: classes2.dex */
public final class Struct extends GeneratedMessageLite<Struct, Builder> implements StructOrBuilder {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<Struct> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.f24269c;

    /* renamed from: com.google.protobuf.Struct$1 */
    public static /* synthetic */ class C23981 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24365a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24365a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24365a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24365a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24365a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24365a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24365a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24365a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Struct, Builder> implements StructOrBuilder {
        public Builder() {
            super(Struct.DEFAULT_INSTANCE);
        }

        public Builder(C23981 c23981) {
            super(Struct.DEFAULT_INSTANCE);
        }
    }

    public static final class FieldsDefaultEntryHolder {

        /* renamed from: a */
        public static final MapEntryLite<String, Value> f24366a = new MapEntryLite<>(WireFormat.FieldType.f24409l, "", WireFormat.FieldType.f24411n, Value.m13754I());
    }

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        GeneratedMessageLite.m13417F(Struct.class, struct);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", FieldsDefaultEntryHolder.f24366a});
            case NEW_MUTABLE_INSTANCE:
                return new Struct();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Struct> parser = PARSER;
                if (parser == null) {
                    synchronized (Struct.class) {
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
