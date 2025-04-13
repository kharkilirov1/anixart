package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import com.yandex.mobile.ads.impl.sa0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo1 implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ int f53303a;

    /* renamed from: b */
    public final /* synthetic */ sa0.InterfaceC5736c f53304b;

    /* renamed from: c */
    public final /* synthetic */ Object f53305c;

    public /* synthetic */ oo1(Object obj, sa0.InterfaceC5736c interfaceC5736c, int i2) {
        this.f53303a = i2;
        this.f53305c = obj;
        this.f53304b = interfaceC5736c;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
        switch (this.f53303a) {
            case 0:
                ((C5173hb) this.f53305c).m25104a(this.f53304b, mediaCodec, j2, j3);
                break;
            default:
                ((e51) this.f53305c).m24015a(this.f53304b, mediaCodec, j2, j3);
                break;
        }
    }
}
