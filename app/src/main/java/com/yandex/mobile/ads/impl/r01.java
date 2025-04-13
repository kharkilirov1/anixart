package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r01 implements q01 {

    /* renamed from: b */
    @NotNull
    private final p80 f54153b;

    public r01(@NotNull p80 localStorage) {
        Intrinsics.m32179h(localStorage, "localStorage");
        this.f54153b = localStorage;
    }

    @Override // com.yandex.mobile.ads.impl.q01
    @Nullable
    /* renamed from: a */
    public final String mo27591a() {
        return this.f54153b.mo27190b("SessionData");
    }

    @Override // com.yandex.mobile.ads.impl.q01
    /* renamed from: a */
    public final void mo27592a(@Nullable String str) {
        this.f54153b.putString("SessionData", str);
    }
}
