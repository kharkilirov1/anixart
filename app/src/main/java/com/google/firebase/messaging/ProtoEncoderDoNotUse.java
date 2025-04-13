package com.google.firebase.messaging;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.util.HashMap;

@Encodable
/* loaded from: classes2.dex */
public abstract class ProtoEncoderDoNotUse {

    /* renamed from: a */
    public static final ProtobufEncoder f23301a;

    static {
        ProtobufEncoder.Builder builder = new ProtobufEncoder.Builder();
        ((AutoProtoEncoderDoNotUseEncoder) AutoProtoEncoderDoNotUseEncoder.f23227a).m12633a(builder);
        f23301a = new ProtobufEncoder(new HashMap(builder.f22609a), new HashMap(builder.f22610b), builder.f22611c);
    }

    /* renamed from: a */
    public abstract MessagingClientEventExtension m12678a();
}
