package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.encoders.proto.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2077a implements ObjectEncoder {

    /* renamed from: b */
    public static final /* synthetic */ C2077a f22616b = new C2077a(0);

    /* renamed from: c */
    public static final /* synthetic */ C2077a f22617c = new C2077a(1);

    /* renamed from: a */
    public final /* synthetic */ int f22618a;

    public /* synthetic */ C2077a(int i2) {
        this.f22618a = i2;
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    /* renamed from: a */
    public final void mo5437a(Object obj, Object obj2) {
        switch (this.f22618a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
                objectEncoderContext.mo12367e(ProtobufDataEncoderContext.f22596g, entry.getKey());
                objectEncoderContext.mo12367e(ProtobufDataEncoderContext.f22597h, entry.getValue());
                return;
            default:
                ObjectEncoder<Object> objectEncoder = ProtobufEncoder.Builder.f22608d;
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
