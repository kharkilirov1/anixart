package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sv0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.q4 */
/* loaded from: classes3.dex */
public final class C5618q4 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @NotNull
    private final C5101g2 f53925a;

    /* renamed from: b */
    @NotNull
    private final C5841u4 f53926b;

    public C5618q4(@NotNull C5101g2 adConfiguration) {
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        this.f53925a = adConfiguration;
        this.f53926b = new C5841u4();
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        Map<String, Object> m32065j = MapsKt.m32065j(new Pair("ad_type", this.f53925a.m24775b().m24033a()));
        String m24779c = this.f53925a.m24779c();
        if (m24779c != null) {
            m32065j.put("block_id", m24779c);
            m32065j.put("ad_unit_id", m24779c);
        }
        Map<String, Object> m28881a = this.f53926b.m28881a(this.f53925a.m24765a());
        Intrinsics.m32178g(m28881a, "adRequestReportDataProvi…dConfiguration.adRequest)");
        m32065j.putAll(m28881a);
        return m32065j;
    }
}
