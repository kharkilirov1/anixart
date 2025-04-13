package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h90 {

    /* renamed from: a */
    @NotNull
    private final c61 f50880a;

    /* renamed from: b */
    private final Context f50881b;

    /* renamed from: c */
    @NotNull
    private final AtomicBoolean f50882c;

    public h90(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f50880a = new c61();
        this.f50881b = context.getApplicationContext();
        this.f50882c = new AtomicBoolean();
    }

    /* renamed from: a */
    public final void m25094a() {
        if (C5474n6.m26806a(this.f50881b)) {
            Objects.requireNonNull(this.f50880a);
            if (c61.m23031a() || this.f50882c.getAndSet(true)) {
                return;
            }
            e60.m24037c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }
}
