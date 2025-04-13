package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sa1 implements hw0<ha1> {

    /* renamed from: a */
    @NotNull
    private final hw0<List<pb1>> f54549a;

    /* renamed from: b */
    @NotNull
    private final ua1 f54550b;

    public sa1(@NotNull Context context, @NotNull ma1 adsRequestListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adsRequestListener, "adsRequestListener");
        this.f54549a = adsRequestListener;
        this.f54550b = new ua1(context);
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22374a(ha1 ha1Var) {
        ha1 result = ha1Var;
        Intrinsics.m32179h(result, "result");
        List<pb1> m23087b = result.m25101b().m23087b();
        Intrinsics.m32178g(m23087b, "result.vast.videoAds");
        this.f54550b.m28927a(m23087b, new ra1(this, m23087b));
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22373a(@NotNull ac1 error) {
        Intrinsics.m32179h(error, "error");
        this.f54549a.mo22373a(error);
    }
}
