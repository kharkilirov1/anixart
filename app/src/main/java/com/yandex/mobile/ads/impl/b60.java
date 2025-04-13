package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sv0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b60 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @NotNull
    private final lh1 f48767a;

    public b60(@NotNull lh1 requestConfig) {
        Intrinsics.m32179h(requestConfig, "requestConfig");
        this.f48767a = requestConfig;
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        return MapsKt.m32064i(new Pair("ad_type", EnumC5007e6.f49821g.m24033a()), new Pair("page_id", this.f48767a.m26467c()), new Pair("category_id", this.f48767a.m26466b()));
    }
}
