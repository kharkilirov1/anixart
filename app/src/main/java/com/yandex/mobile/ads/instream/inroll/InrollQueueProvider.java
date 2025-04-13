package com.yandex.mobile.ads.instream.inroll;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.a30;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

@MainThread
/* loaded from: classes3.dex */
public class InrollQueueProvider {

    /* renamed from: a */
    @NonNull
    private final p90<Inroll> f57453a;

    /* renamed from: b */
    @NonNull
    private final a30 f57454b = new a30();

    public InrollQueueProvider(@NonNull Context context, @NonNull InstreamAd instreamAd) {
        this.f57453a = new p90<>(context, instreamAd);
    }

    @NonNull
    public InstreamAdBreakQueue<Inroll> getQueue() {
        return this.f57453a.m27194a(this.f57454b, InstreamAdBreakType.INROLL);
    }
}
