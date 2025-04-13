package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes.dex */
public final class MonitoredResource extends GeneratedMessageLite<MonitoredResource, Builder> implements MonitoredResourceOrBuilder {
    private static final MonitoredResource DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile Parser<MonitoredResource> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private MapFieldLite<String, String> labels_ = MapFieldLite.f24269c;
    private String type_ = "";

    /* renamed from: com.google.api.MonitoredResource$1 */
    public static /* synthetic */ class C15231 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20420a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20420a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20420a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20420a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20420a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20420a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20420a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20420a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MonitoredResource, Builder> implements MonitoredResourceOrBuilder {
        public Builder() {
            super(MonitoredResource.DEFAULT_INSTANCE);
        }

        public Builder(C15231 c15231) {
            super(MonitoredResource.DEFAULT_INSTANCE);
        }
    }

    public static final class LabelsDefaultEntryHolder {

        /* renamed from: a */
        public static final MapEntryLite<String, String> f20421a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.f24409l;
            f20421a = new MapEntryLite<>(fieldType, "", fieldType, "");
        }
    }

    static {
        MonitoredResource monitoredResource = new MonitoredResource();
        DEFAULT_INSTANCE = monitoredResource;
        GeneratedMessageLite.m13417F(MonitoredResource.class, monitoredResource);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"type_", "labels_", LabelsDefaultEntryHolder.f20421a});
            case NEW_MUTABLE_INSTANCE:
                return new MonitoredResource();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<MonitoredResource> parser = PARSER;
                if (parser == null) {
                    synchronized (MonitoredResource.class) {
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
