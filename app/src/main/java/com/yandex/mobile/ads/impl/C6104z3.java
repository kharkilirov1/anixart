package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;

/* renamed from: com.yandex.mobile.ads.impl.z3 */
/* loaded from: classes3.dex */
public final class C6104z3 {

    /* renamed from: a */
    @NonNull
    private AdPlaybackState f57023a = AdPlaybackState.f12599h;

    /* renamed from: b */
    @Nullable
    private AdsLoader.EventListener f57024b;

    /* renamed from: a */
    public final void m30047a(@Nullable AdsLoader.EventListener eventListener) {
        this.f57024b = eventListener;
    }

    /* renamed from: b */
    public final void m30048b() {
        this.f57024b = null;
        this.f57023a = AdPlaybackState.f12599h;
    }

    @NonNull
    /* renamed from: a */
    public final AdPlaybackState m30045a() {
        return this.f57023a;
    }

    /* renamed from: a */
    public final void m30046a(@NonNull AdPlaybackState adPlaybackState) {
        this.f57023a = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f57024b;
        if (eventListener != null) {
            eventListener.mo6940a(adPlaybackState);
        }
    }
}
