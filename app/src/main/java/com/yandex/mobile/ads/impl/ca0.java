package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ca0 {

    /* renamed from: c */
    @NotNull
    private static final Object f49191c = new Object();

    /* renamed from: a */
    @NotNull
    private final da0 f49192a;

    /* renamed from: b */
    @NotNull
    private final ba0 f49193b;

    public ca0(@NotNull p80 localStorage) {
        Intrinsics.m32179h(localStorage, "localStorage");
        this.f49192a = new da0(localStorage);
        this.f49193b = new ba0();
    }

    @NotNull
    /* renamed from: a */
    public final String m23085a() {
        String m23852a;
        synchronized (f49191c) {
            m23852a = this.f49192a.m23852a();
            if (m23852a == null) {
                Objects.requireNonNull(this.f49193b);
                m23852a = ba0.m22754a();
                this.f49192a.m23853a(m23852a);
            }
        }
        return m23852a;
    }
}
