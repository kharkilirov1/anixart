package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.yandex.mobile.ads.impl.a7 */
/* loaded from: classes3.dex */
public final class C4795a7 {

    /* renamed from: a */
    @NonNull
    private final C6104z3 f48319a;

    /* renamed from: b */
    @NonNull
    private final C5914ve f48320b;

    /* renamed from: c */
    @NonNull
    private final je1 f48321c;

    /* renamed from: d */
    @NonNull
    private final sr0 f48322d;

    /* renamed from: e */
    private boolean f48323e;

    public C4795a7(@NonNull C5914ve c5914ve, @NonNull C6104z3 c6104z3, @NonNull je1 je1Var, @NonNull sr0 sr0Var) {
        this.f48320b = c5914ve;
        this.f48319a = c6104z3;
        this.f48321c = je1Var;
        this.f48322d = sr0Var;
    }

    /* renamed from: a */
    public final void m22390a() {
        C5797te m29218a = this.f48320b.m29218a();
        if (m29218a != null) {
            wq0 m28356b = this.f48322d.m28356b();
            if (m28356b == null) {
                n60.m26810c("Initialize playback without position provider", new Object[0]);
                return;
            }
            this.f48323e = true;
            int m6927d = this.f48319a.m30045a().m6927d(Util.m7717P(m28356b.m29531a()), Util.m7717P(this.f48321c.m25878a()));
            if (m6927d == -1) {
                m29218a.m28635a();
            } else if (m6927d == this.f48319a.m30045a().f12603c) {
                this.f48320b.m29221c();
            } else {
                m29218a.m28635a();
            }
        }
    }

    /* renamed from: b */
    public final boolean m22391b() {
        return this.f48323e;
    }
}
