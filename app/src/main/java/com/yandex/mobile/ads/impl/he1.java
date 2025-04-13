package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* loaded from: classes3.dex */
public final class he1 {

    /* renamed from: a */
    @NonNull
    private final C6104z3 f50921a;

    /* renamed from: b */
    @NonNull
    private final ge1 f50922b;

    /* renamed from: c */
    @NonNull
    private final ye1 f50923c;

    /* renamed from: d */
    private boolean f50924d;

    public he1(@NonNull C6104z3 c6104z3, @NonNull je1 je1Var, @NonNull sr0 sr0Var, @NonNull ye1 ye1Var) {
        this.f50921a = c6104z3;
        this.f50923c = ye1Var;
        this.f50922b = new ge1(sr0Var, je1Var);
    }

    /* renamed from: a */
    public final void m25145a() {
        if (this.f50924d) {
            return;
        }
        this.f50924d = true;
        AdPlaybackState m30045a = this.f50921a.m30045a();
        for (int i2 = 0; i2 < m30045a.f12603c; i2++) {
            AdPlaybackState.AdGroup m6925b = m30045a.m6925b(i2);
            if (m6925b.f12609b != Long.MIN_VALUE) {
                if (m6925b.f12610c < 0) {
                    m30045a = m30045a.m6929g(i2, 1);
                }
                m30045a = m30045a.m6932j(i2);
                this.f50921a.m30046a(m30045a);
            }
        }
        this.f50923c.onVideoCompleted();
    }

    /* renamed from: b */
    public final boolean m25146b() {
        return this.f50924d;
    }

    /* renamed from: c */
    public final void m25147c() {
        if (this.f50922b.m24870a()) {
            m25145a();
        }
    }
}
