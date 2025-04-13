package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.protobuf.WireFormat;

/* loaded from: classes.dex */
public final class MonitoredResourceMetadata extends GeneratedMessageLite<MonitoredResourceMetadata, Builder> implements MonitoredResourceMetadataOrBuilder {
    private static final MonitoredResourceMetadata DEFAULT_INSTANCE;
    private static volatile Parser<MonitoredResourceMetadata> PARSER = null;
    public static final int SYSTEM_LABELS_FIELD_NUMBER = 1;
    public static final int USER_LABELS_FIELD_NUMBER = 2;
    private Struct systemLabels_;
    private MapFieldLite<String, String> userLabels_ = MapFieldLite.f24269c;

    /* renamed from: com.google.api.MonitoredResourceMetadata$1 */
    public static /* synthetic */ class C15251 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20423a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20423a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20423a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20423a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20423a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20423a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20423a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20423a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MonitoredResourceMetadata, Builder> implements MonitoredResourceMetadataOrBuilder {
        public Builder() {
            super(MonitoredResourceMetadata.DEFAULT_INSTANCE);
        }

        public Builder(C15251 c15251) {
            super(MonitoredResourceMetadata.DEFAULT_INSTANCE);
        }
    }

    public static final class UserLabelsDefaultEntryHolder {

        /* renamed from: a */
        public static final MapEntryLite<String, String> f20424a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.f24409l;
            f20424a = new MapEntryLite<>(fieldType, "", fieldType, "");
        }
    }

    static {
        MonitoredResourceMetadata monitoredResourceMetadata = new MonitoredResourceMetadata();
        DEFAULT_INSTANCE = monitoredResourceMetadata;
        GeneratedMessageLite.m13417F(MonitoredResourceMetadata.class, monitoredResourceMetadata);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\t\u00022", new Object[]{"systemLabels_", "userLabels_", UserLabelsDefaultEntryHolder.f20424a});
            case NEW_MUTABLE_INSTANCE:
                return new MonitoredResourceMetadata();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<MonitoredResourceMetadata> parser = PARSER;
                if (parser == null) {
                    synchronized (MonitoredResourceMetadata.class) {
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
