package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Monitoring extends GeneratedMessageLite<Monitoring, Builder> implements MonitoringOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Monitoring DEFAULT_INSTANCE;
    private static volatile Parser<Monitoring> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<MonitoringDestination> producerDestinations_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<MonitoringDestination> consumerDestinations_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.Monitoring$1 */
    public static /* synthetic */ class C15261 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20425a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20425a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20425a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20425a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20425a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20425a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20425a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20425a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Monitoring, Builder> implements MonitoringOrBuilder {
        public Builder() {
            super(Monitoring.DEFAULT_INSTANCE);
        }

        public Builder(C15261 c15261) {
            super(Monitoring.DEFAULT_INSTANCE);
        }
    }

    public static final class MonitoringDestination extends GeneratedMessageLite<MonitoringDestination, Builder> implements MonitoringDestinationOrBuilder {
        private static final MonitoringDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile Parser<MonitoringDestination> PARSER;
        private String monitoredResource_ = "";
        private Internal.ProtobufList<String> metrics_ = GeneratedMessageLite.m13422t();

        public static final class Builder extends GeneratedMessageLite.Builder<MonitoringDestination, Builder> implements MonitoringDestinationOrBuilder {
            public Builder() {
                super(MonitoringDestination.DEFAULT_INSTANCE);
            }

            public Builder(C15261 c15261) {
                super(MonitoringDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            MonitoringDestination monitoringDestination = new MonitoringDestination();
            DEFAULT_INSTANCE = monitoringDestination;
            GeneratedMessageLite.m13417F(MonitoringDestination.class, monitoringDestination);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case NEW_MUTABLE_INSTANCE:
                    return new MonitoringDestination();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MonitoringDestination> parser = PARSER;
                    if (parser == null) {
                        synchronized (MonitoringDestination.class) {
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

    public interface MonitoringDestinationOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        Monitoring monitoring = new Monitoring();
        DEFAULT_INSTANCE = monitoring;
        GeneratedMessageLite.m13417F(Monitoring.class, monitoring);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", MonitoringDestination.class, "consumerDestinations_", MonitoringDestination.class});
            case NEW_MUTABLE_INSTANCE:
                return new Monitoring();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Monitoring> parser = PARSER;
                if (parser == null) {
                    synchronized (Monitoring.class) {
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
