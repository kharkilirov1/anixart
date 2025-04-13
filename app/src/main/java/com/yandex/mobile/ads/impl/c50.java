package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class c50 {

    /* renamed from: a */
    @NonNull
    private final Context f49088a;

    /* renamed from: b */
    @NonNull
    private final m50 f49089b;

    /* renamed from: c */
    @NonNull
    private final hc1<VideoAd> f49090c;

    public c50(@NonNull Context context, @NonNull m50 m50Var, @NonNull hc1<VideoAd> hc1Var) {
        this.f49088a = context.getApplicationContext();
        this.f49089b = m50Var;
        this.f49090c = hc1Var;
    }

    @NonNull
    /* renamed from: a */
    public final mo0 m23025a() {
        C5977wl m26571b = this.f49089b.m26571b();
        y40 y40Var = new y40(this.f49088a, this.f49090c.m25116a());
        return m26571b != null ? new s40(y40Var, this.f49090c.m25118c(), m26571b) : new t40(this.f49088a, y40Var);
    }
}
