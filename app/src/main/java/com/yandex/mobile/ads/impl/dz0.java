package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dz0 {

    /* renamed from: a */
    @NotNull
    private final ez0 f49769a;

    /* renamed from: b */
    @NotNull
    private final hz0 f49770b;

    public dz0(@NotNull xv0 reporterPolicyConfigurator, @NotNull ez0 sdkConfigurationChangeListener, @NotNull hz0 sdkConfigurationProvider) {
        Intrinsics.m32179h(reporterPolicyConfigurator, "reporterPolicyConfigurator");
        Intrinsics.m32179h(sdkConfigurationChangeListener, "sdkConfigurationChangeListener");
        Intrinsics.m32179h(sdkConfigurationProvider, "sdkConfigurationProvider");
        this.f49769a = sdkConfigurationChangeListener;
        this.f49770b = sdkConfigurationProvider;
    }

    /* renamed from: a */
    public final void m23965a() {
        this.f49770b.m25403a(this.f49769a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dz0(@org.jetbrains.annotations.Nullable com.yandex.metrica.IReporter r3, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.xv0 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "reporterPolicyConfigurator"
            kotlin.jvm.internal.Intrinsics.m32179h(r4, r0)
            com.yandex.mobile.ads.impl.ez0 r0 = new com.yandex.mobile.ads.impl.ez0
            com.yandex.mobile.ads.impl.m9 r1 = new com.yandex.mobile.ads.impl.m9
            r1.<init>()
            r0.<init>(r1, r3, r4)
            com.yandex.mobile.ads.impl.hz0 r3 = com.yandex.mobile.ads.impl.hz0.m25401a()
            java.lang.String r1 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.m32178g(r3, r1)
            r2.<init>(r4, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.dz0.<init>(com.yandex.metrica.IReporter, com.yandex.mobile.ads.impl.xv0):void");
    }
}
