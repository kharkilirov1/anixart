package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class f51 implements InterfaceC4972di {
    @Override // com.yandex.mobile.ads.impl.InterfaceC4972di
    /* renamed from: a */
    public final long mo23884a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4972di
    /* renamed from: b */
    public final void mo23886b() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4972di
    /* renamed from: c */
    public final long mo23887c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4972di
    /* renamed from: a */
    public final InterfaceC4944cy mo23885a(Looper looper, @Nullable Handler.Callback callback) {
        return new h51(new Handler(looper, callback));
    }
}
