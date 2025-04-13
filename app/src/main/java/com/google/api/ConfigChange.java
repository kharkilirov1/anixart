package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class ConfigChange extends GeneratedMessageLite<ConfigChange, Builder> implements ConfigChangeOrBuilder {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    private static final ConfigChange DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<ConfigChange> PARSER;
    private int changeType_;
    private String element_ = "";
    private String oldValue_ = "";
    private String newValue_ = "";
    private Internal.ProtobufList<Advice> advices_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.ConfigChange$1 */
    public static /* synthetic */ class C14991 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20354a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20354a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20354a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20354a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20354a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20354a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20354a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20354a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ConfigChange, Builder> implements ConfigChangeOrBuilder {
        public Builder() {
            super(ConfigChange.DEFAULT_INSTANCE);
        }

        public Builder(C14991 c14991) {
            super(ConfigChange.DEFAULT_INSTANCE);
        }
    }

    static {
        ConfigChange configChange = new ConfigChange();
        DEFAULT_INSTANCE = configChange;
        GeneratedMessageLite.m13417F(ConfigChange.class, configChange);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b", new Object[]{"element_", "oldValue_", "newValue_", "changeType_", "advices_", Advice.class});
            case NEW_MUTABLE_INSTANCE:
                return new ConfigChange();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ConfigChange> parser = PARSER;
                if (parser == null) {
                    synchronized (ConfigChange.class) {
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
