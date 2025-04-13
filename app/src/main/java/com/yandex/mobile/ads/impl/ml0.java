package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ml0 implements gf1 {

    /* renamed from: a */
    @NotNull
    private final bg1 f52704a;

    public ml0(@NotNull wl0 videoViewProvider) {
        Intrinsics.m32179h(videoViewProvider, "videoViewProvider");
        this.f52704a = new bg1(videoViewProvider);
    }

    @Override // com.yandex.mobile.ads.impl.gf1
    /* renamed from: a */
    public final boolean mo24877a() {
        return this.f52704a.m22815a();
    }
}
