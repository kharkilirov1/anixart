package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.sv0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ng1 {

    /* renamed from: a */
    @NotNull
    private final C5841u4 f52986a;

    /* renamed from: b */
    @NotNull
    private final vv0 f52987b;

    public ng1(@NotNull Context context, @NotNull C5841u4 adRequestReportDataProvider, @NotNull vv0 metricaReporter) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adRequestReportDataProvider, "adRequestReportDataProvider");
        Intrinsics.m32179h(metricaReporter, "metricaReporter");
        this.f52986a = adRequestReportDataProvider;
        this.f52987b = metricaReporter;
    }

    /* renamed from: a */
    public final void m26906a(@NotNull lg1 viewSizeInfo, @NotNull C5101g2 adConfiguration) {
        int m21917d;
        Intrinsics.m32179h(viewSizeInfo, "viewSizeInfo");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        tv0 tv0Var = new tv0(new LinkedHashMap());
        AdRequest m24765a = adConfiguration.m24765a();
        if (m24765a != null) {
            tv0Var.m28760a(this.f52986a.m28881a(m24765a));
        }
        tv0Var.m28761b(adConfiguration.m24779c(), "ad_unit_id");
        tv0Var.m28761b(adConfiguration.m24779c(), "block_id");
        int m24790l = adConfiguration.m24790l();
        tv0Var.m28761b(m24790l != 1 ? m24790l != 2 ? "undefined" : "landscape" : "portrait", "orientation");
        SizeInfo m24792n = adConfiguration.m24792n();
        tv0Var.m28757a((m24792n == null || (m21917d = m24792n.m21917d()) == 0) ? null : p11.m27142a(m21917d), "size_type");
        SizeInfo m24792n2 = adConfiguration.m24792n();
        tv0Var.m28757a(m24792n2 != null ? Integer.valueOf(m24792n2.m21919e()) : null, "size_info_width");
        SizeInfo m24792n3 = adConfiguration.m24792n();
        tv0Var.m28757a(m24792n3 != null ? Integer.valueOf(m24792n3.m21915c()) : null, "size_info_height");
        tv0Var.m28761b(Integer.valueOf(viewSizeInfo.m26455d().m26125b()), "view_width");
        tv0Var.m28761b(Integer.valueOf(viewSizeInfo.m26455d().m26124a()), "view_height");
        tv0Var.m28757a(viewSizeInfo.m26453b().m28909b(), "layout_width");
        tv0Var.m28757a(viewSizeInfo.m26453b().m28908a(), "layout_height");
        tv0Var.m28761b(Integer.valueOf(viewSizeInfo.m26454c().m25099b().m25478b()), "measured_width");
        String name = viewSizeInfo.m26454c().m25099b().m25477a().name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        tv0Var.m28761b(lowerCase, "measured_width_mode");
        tv0Var.m28761b(Integer.valueOf(viewSizeInfo.m26454c().m25098a().m25478b()), "measured_height");
        String lowerCase2 = viewSizeInfo.m26454c().m25098a().m25477a().name().toLowerCase(locale);
        Intrinsics.m32178g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        tv0Var.m28761b(lowerCase2, "measured_height_mode");
        Map<String, Object> m28756a = tv0Var.m28756a();
        Intrinsics.m32178g(m28756a, "ReportDataWrapper(mutabl…   }\n        }.reportData");
        this.f52987b.mo23876a(new sv0(sv0.EnumC5764b.f54827O, m28756a));
    }

    public /* synthetic */ ng1(Context context) {
        this(context, new C5841u4(), C5730s8.m28078a(context));
    }
}
