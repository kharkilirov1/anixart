package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class Usage extends GeneratedMessageLite<Usage, Builder> implements UsageOrBuilder {
    private static final Usage DEFAULT_INSTANCE;
    private static volatile Parser<Usage> PARSER = null;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private Internal.ProtobufList<String> requirements_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<UsageRule> rules_ = GeneratedMessageLite.m13422t();
    private String producerNotificationChannel_ = "";

    /* renamed from: com.google.api.Usage$1 */
    public static /* synthetic */ class C15421 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20454a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20454a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20454a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20454a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20454a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20454a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20454a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20454a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Usage, Builder> implements UsageOrBuilder {
        public Builder() {
            super(Usage.DEFAULT_INSTANCE);
        }

        public Builder(C15421 c15421) {
            super(Usage.DEFAULT_INSTANCE);
        }
    }

    static {
        Usage usage = new Usage();
        DEFAULT_INSTANCE = usage;
        GeneratedMessageLite.m13417F(Usage.class, usage);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001Ț\u0006\u001b\u0007Ȉ", new Object[]{"requirements_", "rules_", UsageRule.class, "producerNotificationChannel_"});
            case NEW_MUTABLE_INSTANCE:
                return new Usage();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Usage> parser = PARSER;
                if (parser == null) {
                    synchronized (Usage.class) {
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
