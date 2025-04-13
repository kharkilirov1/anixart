package com.google.api;

import com.google.protobuf.Api;
import com.google.protobuf.Enum;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Type;
import com.google.protobuf.UInt32Value;

/* loaded from: classes.dex */
public final class Service extends GeneratedMessageLite<Service, Builder> implements ServiceOrBuilder {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final Service DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Service> PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private Http http_;
    private Logging logging_;
    private Monitoring monitoring_;
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private Usage usage_;
    private String name_ = "";
    private String id_ = "";
    private String title_ = "";
    private String producerProjectId_ = "";
    private Internal.ProtobufList<Api> apis_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<Type> types_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<Enum> enums_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<Endpoint> endpoints_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<LogDescriptor> logs_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<MetricDescriptor> metrics_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<MonitoredResourceDescriptor> monitoredResources_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.Service$1 */
    public static /* synthetic */ class C15371 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20449a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20449a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20449a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20449a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20449a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20449a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20449a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20449a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Service, Builder> implements ServiceOrBuilder {
        public Builder() {
            super(Service.DEFAULT_INSTANCE);
        }

        public Builder(C15371 c15371) {
            super(Service.DEFAULT_INSTANCE);
        }
    }

    static {
        Service service = new Service();
        DEFAULT_INSTANCE = service;
        GeneratedMessageLite.m13417F(Service.class, service);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\t\b\t\t\t\n\t\u000b\t\f\t\u000f\t\u0012\u001b\u0014\t\u0015\t\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001a\t\u001b\t\u001c\t\u001d\t!Ȉ%\t", new Object[]{"name_", "title_", "apis_", Api.class, "types_", Type.class, "enums_", Enum.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", Endpoint.class, "configVersion_", "control_", "producerProjectId_", "logs_", LogDescriptor.class, "metrics_", MetricDescriptor.class, "monitoredResources_", MonitoredResourceDescriptor.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case NEW_MUTABLE_INSTANCE:
                return new Service();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Service> parser = PARSER;
                if (parser == null) {
                    synchronized (Service.class) {
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
