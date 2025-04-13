package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sv0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i30 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @NotNull
    private final C5726s4 f51194a;

    public i30(@NotNull m50 instreamVideoAdBreak) {
        Intrinsics.m32179h(instreamVideoAdBreak, "instreamVideoAdBreak");
        this.f51194a = new C5726s4(instreamVideoAdBreak.m26569a());
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        tv0 tv0Var = new tv0(MapsKt.m32065j(new Pair("ad_type", EnumC5007e6.f49821g.m24033a())));
        tv0Var.m28761b(this.f51194a.m28068d(), "page_id");
        tv0Var.m28761b(this.f51194a.m28066b(), "category_id");
        tv0Var.m28761b(this.f51194a.m28067c(), "imp_id");
        Map<String, Object> m28756a = tv0Var.m28756a();
        Intrinsics.m32178g(m28756a, "reportDataWrapper.reportData");
        return m28756a;
    }
}
