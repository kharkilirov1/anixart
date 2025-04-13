package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class LabelDescriptor extends GeneratedMessageLite<LabelDescriptor, Builder> implements LabelDescriptorOrBuilder {
    private static final LabelDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<LabelDescriptor> PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private int valueType_;
    private String key_ = "";
    private String description_ = "";

    /* renamed from: com.google.api.LabelDescriptor$1 */
    public static /* synthetic */ class C15131 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20380a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20380a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20380a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20380a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20380a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20380a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20380a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20380a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LabelDescriptor, Builder> implements LabelDescriptorOrBuilder {
        public Builder() {
            super(LabelDescriptor.DEFAULT_INSTANCE);
        }

        public Builder(C15131 c15131) {
            super(LabelDescriptor.DEFAULT_INSTANCE);
        }
    }

    public enum ValueType implements Internal.EnumLite {
        STRING(0),
        BOOL(1),
        INT64(2),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f20386b;

        /* renamed from: com.google.api.LabelDescriptor$ValueType$1 */
        public class C15141 implements Internal.EnumLiteMap<ValueType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public ValueType mo11029a(int i2) {
                return ValueType.m11056a(i2);
            }
        }

        public static final class ValueTypeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return ValueType.m11056a(i2) != null;
            }
        }

        ValueType(int i2) {
            this.f20386b = i2;
        }

        /* renamed from: a */
        public static ValueType m11056a(int i2) {
            if (i2 == 0) {
                return STRING;
            }
            if (i2 == 1) {
                return BOOL;
            }
            if (i2 != 2) {
                return null;
            }
            return INT64;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f20386b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        LabelDescriptor labelDescriptor = new LabelDescriptor();
        DEFAULT_INSTANCE = labelDescriptor;
        GeneratedMessageLite.m13417F(LabelDescriptor.class, labelDescriptor);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"key_", "valueType_", "description_"});
            case NEW_MUTABLE_INSTANCE:
                return new LabelDescriptor();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<LabelDescriptor> parser = PARSER;
                if (parser == null) {
                    synchronized (LabelDescriptor.class) {
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
