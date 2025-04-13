package com.yandex.mobile.ads.appopenad;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.impl.C4963da;

@MainThread
/* loaded from: classes2.dex */
final class AppOpenAdLoader {

    /* renamed from: a */
    @NonNull
    private final C4963da f47624a;

    public AppOpenAdLoader(@NonNull Context context) {
        this.f47624a = new C4963da(context);
    }

    public void cancelLoading() {
        this.f47624a.m23848a();
    }

    public void loadAd(@NonNull AdRequestConfiguration adRequestConfiguration) {
        this.f47624a.m23850a(adRequestConfiguration);
    }

    public void setAdLoadListener(@Nullable AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f47624a.m23849a(appOpenAdLoadListener);
    }
}
