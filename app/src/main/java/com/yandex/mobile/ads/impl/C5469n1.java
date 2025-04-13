package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.n1 */
/* loaded from: classes3.dex */
public final class C5469n1 {

    /* renamed from: c */
    private static final long f52833c = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a */
    @NotNull
    private final xz0 f52834a;

    /* renamed from: b */
    @NotNull
    private final Context f52835b;

    public C5469n1(@NotNull Context context, @NotNull xz0 sdkSettings) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(sdkSettings, "sdkSettings");
        this.f52834a = sdkSettings;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m32178g(applicationContext, "context.applicationContext");
        this.f52835b = applicationContext;
    }

    /* renamed from: a */
    public final long m26787a() {
        cz0 m29824a = this.f52834a.m29824a(this.f52835b);
        Long m23588a = m29824a != null ? m29824a.m23588a() : null;
        return m23588a != null ? m23588a.longValue() : f52833c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C5469n1(android.content.Context r3) {
        /*
            r2 = this;
            com.yandex.mobile.ads.impl.xz0 r0 = com.yandex.mobile.ads.impl.xz0.m29823b()
            java.lang.String r1 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5469n1.<init>(android.content.Context):void");
    }
}
