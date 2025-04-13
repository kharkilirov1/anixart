package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class DescriptorProtos {

    /* renamed from: com.google.protobuf.DescriptorProtos$1 */
    public static /* synthetic */ class C23551 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24053a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24053a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24053a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24053a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24053a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24053a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24053a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24053a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class DescriptorProto extends GeneratedMessageLite<DescriptorProto, Builder> implements DescriptorProtoOrBuilder {
        private static final DescriptorProto DEFAULT_INSTANCE;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private static volatile Parser<DescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private int bitField0_;
        private Internal.ProtobufList<EnumDescriptorProto> enumType_;
        private Internal.ProtobufList<ExtensionRange> extensionRange_;
        private Internal.ProtobufList<FieldDescriptorProto> extension_;
        private Internal.ProtobufList<FieldDescriptorProto> field_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private Internal.ProtobufList<DescriptorProto> nestedType_;
        private Internal.ProtobufList<OneofDescriptorProto> oneofDecl_;
        private MessageOptions options_;
        private Internal.ProtobufList<String> reservedName_;
        private Internal.ProtobufList<ReservedRange> reservedRange_;

        public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProto, Builder> implements DescriptorProtoOrBuilder {
            public Builder() {
                super(DescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(DescriptorProto.DEFAULT_INSTANCE);
            }
        }

        public static final class ExtensionRange extends GeneratedMessageLite<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
            private static final ExtensionRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private static volatile Parser<ExtensionRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized = 2;
            private ExtensionRangeOptions options_;
            private int start_;

            public static final class Builder extends GeneratedMessageLite.Builder<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
                public Builder() {
                    super(ExtensionRange.DEFAULT_INSTANCE);
                }

                public Builder(C23551 c23551) {
                    super(ExtensionRange.DEFAULT_INSTANCE);
                }
            }

            static {
                ExtensionRange extensionRange = new ExtensionRange();
                DEFAULT_INSTANCE = extensionRange;
                GeneratedMessageLite.m13417F(ExtensionRange.class, extensionRange);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            /* renamed from: p */
            public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (methodToInvoke) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case SET_MEMOIZED_IS_INITIALIZED:
                        this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new ExtensionRange();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<ExtensionRange> parser = PARSER;
                        if (parser == null) {
                            synchronized (ExtensionRange.class) {
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

        public interface ExtensionRangeOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class ReservedRange extends GeneratedMessageLite<ReservedRange, Builder> implements ReservedRangeOrBuilder {
            private static final ReservedRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile Parser<ReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            public static final class Builder extends GeneratedMessageLite.Builder<ReservedRange, Builder> implements ReservedRangeOrBuilder {
                public Builder() {
                    super(ReservedRange.DEFAULT_INSTANCE);
                }

                public Builder(C23551 c23551) {
                    super(ReservedRange.DEFAULT_INSTANCE);
                }
            }

            static {
                ReservedRange reservedRange = new ReservedRange();
                DEFAULT_INSTANCE = reservedRange;
                GeneratedMessageLite.m13417F(ReservedRange.class, reservedRange);
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
                        return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new ReservedRange();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<ReservedRange> parser = PARSER;
                        if (parser == null) {
                            synchronized (ReservedRange.class) {
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

        public interface ReservedRangeOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            DescriptorProto descriptorProto = new DescriptorProto();
            DEFAULT_INSTANCE = descriptorProto;
            GeneratedMessageLite.m13417F(DescriptorProto.class, descriptorProto);
        }

        public DescriptorProto() {
            ProtobufArrayList<Object> protobufArrayList = ProtobufArrayList.f24313e;
            this.field_ = protobufArrayList;
            this.extension_ = protobufArrayList;
            this.nestedType_ = protobufArrayList;
            this.enumType_ = protobufArrayList;
            this.extensionRange_ = protobufArrayList;
            this.oneofDecl_ = protobufArrayList;
            this.reservedRange_ = protobufArrayList;
            this.reservedName_ = protobufArrayList;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", FieldDescriptorProto.class, "nestedType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "extensionRange_", ExtensionRange.class, "extension_", FieldDescriptorProto.class, "options_", "oneofDecl_", OneofDescriptorProto.class, "reservedRange_", ReservedRange.class, "reservedName_"});
                case NEW_MUTABLE_INSTANCE:
                    return new DescriptorProto();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<DescriptorProto> parser = PARSER;
                    if (parser == null) {
                        synchronized (DescriptorProto.class) {
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

    public interface DescriptorProtoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class EnumDescriptorProto extends GeneratedMessageLite<EnumDescriptorProto, Builder> implements EnumDescriptorProtoOrBuilder {
        private static final EnumDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<EnumDescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private EnumOptions options_;
        private Internal.ProtobufList<String> reservedName_;
        private Internal.ProtobufList<EnumReservedRange> reservedRange_;
        private Internal.ProtobufList<EnumValueDescriptorProto> value_;

        public static final class Builder extends GeneratedMessageLite.Builder<EnumDescriptorProto, Builder> implements EnumDescriptorProtoOrBuilder {
            public Builder() {
                super(EnumDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(EnumDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        public static final class EnumReservedRange extends GeneratedMessageLite<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
            private static final EnumReservedRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile Parser<EnumReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            public static final class Builder extends GeneratedMessageLite.Builder<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
                public Builder() {
                    super(EnumReservedRange.DEFAULT_INSTANCE);
                }

                public Builder(C23551 c23551) {
                    super(EnumReservedRange.DEFAULT_INSTANCE);
                }
            }

            static {
                EnumReservedRange enumReservedRange = new EnumReservedRange();
                DEFAULT_INSTANCE = enumReservedRange;
                GeneratedMessageLite.m13417F(EnumReservedRange.class, enumReservedRange);
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
                        return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new EnumReservedRange();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<EnumReservedRange> parser = PARSER;
                        if (parser == null) {
                            synchronized (EnumReservedRange.class) {
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

        public interface EnumReservedRangeOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            EnumDescriptorProto enumDescriptorProto = new EnumDescriptorProto();
            DEFAULT_INSTANCE = enumDescriptorProto;
            GeneratedMessageLite.m13417F(EnumDescriptorProto.class, enumDescriptorProto);
        }

        public EnumDescriptorProto() {
            ProtobufArrayList<Object> protobufArrayList = ProtobufArrayList.f24313e;
            this.value_ = protobufArrayList;
            this.reservedRange_ = protobufArrayList;
            this.reservedName_ = protobufArrayList;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", EnumValueDescriptorProto.class, "options_", "reservedRange_", EnumReservedRange.class, "reservedName_"});
                case NEW_MUTABLE_INSTANCE:
                    return new EnumDescriptorProto();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<EnumDescriptorProto> parser = PARSER;
                    if (parser == null) {
                        synchronized (EnumDescriptorProto.class) {
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

    public interface EnumDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class EnumOptions extends GeneratedMessageLite.ExtendableMessage<EnumOptions, Builder> implements EnumOptionsOrBuilder {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        private static final EnumOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        private static volatile Parser<EnumOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumOptions, Builder> implements EnumOptionsOrBuilder {
            public Builder() {
                super(EnumOptions.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(EnumOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            EnumOptions enumOptions = new EnumOptions();
            DEFAULT_INSTANCE = enumOptions;
            GeneratedMessageLite.m13417F(EnumOptions.class, enumOptions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002ϧ\u0003\u0000\u0001\u0001\u0002ဇ\u0000\u0003ဇ\u0001ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case NEW_MUTABLE_INSTANCE:
                    return new EnumOptions();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<EnumOptions> parser = PARSER;
                    if (parser == null) {
                        synchronized (EnumOptions.class) {
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

    public interface EnumOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<EnumOptions, EnumOptions.Builder> {
    }

    public static final class EnumValueDescriptorProto extends GeneratedMessageLite<EnumValueDescriptorProto, Builder> implements EnumValueDescriptorProtoOrBuilder {
        private static final EnumValueDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<EnumValueDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int number_;
        private EnumValueOptions options_;

        public static final class Builder extends GeneratedMessageLite.Builder<EnumValueDescriptorProto, Builder> implements EnumValueDescriptorProtoOrBuilder {
            public Builder() {
                super(EnumValueDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(EnumValueDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        static {
            EnumValueDescriptorProto enumValueDescriptorProto = new EnumValueDescriptorProto();
            DEFAULT_INSTANCE = enumValueDescriptorProto;
            GeneratedMessageLite.m13417F(EnumValueDescriptorProto.class, enumValueDescriptorProto);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
                case NEW_MUTABLE_INSTANCE:
                    return new EnumValueDescriptorProto();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<EnumValueDescriptorProto> parser = PARSER;
                    if (parser == null) {
                        synchronized (EnumValueDescriptorProto.class) {
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

    public interface EnumValueDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class EnumValueOptions extends GeneratedMessageLite.ExtendableMessage<EnumValueOptions, Builder> implements EnumValueOptionsOrBuilder {
        private static final EnumValueOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        private static volatile Parser<EnumValueOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumValueOptions, Builder> implements EnumValueOptionsOrBuilder {
            public Builder() {
                super(EnumValueOptions.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(EnumValueOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            EnumValueOptions enumValueOptions = new EnumValueOptions();
            DEFAULT_INSTANCE = enumValueOptions;
            GeneratedMessageLite.m13417F(EnumValueOptions.class, enumValueOptions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0001\u0001ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case NEW_MUTABLE_INSTANCE:
                    return new EnumValueOptions();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<EnumValueOptions> parser = PARSER;
                    if (parser == null) {
                        synchronized (EnumValueOptions.class) {
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

    public interface EnumValueOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<EnumValueOptions, EnumValueOptions.Builder> {
    }

    public static final class ExtensionRangeOptions extends GeneratedMessageLite.ExtendableMessage<ExtensionRangeOptions, Builder> implements ExtensionRangeOptionsOrBuilder {
        private static final ExtensionRangeOptions DEFAULT_INSTANCE;
        private static volatile Parser<ExtensionRangeOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ExtensionRangeOptions, Builder> implements ExtensionRangeOptionsOrBuilder {
            public Builder() {
                super(ExtensionRangeOptions.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(ExtensionRangeOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            ExtensionRangeOptions extensionRangeOptions = new ExtensionRangeOptions();
            DEFAULT_INSTANCE = extensionRangeOptions;
            GeneratedMessageLite.m13417F(ExtensionRangeOptions.class, extensionRangeOptions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", UninterpretedOption.class});
                case NEW_MUTABLE_INSTANCE:
                    return new ExtensionRangeOptions();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ExtensionRangeOptions> parser = PARSER;
                    if (parser == null) {
                        synchronized (ExtensionRangeOptions.class) {
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

    public interface ExtensionRangeOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<ExtensionRangeOptions, ExtensionRangeOptions.Builder> {
    }

    public static final class FieldDescriptorProto extends GeneratedMessageLite<FieldDescriptorProto, Builder> implements FieldDescriptorProtoOrBuilder {
        private static final FieldDescriptorProto DEFAULT_INSTANCE;
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private static volatile Parser<FieldDescriptorProto> PARSER = null;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private int number_;
        private int oneofIndex_;
        private FieldOptions options_;
        private boolean proto3Optional_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int label_ = 1;
        private int type_ = 1;
        private String typeName_ = "";
        private String extendee_ = "";
        private String defaultValue_ = "";
        private String jsonName_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<FieldDescriptorProto, Builder> implements FieldDescriptorProtoOrBuilder {
            public Builder() {
                super(FieldDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(FieldDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        public enum Label implements Internal.EnumLite {
            LABEL_OPTIONAL(1),
            LABEL_REQUIRED(2),
            LABEL_REPEATED(3);


            /* renamed from: b */
            public final int f24058b;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label$1 */
            public class C23561 implements Internal.EnumLiteMap<Label> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public Label mo11029a(int i2) {
                    return Label.m13331a(i2);
                }
            }

            public static final class LabelVerifier implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final Internal.EnumVerifier f24059a = new LabelVerifier();

                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return Label.m13331a(i2) != null;
                }
            }

            Label(int i2) {
                this.f24058b = i2;
            }

            /* renamed from: a */
            public static Label m13331a(int i2) {
                if (i2 == 1) {
                    return LABEL_OPTIONAL;
                }
                if (i2 == 2) {
                    return LABEL_REQUIRED;
                }
                if (i2 != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                return this.f24058b;
            }
        }

        public enum Type implements Internal.EnumLite {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);


            /* renamed from: b */
            public final int f24079b;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type$1 */
            public class C23571 implements Internal.EnumLiteMap<Type> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public Type mo11029a(int i2) {
                    return Type.m13332a(i2);
                }
            }

            public static final class TypeVerifier implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final Internal.EnumVerifier f24080a = new TypeVerifier();

                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return Type.m13332a(i2) != null;
                }
            }

            Type(int i2) {
                this.f24079b = i2;
            }

            /* renamed from: a */
            public static Type m13332a(int i2) {
                switch (i2) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                return this.f24079b;
            }
        }

        static {
            FieldDescriptorProto fieldDescriptorProto = new FieldDescriptorProto();
            DEFAULT_INSTANCE = fieldDescriptorProto;
            GeneratedMessageLite.m13417F(FieldDescriptorProto.class, fieldDescriptorProto);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", Label.LabelVerifier.f24059a, "type_", Type.TypeVerifier.f24080a, "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
                case NEW_MUTABLE_INSTANCE:
                    return new FieldDescriptorProto();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FieldDescriptorProto> parser = PARSER;
                    if (parser == null) {
                        synchronized (FieldDescriptorProto.class) {
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

    public interface FieldDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class FieldOptions extends GeneratedMessageLite.ExtendableMessage<FieldOptions, Builder> implements FieldOptionsOrBuilder {
        public static final int CTYPE_FIELD_NUMBER = 1;
        private static final FieldOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        private static volatile Parser<FieldOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int WEAK_FIELD_NUMBER = 10;
        private int bitField0_;
        private int ctype_;
        private boolean deprecated_;
        private int jstype_;
        private boolean lazy_;
        private boolean packed_;
        private boolean weak_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<FieldOptions, Builder> implements FieldOptionsOrBuilder {
            public Builder() {
                super(FieldOptions.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(FieldOptions.DEFAULT_INSTANCE);
            }
        }

        public enum CType implements Internal.EnumLite {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);


            /* renamed from: b */
            public final int f24085b;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$CType$1 */
            public class C23581 implements Internal.EnumLiteMap<CType> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public CType mo11029a(int i2) {
                    return CType.m13335a(i2);
                }
            }

            public static final class CTypeVerifier implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final Internal.EnumVerifier f24086a = new CTypeVerifier();

                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return CType.m13335a(i2) != null;
                }
            }

            CType(int i2) {
                this.f24085b = i2;
            }

            /* renamed from: a */
            public static CType m13335a(int i2) {
                if (i2 == 0) {
                    return STRING;
                }
                if (i2 == 1) {
                    return CORD;
                }
                if (i2 != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                return this.f24085b;
            }
        }

        public enum JSType implements Internal.EnumLite {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);


            /* renamed from: b */
            public final int f24091b;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$JSType$1 */
            public class C23591 implements Internal.EnumLiteMap<JSType> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public JSType mo11029a(int i2) {
                    return JSType.m13336a(i2);
                }
            }

            public static final class JSTypeVerifier implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final Internal.EnumVerifier f24092a = new JSTypeVerifier();

                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return JSType.m13336a(i2) != null;
                }
            }

            JSType(int i2) {
                this.f24091b = i2;
            }

            /* renamed from: a */
            public static JSType m13336a(int i2) {
                if (i2 == 0) {
                    return JS_NORMAL;
                }
                if (i2 == 1) {
                    return JS_STRING;
                }
                if (i2 != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                return this.f24091b;
            }
        }

        static {
            FieldOptions fieldOptions = new FieldOptions();
            DEFAULT_INSTANCE = fieldOptions;
            GeneratedMessageLite.m13417F(FieldOptions.class, fieldOptions);
        }

        /* renamed from: J */
        public static FieldOptions m13334J() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0003\u0006ဌ\u0002\nဇ\u0005ϧЛ", new Object[]{"bitField0_", "ctype_", CType.CTypeVerifier.f24086a, "packed_", "deprecated_", "lazy_", "jstype_", JSType.JSTypeVerifier.f24092a, "weak_", "uninterpretedOption_", UninterpretedOption.class});
                case NEW_MUTABLE_INSTANCE:
                    return new FieldOptions();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FieldOptions> parser = PARSER;
                    if (parser == null) {
                        synchronized (FieldOptions.class) {
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

    public interface FieldOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<FieldOptions, FieldOptions.Builder> {
    }

    public static final class FileDescriptorProto extends GeneratedMessageLite<FileDescriptorProto, Builder> implements FileDescriptorProtoOrBuilder {
        private static final FileDescriptorProto DEFAULT_INSTANCE;
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private static volatile Parser<FileDescriptorProto> PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private int bitField0_;
        private Internal.ProtobufList<String> dependency_;
        private Internal.ProtobufList<EnumDescriptorProto> enumType_;
        private Internal.ProtobufList<FieldDescriptorProto> extension_;
        private Internal.ProtobufList<DescriptorProto> messageType_;
        private FileOptions options_;
        private Internal.IntList publicDependency_;
        private Internal.ProtobufList<ServiceDescriptorProto> service_;
        private SourceCodeInfo sourceCodeInfo_;
        private String syntax_;
        private Internal.IntList weakDependency_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String package_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<FileDescriptorProto, Builder> implements FileDescriptorProtoOrBuilder {
            public Builder() {
                super(FileDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(FileDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        static {
            FileDescriptorProto fileDescriptorProto = new FileDescriptorProto();
            DEFAULT_INSTANCE = fileDescriptorProto;
            GeneratedMessageLite.m13417F(FileDescriptorProto.class, fileDescriptorProto);
        }

        public FileDescriptorProto() {
            ProtobufArrayList<Object> protobufArrayList = ProtobufArrayList.f24313e;
            this.dependency_ = protobufArrayList;
            IntArrayList intArrayList = IntArrayList.f24207e;
            this.publicDependency_ = intArrayList;
            this.weakDependency_ = intArrayList;
            this.messageType_ = protobufArrayList;
            this.enumType_ = protobufArrayList;
            this.service_ = protobufArrayList;
            this.extension_ = protobufArrayList;
            this.syntax_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "service_", ServiceDescriptorProto.class, "extension_", FieldDescriptorProto.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_"});
                case NEW_MUTABLE_INSTANCE:
                    return new FileDescriptorProto();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FileDescriptorProto> parser = PARSER;
                    if (parser == null) {
                        synchronized (FileDescriptorProto.class) {
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

    public interface FileDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class FileDescriptorSet extends GeneratedMessageLite<FileDescriptorSet, Builder> implements FileDescriptorSetOrBuilder {
        private static final FileDescriptorSet DEFAULT_INSTANCE;
        public static final int FILE_FIELD_NUMBER = 1;
        private static volatile Parser<FileDescriptorSet> PARSER;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<FileDescriptorProto> file_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.Builder<FileDescriptorSet, Builder> implements FileDescriptorSetOrBuilder {
            public Builder() {
                super(FileDescriptorSet.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(FileDescriptorSet.DEFAULT_INSTANCE);
            }
        }

        static {
            FileDescriptorSet fileDescriptorSet = new FileDescriptorSet();
            DEFAULT_INSTANCE = fileDescriptorSet;
            GeneratedMessageLite.m13417F(FileDescriptorSet.class, fileDescriptorSet);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", FileDescriptorProto.class});
                case NEW_MUTABLE_INSTANCE:
                    return new FileDescriptorSet();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FileDescriptorSet> parser = PARSER;
                    if (parser == null) {
                        synchronized (FileDescriptorSet.class) {
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

    public interface FileDescriptorSetOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class FileOptions extends GeneratedMessageLite.ExtendableMessage<FileOptions, Builder> implements FileOptionsOrBuilder {
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        private static final FileOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private static volatile Parser<FileOptions> PARSER = null;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean ccGenericServices_;
        private boolean deprecated_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private boolean javaStringCheckUtf8_;
        private boolean phpGenericServices_;
        private boolean pyGenericServices_;
        private byte memoizedIsInitialized = 2;
        private String javaPackage_ = "";
        private String javaOuterClassname_ = "";
        private int optimizeFor_ = 1;
        private String goPackage_ = "";
        private boolean ccEnableArenas_ = true;
        private String objcClassPrefix_ = "";
        private String csharpNamespace_ = "";
        private String swiftPrefix_ = "";
        private String phpClassPrefix_ = "";
        private String phpNamespace_ = "";
        private String phpMetadataNamespace_ = "";
        private String rubyPackage_ = "";
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<FileOptions, Builder> implements FileOptionsOrBuilder {
            public Builder() {
                super(FileOptions.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(FileOptions.DEFAULT_INSTANCE);
            }
        }

        public enum OptimizeMode implements Internal.EnumLite {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);


            /* renamed from: b */
            public final int f24097b;

            /* renamed from: com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode$1 */
            public class C23601 implements Internal.EnumLiteMap<OptimizeMode> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public OptimizeMode mo11029a(int i2) {
                    return OptimizeMode.m13341a(i2);
                }
            }

            public static final class OptimizeModeVerifier implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final Internal.EnumVerifier f24098a = new OptimizeModeVerifier();

                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return OptimizeMode.m13341a(i2) != null;
                }
            }

            OptimizeMode(int i2) {
                this.f24097b = i2;
            }

            /* renamed from: a */
            public static OptimizeMode m13341a(int i2) {
                if (i2 == 1) {
                    return SPEED;
                }
                if (i2 == 2) {
                    return CODE_SIZE;
                }
                if (i2 != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                return this.f24097b;
            }
        }

        static {
            FileOptions fileOptions = new FileOptions();
            DEFAULT_INSTANCE = fileOptions;
            GeneratedMessageLite.m13417F(FileOptions.class, fileOptions);
        }

        /* renamed from: J */
        public static FileOptions m13340J() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0001\u0001ဈ\u0000\bဈ\u0001\tဌ\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\u000b\u001bဇ\u0004\u001fဇ\f$ဈ\r%ဈ\u000e'ဈ\u000f(ဈ\u0010)ဈ\u0011*ဇ\n,ဈ\u0012-ဈ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", OptimizeMode.OptimizeModeVerifier.f24098a, "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpGenericServices_", "phpMetadataNamespace_", "rubyPackage_", "uninterpretedOption_", UninterpretedOption.class});
                case NEW_MUTABLE_INSTANCE:
                    return new FileOptions();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FileOptions> parser = PARSER;
                    if (parser == null) {
                        synchronized (FileOptions.class) {
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

    public interface FileOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<FileOptions, FileOptions.Builder> {
    }

    public static final class GeneratedCodeInfo extends GeneratedMessageLite<GeneratedCodeInfo, Builder> implements GeneratedCodeInfoOrBuilder {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        private static final GeneratedCodeInfo DEFAULT_INSTANCE;
        private static volatile Parser<GeneratedCodeInfo> PARSER;
        private Internal.ProtobufList<Annotation> annotation_ = ProtobufArrayList.f24313e;

        public static final class Annotation extends GeneratedMessageLite<Annotation, Builder> implements AnnotationOrBuilder {
            public static final int BEGIN_FIELD_NUMBER = 3;
            private static final Annotation DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 4;
            private static volatile Parser<Annotation> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private int begin_;
            private int bitField0_;
            private int end_;
            private int pathMemoizedSerializedSize = -1;
            private Internal.IntList path_ = IntArrayList.f24207e;
            private String sourceFile_ = "";

            public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
                public Builder() {
                    super(Annotation.DEFAULT_INSTANCE);
                }

                public Builder(C23551 c23551) {
                    super(Annotation.DEFAULT_INSTANCE);
                }
            }

            static {
                Annotation annotation = new Annotation();
                DEFAULT_INSTANCE = annotation;
                GeneratedMessageLite.m13417F(Annotation.class, annotation);
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
                        return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new Annotation();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Annotation> parser = PARSER;
                        if (parser == null) {
                            synchronized (Annotation.class) {
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

        public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<GeneratedCodeInfo, Builder> implements GeneratedCodeInfoOrBuilder {
            public Builder() {
                super(GeneratedCodeInfo.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(GeneratedCodeInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            GeneratedCodeInfo generatedCodeInfo = new GeneratedCodeInfo();
            DEFAULT_INSTANCE = generatedCodeInfo;
            GeneratedMessageLite.m13417F(GeneratedCodeInfo.class, generatedCodeInfo);
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
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", Annotation.class});
                case NEW_MUTABLE_INSTANCE:
                    return new GeneratedCodeInfo();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<GeneratedCodeInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (GeneratedCodeInfo.class) {
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

    public interface GeneratedCodeInfoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class MessageOptions extends GeneratedMessageLite.ExtendableMessage<MessageOptions, Builder> implements MessageOptionsOrBuilder {
        private static final MessageOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private static volatile Parser<MessageOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private boolean mapEntry_;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<MessageOptions, Builder> implements MessageOptionsOrBuilder {
            public Builder() {
                super(MessageOptions.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(MessageOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            MessageOptions messageOptions = new MessageOptions();
            DEFAULT_INSTANCE = messageOptions;
            GeneratedMessageLite.m13417F(MessageOptions.class, messageOptions);
        }

        /* renamed from: J */
        public static MessageOptions m13345J() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "uninterpretedOption_", UninterpretedOption.class});
                case NEW_MUTABLE_INSTANCE:
                    return new MessageOptions();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MessageOptions> parser = PARSER;
                    if (parser == null) {
                        synchronized (MessageOptions.class) {
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

    public interface MessageOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<MessageOptions, MessageOptions.Builder> {
    }

    public static final class MethodDescriptorProto extends GeneratedMessageLite<MethodDescriptorProto, Builder> implements MethodDescriptorProtoOrBuilder {
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        private static final MethodDescriptorProto DEFAULT_INSTANCE;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private static volatile Parser<MethodDescriptorProto> PARSER = null;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean clientStreaming_;
        private MethodOptions options_;
        private boolean serverStreaming_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String inputType_ = "";
        private String outputType_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<MethodDescriptorProto, Builder> implements MethodDescriptorProtoOrBuilder {
            public Builder() {
                super(MethodDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(MethodDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        static {
            MethodDescriptorProto methodDescriptorProto = new MethodDescriptorProto();
            DEFAULT_INSTANCE = methodDescriptorProto;
            GeneratedMessageLite.m13417F(MethodDescriptorProto.class, methodDescriptorProto);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
                case NEW_MUTABLE_INSTANCE:
                    return new MethodDescriptorProto();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MethodDescriptorProto> parser = PARSER;
                    if (parser == null) {
                        synchronized (MethodDescriptorProto.class) {
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

    public interface MethodDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class MethodOptions extends GeneratedMessageLite.ExtendableMessage<MethodOptions, Builder> implements MethodOptionsOrBuilder {
        private static final MethodOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private static volatile Parser<MethodOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<MethodOptions, Builder> implements MethodOptionsOrBuilder {
            public Builder() {
                super(MethodOptions.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(MethodOptions.DEFAULT_INSTANCE);
            }
        }

        public enum IdempotencyLevel implements Internal.EnumLite {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);


            /* renamed from: b */
            public final int f24103b;

            /* renamed from: com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel$1 */
            public class C23611 implements Internal.EnumLiteMap<IdempotencyLevel> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* renamed from: a */
                public IdempotencyLevel mo11029a(int i2) {
                    return IdempotencyLevel.m13349a(i2);
                }
            }

            public static final class IdempotencyLevelVerifier implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final Internal.EnumVerifier f24104a = new IdempotencyLevelVerifier();

                @Override // com.google.protobuf.Internal.EnumVerifier
                /* renamed from: a */
                public boolean mo11030a(int i2) {
                    return IdempotencyLevel.m13349a(i2) != null;
                }
            }

            IdempotencyLevel(int i2) {
                this.f24103b = i2;
            }

            /* renamed from: a */
            public static IdempotencyLevel m13349a(int i2) {
                if (i2 == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (i2 == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (i2 != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            /* renamed from: x */
            public final int mo11028x() {
                return this.f24103b;
            }
        }

        static {
            MethodOptions methodOptions = new MethodOptions();
            DEFAULT_INSTANCE = methodOptions;
            GeneratedMessageLite.m13417F(MethodOptions.class, methodOptions);
        }

        /* renamed from: J */
        public static MethodOptions m13348J() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0001!ဇ\u0000\"ဌ\u0001ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", IdempotencyLevel.IdempotencyLevelVerifier.f24104a, "uninterpretedOption_", UninterpretedOption.class});
                case NEW_MUTABLE_INSTANCE:
                    return new MethodOptions();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MethodOptions> parser = PARSER;
                    if (parser == null) {
                        synchronized (MethodOptions.class) {
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

    public interface MethodOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<MethodOptions, MethodOptions.Builder> {
    }

    public static final class OneofDescriptorProto extends GeneratedMessageLite<OneofDescriptorProto, Builder> implements OneofDescriptorProtoOrBuilder {
        private static final OneofDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static volatile Parser<OneofDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private OneofOptions options_;

        public static final class Builder extends GeneratedMessageLite.Builder<OneofDescriptorProto, Builder> implements OneofDescriptorProtoOrBuilder {
            public Builder() {
                super(OneofDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(OneofDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        static {
            OneofDescriptorProto oneofDescriptorProto = new OneofDescriptorProto();
            DEFAULT_INSTANCE = oneofDescriptorProto;
            GeneratedMessageLite.m13417F(OneofDescriptorProto.class, oneofDescriptorProto);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
                case NEW_MUTABLE_INSTANCE:
                    return new OneofDescriptorProto();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<OneofDescriptorProto> parser = PARSER;
                    if (parser == null) {
                        synchronized (OneofDescriptorProto.class) {
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

    public interface OneofDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class OneofOptions extends GeneratedMessageLite.ExtendableMessage<OneofOptions, Builder> implements OneofOptionsOrBuilder {
        private static final OneofOptions DEFAULT_INSTANCE;
        private static volatile Parser<OneofOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<OneofOptions, Builder> implements OneofOptionsOrBuilder {
            public Builder() {
                super(OneofOptions.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(OneofOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            OneofOptions oneofOptions = new OneofOptions();
            DEFAULT_INSTANCE = oneofOptions;
            GeneratedMessageLite.m13417F(OneofOptions.class, oneofOptions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", UninterpretedOption.class});
                case NEW_MUTABLE_INSTANCE:
                    return new OneofOptions();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<OneofOptions> parser = PARSER;
                    if (parser == null) {
                        synchronized (OneofOptions.class) {
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

    public interface OneofOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<OneofOptions, OneofOptions.Builder> {
    }

    public static final class ServiceDescriptorProto extends GeneratedMessageLite<ServiceDescriptorProto, Builder> implements ServiceDescriptorProtoOrBuilder {
        private static final ServiceDescriptorProto DEFAULT_INSTANCE;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<ServiceDescriptorProto> PARSER;
        private int bitField0_;
        private ServiceOptions options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private Internal.ProtobufList<MethodDescriptorProto> method_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.Builder<ServiceDescriptorProto, Builder> implements ServiceDescriptorProtoOrBuilder {
            public Builder() {
                super(ServiceDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(ServiceDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        static {
            ServiceDescriptorProto serviceDescriptorProto = new ServiceDescriptorProto();
            DEFAULT_INSTANCE = serviceDescriptorProto;
            GeneratedMessageLite.m13417F(ServiceDescriptorProto.class, serviceDescriptorProto);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", MethodDescriptorProto.class, "options_"});
                case NEW_MUTABLE_INSTANCE:
                    return new ServiceDescriptorProto();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ServiceDescriptorProto> parser = PARSER;
                    if (parser == null) {
                        synchronized (ServiceDescriptorProto.class) {
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

    public interface ServiceDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ServiceOptions extends GeneratedMessageLite.ExtendableMessage<ServiceOptions, Builder> implements ServiceOptionsOrBuilder {
        private static final ServiceOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        private static volatile Parser<ServiceOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ServiceOptions, Builder> implements ServiceOptionsOrBuilder {
            public Builder() {
                super(ServiceOptions.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(ServiceOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            ServiceOptions serviceOptions = new ServiceOptions();
            DEFAULT_INSTANCE = serviceOptions;
            GeneratedMessageLite.m13417F(ServiceOptions.class, serviceOptions);
        }

        /* renamed from: J */
        public static ServiceOptions m13354J() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001!ϧ\u0002\u0000\u0001\u0001!ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case NEW_MUTABLE_INSTANCE:
                    return new ServiceOptions();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ServiceOptions> parser = PARSER;
                    if (parser == null) {
                        synchronized (ServiceOptions.class) {
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

    public interface ServiceOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<ServiceOptions, ServiceOptions.Builder> {
    }

    public static final class SourceCodeInfo extends GeneratedMessageLite<SourceCodeInfo, Builder> implements SourceCodeInfoOrBuilder {
        private static final SourceCodeInfo DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static volatile Parser<SourceCodeInfo> PARSER;
        private Internal.ProtobufList<Location> location_ = ProtobufArrayList.f24313e;

        public static final class Builder extends GeneratedMessageLite.Builder<SourceCodeInfo, Builder> implements SourceCodeInfoOrBuilder {
            public Builder() {
                super(SourceCodeInfo.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(SourceCodeInfo.DEFAULT_INSTANCE);
            }
        }

        public static final class Location extends GeneratedMessageLite<Location, Builder> implements LocationOrBuilder {
            private static final Location DEFAULT_INSTANCE;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private static volatile Parser<Location> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private int bitField0_;
            private String leadingComments_;
            private Internal.ProtobufList<String> leadingDetachedComments_;
            private Internal.IntList path_;
            private Internal.IntList span_;
            private String trailingComments_;
            private int pathMemoizedSerializedSize = -1;
            private int spanMemoizedSerializedSize = -1;

            public static final class Builder extends GeneratedMessageLite.Builder<Location, Builder> implements LocationOrBuilder {
                public Builder() {
                    super(Location.DEFAULT_INSTANCE);
                }

                public Builder(C23551 c23551) {
                    super(Location.DEFAULT_INSTANCE);
                }
            }

            static {
                Location location = new Location();
                DEFAULT_INSTANCE = location;
                GeneratedMessageLite.m13417F(Location.class, location);
            }

            public Location() {
                IntArrayList intArrayList = IntArrayList.f24207e;
                this.path_ = intArrayList;
                this.span_ = intArrayList;
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = ProtobufArrayList.f24313e;
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
                        return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new Location();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Location> parser = PARSER;
                        if (parser == null) {
                            synchronized (Location.class) {
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

        public interface LocationOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            SourceCodeInfo sourceCodeInfo = new SourceCodeInfo();
            DEFAULT_INSTANCE = sourceCodeInfo;
            GeneratedMessageLite.m13417F(SourceCodeInfo.class, sourceCodeInfo);
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
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", Location.class});
                case NEW_MUTABLE_INSTANCE:
                    return new SourceCodeInfo();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<SourceCodeInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (SourceCodeInfo.class) {
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

    public interface SourceCodeInfoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class UninterpretedOption extends GeneratedMessageLite<UninterpretedOption, Builder> implements UninterpretedOptionOrBuilder {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        private static final UninterpretedOption DEFAULT_INSTANCE;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private static volatile Parser<UninterpretedOption> PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private int bitField0_;
        private double doubleValue_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<NamePart> name_ = ProtobufArrayList.f24313e;
        private String identifierValue_ = "";
        private ByteString stringValue_ = ByteString.f23981c;
        private String aggregateValue_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<UninterpretedOption, Builder> implements UninterpretedOptionOrBuilder {
            public Builder() {
                super(UninterpretedOption.DEFAULT_INSTANCE);
            }

            public Builder(C23551 c23551) {
                super(UninterpretedOption.DEFAULT_INSTANCE);
            }
        }

        public static final class NamePart extends GeneratedMessageLite<NamePart, Builder> implements NamePartOrBuilder {
            private static final NamePart DEFAULT_INSTANCE;
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static volatile Parser<NamePart> PARSER;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized = 2;
            private String namePart_ = "";

            public static final class Builder extends GeneratedMessageLite.Builder<NamePart, Builder> implements NamePartOrBuilder {
                public Builder() {
                    super(NamePart.DEFAULT_INSTANCE);
                }

                public Builder(C23551 c23551) {
                    super(NamePart.DEFAULT_INSTANCE);
                }
            }

            static {
                NamePart namePart = new NamePart();
                DEFAULT_INSTANCE = namePart;
                GeneratedMessageLite.m13417F(NamePart.class, namePart);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            /* renamed from: p */
            public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (methodToInvoke) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case SET_MEMOIZED_IS_INITIALIZED:
                        this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new NamePart();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<NamePart> parser = PARSER;
                        if (parser == null) {
                            synchronized (NamePart.class) {
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

        public interface NamePartOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            UninterpretedOption uninterpretedOption = new UninterpretedOption();
            DEFAULT_INSTANCE = uninterpretedOption;
            GeneratedMessageLite.m13417F(UninterpretedOption.class, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", NamePart.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
                case NEW_MUTABLE_INSTANCE:
                    return new UninterpretedOption();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<UninterpretedOption> parser = PARSER;
                    if (parser == null) {
                        synchronized (UninterpretedOption.class) {
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

    public interface UninterpretedOptionOrBuilder extends MessageLiteOrBuilder {
    }
}
