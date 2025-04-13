package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.YandexMetrica;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.v9 */
/* loaded from: classes3.dex */
public final class C5907v9 {

    /* renamed from: a */
    @NotNull
    private final xv0 f55784a;

    public C5907v9(@NotNull xv0 reporterPolicyConfigurator) {
        Intrinsics.m32179h(reporterPolicyConfigurator, "reporterPolicyConfigurator");
        this.f55784a = reporterPolicyConfigurator;
    }

    @Nullable
    /* renamed from: a */
    public final IReporter m29198a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        String str = C5474n6.m26806a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
        try {
            ReporterConfig build = ReporterConfig.newConfigBuilder(str).withStatisticsSending(this.f55784a.m29813b(context)).build();
            Intrinsics.m32178g(build, "newConfigBuilder(apiKey)…\n                .build()");
            YandexMetrica.activateReporter(context, build);
            return YandexMetrica.getReporter(context, str);
        } catch (Throwable th) {
            n60.m26808a(th, th.toString(), new Object[0]);
            return null;
        }
    }
}
