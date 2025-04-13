package com.yandex.mobile.ads.instream;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.p30;

@MainThread
/* loaded from: classes3.dex */
public class InstreamAdLoader {

    /* renamed from: a */
    @NonNull
    private final p30 f57419a;

    public InstreamAdLoader(@NonNull Context context) {
        this.f57419a = new p30(context);
    }

    public void loadInstreamAd(@NonNull Context context, @NonNull InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f57419a.m27160a(instreamAdRequestConfiguration);
    }

    public void setInstreamAdLoadListener(@Nullable InstreamAdLoadListener instreamAdLoadListener) {
        this.f57419a.m27159a(instreamAdLoadListener);
    }
}
