package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.f2 */
/* loaded from: classes3.dex */
public final class C5054f2 {

    /* renamed from: a */
    @NonNull
    private final C4794a6 f50094a;

    /* renamed from: b */
    @NonNull
    private final C6104z3 f50095b;

    /* renamed from: c */
    @NonNull
    private final C5003e4 f50096c;

    /* renamed from: d */
    @NonNull
    private final C5914ve f50097d;

    /* renamed from: e */
    @NonNull
    private final C5603ps f50098e;

    /* renamed from: f */
    @NonNull
    private final br0 f50099f;

    /* renamed from: g */
    @NonNull
    private final zq0 f50100g;

    /* renamed from: h */
    @NonNull
    private final C4840b4 f50101h = new C4840b4();

    public C5054f2(@NonNull C5914ve c5914ve, @NonNull C6107z5 c6107z5, @NonNull yq0 yq0Var, @NonNull C5003e4 c5003e4) {
        this.f50097d = c5914ve;
        this.f50094a = c6107z5.m30057b();
        this.f50095b = c6107z5.m30058c();
        this.f50098e = yq0Var.m29964c();
        this.f50100g = yq0Var.m29965d();
        this.f50099f = yq0Var.m29966e();
        this.f50096c = c5003e4;
    }

    /* renamed from: a */
    public final void m24292a(@NonNull C5264j3 c5264j3, @NonNull VideoAd videoAd) {
        if (!this.f50097d.m29220b()) {
            n60.m26813f("Ad completed callback after release or without playing data", new Object[0]);
            return;
        }
        if (d40.f49559a.equals(this.f50094a.m22380a(videoAd))) {
            AdPlaybackState m30045a = this.f50095b.m30045a();
            if (m30045a.m6928e(c5264j3.m25765a(), c5264j3.m25766b())) {
                n60.m26810c("Invalid state. Ad already skipped.", new Object[0]);
                return;
            }
            this.f50094a.m22383a(videoAd, d40.f49563e);
            this.f50095b.m30046a(m30045a.m6931i(c5264j3.m25765a(), c5264j3.m25766b()));
            return;
        }
        if (!this.f50098e.m27372b()) {
            n60.m26810c("Player were null on ad completion", new Object[0]);
            return;
        }
        int m25765a = c5264j3.m25765a();
        int m25766b = c5264j3.m25766b();
        AdPlaybackState m30045a2 = this.f50095b.m30045a();
        boolean m6928e = m30045a2.m6928e(m25765a, m25766b);
        Objects.requireNonNull(this.f50101h);
        boolean m22715a = C4840b4.m22715a(m30045a2, m25765a, m25766b);
        if (m6928e || m22715a) {
            n60.m26810c("Invalid state. Ad already skipped or in error state.", new Object[0]);
        } else {
            this.f50094a.m22383a(videoAd, d40.f49565g);
            int i2 = m25765a - m30045a2.f12606f;
            AdPlaybackState.AdGroup[] adGroupArr = m30045a2.f12607g;
            AdPlaybackState.AdGroup[] adGroupArr2 = (AdPlaybackState.AdGroup[]) Util.m7719R(adGroupArr, adGroupArr.length);
            adGroupArr2[i2] = adGroupArr2[i2].m6939h(3, m25766b);
            this.f50095b.m30046a(new AdPlaybackState(m30045a2.f12602b, adGroupArr2, m30045a2.f12604d, m30045a2.f12605e, m30045a2.f12606f).m6930h(0L));
            if (!this.f50100g.m30284c()) {
                this.f50094a.m22382a((dr0) null);
            }
        }
        this.f50099f.m22927b();
        this.f50096c.onAdCompleted(videoAd);
    }
}
