package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ey0 {

    /* renamed from: a */
    @NotNull
    private final LinkedHashSet f50075a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m24280a(@NotNull dy0 route) {
        Intrinsics.m32179h(route, "route");
        this.f50075a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m24281b(@NotNull dy0 failedRoute) {
        Intrinsics.m32179h(failedRoute, "failedRoute");
        this.f50075a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m24282c(@NotNull dy0 route) {
        Intrinsics.m32179h(route, "route");
        return this.f50075a.contains(route);
    }
}
