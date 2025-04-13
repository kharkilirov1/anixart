package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.util.HashMap;

@Encodable
/* loaded from: classes.dex */
public abstract class ProtoEncoderDoNotUse {

    /* renamed from: a */
    public static final ProtobufEncoder f9154a;

    static {
        ProtobufEncoder.Builder builder = new ProtobufEncoder.Builder();
        ((AutoProtoEncoderDoNotUseEncoder) AutoProtoEncoderDoNotUseEncoder.f9087a).m5485a(builder);
        f9154a = new ProtobufEncoder(new HashMap(builder.f22609a), new HashMap(builder.f22610b), builder.f22611c);
    }

    /* renamed from: a */
    public abstract ClientMetrics m5518a();
}
