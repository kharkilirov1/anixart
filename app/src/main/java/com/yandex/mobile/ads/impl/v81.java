package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
final class v81 {

    /* renamed from: a */
    @NonNull
    private final h40 f55778a;

    /* renamed from: b */
    @NonNull
    private final t81 f55779b;

    /* renamed from: c */
    @NonNull
    private final hc1<VideoAd> f55780c;

    /* renamed from: d */
    @NonNull
    private final p50 f55781d;

    /* renamed from: e */
    @NonNull
    private final o50 f55782e;

    /* renamed from: f */
    @Nullable
    private q40 f55783f;

    public v81(@NonNull h40 h40Var, @NonNull t81 t81Var, @NonNull hc1<VideoAd> hc1Var, @NonNull q50 q50Var, @NonNull cr0 cr0Var, @NonNull h50 h50Var) {
        this.f55778a = h40Var;
        this.f55779b = t81Var;
        this.f55780c = hc1Var;
        this.f55781d = new p50(q50Var, cr0Var);
        this.f55782e = new o50(q50Var, h50Var);
    }

    /* renamed from: a */
    public final void m29195a() {
        InstreamAdView m25051b = this.f55778a.m25051b();
        if (this.f55783f != null || m25051b == null) {
            return;
        }
        q40 m27169a = this.f55781d.m27169a(this.f55780c);
        this.f55783f = m27169a;
        this.f55779b.mo27330a(m25051b, m27169a);
    }

    /* renamed from: b */
    public final void m29197b() {
        InstreamAdView m25051b = this.f55778a.m25051b();
        q40 q40Var = this.f55783f;
        if (q40Var == null || m25051b == null) {
            return;
        }
        this.f55782e.m27002b(this.f55780c, m25051b, q40Var);
        this.f55783f = null;
        this.f55779b.mo27329a(m25051b);
    }

    /* renamed from: a */
    public final void m29196a(@NonNull hc1<VideoAd> hc1Var) {
        InstreamAdView m25051b = this.f55778a.m25051b();
        q40 q40Var = this.f55783f;
        if (q40Var == null || m25051b == null) {
            return;
        }
        this.f55782e.m27001a(hc1Var, m25051b, q40Var);
    }
}
