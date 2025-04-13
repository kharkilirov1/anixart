package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.IReporter;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ez0 implements pz0 {

    /* renamed from: a */
    @NotNull
    private final C5430m9 f50076a;

    /* renamed from: b */
    @Nullable
    private final IReporter f50077b;

    /* renamed from: c */
    @NotNull
    private final xv0 f50078c;

    public ez0(@NotNull C5430m9 appMetricaBridge, @Nullable IReporter iReporter, @NotNull xv0 reporterPolicyConfigurator) {
        Intrinsics.m32179h(appMetricaBridge, "appMetricaBridge");
        Intrinsics.m32179h(reporterPolicyConfigurator, "reporterPolicyConfigurator");
        this.f50076a = appMetricaBridge;
        this.f50077b = iReporter;
        this.f50078c = reporterPolicyConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.pz0
    /* renamed from: a */
    public final void mo24284a(@NotNull Context context, @NotNull cz0 sdkConfiguration) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(sdkConfiguration, "sdkConfiguration");
        boolean m29812a = this.f50078c.m29812a(context);
        Objects.requireNonNull(this.f50076a);
        C5430m9.m26590a(context, m29812a);
        IReporter iReporter = this.f50077b;
        if (iReporter != null) {
            iReporter.setStatisticsSending(this.f50078c.m29813b(context));
        }
    }
}
