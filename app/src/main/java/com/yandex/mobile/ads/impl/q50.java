package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class q50 {

    /* renamed from: a */
    @NonNull
    private final HashMap f53940a = new HashMap();

    /* renamed from: a */
    public final void m27630a(@NonNull hc1<VideoAd> hc1Var, @NonNull q40 q40Var) {
        this.f53940a.put(hc1Var, q40Var);
    }

    @Nullable
    /* renamed from: a */
    public final q40 m27629a(@NonNull hc1<VideoAd> hc1Var) {
        return (q40) this.f53940a.get(hc1Var);
    }
}
