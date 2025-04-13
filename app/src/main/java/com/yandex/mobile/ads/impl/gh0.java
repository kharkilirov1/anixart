package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.sv0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gh0 {

    /* renamed from: a */
    @NotNull
    private final vv0 f50589a;

    /* renamed from: b */
    @NotNull
    private final C4849bb f50590b;

    public gh0(@NotNull Context context, @NotNull InterfaceC5373l3 adInfoReportDataProviderFactory, @NotNull EnumC5007e6 adType, @Nullable String str) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.m32179h(adType, "adType");
        this.f50589a = C5730s8.m28078a(context);
        this.f50590b = new C4849bb(adInfoReportDataProviderFactory, adType, str);
    }

    /* renamed from: a */
    public final void m24894a(@NotNull sv0.InterfaceC5763a reportParameterManager) {
        Intrinsics.m32179h(reportParameterManager, "reportParameterManager");
        this.f50590b.m22761a(reportParameterManager);
    }

    /* renamed from: a */
    public final void m24895a(@NotNull ArrayList assetNames, @NotNull sv0.EnumC5764b reportType) {
        Intrinsics.m32179h(assetNames, "assetNames");
        Intrinsics.m32179h(reportType, "reportType");
        tv0 tv0Var = new tv0(new HashMap());
        tv0Var.m28761b(assetNames, "assets");
        Map<String, Object> m22760a = this.f50590b.m22760a();
        Intrinsics.m32178g(m22760a, "reportParametersProvider.commonReportParameters");
        tv0Var.m28760a(m22760a);
        this.f50589a.mo23876a(new sv0(reportType, tv0Var.m28756a()));
    }
}
