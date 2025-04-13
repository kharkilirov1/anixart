package com.google.cloud.audit;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.rpc.Status;

/* loaded from: classes.dex */
public final class AuditLog extends GeneratedMessageLite<AuditLog, Builder> implements AuditLogOrBuilder {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    private static final AuditLog DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile Parser<AuditLog> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private AuthenticationInfo authenticationInfo_;
    private long numResponseItems_;
    private RequestMetadata requestMetadata_;
    private Struct request_;
    private Struct response_;
    private Any serviceData_;
    private Status status_;
    private String serviceName_ = "";
    private String methodName_ = "";
    private String resourceName_ = "";
    private Internal.ProtobufList<AuthorizationInfo> authorizationInfo_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.cloud.audit.AuditLog$1 */
    public static /* synthetic */ class C15451 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20459a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20459a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20459a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20459a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20459a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20459a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20459a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20459a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuditLog, Builder> implements AuditLogOrBuilder {
        public Builder() {
            super(AuditLog.DEFAULT_INSTANCE);
        }

        public Builder(C15451 c15451) {
            super(AuditLog.DEFAULT_INSTANCE);
        }
    }

    static {
        AuditLog auditLog = new AuditLog();
        DEFAULT_INSTANCE = auditLog;
        GeneratedMessageLite.m13417F(AuditLog.class, auditLog);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0002\u0011\u000b\u0000\u0001\u0000\u0002\t\u0003\t\u0004\t\u0007Ȉ\bȈ\t\u001b\u000bȈ\f\u0002\u000f\t\u0010\t\u0011\t", new Object[]{"status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", AuthorizationInfo.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"});
            case NEW_MUTABLE_INSTANCE:
                return new AuditLog();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<AuditLog> parser = PARSER;
                if (parser == null) {
                    synchronized (AuditLog.class) {
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
