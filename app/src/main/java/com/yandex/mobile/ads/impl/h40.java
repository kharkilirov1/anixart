package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public final class h40 {

    /* renamed from: a */
    @NonNull
    private final WeakReference<InstreamAdView> f50830a;

    /* renamed from: b */
    @NonNull
    private final List<fc1> f50831b;

    public h40(@NonNull InstreamAdView instreamAdView, @NonNull List<fc1> list) {
        this.f50830a = new WeakReference<>(instreamAdView);
        this.f50831b = list;
    }

    @NonNull
    /* renamed from: a */
    public final List<fc1> m25050a() {
        return this.f50831b;
    }

    @Nullable
    /* renamed from: b */
    public final InstreamAdView m25051b() {
        return this.f50830a.get();
    }
}
