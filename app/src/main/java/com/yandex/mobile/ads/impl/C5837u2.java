package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;

/* renamed from: com.yandex.mobile.ads.impl.u2 */
/* loaded from: classes3.dex */
public final class C5837u2 {

    /* renamed from: a */
    @NonNull
    private final C6104z3 f55342a;

    /* renamed from: b */
    @NonNull
    private final C6002x1 f55343b;

    public C5837u2(@NonNull je1 je1Var, @NonNull C6104z3 c6104z3) {
        this.f55342a = c6104z3;
        this.f55343b = new C6002x1(je1Var);
    }

    /* renamed from: a */
    public final int m28836a(@NonNull InstreamAdBreakPosition instreamAdBreakPosition) {
        long m29623a = this.f55343b.m29623a(instreamAdBreakPosition);
        AdPlaybackState m30045a = this.f55342a.m30045a();
        if (m29623a == Long.MIN_VALUE) {
            int i2 = m30045a.f12603c;
            if (i2 <= 0 || m30045a.m6925b(i2 - 1).f12609b != Long.MIN_VALUE) {
                return -1;
            }
            return m30045a.f12603c - 1;
        }
        long m7717P = Util.m7717P(m29623a);
        for (int i3 = 0; i3 < m30045a.f12603c; i3++) {
            long j2 = m30045a.m6925b(i3).f12609b;
            if (j2 != Long.MIN_VALUE && Math.abs(j2 - m7717P) <= 1000) {
                return i3;
            }
        }
        return -1;
    }
}
