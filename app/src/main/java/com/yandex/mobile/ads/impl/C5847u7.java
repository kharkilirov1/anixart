package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.u7 */
/* loaded from: classes3.dex */
public final class C5847u7 {

    /* renamed from: a */
    @NonNull
    private final hc1<VideoAd> f55416a;

    /* renamed from: b */
    @NonNull
    private final C5905v7 f55417b;

    public C5847u7(@NonNull hc1<VideoAd> hc1Var) {
        this.f55416a = hc1Var;
        this.f55417b = new C5905v7(hc1Var.m25120e());
    }

    @NonNull
    /* renamed from: a */
    public final InterfaceC5784t7 m28907a() {
        int m27826a = new r31(this.f55417b).m27826a(this.f55416a);
        return C5782t5.m28464a(2, m27826a) ? new c31(this.f55416a.m25119d()) : C5782t5.m28464a(3, m27826a) ? new C4985dr() : new C4816an();
    }
}
