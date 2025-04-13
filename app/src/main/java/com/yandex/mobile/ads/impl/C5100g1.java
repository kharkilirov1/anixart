package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.g1 */
/* loaded from: classes3.dex */
public final class C5100g1 {

    /* renamed from: a */
    @NotNull
    private final C5260j1 f50470a;

    /* renamed from: b */
    @NotNull
    private final C5209i1 f50471b;

    @JvmOverloads
    public C5100g1(@NotNull Context context, @NotNull C5260j1 adBlockerStateProvider, @NotNull C5209i1 adBlockerStateExpiredValidator) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adBlockerStateProvider, "adBlockerStateProvider");
        Intrinsics.m32179h(adBlockerStateExpiredValidator, "adBlockerStateExpiredValidator");
        this.f50470a = adBlockerStateProvider;
        this.f50471b = adBlockerStateExpiredValidator;
    }

    /* renamed from: a */
    public final boolean m24762a() {
        return this.f50471b.m25424a(this.f50470a.m25757a());
    }

    public /* synthetic */ C5100g1(Context context) {
        this(context, new C5260j1(context), new C5209i1(context));
    }
}
