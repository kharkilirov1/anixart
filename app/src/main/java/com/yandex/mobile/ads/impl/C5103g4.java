package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.g4 */
/* loaded from: classes3.dex */
public final class C5103g4 {

    /* renamed from: a */
    @NonNull
    private final C5837u2 f50492a;

    /* renamed from: b */
    @NonNull
    private final C5424m3 f50493b;

    /* renamed from: c */
    @NonNull
    private final C6104z3 f50494c;

    public C5103g4(@NonNull C6107z5 c6107z5, @NonNull C5837u2 c5837u2) {
        this.f50492a = c5837u2;
        this.f50493b = c6107z5.m30056a();
        this.f50494c = c6107z5.m30058c();
    }

    /* renamed from: a */
    public final void m24802a(@NonNull VideoAd videoAd) {
        if (!(videoAd.getMediaFile() instanceof b50)) {
            n60.m26810c("Unknown mediaFile received in prepareAd", new Object[0]);
            return;
        }
        b50 b50Var = (b50) videoAd.getMediaFile();
        C5264j3 c5264j3 = new C5264j3(this.f50492a.m28836a(b50Var.m22721a()), videoAd.getAdPodInfo().getAdPosition() - 1);
        this.f50493b.m26563a(c5264j3, videoAd);
        AdPlaybackState m30045a = this.f50494c.m30045a();
        if (m30045a.m6928e(c5264j3.m25765a(), c5264j3.m25766b())) {
            return;
        }
        AdPlaybackState m6929g = m30045a.m6929g(c5264j3.m25765a(), videoAd.getAdPodInfo().getAdsCount());
        Uri parse = Uri.parse(b50Var.getUrl());
        int m25765a = c5264j3.m25765a();
        int m25766b = c5264j3.m25766b();
        int i2 = m25765a - m6929g.f12606f;
        AdPlaybackState.AdGroup[] adGroupArr = m6929g.f12607g;
        AdPlaybackState.AdGroup[] adGroupArr2 = (AdPlaybackState.AdGroup[]) Util.m7719R(adGroupArr, adGroupArr.length);
        AdPlaybackState.AdGroup adGroup = adGroupArr2[i2];
        int[] m6934c = AdPlaybackState.AdGroup.m6934c(adGroup.f12612e, m25766b + 1);
        long[] jArr = adGroup.f12613f;
        if (jArr.length != m6934c.length) {
            jArr = AdPlaybackState.AdGroup.m6933b(jArr, m6934c.length);
        }
        Uri[] uriArr = (Uri[]) Arrays.copyOf(adGroup.f12611d, m6934c.length);
        uriArr[m25766b] = parse;
        m6934c[m25766b] = 1;
        adGroupArr2[i2] = new AdPlaybackState.AdGroup(adGroup.f12609b, adGroup.f12610c, m6934c, uriArr, jArr, adGroup.f12614g, adGroup.f12615h);
        this.f50494c.m30046a(new AdPlaybackState(m6929g.f12602b, adGroupArr2, m6929g.f12604d, m6929g.f12605e, m6929g.f12606f));
    }
}
