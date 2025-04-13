package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Player;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class fq0 {

    /* renamed from: a */
    @NonNull
    private final C5054f2 f50407a;

    /* renamed from: b */
    @NonNull
    private final C6004x3 f50408b;

    /* renamed from: c */
    @NonNull
    private final C5424m3 f50409c;

    /* renamed from: d */
    @NonNull
    private final C5914ve f50410d;

    /* renamed from: e */
    @NonNull
    private final zq0 f50411e;

    /* renamed from: f */
    @NonNull
    private final C5603ps f50412f;

    /* renamed from: g */
    @NonNull
    private final mf1 f50413g;

    /* renamed from: h */
    private int f50414h = -1;

    /* renamed from: i */
    private int f50415i = -1;

    public fq0(@NonNull C5914ve c5914ve, @NonNull yq0 yq0Var, @NonNull C6107z5 c6107z5, @NonNull he1 he1Var, @NonNull C5710rt c5710rt, @NonNull C5054f2 c5054f2) {
        this.f50410d = c5914ve;
        zq0 m29965d = yq0Var.m29965d();
        this.f50411e = m29965d;
        this.f50412f = yq0Var.m29964c();
        this.f50409c = c6107z5.m30056a();
        this.f50407a = c5054f2;
        this.f50413g = new mf1(m29965d, he1Var);
        this.f50408b = new C6004x3(c6107z5, c5710rt, he1Var);
    }

    /* renamed from: a */
    public final void m24723a() {
        Player m27369a = this.f50412f.m27369a();
        if (!this.f50410d.m29220b() || m27369a == null) {
            return;
        }
        this.f50413g.m26657a(m27369a);
        boolean m30284c = this.f50411e.m30284c();
        boolean isPlayingAd = m27369a.isPlayingAd();
        int currentAdGroupIndex = m27369a.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = m27369a.getCurrentAdIndexInAdGroup();
        this.f50411e.m30282a(isPlayingAd);
        int i2 = isPlayingAd ? currentAdGroupIndex : this.f50414h;
        int i3 = this.f50415i;
        this.f50415i = currentAdIndexInAdGroup;
        this.f50414h = currentAdGroupIndex;
        C5264j3 c5264j3 = new C5264j3(i2, i3);
        VideoAd m26562a = this.f50409c.m26562a(c5264j3);
        boolean z = m30284c && (currentAdIndexInAdGroup == -1 || i3 < currentAdIndexInAdGroup);
        if (m26562a != null && z) {
            this.f50407a.m24292a(c5264j3, m26562a);
        }
        this.f50408b.m29660a(m27369a, m30284c);
    }
}
