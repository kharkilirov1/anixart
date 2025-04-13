package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class p50 {

    /* renamed from: a */
    @NonNull
    private final q50 f53387a;

    /* renamed from: b */
    @NonNull
    private final C5810tn f53388b;

    public p50(@NonNull q50 q50Var, @NonNull cr0 cr0Var) {
        this.f53387a = q50Var;
        this.f53388b = new C5810tn(cr0Var);
    }

    @NonNull
    /* renamed from: a */
    public final q40 m27169a(@NonNull hc1<VideoAd> hc1Var) {
        q40 m27629a = this.f53387a.m27629a(hc1Var);
        return m27629a == null ? this.f53388b.m28692a() : m27629a;
    }
}
