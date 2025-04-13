package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class m50 implements InstreamAdBreak {

    /* renamed from: a */
    @NonNull
    private final List<hc1<VideoAd>> f52577a;

    /* renamed from: b */
    @NonNull
    private final String f52578b;

    /* renamed from: c */
    @NonNull
    private final C5519o1 f52579c;

    /* renamed from: d */
    @NonNull
    private final InstreamAdBreakPosition f52580d;

    /* renamed from: e */
    private final long f52581e;

    public m50(@NonNull ArrayList arrayList, @NonNull String str, @NonNull C5519o1 c5519o1, @NonNull InstreamAdBreakPosition instreamAdBreakPosition, long j2) {
        this.f52577a = arrayList;
        this.f52578b = str;
        this.f52579c = c5519o1;
        this.f52580d = instreamAdBreakPosition;
        this.f52581e = j2;
    }

    @NonNull
    /* renamed from: a */
    public final C5519o1 m26569a() {
        return this.f52579c;
    }

    /* renamed from: a */
    public final void m26570a(@Nullable C5977wl c5977wl) {
    }

    @Nullable
    /* renamed from: b */
    public final C5977wl m26571b() {
        return null;
    }

    @NonNull
    /* renamed from: c */
    public final List<hc1<VideoAd>> m26572c() {
        return this.f52577a;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    @NonNull
    public final InstreamAdBreakPosition getAdBreakPosition() {
        return this.f52580d;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    @NonNull
    public final String getType() {
        return this.f52578b;
    }

    @NonNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("ad_break_#");
        m26356a.append(this.f52581e);
        return m26356a.toString();
    }
}
