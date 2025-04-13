package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class co0 {

    /* renamed from: a */
    @NotNull
    private final p80 f49330a;

    public co0(@NotNull p80 localStorage) {
        Intrinsics.m32179h(localStorage, "localStorage");
        this.f49330a = localStorage;
    }

    @Nullable
    /* renamed from: a */
    public final String m23498a() {
        return this.f49330a.mo27190b("YmadOmSdkJs");
    }

    @Nullable
    /* renamed from: b */
    public final String m23500b() {
        return this.f49330a.mo27190b("YmadOmSdkJsUrl");
    }

    /* renamed from: a */
    public final void m23499a(@Nullable String str) {
        this.f49330a.putString("YmadOmSdkJs", str);
    }

    /* renamed from: b */
    public final void m23501b(@Nullable String str) {
        this.f49330a.putString("YmadOmSdkJsUrl", str);
    }
}
