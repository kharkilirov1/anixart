package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.yandex.mobile.ads.base.model.BiddingSettings;

/* renamed from: com.yandex.mobile.ads.impl.ne */
/* loaded from: classes3.dex */
public final class C5486ne {

    /* renamed from: a */
    @NonNull
    private final C5101g2 f52930a;

    public C5486ne(@NonNull C5101g2 c5101g2) {
        this.f52930a = c5101g2;
    }

    @WorkerThread
    /* renamed from: a */
    public final void m26857a(@NonNull Context context, @NonNull BiddingSettings biddingSettings, @NonNull InterfaceC5588pe interfaceC5588pe) {
        new C5245ir(this.f52930a, biddingSettings).m25603a(context, interfaceC5588pe);
    }
}
