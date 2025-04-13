package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ru0 {

    /* renamed from: a */
    @NotNull
    private final vv0 f54419a;

    /* renamed from: b */
    @NotNull
    private final C4849bb f54420b;

    /* renamed from: c */
    private boolean f54421c;

    public ru0(@NotNull Context context, @NotNull InterfaceC5373l3 adInfoReportDataProviderFactory, @NotNull EnumC5007e6 adType, @Nullable String str) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.m32179h(adType, "adType");
        this.f54419a = C5730s8.m28078a(context);
        this.f54420b = new C4849bb(adInfoReportDataProviderFactory, adType, str);
        this.f54421c = true;
    }

    /* renamed from: a */
    public final void m27987a(@NotNull sv0.InterfaceC5763a reportParameterManager) {
        Intrinsics.m32179h(reportParameterManager, "reportParameterManager");
        this.f54420b.m22761a(reportParameterManager);
    }

    /* renamed from: a */
    public final void m27986a() {
        if (this.f54421c) {
            this.f54421c = false;
            return;
        }
        tv0 tv0Var = new tv0(new HashMap());
        Map<String, Object> m22760a = this.f54420b.m22760a();
        Intrinsics.m32178g(m22760a, "reportParametersProvider.commonReportParameters");
        tv0Var.m28760a(m22760a);
        this.f54419a.mo23876a(new sv0(sv0.EnumC5764b.f54820H, tv0Var.m28756a()));
    }
}
