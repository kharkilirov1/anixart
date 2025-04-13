package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Player;

/* loaded from: classes3.dex */
public final class sq0 {

    /* renamed from: a */
    @NonNull
    private final C5603ps f54800a;

    public sq0(@NonNull C5603ps c5603ps) {
        this.f54800a = c5603ps;
    }

    /* renamed from: a */
    public final void m28350a() {
        Player m27369a = this.f54800a.m27369a();
        if (m27369a != null) {
            m27369a.setPlayWhenReady(false);
        }
    }

    /* renamed from: b */
    public final void m28351b() {
        Player m27369a = this.f54800a.m27369a();
        if (m27369a != null) {
            m27369a.setPlayWhenReady(true);
        }
    }
}
