package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public final class m80 {

    /* renamed from: a */
    @NonNull
    private final sr0 f52594a;

    /* renamed from: b */
    @NonNull
    private final je1 f52595b;

    public m80(@NonNull sr0 sr0Var, @NonNull je1 je1Var) {
        this.f52594a = sr0Var;
        this.f52595b = je1Var;
    }

    /* renamed from: a */
    public final int m26587a(@NonNull AdPlaybackState adPlaybackState) {
        wq0 m28356b = this.f52594a.m28356b();
        if (m28356b == null) {
            return -1;
        }
        long m7717P = Util.m7717P(this.f52595b.m25878a());
        long m7717P2 = Util.m7717P(m28356b.m29531a());
        int m6927d = adPlaybackState.m6927d(m7717P2, m7717P);
        return m6927d == -1 ? adPlaybackState.m6926c(m7717P2, m7717P) : m6927d;
    }
}
