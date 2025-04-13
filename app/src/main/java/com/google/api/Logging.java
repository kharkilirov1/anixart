package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Logging extends GeneratedMessageLite<Logging, Builder> implements LoggingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Logging DEFAULT_INSTANCE;
    private static volatile Parser<Logging> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<LoggingDestination> producerDestinations_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<LoggingDestination> consumerDestinations_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.Logging$1 */
    public static /* synthetic */ class C15171 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20397a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20397a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20397a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20397a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20397a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20397a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20397a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20397a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Logging, Builder> implements LoggingOrBuilder {
        public Builder() {
            super(Logging.DEFAULT_INSTANCE);
        }

        public Builder(C15171 c15171) {
            super(Logging.DEFAULT_INSTANCE);
        }
    }

    public static final class LoggingDestination extends GeneratedMessageLite<LoggingDestination, Builder> implements LoggingDestinationOrBuilder {
        private static final LoggingDestination DEFAULT_INSTANCE;
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile Parser<LoggingDestination> PARSER;
        private String monitoredResource_ = "";
        private Internal.ProtobufList<String> logs_ = GeneratedMessageLite.m13422t();

        public static final class Builder extends GeneratedMessageLite.Builder<LoggingDestination, Builder> implements LoggingDestinationOrBuilder {
            public Builder() {
                super(LoggingDestination.DEFAULT_INSTANCE);
            }

            public Builder(C15171 c15171) {
                super(LoggingDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            LoggingDestination loggingDestination = new LoggingDestination();
            DEFAULT_INSTANCE = loggingDestination;
            GeneratedMessageLite.m13417F(LoggingDestination.class, loggingDestination);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ț\u0003Ȉ", new Object[]{"logs_", "monitoredResource_"});
                case NEW_MUTABLE_INSTANCE:
                    return new LoggingDestination();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<LoggingDestination> parser = PARSER;
                    if (parser == null) {
                        synchronized (LoggingDestination.class) {
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

    public interface LoggingDestinationOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        Logging logging = new Logging();
        DEFAULT_INSTANCE = logging;
        GeneratedMessageLite.m13417F(Logging.class, logging);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", LoggingDestination.class, "consumerDestinations_", LoggingDestination.class});
            case NEW_MUTABLE_INSTANCE:
                return new Logging();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Logging> parser = PARSER;
                if (parser == null) {
                    synchronized (Logging.class) {
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
