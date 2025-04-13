package com.google.firebase.encoders.json;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.encoders.json.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2075b implements ValueEncoder {

    /* renamed from: b */
    public static final /* synthetic */ C2075b f22586b = new C2075b(0);

    /* renamed from: c */
    public static final /* synthetic */ C2075b f22587c = new C2075b(1);

    /* renamed from: a */
    public final /* synthetic */ int f22588a;

    public /* synthetic */ C2075b(int i2) {
        this.f22588a = i2;
    }

    @Override // com.google.firebase.encoders.ValueEncoder
    /* renamed from: a */
    public final void mo12368a(Object obj, Object obj2) {
        switch (this.f22588a) {
            case 0:
                JsonDataEncoderBuilder.TimestampEncoder timestampEncoder = JsonDataEncoderBuilder.f22572e;
                ((ValueEncoderContext) obj2).mo12369c((String) obj);
                break;
            default:
                JsonDataEncoderBuilder.TimestampEncoder timestampEncoder2 = JsonDataEncoderBuilder.f22572e;
                ((ValueEncoderContext) obj2).mo12370d(((Boolean) obj).booleanValue());
                break;
        }
    }
}
