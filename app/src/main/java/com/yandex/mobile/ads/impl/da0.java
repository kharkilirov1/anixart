package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class da0 {

    /* renamed from: a */
    @NotNull
    private final p80 f49613a;

    /* renamed from: b */
    @NotNull
    private final Object f49614b;

    /* renamed from: c */
    @Nullable
    private String f49615c;

    public da0(@NotNull p80 localStorage) {
        Intrinsics.m32179h(localStorage, "localStorage");
        this.f49613a = localStorage;
        this.f49614b = new Object();
    }

    @Nullable
    /* renamed from: a */
    public final String m23852a() {
        String str;
        synchronized (this.f49614b) {
            if (this.f49615c == null) {
                this.f49615c = this.f49613a.mo27190b("YmadMauid");
            }
            str = this.f49615c;
        }
        return str;
    }

    /* renamed from: a */
    public final void m23853a(@NotNull String mauid) {
        Intrinsics.m32179h(mauid, "mauid");
        synchronized (this.f49614b) {
            this.f49615c = mauid;
            this.f49613a.putString("YmadMauid", mauid);
        }
    }
}
