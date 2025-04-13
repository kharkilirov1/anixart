package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Property extends GeneratedMessageLite<Property, Builder> implements PropertyOrBuilder {
    private static final Property DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Property> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    private String name_ = "";
    private String description_ = "";

    /* renamed from: com.google.api.Property$1 */
    public static /* synthetic */ class C15301 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20429a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20429a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20429a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20429a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20429a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20429a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20429a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20429a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Property, Builder> implements PropertyOrBuilder {
        public Builder() {
            super(Property.DEFAULT_INSTANCE);
        }

        public Builder(C15301 c15301) {
            super(Property.DEFAULT_INSTANCE);
        }
    }

    public enum PropertyType implements Internal.EnumLite {
        UNSPECIFIED(0),
        INT64(1),
        BOOL(2),
        STRING(3),
        DOUBLE(4),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f20437b;

        /* renamed from: com.google.api.Property$PropertyType$1 */
        public class C15311 implements Internal.EnumLiteMap<PropertyType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public PropertyType mo11029a(int i2) {
                return PropertyType.m11076a(i2);
            }
        }

        public static final class PropertyTypeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return PropertyType.m11076a(i2) != null;
            }
        }

        PropertyType(int i2) {
            this.f20437b = i2;
        }

        /* renamed from: a */
        public static PropertyType m11076a(int i2) {
            if (i2 == 0) {
                return UNSPECIFIED;
            }
            if (i2 == 1) {
                return INT64;
            }
            if (i2 == 2) {
                return BOOL;
            }
            if (i2 == 3) {
                return STRING;
            }
            if (i2 != 4) {
                return null;
            }
            return DOUBLE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f20437b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Property property = new Property();
        DEFAULT_INSTANCE = property;
        GeneratedMessageLite.m13417F(Property.class, property);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"name_", "type_", "description_"});
            case NEW_MUTABLE_INSTANCE:
                return new Property();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Property> parser = PARSER;
                if (parser == null) {
                    synchronized (Property.class) {
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
