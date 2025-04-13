package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;

/* loaded from: classes3.dex */
public final class r90 implements InstreamAdBreakEventListener {

    /* renamed from: a */
    @NonNull
    private final Handler f54238a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    @Nullable
    private InstreamAdBreakEventListener f54239b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m27876b() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f54239b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m27878c() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f54239b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakStarted();
        }
    }

    /* renamed from: a */
    public final void m27881a(@Nullable InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f54239b = instreamAdBreakEventListener;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakCompleted() {
        this.f54238a.post(new sp1(this, 0));
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakError(@NonNull String str) {
        this.f54238a.post(new hn1(this, str, 25));
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakPrepared() {
        this.f54238a.post(new sp1(this, 1));
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakStarted() {
        this.f54238a.post(new sp1(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27873a() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f54239b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27875a(String str) {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f54239b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakError(str);
        }
    }
}
