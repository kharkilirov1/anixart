package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sv0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ek0 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @NotNull
    private final sv0.InterfaceC5763a f49986a;

    /* renamed from: b */
    @NotNull
    private C5070fb f49987b;

    public ek0(@NotNull sv0.InterfaceC5763a reportManager, @NotNull C5070fb assetsRenderedReportParameterProvider) {
        Intrinsics.m32179h(reportManager, "reportManager");
        Intrinsics.m32179h(assetsRenderedReportParameterProvider, "assetsRenderedReportParameterProvider");
        this.f49986a = reportManager;
        this.f49987b = assetsRenderedReportParameterProvider;
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        Map<String, Object> mo22529a = this.f49986a.mo22529a();
        Intrinsics.m32178g(mo22529a, "reportManager.getReportParameters()");
        return MapsKt.m32066k(mo22529a, MapsKt.m32063h(new Pair("assets", MapsKt.m32063h(new Pair("rendered", this.f49987b.m24381a())))));
    }
}
