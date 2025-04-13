package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
final class w81 {

    /* renamed from: a */
    @NonNull
    private final u81 f56046a;

    /* renamed from: b */
    @NonNull
    private final q50 f56047b = new q50();

    /* renamed from: c */
    @NonNull
    private final cr0 f56048c;

    /* renamed from: d */
    @NonNull
    private final t30 f56049d;

    public w81(@NonNull cr0 cr0Var, @NonNull t30 t30Var, @NonNull m30 m30Var) {
        this.f56048c = cr0Var;
        this.f56049d = t30Var;
        this.f56046a = new u81(m30Var);
    }

    @NonNull
    /* renamed from: a */
    public final v81 m29406a(@NonNull Context context, @NonNull h40 h40Var, @NonNull m50 m50Var, @NonNull hc1 hc1Var, @NonNull tf1 tf1Var, @NonNull sp0 sp0Var, @NonNull tb1 tb1Var) {
        h50 h50Var = new h50((VideoAd) hc1Var.m25118c(), this.f56049d);
        return new v81(h40Var, this.f56046a.m28913a(context, m50Var, hc1Var, h50Var, tf1Var, sp0Var, tb1Var), hc1Var, this.f56047b, this.f56048c, h50Var);
    }
}
