package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import java.util.List;

/* loaded from: classes3.dex */
public final class i40 {

    /* renamed from: a */
    @Nullable
    private h40 f51213a;

    /* renamed from: a */
    public final void m25441a(@NonNull InstreamAdView instreamAdView, @NonNull List<fc1> list) {
        this.f51213a = new h40(instreamAdView, list);
    }

    /* renamed from: b */
    public final void m25442b() {
        this.f51213a = null;
    }

    @Nullable
    /* renamed from: a */
    public final h40 m25440a() {
        return this.f51213a;
    }
}
