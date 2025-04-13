package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.m3 */
/* loaded from: classes3.dex */
public final class C5424m3 {

    /* renamed from: a */
    @NonNull
    private final HashMap f52568a = new HashMap();

    /* renamed from: b */
    @NonNull
    private final HashMap f52569b = new HashMap();

    /* renamed from: a */
    public final void m26563a(@NonNull C5264j3 c5264j3, @NonNull VideoAd videoAd) {
        this.f52568a.put(videoAd, c5264j3);
        this.f52569b.put(c5264j3, videoAd);
    }

    @Nullable
    /* renamed from: a */
    public final C5264j3 m26561a(@NonNull VideoAd videoAd) {
        return (C5264j3) this.f52568a.get(videoAd);
    }

    @Nullable
    /* renamed from: a */
    public final VideoAd m26562a(@NonNull C5264j3 c5264j3) {
        return (VideoAd) this.f52569b.get(c5264j3);
    }
}
