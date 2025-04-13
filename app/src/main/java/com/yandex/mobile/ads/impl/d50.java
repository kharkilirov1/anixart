package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.InstreamAdListener;

/* loaded from: classes3.dex */
public final class d50 implements w50 {

    /* renamed from: a */
    @NonNull
    private final Handler f49571a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    @Nullable
    private InstreamAdListener f49572b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m23806b() {
        InstreamAdListener instreamAdListener = this.f49572b;
        if (instreamAdListener != null) {
            instreamAdListener.onInstreamAdCompleted();
        }
    }

    /* renamed from: a */
    public final void m23809a(@Nullable InstreamAdListener instreamAdListener) {
        this.f49572b = instreamAdListener;
    }

    /* renamed from: c */
    public final void m23810c() {
        this.f49571a.post(new ao1(this, 1));
    }

    /* renamed from: d */
    public final void m23811d() {
        this.f49571a.post(new ao1(this, 0));
    }

    /* renamed from: e */
    public final void m23812e() {
        this.f49571a.post(new hn1(this, "Video player returned error", 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23803a() {
        InstreamAdListener instreamAdListener = this.f49572b;
        if (instreamAdListener != null) {
            instreamAdListener.onInstreamAdPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23805a(String str) {
        InstreamAdListener instreamAdListener = this.f49572b;
        if (instreamAdListener != null) {
            instreamAdListener.onError(str);
        }
    }
}
