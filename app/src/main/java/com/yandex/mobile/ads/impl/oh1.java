package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oh1 implements hw0<gh1> {

    /* renamed from: a */
    @NotNull
    private final C5724s3 f53271a;

    /* renamed from: b */
    @NotNull
    private final hw0<gh1> f53272b;

    public oh1(@NotNull C5724s3 adLoadingPhasesManager, @NotNull hw0<gh1> requestListener) {
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(requestListener, "requestListener");
        this.f53271a = adLoadingPhasesManager;
        this.f53272b = requestListener;
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22374a(gh1 gh1Var) {
        gh1 vmap = gh1Var;
        Intrinsics.m32179h(vmap, "vmap");
        this.f53271a.m28050a(EnumC5668r3.f54181n);
        this.f53272b.mo22374a((hw0<gh1>) vmap);
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22373a(@NotNull ac1 error) {
        Intrinsics.m32179h(error, "error");
        this.f53271a.m28050a(EnumC5668r3.f54181n);
        this.f53272b.mo22373a(error);
    }
}
