package com.google.firebase.messaging;

import androidx.room.util.C0576a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {

    /* renamed from: a */
    public static final Configurator f23227a = new AutoProtoEncoderDoNotUseEncoder();

    public static final class MessagingClientEventEncoder implements ObjectEncoder<MessagingClientEvent> {

        /* renamed from: a */
        public static final MessagingClientEventEncoder f23228a = new MessagingClientEventEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f23229b;

        /* renamed from: c */
        public static final FieldDescriptor f23230c;

        /* renamed from: d */
        public static final FieldDescriptor f23231d;

        /* renamed from: e */
        public static final FieldDescriptor f23232e;

        /* renamed from: f */
        public static final FieldDescriptor f23233f;

        /* renamed from: g */
        public static final FieldDescriptor f23234g;

        /* renamed from: h */
        public static final FieldDescriptor f23235h;

        /* renamed from: i */
        public static final FieldDescriptor f23236i;

        /* renamed from: j */
        public static final FieldDescriptor f23237j;

        /* renamed from: k */
        public static final FieldDescriptor f23238k;

        /* renamed from: l */
        public static final FieldDescriptor f23239l;

        /* renamed from: m */
        public static final FieldDescriptor f23240m;

        /* renamed from: n */
        public static final FieldDescriptor f23241n;

        /* renamed from: o */
        public static final FieldDescriptor f23242o;

        /* renamed from: p */
        public static final FieldDescriptor f23243p;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("projectNumber");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f22589a = 1;
            f23229b = C0576a.m4109h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("messageId");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f22589a = 2;
            f23230c = C0576a.m4109h(atProtobuf2, builder2);
            FieldDescriptor.Builder builder3 = new FieldDescriptor.Builder("instanceId");
            AtProtobuf atProtobuf3 = new AtProtobuf();
            atProtobuf3.f22589a = 3;
            f23231d = C0576a.m4109h(atProtobuf3, builder3);
            FieldDescriptor.Builder builder4 = new FieldDescriptor.Builder("messageType");
            AtProtobuf atProtobuf4 = new AtProtobuf();
            atProtobuf4.f22589a = 4;
            f23232e = C0576a.m4109h(atProtobuf4, builder4);
            FieldDescriptor.Builder builder5 = new FieldDescriptor.Builder("sdkPlatform");
            AtProtobuf atProtobuf5 = new AtProtobuf();
            atProtobuf5.f22589a = 5;
            f23233f = C0576a.m4109h(atProtobuf5, builder5);
            FieldDescriptor.Builder builder6 = new FieldDescriptor.Builder("packageName");
            AtProtobuf atProtobuf6 = new AtProtobuf();
            atProtobuf6.f22589a = 6;
            f23234g = C0576a.m4109h(atProtobuf6, builder6);
            FieldDescriptor.Builder builder7 = new FieldDescriptor.Builder("collapseKey");
            AtProtobuf atProtobuf7 = new AtProtobuf();
            atProtobuf7.f22589a = 7;
            f23235h = C0576a.m4109h(atProtobuf7, builder7);
            FieldDescriptor.Builder builder8 = new FieldDescriptor.Builder("priority");
            AtProtobuf atProtobuf8 = new AtProtobuf();
            atProtobuf8.f22589a = 8;
            f23236i = C0576a.m4109h(atProtobuf8, builder8);
            FieldDescriptor.Builder builder9 = new FieldDescriptor.Builder("ttl");
            AtProtobuf atProtobuf9 = new AtProtobuf();
            atProtobuf9.f22589a = 9;
            f23237j = C0576a.m4109h(atProtobuf9, builder9);
            FieldDescriptor.Builder builder10 = new FieldDescriptor.Builder("topic");
            AtProtobuf atProtobuf10 = new AtProtobuf();
            atProtobuf10.f22589a = 10;
            f23238k = C0576a.m4109h(atProtobuf10, builder10);
            FieldDescriptor.Builder builder11 = new FieldDescriptor.Builder("bulkId");
            AtProtobuf atProtobuf11 = new AtProtobuf();
            atProtobuf11.f22589a = 11;
            f23239l = C0576a.m4109h(atProtobuf11, builder11);
            FieldDescriptor.Builder builder12 = new FieldDescriptor.Builder("event");
            AtProtobuf atProtobuf12 = new AtProtobuf();
            atProtobuf12.f22589a = 12;
            f23240m = C0576a.m4109h(atProtobuf12, builder12);
            FieldDescriptor.Builder builder13 = new FieldDescriptor.Builder("analyticsLabel");
            AtProtobuf atProtobuf13 = new AtProtobuf();
            atProtobuf13.f22589a = 13;
            f23241n = C0576a.m4109h(atProtobuf13, builder13);
            FieldDescriptor.Builder builder14 = new FieldDescriptor.Builder("campaignId");
            AtProtobuf atProtobuf14 = new AtProtobuf();
            atProtobuf14.f22589a = 14;
            f23242o = C0576a.m4109h(atProtobuf14, builder14);
            FieldDescriptor.Builder builder15 = new FieldDescriptor.Builder("composerLabel");
            AtProtobuf atProtobuf15 = new AtProtobuf();
            atProtobuf15.f22589a = 15;
            f23243p = C0576a.m4109h(atProtobuf15, builder15);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.mo12365a(f23229b, messagingClientEvent.f23406a);
            objectEncoderContext.mo12367e(f23230c, messagingClientEvent.f23407b);
            objectEncoderContext.mo12367e(f23231d, messagingClientEvent.f23408c);
            objectEncoderContext.mo12367e(f23232e, messagingClientEvent.f23409d);
            objectEncoderContext.mo12367e(f23233f, messagingClientEvent.f23410e);
            objectEncoderContext.mo12367e(f23234g, messagingClientEvent.f23411f);
            objectEncoderContext.mo12367e(f23235h, messagingClientEvent.f23412g);
            objectEncoderContext.mo12366b(f23236i, messagingClientEvent.f23413h);
            objectEncoderContext.mo12366b(f23237j, messagingClientEvent.f23414i);
            objectEncoderContext.mo12367e(f23238k, messagingClientEvent.f23415j);
            objectEncoderContext.mo12365a(f23239l, messagingClientEvent.f23416k);
            objectEncoderContext.mo12367e(f23240m, messagingClientEvent.f23417l);
            objectEncoderContext.mo12367e(f23241n, messagingClientEvent.f23418m);
            objectEncoderContext.mo12365a(f23242o, messagingClientEvent.f23419n);
            objectEncoderContext.mo12367e(f23243p, messagingClientEvent.f23420o);
        }
    }

    public static final class MessagingClientEventExtensionEncoder implements ObjectEncoder<MessagingClientEventExtension> {

        /* renamed from: a */
        public static final MessagingClientEventExtensionEncoder f23244a = new MessagingClientEventExtensionEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f23245b;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("messagingClientEvent");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f22589a = 1;
            f23245b = C0576a.m4109h(atProtobuf, builder);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).mo12367e(f23245b, ((MessagingClientEventExtension) obj).f23446a);
        }
    }

    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* renamed from: a */
        public static final ProtoEncoderDoNotUseEncoder f23246a = new ProtoEncoderDoNotUseEncoder();

        /* renamed from: b */
        public static final FieldDescriptor f23247b = FieldDescriptor.m12362a("messagingClientEventExtension");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void mo5437a(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).mo12367e(f23247b, ((ProtoEncoderDoNotUse) obj).m12678a());
        }
    }

    /* renamed from: a */
    public void m12633a(EncoderConfig<?> encoderConfig) {
        encoderConfig.mo12371a(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.f23246a);
        encoderConfig.mo12371a(MessagingClientEventExtension.class, MessagingClientEventExtensionEncoder.f23244a);
        encoderConfig.mo12371a(MessagingClientEvent.class, MessagingClientEventEncoder.f23228a);
    }
}
