package com.yandex.mobile.ads.instream.pauseroll;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.np0;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

@MainThread
/* loaded from: classes3.dex */
public class PauserollQueueProvider {

    /* renamed from: a */
    @NonNull
    private final p90<Pauseroll> f57455a;

    /* renamed from: b */
    @NonNull
    private final np0 f57456b = new np0();

    public PauserollQueueProvider(@NonNull Context context, @NonNull InstreamAd instreamAd) {
        this.f57455a = new p90<>(context, instreamAd);
    }

    @NonNull
    public InstreamAdBreakQueue<Pauseroll> getQueue() {
        return this.f57455a.m27194a(this.f57456b, InstreamAdBreakType.PAUSEROLL);
    }
}
