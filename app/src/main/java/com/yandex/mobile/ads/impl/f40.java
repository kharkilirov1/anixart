package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class f40 {

    /* renamed from: a */
    @NonNull
    private final Context f50119a;

    /* renamed from: b */
    @NonNull
    private final i40 f50120b;

    /* renamed from: c */
    @NonNull
    private final m30 f50121c;

    /* renamed from: d */
    @NonNull
    private final w81 f50122d;

    /* renamed from: e */
    @Nullable
    private v81 f50123e;

    public f40(@NonNull Context context, @NonNull i40 i40Var, @NonNull cr0 cr0Var, @NonNull t30 t30Var) {
        this.f50119a = context.getApplicationContext();
        this.f50120b = i40Var;
        m30 m30Var = new m30();
        this.f50121c = m30Var;
        this.f50122d = new w81(cr0Var, t30Var, m30Var);
    }

    /* renamed from: a */
    public final void m24316a(@Nullable ub1 ub1Var) {
        this.f50121c.m26565a(ub1Var);
    }

    /* renamed from: a */
    public final void m24315a(@NonNull m50 m50Var, @NonNull hc1 hc1Var, @NonNull tf1 tf1Var, @NonNull tb1 tb1Var, @NonNull sp0 sp0Var) {
        m24313a();
        h40 m25440a = this.f50120b.m25440a();
        if (m25440a != null) {
            v81 m29406a = this.f50122d.m29406a(this.f50119a, m25440a, m50Var, hc1Var, tf1Var, sp0Var, tb1Var);
            this.f50123e = m29406a;
            m29406a.m29195a();
        }
    }

    /* renamed from: a */
    public final void m24313a() {
        v81 v81Var = this.f50123e;
        if (v81Var != null) {
            v81Var.m29197b();
            this.f50123e = null;
        }
    }

    /* renamed from: a */
    public final void m24314a(@NonNull hc1<VideoAd> hc1Var) {
        v81 v81Var = this.f50123e;
        if (v81Var != null) {
            v81Var.m29196a(hc1Var);
        }
    }
}
