package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.vy */
/* loaded from: classes3.dex */
public final class C5946vy {

    /* renamed from: a */
    @NotNull
    private final InterfaceC5824ty f55898a;

    /* renamed from: b */
    @NotNull
    private final xz0 f55899b;

    public C5946vy(@NotNull InterfaceC5824ty defaultHostAccessChecker, @NotNull xz0 sdkSettings) {
        Intrinsics.m32179h(defaultHostAccessChecker, "defaultHostAccessChecker");
        Intrinsics.m32179h(sdkSettings, "sdkSettings");
        this.f55898a = defaultHostAccessChecker;
        this.f55899b = sdkSettings;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC5824ty m29284a() {
        Objects.requireNonNull(this.f55899b);
        xz0.m29822a();
        return this.f55898a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C5946vy() {
        /*
            r3 = this;
            com.yandex.mobile.ads.impl.rn r0 = new com.yandex.mobile.ads.impl.rn
            r0.<init>()
            com.yandex.mobile.ads.impl.xz0 r1 = com.yandex.mobile.ads.impl.xz0.m29823b()
            java.lang.String r2 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.m32178g(r1, r2)
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5946vy.<init>():void");
    }
}
