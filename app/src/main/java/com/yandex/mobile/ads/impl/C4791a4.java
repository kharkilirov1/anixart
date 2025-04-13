package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.a4 */
/* loaded from: classes3.dex */
public final class C4791a4 {

    /* renamed from: a */
    @NonNull
    private final C6002x1 f48305a;

    public C4791a4(@NonNull je1 je1Var) {
        this.f48305a = new C6002x1(je1Var);
    }

    @NonNull
    /* renamed from: a */
    public final AdPlaybackState m22372a(@NonNull InstreamAd instreamAd, @Nullable Object obj) {
        List<? extends InstreamAdBreak> adBreaks = instreamAd.getAdBreaks();
        if (adBreaks.isEmpty()) {
            return AdPlaybackState.f12599h;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends InstreamAdBreak> it = adBreaks.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            long m29623a = this.f48305a.m29623a(it.next().getAdBreakPosition());
            if (m29623a == Long.MIN_VALUE) {
                i2 = 1;
            } else if (m29623a != -1) {
                arrayList.add(Long.valueOf(Util.m7717P(m29623a)));
            }
        }
        int size = arrayList.size() + i2;
        long[] jArr = new long[size];
        if (i2 != 0) {
            jArr[size - 1] = Long.MIN_VALUE;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            jArr[i3] = ((Long) arrayList.get(i3)).longValue();
        }
        Arrays.sort(jArr, 0, arrayList.size());
        AdPlaybackState.AdGroup[] adGroupArr = new AdPlaybackState.AdGroup[size];
        for (int i4 = 0; i4 < size; i4++) {
            adGroupArr[i4] = new AdPlaybackState.AdGroup(jArr[i4]);
        }
        return new AdPlaybackState(obj, adGroupArr, 0L, -9223372036854775807L, 0);
    }
}
