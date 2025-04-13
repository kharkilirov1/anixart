package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.cc */
/* loaded from: classes3.dex */
public final class C4913cc {

    /* renamed from: a */
    @NotNull
    private final l01 f49199a;

    public C4913cc(@NotNull l01 sensitiveModeChecker) {
        Intrinsics.m32179h(sensitiveModeChecker, "sensitiveModeChecker");
        this.f49199a = sensitiveModeChecker;
    }

    /* renamed from: a */
    public final boolean m23189a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        Objects.requireNonNull(this.f49199a);
        boolean m26311c = l01.m26311c(context);
        cz0 m29824a = xz0.m29823b().m29824a(context);
        return (m26311c || m29824a == null || !m29824a.m23613v()) ? false : true;
    }
}
