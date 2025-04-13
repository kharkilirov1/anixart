package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Billing extends GeneratedMessageLite<Billing, Builder> implements BillingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final Billing DEFAULT_INSTANCE;
    private static volatile Parser<Billing> PARSER;
    private Internal.ProtobufList<BillingDestination> consumerDestinations_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.Billing$1 */
    public static /* synthetic */ class C14971 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20346a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20346a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20346a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20346a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20346a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20346a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20346a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20346a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class BillingDestination extends GeneratedMessageLite<BillingDestination, Builder> implements BillingDestinationOrBuilder {
        private static final BillingDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile Parser<BillingDestination> PARSER;
        private String monitoredResource_ = "";
        private Internal.ProtobufList<String> metrics_ = GeneratedMessageLite.m13422t();

        public static final class Builder extends GeneratedMessageLite.Builder<BillingDestination, Builder> implements BillingDestinationOrBuilder {
            public Builder() {
                super(BillingDestination.DEFAULT_INSTANCE);
            }

            public Builder(C14971 c14971) {
                super(BillingDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            BillingDestination billingDestination = new BillingDestination();
            DEFAULT_INSTANCE = billingDestination;
            GeneratedMessageLite.m13417F(BillingDestination.class, billingDestination);
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
                    return new BillingDestination();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<BillingDestination> parser = PARSER;
                    if (parser == null) {
                        synchronized (BillingDestination.class) {
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

    public interface BillingDestinationOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Billing, Builder> implements BillingOrBuilder {
        public Builder() {
            super(Billing.DEFAULT_INSTANCE);
        }

        public Builder(C14971 c14971) {
            super(Billing.DEFAULT_INSTANCE);
        }
    }

    static {
        Billing billing = new Billing();
        DEFAULT_INSTANCE = billing;
        GeneratedMessageLite.m13417F(Billing.class, billing);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"consumerDestinations_", BillingDestination.class});
            case NEW_MUTABLE_INSTANCE:
                return new Billing();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Billing> parser = PARSER;
                if (parser == null) {
                    synchronized (Billing.class) {
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
