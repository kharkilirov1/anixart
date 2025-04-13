package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sv0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.nm */
/* loaded from: classes3.dex */
public final class C5502nm implements InterfaceC5449mm {

    /* renamed from: a */
    @NotNull
    private final vv0 f53038a;

    /* renamed from: b */
    @NotNull
    private final Map<String, Object> f53039b;

    public C5502nm(@NotNull vv0 metricaReporter, @NotNull Map<String, ? extends Object> extraParams) {
        Intrinsics.m32179h(metricaReporter, "metricaReporter");
        Intrinsics.m32179h(extraParams, "extraParams");
        this.f53038a = metricaReporter;
        this.f53039b = extraParams;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5449mm
    /* renamed from: a */
    public final void mo26690a(@NotNull EnumC5404lm eventType) {
        Map map;
        Intrinsics.m32179h(eventType, "eventType");
        sv0.EnumC5764b enumC5764b = sv0.EnumC5764b.f54832T;
        Map<String, Object> map2 = this.f53039b;
        String m26497a = eventType.m26497a();
        Pair pair = new Pair("log_type", m26497a);
        Intrinsics.m32179h(map2, "<this>");
        if (map2.isEmpty()) {
            map = MapsKt.m32063h(pair);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.put("log_type", m26497a);
            map = linkedHashMap;
        }
        this.f53038a.mo23876a(new sv0(enumC5764b, (Map<String, Object>) map));
    }
}
