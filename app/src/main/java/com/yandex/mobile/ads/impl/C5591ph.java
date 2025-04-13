package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;

/* renamed from: com.yandex.mobile.ads.impl.ph */
/* loaded from: classes3.dex */
public final class C5591ph implements t81 {

    /* renamed from: a */
    @NonNull
    private final g40 f53559a;

    /* renamed from: b */
    @NonNull
    private final C5162h4 f53560b;

    public C5591ph(@NonNull Context context, @NonNull m50 m50Var, @NonNull h50 h50Var, @NonNull tb1 tb1Var, @NonNull hc1 hc1Var, @NonNull tf1 tf1Var) {
        this.f53559a = new g40(context, m50Var, hc1Var, tf1Var, tb1Var, new t50(new C5135gl()).m28466a(hc1Var.m25116a(), null));
        this.f53560b = new C5162h4(h50Var);
    }

    @Override // com.yandex.mobile.ads.impl.t81
    /* renamed from: a */
    public final void mo27330a(@NonNull InstreamAdView instreamAdView, @NonNull q40 q40Var) {
        instreamAdView.setOnClickListener(this.f53559a);
        this.f53560b.m25049a(q40Var.m27612a(), q40Var.m27615d());
    }

    @Override // com.yandex.mobile.ads.impl.t81
    /* renamed from: a */
    public final void mo27329a(@NonNull InstreamAdView instreamAdView) {
        instreamAdView.setOnClickListener(null);
        instreamAdView.setClickable(false);
    }
}
