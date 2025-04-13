package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.q40;
import com.yandex.mobile.ads.instream.player.p025ad.C6154a;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class o50 {

    /* renamed from: a */
    @NonNull
    private final q50 f53171a;

    /* renamed from: b */
    @NonNull
    private final C6154a f53172b = new C6154a();

    /* renamed from: c */
    @NonNull
    private final k30 f53173c;

    public o50(@NonNull q50 q50Var, @NonNull h50 h50Var) {
        this.f53171a = q50Var;
        this.f53173c = new k30(h50Var);
    }

    /* renamed from: a */
    public final void m27001a(@NonNull hc1<VideoAd> hc1Var, @NonNull InstreamAdView instreamAdView, @NonNull q40 q40Var) {
        Objects.requireNonNull(this.f53172b);
        ub1 m30403a = C6154a.m30403a(instreamAdView);
        if (m30403a != null) {
            this.f53171a.m27630a(hc1Var, new q40.C5619a().m27623b(this.f53173c.m26016a(m30403a, q40Var).m27615d()).m27620a(q40Var.m27612a()).m27621a());
        }
    }

    /* renamed from: b */
    public final void m27002b(@NonNull hc1<VideoAd> hc1Var, @NonNull InstreamAdView instreamAdView, @NonNull q40 q40Var) {
        Objects.requireNonNull(this.f53172b);
        ub1 m30403a = C6154a.m30403a(instreamAdView);
        if (m30403a != null) {
            this.f53171a.m27630a(hc1Var, this.f53173c.m26016a(m30403a, q40Var));
        }
    }
}
