package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.oi0;

@MainThread
/* loaded from: classes3.dex */
public class NativeAdLoader {

    /* renamed from: a */
    @NonNull
    private final C6228p f57621a;

    /* renamed from: b */
    @NonNull
    public final Context f57622b;

    public NativeAdLoader(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f57622b = applicationContext;
        this.f57621a = new C6228p(applicationContext);
    }

    public void cancelLoading() {
        this.f57621a.m30608a();
    }

    public void loadAd(@NonNull NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        this.f57621a.m30610a(nativeAdRequestConfiguration, new oi0(this.f57622b));
    }

    public void setNativeAdLoadListener(@Nullable NativeAdLoadListener nativeAdLoadListener) {
        this.f57621a.m30609a(nativeAdLoadListener);
    }
}
