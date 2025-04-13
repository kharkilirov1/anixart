package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

/* loaded from: classes.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {

    /* renamed from: a */
    public static final Configurator f8974a = new AutoBatchedLogRequestEncoder();

    public static final class AndroidClientInfoEncoder implements ObjectEncoder<AndroidClientInfo> {

        /* renamed from: a */
        public static final AndroidClientInfoEncoder f8975a = new AndroidClientInfoEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f8976b = FieldDescriptor.m12362a("sdkVersion");

        /* renamed from: c */
        public static final FieldDescriptor f8977c = FieldDescriptor.m12362a("model");

        /* renamed from: d */
        public static final FieldDescriptor f8978d = FieldDescriptor.m12362a("hardware");

        /* renamed from: e */
        public static final FieldDescriptor f8979e = FieldDescriptor.m12362a("device");

        /* renamed from: f */
        public static final FieldDescriptor f8980f = FieldDescriptor.m12362a("product");

        /* renamed from: g */
        public static final FieldDescriptor f8981g = FieldDescriptor.m12362a("osBuild");

        /* renamed from: h */
        public static final FieldDescriptor f8982h = FieldDescriptor.m12362a("manufacturer");

        /* renamed from: i */
        public static final FieldDescriptor f8983i = FieldDescriptor.m12362a("fingerprint");

        /* renamed from: j */
        public static final FieldDescriptor f8984j = FieldDescriptor.m12362a("locale");

        /* renamed from: k */
        public static final FieldDescriptor f8985k = FieldDescriptor.m12362a("country");

        /* renamed from: l */
        public static final FieldDescriptor f8986l = FieldDescriptor.m12362a("mccMnc");

        /* renamed from: m */
        public static final FieldDescriptor f8987m = FieldDescriptor.m12362a("applicationBuild");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.mo12367e(f8976b, androidClientInfo.mo5422m());
            objectEncoderContext.mo12367e(f8977c, androidClientInfo.mo5419j());
            objectEncoderContext.mo12367e(f8978d, androidClientInfo.mo5415f());
            objectEncoderContext.mo12367e(f8979e, androidClientInfo.mo5413d());
            objectEncoderContext.mo12367e(f8980f, androidClientInfo.mo5421l());
            objectEncoderContext.mo12367e(f8981g, androidClientInfo.mo5420k());
            objectEncoderContext.mo12367e(f8982h, androidClientInfo.mo5417h());
            objectEncoderContext.mo12367e(f8983i, androidClientInfo.mo5414e());
            objectEncoderContext.mo12367e(f8984j, androidClientInfo.mo5416g());
            objectEncoderContext.mo12367e(f8985k, androidClientInfo.mo5412c());
            objectEncoderContext.mo12367e(f8986l, androidClientInfo.mo5418i());
            objectEncoderContext.mo12367e(f8987m, androidClientInfo.mo5411b());
        }
    }

    public static final class BatchedLogRequestEncoder implements ObjectEncoder<BatchedLogRequest> {

        /* renamed from: a */
        public static final BatchedLogRequestEncoder f8988a = new BatchedLogRequestEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f8989b = FieldDescriptor.m12362a("logRequest");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).mo12367e(f8989b, ((BatchedLogRequest) obj).mo5438b());
        }
    }

    public static final class ClientInfoEncoder implements ObjectEncoder<ClientInfo> {

        /* renamed from: a */
        public static final ClientInfoEncoder f8990a = new ClientInfoEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f8991b = FieldDescriptor.m12362a("clientType");

        /* renamed from: c */
        public static final FieldDescriptor f8992c = FieldDescriptor.m12362a("androidClientInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            ClientInfo clientInfo = (ClientInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.mo12367e(f8991b, clientInfo.mo5440c());
            objectEncoderContext.mo12367e(f8992c, clientInfo.mo5439b());
        }
    }

    public static final class LogEventEncoder implements ObjectEncoder<LogEvent> {

        /* renamed from: a */
        public static final LogEventEncoder f8993a = new LogEventEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f8994b = FieldDescriptor.m12362a("eventTimeMs");

        /* renamed from: c */
        public static final FieldDescriptor f8995c = FieldDescriptor.m12362a("eventCode");

        /* renamed from: d */
        public static final FieldDescriptor f8996d = FieldDescriptor.m12362a("eventUptimeMs");

        /* renamed from: e */
        public static final FieldDescriptor f8997e = FieldDescriptor.m12362a("sourceExtension");

        /* renamed from: f */
        public static final FieldDescriptor f8998f = FieldDescriptor.m12362a("sourceExtensionJsonProto3");

        /* renamed from: g */
        public static final FieldDescriptor f8999g = FieldDescriptor.m12362a("timezoneOffsetSeconds");

        /* renamed from: h */
        public static final FieldDescriptor f9000h = FieldDescriptor.m12362a("networkConnectionInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            LogEvent logEvent = (LogEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.mo12365a(f8994b, logEvent.mo5445b());
            objectEncoderContext.mo12367e(f8995c, logEvent.mo5444a());
            objectEncoderContext.mo12365a(f8996d, logEvent.mo5446c());
            objectEncoderContext.mo12367e(f8997e, logEvent.mo5448e());
            objectEncoderContext.mo12367e(f8998f, logEvent.mo5449f());
            objectEncoderContext.mo12365a(f8999g, logEvent.mo5450g());
            objectEncoderContext.mo12367e(f9000h, logEvent.mo5447d());
        }
    }

    public static final class LogRequestEncoder implements ObjectEncoder<LogRequest> {

        /* renamed from: a */
        public static final LogRequestEncoder f9001a = new LogRequestEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f9002b = FieldDescriptor.m12362a("requestTimeMs");

        /* renamed from: c */
        public static final FieldDescriptor f9003c = FieldDescriptor.m12362a("requestUptimeMs");

        /* renamed from: d */
        public static final FieldDescriptor f9004d = FieldDescriptor.m12362a("clientInfo");

        /* renamed from: e */
        public static final FieldDescriptor f9005e = FieldDescriptor.m12362a("logSource");

        /* renamed from: f */
        public static final FieldDescriptor f9006f = FieldDescriptor.m12362a("logSourceName");

        /* renamed from: g */
        public static final FieldDescriptor f9007g = FieldDescriptor.m12362a("logEvent");

        /* renamed from: h */
        public static final FieldDescriptor f9008h = FieldDescriptor.m12362a("qosTier");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            LogRequest logRequest = (LogRequest) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.mo12365a(f9002b, logRequest.mo5462g());
            objectEncoderContext.mo12365a(f9003c, logRequest.mo5463h());
            objectEncoderContext.mo12367e(f9004d, logRequest.mo5457b());
            objectEncoderContext.mo12367e(f9005e, logRequest.mo5459d());
            objectEncoderContext.mo12367e(f9006f, logRequest.mo5460e());
            objectEncoderContext.mo12367e(f9007g, logRequest.mo5458c());
            objectEncoderContext.mo12367e(f9008h, logRequest.mo5461f());
        }
    }

    public static final class NetworkConnectionInfoEncoder implements ObjectEncoder<NetworkConnectionInfo> {

        /* renamed from: a */
        public static final NetworkConnectionInfoEncoder f9009a = new NetworkConnectionInfoEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f9010b = FieldDescriptor.m12362a("networkType");

        /* renamed from: c */
        public static final FieldDescriptor f9011c = FieldDescriptor.m12362a("mobileSubtype");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.mo12367e(f9010b, networkConnectionInfo.mo5474c());
            objectEncoderContext.mo12367e(f9011c, networkConnectionInfo.mo5473b());
        }
    }

    /* renamed from: a */
    public void m5436a(EncoderConfig<?> encoderConfig) {
        BatchedLogRequestEncoder batchedLogRequestEncoder = BatchedLogRequestEncoder.f8988a;
        encoderConfig.mo12371a(BatchedLogRequest.class, batchedLogRequestEncoder);
        encoderConfig.mo12371a(AutoValue_BatchedLogRequest.class, batchedLogRequestEncoder);
        LogRequestEncoder logRequestEncoder = LogRequestEncoder.f9001a;
        encoderConfig.mo12371a(LogRequest.class, logRequestEncoder);
        encoderConfig.mo12371a(AutoValue_LogRequest.class, logRequestEncoder);
        ClientInfoEncoder clientInfoEncoder = ClientInfoEncoder.f8990a;
        encoderConfig.mo12371a(ClientInfo.class, clientInfoEncoder);
        encoderConfig.mo12371a(AutoValue_ClientInfo.class, clientInfoEncoder);
        AndroidClientInfoEncoder androidClientInfoEncoder = AndroidClientInfoEncoder.f8975a;
        encoderConfig.mo12371a(AndroidClientInfo.class, androidClientInfoEncoder);
        encoderConfig.mo12371a(AutoValue_AndroidClientInfo.class, androidClientInfoEncoder);
        LogEventEncoder logEventEncoder = LogEventEncoder.f8993a;
        encoderConfig.mo12371a(LogEvent.class, logEventEncoder);
        encoderConfig.mo12371a(AutoValue_LogEvent.class, logEventEncoder);
        NetworkConnectionInfoEncoder networkConnectionInfoEncoder = NetworkConnectionInfoEncoder.f9009a;
        encoderConfig.mo12371a(NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        encoderConfig.mo12371a(AutoValue_NetworkConnectionInfo.class, networkConnectionInfoEncoder);
    }
}
