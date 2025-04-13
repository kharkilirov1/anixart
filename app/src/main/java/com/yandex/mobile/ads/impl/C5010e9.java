package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.e9 */
/* loaded from: classes3.dex */
public final class C5010e9 {

    /* renamed from: a */
    @NotNull
    private final xz0 f49844a;

    /* renamed from: b */
    @NotNull
    private final fz0 f49845b;

    /* renamed from: c */
    @NotNull
    private final C5260j1 f49846c;

    /* renamed from: d */
    private final Context f49847d;

    public C5010e9(@NotNull Context context, @NotNull xz0 sdkSettings, @NotNull fz0 sdkConfigurationExpiredDateValidator) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(sdkSettings, "sdkSettings");
        Intrinsics.m32179h(sdkConfigurationExpiredDateValidator, "sdkConfigurationExpiredDateValidator");
        this.f49844a = sdkSettings;
        this.f49845b = sdkConfigurationExpiredDateValidator;
        this.f49846c = new C5260j1(context);
        this.f49847d = context.getApplicationContext();
    }

    /* renamed from: a */
    public final boolean m24044a() {
        if (this.f49846c.m25757a().m25018b()) {
            cz0 m29824a = this.f49844a.m29824a(this.f49847d);
            if (!((m29824a == null || !m29824a.m23612u() || this.f49845b.m24759a(m29824a)) ? false : true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C5010e9(android.content.Context r3) {
        /*
            r2 = this;
            com.yandex.mobile.ads.impl.xz0 r0 = com.yandex.mobile.ads.impl.xz0.m29823b()
            java.lang.String r1 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            com.yandex.mobile.ads.impl.fz0 r1 = new com.yandex.mobile.ads.impl.fz0
            r1.<init>()
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5010e9.<init>(android.content.Context):void");
    }
}
