package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;

/* loaded from: classes3.dex */
public final class e40 {

    /* renamed from: a */
    @NonNull
    private final m30 f49801a;

    /* renamed from: b */
    @NonNull
    private final C5296jo f49802b;

    public e40(@NonNull m30 m30Var, @NonNull u40 u40Var) {
        this.f49801a = m30Var;
        this.f49802b = new C5296jo(u40Var);
    }

    @Nullable
    /* renamed from: a */
    public final ub1 m24005a(@NonNull InstreamAdView instreamAdView) {
        Context context = instreamAdView.getContext();
        ub1 m26564a = this.f49801a.m26564a();
        return m26564a == null ? this.f49802b.m25915a(context, instreamAdView) : m26564a;
    }
}
