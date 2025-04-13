package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.VideoEventListener;

/* loaded from: classes3.dex */
public final class ke1 implements pe1 {

    /* renamed from: a */
    @NonNull
    private final Handler f51959a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    @Nullable
    private VideoEventListener f51960b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m26114b() {
        VideoEventListener videoEventListener = this.f51960b;
        if (videoEventListener != null) {
            videoEventListener.onVideoComplete();
        }
    }

    /* renamed from: a */
    public final void m26116a(@Nullable VideoEventListener videoEventListener) {
        this.f51960b = videoEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.pe1
    /* renamed from: a */
    public final void mo26115a() {
        this.f51959a.post(new gp1(this, 7));
    }
}
