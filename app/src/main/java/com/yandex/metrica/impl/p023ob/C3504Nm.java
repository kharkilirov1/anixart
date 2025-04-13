package com.yandex.metrica.impl.p023ob;

import android.os.SystemClock;

/* renamed from: com.yandex.metrica.impl.ob.Nm */
/* loaded from: classes2.dex */
public class C3504Nm implements InterfaceC3529Om {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3529Om
    /* renamed from: a */
    public long mo18643a() {
        return System.currentTimeMillis();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3529Om
    /* renamed from: b */
    public long mo18644b() {
        return System.currentTimeMillis() / 1000;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3529Om
    /* renamed from: c */
    public long mo18645c() {
        return SystemClock.elapsedRealtime();
    }
}
