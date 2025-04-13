package com.google.api;

import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class MetricDescriptor extends GeneratedMessageLite<MetricDescriptor, Builder> implements MetricDescriptorOrBuilder {
    private static final MetricDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<MetricDescriptor> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private int launchStage_;
    private MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private int valueType_;
    private String name_ = "";
    private String type_ = "";
    private Internal.ProtobufList<LabelDescriptor> labels_ = GeneratedMessageLite.m13422t();
    private String unit_ = "";
    private String description_ = "";
    private String displayName_ = "";

    /* renamed from: com.google.api.MetricDescriptor$1 */
    public static /* synthetic */ class C15191 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20400a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20400a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20400a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20400a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20400a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20400a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20400a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20400a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MetricDescriptor, Builder> implements MetricDescriptorOrBuilder {
        public Builder() {
            super(MetricDescriptor.DEFAULT_INSTANCE);
        }

        public Builder(C15191 c15191) {
            super(MetricDescriptor.DEFAULT_INSTANCE);
        }
    }

    public static final class MetricDescriptorMetadata extends GeneratedMessageLite<MetricDescriptorMetadata, Builder> implements MetricDescriptorMetadataOrBuilder {
        private static final MetricDescriptorMetadata DEFAULT_INSTANCE;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile Parser<MetricDescriptorMetadata> PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private Duration ingestDelay_;
        private int launchStage_;
        private Duration samplePeriod_;

        public static final class Builder extends GeneratedMessageLite.Builder<MetricDescriptorMetadata, Builder> implements MetricDescriptorMetadataOrBuilder {
            public Builder() {
                super(MetricDescriptorMetadata.DEFAULT_INSTANCE);
            }

            public Builder(C15191 c15191) {
                super(MetricDescriptorMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            MetricDescriptorMetadata metricDescriptorMetadata = new MetricDescriptorMetadata();
            DEFAULT_INSTANCE = metricDescriptorMetadata;
            GeneratedMessageLite.m13417F(MetricDescriptorMetadata.class, metricDescriptorMetadata);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"launchStage_", "samplePeriod_", "ingestDelay_"});
                case NEW_MUTABLE_INSTANCE:
                    return new MetricDescriptorMetadata();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MetricDescriptorMetadata> parser = PARSER;
                    if (parser == null) {
                        synchronized (MetricDescriptorMetadata.class) {
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

    public interface MetricDescriptorMetadataOrBuilder extends MessageLiteOrBuilder {
    }

    public enum MetricKind implements Internal.EnumLite {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f20407b;

        /* renamed from: com.google.api.MetricDescriptor$MetricKind$1 */
        public class C15201 implements Internal.EnumLiteMap<MetricKind> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public MetricKind mo11029a(int i2) {
                return MetricKind.m11064a(i2);
            }
        }

        public static final class MetricKindVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return MetricKind.m11064a(i2) != null;
            }
        }

        MetricKind(int i2) {
            this.f20407b = i2;
        }

        /* renamed from: a */
        public static MetricKind m11064a(int i2) {
            if (i2 == 0) {
                return METRIC_KIND_UNSPECIFIED;
            }
            if (i2 == 1) {
                return GAUGE;
            }
            if (i2 == 2) {
                return DELTA;
            }
            if (i2 != 3) {
                return null;
            }
            return CUMULATIVE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f20407b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum ValueType implements Internal.EnumLite {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f20417b;

        /* renamed from: com.google.api.MetricDescriptor$ValueType$1 */
        public class C15211 implements Internal.EnumLiteMap<ValueType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public ValueType mo11029a(int i2) {
                return ValueType.m11065a(i2);
            }
        }

        public static final class ValueTypeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return ValueType.m11065a(i2) != null;
            }
        }

        ValueType(int i2) {
            this.f20417b = i2;
        }

        /* renamed from: a */
        public static ValueType m11065a(int i2) {
            switch (i2) {
                case 0:
                    return VALUE_TYPE_UNSPECIFIED;
                case 1:
                    return BOOL;
                case 2:
                    return INT64;
                case 3:
                    return DOUBLE;
                case 4:
                    return STRING;
                case 5:
                    return DISTRIBUTION;
                case 6:
                    return MONEY;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f20417b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        MetricDescriptor metricDescriptor = new MetricDescriptor();
        DEFAULT_INSTANCE = metricDescriptor;
        GeneratedMessageLite.m13417F(MetricDescriptor.class, metricDescriptor);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\f\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\n\t\f\f", new Object[]{"name_", "labels_", LabelDescriptor.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"});
            case NEW_MUTABLE_INSTANCE:
                return new MetricDescriptor();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<MetricDescriptor> parser = PARSER;
                if (parser == null) {
                    synchronized (MetricDescriptor.class) {
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
