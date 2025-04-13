package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ax0 {
    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final Map<String, Object> m22651a(@Nullable AdResponse<?> adResponse) {
        EnumC5007e6 m21824n;
        tv0 tv0Var = new tv0(new LinkedHashMap());
        tv0Var.m28761b(adResponse != null ? adResponse.m21826p() : null, "block_id");
        tv0Var.m28761b(adResponse != null ? adResponse.m21826p() : null, "ad_unit_id");
        tv0Var.m28761b(adResponse != null ? adResponse.m21825o() : null, "ad_type_format");
        tv0Var.m28761b(adResponse != null ? adResponse.m21800A() : null, "product_type");
        tv0Var.m28761b(adResponse != null ? adResponse.m21823m() : null, "ad_source");
        tv0Var.m28761b((adResponse == null || (m21824n = adResponse.m21824n()) == null) ? null : m21824n.m24033a(), "ad_type");
        tv0Var.m28757a(adResponse != null ? adResponse.m21833w() : null, "design");
        Map<String, Object> m28756a = tv0Var.m28756a();
        Intrinsics.m32178g(m28756a, "with(ReportDataWrapper(m…     reportData\n        }");
        return m28756a;
    }
}
