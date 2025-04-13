package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.MediaView;

/* loaded from: classes3.dex */
public final class oc0 {

    /* renamed from: a */
    @NonNull
    private final C5965wa f53244a;

    /* renamed from: b */
    @NonNull
    private final C5101g2 f53245b;

    /* renamed from: c */
    @NonNull
    private final l20 f53246c;

    /* renamed from: d */
    @NonNull
    private final pc0 f53247d;

    /* renamed from: e */
    @Nullable
    private final s01 f53248e;

    public oc0(@NonNull C5965wa c5965wa, @NonNull C5101g2 c5101g2, @NonNull l20 l20Var, @NonNull pc0 pc0Var, @Nullable s01 s01Var) {
        this.f53244a = c5965wa;
        this.f53245b = c5101g2;
        this.f53246c = l20Var;
        this.f53247d = pc0Var;
        this.f53248e = s01Var;
    }

    @Nullable
    /* renamed from: a */
    public final nc0 m27068a(@NonNull MediaView mediaView, @NonNull w10 w10Var, @NonNull zj0 zj0Var, @NonNull nj0 nj0Var) {
        return this.f53247d.mo25870a(mediaView, this.f53245b, w10Var, this.f53246c, zj0Var, nj0Var, this.f53248e, this.f53244a.m29417a());
    }
}
