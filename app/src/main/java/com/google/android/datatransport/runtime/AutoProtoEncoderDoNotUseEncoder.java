package com.google.android.datatransport.runtime;

import androidx.room.util.C0576a;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.IOException;

/* loaded from: classes.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {

    /* renamed from: a */
    public static final Configurator f9087a = new AutoProtoEncoderDoNotUseEncoder();

    public static final class ClientMetricsEncoder implements ObjectEncoder<ClientMetrics> {

        /* renamed from: a */
        public static final ClientMetricsEncoder f9088a = new ClientMetricsEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f9089b;

        /* renamed from: c */
        public static final FieldDescriptor f9090c;

        /* renamed from: d */
        public static final FieldDescriptor f9091d;

        /* renamed from: e */
        public static final FieldDescriptor f9092e;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("window");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f22589a = 1;
            f9089b = C0576a.m4109h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("logSourceMetrics");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f22589a = 2;
            f9090c = C0576a.m4109h(atProtobuf2, builder2);
            FieldDescriptor.Builder builder3 = new FieldDescriptor.Builder("globalMetrics");
            AtProtobuf atProtobuf3 = new AtProtobuf();
            atProtobuf3.f22589a = 3;
            f9091d = C0576a.m4109h(atProtobuf3, builder3);
            FieldDescriptor.Builder builder4 = new FieldDescriptor.Builder("appNamespace");
            AtProtobuf atProtobuf4 = new AtProtobuf();
            atProtobuf4.f22589a = 4;
            f9092e = C0576a.m4109h(atProtobuf4, builder4);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            ClientMetrics clientMetrics = (ClientMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.mo12367e(f9089b, clientMetrics.f9213a);
            objectEncoderContext.mo12367e(f9090c, clientMetrics.f9214b);
            objectEncoderContext.mo12367e(f9091d, clientMetrics.f9215c);
            objectEncoderContext.mo12367e(f9092e, clientMetrics.f9216d);
        }
    }

    public static final class GlobalMetricsEncoder implements ObjectEncoder<GlobalMetrics> {

        /* renamed from: a */
        public static final GlobalMetricsEncoder f9093a = new GlobalMetricsEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f9094b;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("storageMetrics");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f22589a = 1;
            f9094b = C0576a.m4109h(atProtobuf, builder);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).mo12367e(f9094b, ((GlobalMetrics) obj).f9221a);
        }
    }

    public static final class LogEventDroppedEncoder implements ObjectEncoder<LogEventDropped> {

        /* renamed from: a */
        public static final LogEventDroppedEncoder f9095a = new LogEventDroppedEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f9096b;

        /* renamed from: c */
        public static final FieldDescriptor f9097c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("eventsDroppedCount");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f22589a = 1;
            f9096b = C0576a.m4109h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("reason");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f22589a = 3;
            f9097c = C0576a.m4109h(atProtobuf2, builder2);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            LogEventDropped logEventDropped = (LogEventDropped) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.mo12365a(f9096b, logEventDropped.f9223a);
            objectEncoderContext.mo12367e(f9097c, logEventDropped.f9224b);
        }
    }

    public static final class LogSourceMetricsEncoder implements ObjectEncoder<LogSourceMetrics> {

        /* renamed from: a */
        public static final LogSourceMetricsEncoder f9098a = new LogSourceMetricsEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f9099b;

        /* renamed from: c */
        public static final FieldDescriptor f9100c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("logSource");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f22589a = 1;
            f9099b = C0576a.m4109h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("logEventDropped");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f22589a = 2;
            f9100c = C0576a.m4109h(atProtobuf2, builder2);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            LogSourceMetrics logSourceMetrics = (LogSourceMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.mo12367e(f9099b, logSourceMetrics.f9237a);
            objectEncoderContext.mo12367e(f9100c, logSourceMetrics.f9238b);
        }
    }

    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* renamed from: a */
        public static final ProtoEncoderDoNotUseEncoder f9101a = new ProtoEncoderDoNotUseEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f9102b = FieldDescriptor.m12362a("clientMetrics");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).mo12367e(f9102b, ((ProtoEncoderDoNotUse) obj).m5518a());
        }
    }

    public static final class StorageMetricsEncoder implements ObjectEncoder<StorageMetrics> {

        /* renamed from: a */
        public static final StorageMetricsEncoder f9103a = new StorageMetricsEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f9104b;

        /* renamed from: c */
        public static final FieldDescriptor f9105c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("currentCacheSizeBytes");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f22589a = 1;
            f9104b = C0576a.m4109h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("maxCacheSizeBytes");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f22589a = 2;
            f9105c = C0576a.m4109h(atProtobuf2, builder2);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            StorageMetrics storageMetrics = (StorageMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.mo12365a(f9104b, storageMetrics.f9241a);
            objectEncoderContext.mo12365a(f9105c, storageMetrics.f9242b);
        }
    }

    public static final class TimeWindowEncoder implements ObjectEncoder<TimeWindow> {

        /* renamed from: a */
        public static final TimeWindowEncoder f9106a = new TimeWindowEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f9107b;

        /* renamed from: c */
        public static final FieldDescriptor f9108c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("startMs");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f22589a = 1;
            f9107b = C0576a.m4109h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("endMs");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f22589a = 2;
            f9108c = C0576a.m4109h(atProtobuf2, builder2);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            TimeWindow timeWindow = (TimeWindow) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.mo12365a(f9107b, timeWindow.f9245a);
            objectEncoderContext.mo12365a(f9108c, timeWindow.f9246b);
        }
    }

    /* renamed from: a */
    public void m5485a(EncoderConfig<?> encoderConfig) {
        encoderConfig.mo12371a(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.f9101a);
        encoderConfig.mo12371a(ClientMetrics.class, ClientMetricsEncoder.f9088a);
        encoderConfig.mo12371a(TimeWindow.class, TimeWindowEncoder.f9106a);
        encoderConfig.mo12371a(LogSourceMetrics.class, LogSourceMetricsEncoder.f9098a);
        encoderConfig.mo12371a(LogEventDropped.class, LogEventDroppedEncoder.f9095a);
        encoderConfig.mo12371a(GlobalMetrics.class, GlobalMetricsEncoder.f9093a);
        encoderConfig.mo12371a(StorageMetrics.class, StorageMetricsEncoder.f9103a);
    }
}
