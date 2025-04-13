package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.player.p025ad.C6154a;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.xk */
/* loaded from: classes3.dex */
public final class C6030xk implements t81 {

    /* renamed from: a */
    @NonNull
    private final C6080yk f56495a;

    /* renamed from: b */
    @NonNull
    private final C5116gb f56496b;

    /* renamed from: c */
    @NonNull
    private final C6154a f56497c = new C6154a();

    /* renamed from: d */
    @NonNull
    private final e40 f56498d;

    public C6030xk(@NonNull Context context, @NonNull m30 m30Var, @NonNull h50 h50Var, @NonNull m50 m50Var, @NonNull hc1 hc1Var, @NonNull tf1 tf1Var, @NonNull sp0 sp0Var, @NonNull tb1 tb1Var) {
        this.f56498d = new e40(m30Var, v40.m29181a(xz0.m29823b().m29824a(context)));
        this.f56495a = new C6080yk(context, m50Var, h50Var, tb1Var, hc1Var, tf1Var);
        this.f56496b = new C5116gb(new C4802ab(context, hc1Var, m50Var, tf1Var, tb1Var, sp0Var, n40.m26795a(context, hc1Var)).m22449a());
    }

    @Override // com.yandex.mobile.ads.impl.t81
    /* renamed from: a */
    public final void mo27329a(@NonNull InstreamAdView instreamAdView) {
        Objects.requireNonNull(this.f56497c);
        ub1 m30403a = C6154a.m30403a(instreamAdView);
        if (m30403a != null) {
            instreamAdView.removeView(m30403a.m28929a());
        }
        Objects.requireNonNull(this.f56497c);
        C6154a.m30404a(instreamAdView, null);
    }

    @Override // com.yandex.mobile.ads.impl.t81
    /* renamed from: a */
    public final void mo27330a(@NonNull InstreamAdView instreamAdView, @NonNull q40 q40Var) {
        ub1 m24005a = this.f56498d.m24005a(instreamAdView);
        if (m24005a != null) {
            this.f56495a.m29949a(m24005a, q40Var);
            this.f56496b.m24834a(m24005a);
            instreamAdView.addView(m24005a.m28929a(), new ViewGroup.LayoutParams(-1, -1));
        }
        Objects.requireNonNull(this.f56497c);
        C6154a.m30404a(instreamAdView, m24005a);
    }
}
