package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.k1 */
/* loaded from: classes3.dex */
public final class C5313k1 {

    /* renamed from: c */
    @NotNull
    private static final Object f51797c = new Object();

    /* renamed from: a */
    @NotNull
    private final p80 f51798a;

    /* renamed from: b */
    @Nullable
    private volatile C5158h1 f51799b;

    public C5313k1(@NotNull p80 localStorage) {
        Intrinsics.m32179h(localStorage, "localStorage");
        this.f51798a = localStorage;
    }

    @NotNull
    /* renamed from: a */
    public final C5158h1 m26005a() {
        synchronized (f51797c) {
            if (this.f51799b == null) {
                this.f51799b = new C5158h1(this.f51798a.mo27184a("AdBlockerLastUpdate"), this.f51798a.getBoolean("AdBlockerDetected", false));
            }
        }
        C5158h1 c5158h1 = this.f51799b;
        if (c5158h1 != null) {
            return c5158h1;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final void m26006a(@NotNull C5158h1 adBlockerState) {
        Intrinsics.m32179h(adBlockerState, "adBlockerState");
        synchronized (f51797c) {
            this.f51799b = adBlockerState;
            this.f51798a.putLong("AdBlockerLastUpdate", adBlockerState.m25017a());
            this.f51798a.putBoolean("AdBlockerDetected", adBlockerState.m25018b());
        }
    }
}
