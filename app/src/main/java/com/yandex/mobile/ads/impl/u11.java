package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class u11 {

    /* renamed from: a */
    @NonNull
    private final h50 f55340a;

    /* renamed from: b */
    @Nullable
    private final SkipInfo f55341b;

    public u11(@NonNull h50 h50Var, @NonNull VideoAd videoAd) {
        this.f55340a = h50Var;
        this.f55341b = videoAd.getSkipInfo();
    }

    /* renamed from: a */
    public final void m28835a(@NonNull View view, @NonNull q40 q40Var) {
        if (this.f55341b == null) {
            view.setVisibility(8);
            return;
        }
        view.setOnClickListener(new t11(this.f55340a));
        if (!q40Var.m27614c()) {
            view.setEnabled(false);
        } else {
            view.setVisibility(0);
            view.setEnabled(true);
        }
    }
}
