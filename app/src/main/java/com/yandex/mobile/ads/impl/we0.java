package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class we0 {

    /* renamed from: a */
    @NotNull
    private static final AtomicBoolean f56121a = new AtomicBoolean(false);

    @JvmStatic
    /* renamed from: a */
    public static final void m29477a() {
        if (f56121a.compareAndSet(false, true)) {
            e60.m24036b("Yandex Mobile Ads 5.9.0 initialized successfully", new Object[0]);
        }
    }
}
