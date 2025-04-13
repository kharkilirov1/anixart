package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class MonitoredResourceDescriptor extends GeneratedMessageLite<MonitoredResourceDescriptor, Builder> implements MonitoredResourceDescriptorOrBuilder {
    private static final MonitoredResourceDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LABELS_FIELD_NUMBER = 4;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile Parser<MonitoredResourceDescriptor> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int launchStage_;
    private String name_ = "";
    private String type_ = "";
    private String displayName_ = "";
    private String description_ = "";
    private Internal.ProtobufList<LabelDescriptor> labels_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.MonitoredResourceDescriptor$1 */
    public static /* synthetic */ class C15241 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20422a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20422a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20422a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20422a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20422a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20422a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20422a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20422a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MonitoredResourceDescriptor, Builder> implements MonitoredResourceDescriptorOrBuilder {
        public Builder() {
            super(MonitoredResourceDescriptor.DEFAULT_INSTANCE);
        }

        public Builder(C15241 c15241) {
            super(MonitoredResourceDescriptor.DEFAULT_INSTANCE);
        }
    }

    static {
        MonitoredResourceDescriptor monitoredResourceDescriptor = new MonitoredResourceDescriptor();
        DEFAULT_INSTANCE = monitoredResourceDescriptor;
        GeneratedMessageLite.m13417F(MonitoredResourceDescriptor.class, monitoredResourceDescriptor);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005Ȉ\u0007\f", new Object[]{"type_", "displayName_", "description_", "labels_", LabelDescriptor.class, "name_", "launchStage_"});
            case NEW_MUTABLE_INSTANCE:
                return new MonitoredResourceDescriptor();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<MonitoredResourceDescriptor> parser = PARSER;
                if (parser == null) {
                    synchronized (MonitoredResourceDescriptor.class) {
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
