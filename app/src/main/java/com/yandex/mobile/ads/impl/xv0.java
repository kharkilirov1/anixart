package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xv0 {

    /* renamed from: a */
    @NotNull
    private final l01 f56579a;

    /* renamed from: b */
    @NotNull
    private final xz0 f56580b;

    public xv0(@NotNull l01 sensitiveModeChecker, @NotNull xz0 consentProvider) {
        Intrinsics.m32179h(sensitiveModeChecker, "sensitiveModeChecker");
        Intrinsics.m32179h(consentProvider, "consentProvider");
        this.f56579a = sensitiveModeChecker;
        this.f56580b = consentProvider;
    }

    /* renamed from: a */
    public final boolean m29812a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        Objects.requireNonNull(this.f56579a);
        return l01.m26310b(context) && this.f56580b.m29834f();
    }

    /* renamed from: b */
    public final boolean m29813b(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        Objects.requireNonNull(this.f56579a);
        return l01.m26310b(context);
    }
}
