package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* renamed from: com.yandex.mobile.ads.impl.d4 */
/* loaded from: classes3.dex */
public final class C4955d4 {

    /* renamed from: a */
    @NonNull
    private final C4794a6 f49555a;

    /* renamed from: b */
    @NonNull
    private final C6104z3 f49556b;

    /* renamed from: c */
    @NonNull
    private final zq0 f49557c;

    /* renamed from: d */
    @NonNull
    private final br0 f49558d;

    /* renamed from: com.yandex.mobile.ads.impl.d4$a */
    public interface a {
        /* renamed from: a */
        void mo23800a();
    }

    public C4955d4(@NonNull C6107z5 c6107z5, @NonNull yq0 yq0Var) {
        this.f49555a = c6107z5.m30057b();
        this.f49556b = c6107z5.m30058c();
        this.f49557c = yq0Var.m29965d();
        this.f49558d = yq0Var.m29966e();
    }

    /* renamed from: a */
    public final void m23799a(@NonNull C5264j3 c5264j3, @NonNull int i2, @NonNull a aVar) {
        int m25765a = c5264j3.m25765a();
        int m25766b = c5264j3.m25766b();
        AdPlaybackState m30045a = this.f49556b.m30045a();
        if (m30045a.m6928e(m25765a, m25766b)) {
            return;
        }
        if (C5782t5.m28464a(2, i2)) {
            int i3 = m30045a.m6925b(m25765a).f12610c;
            while (m25766b < i3) {
                m30045a = m30045a.m6931i(m25765a, m25766b).m6930h(0L);
                m25766b++;
            }
        } else {
            m30045a = m30045a.m6931i(m25765a, m25766b).m6930h(0L);
        }
        this.f49556b.m30046a(m30045a);
        this.f49558d.m22927b();
        aVar.mo23800a();
        if (this.f49557c.m30284c()) {
            return;
        }
        this.f49555a.m22382a((dr0) null);
    }
}
