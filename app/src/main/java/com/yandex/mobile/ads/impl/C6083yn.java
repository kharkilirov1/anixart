package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5173hb;
import com.yandex.mobile.ads.impl.e51;
import com.yandex.mobile.ads.impl.sa0;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.yn */
/* loaded from: classes3.dex */
public final class C6083yn implements sa0.InterfaceC5735b {
    @Override // com.yandex.mobile.ads.impl.sa0.InterfaceC5735b
    /* renamed from: a */
    public final sa0 mo24031a(sa0.C5734a c5734a) throws IOException {
        int i2 = s91.f54530a;
        if (i2 < 23 || i2 < 31) {
            return new e51.C5006a().mo24031a(c5734a);
        }
        int m25138a = he0.m25138a(c5734a.f54546c.f53820l);
        StringBuilder m26356a = l60.m26356a("Creating an asynchronous MediaCodec adapter for track type ");
        m26356a.append(s91.m28129d(m25138a));
        d90.m23841c("DMCodecAdapterFactory", m26356a.toString());
        return new C5173hb.a(m25138a).mo24031a(c5734a);
    }
}
