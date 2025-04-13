package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class a60 implements id1 {

    /* renamed from: a */
    @NonNull
    private final cd1<VideoAd> f48316a;

    /* renamed from: b */
    @NonNull
    private final cg1 f48317b;

    /* renamed from: c */
    @NonNull
    private final sd1 f48318c;

    public a60(@NonNull h50 h50Var, @NonNull y50 y50Var, @NonNull sd1 sd1Var) {
        this.f48316a = h50Var;
        this.f48317b = hg0.m25193a(y50Var);
        this.f48318c = sd1Var;
    }

    @Override // com.yandex.mobile.ads.impl.id1
    /* renamed from: a */
    public final void mo22386a(long j2, long j3) {
        boolean m23259a = this.f48317b.m23259a();
        if (this.f48318c.m28207a() != rd1.f54291h) {
            if (m23259a) {
                if (this.f48316a.isPlayingAd()) {
                    return;
                }
                this.f48316a.mo23231c();
            } else if (this.f48316a.isPlayingAd()) {
                this.f48316a.mo23227a();
            }
        }
    }
}
