package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.l4 */
/* loaded from: classes3.dex */
public final class C5376l4 {

    /* renamed from: a */
    @NonNull
    private final AdResponse f52247a;

    /* renamed from: b */
    @NonNull
    private final C5841u4 f52248b = new C5841u4();

    /* renamed from: c */
    @NonNull
    private final vv0 f52249c;

    /* renamed from: d */
    @NonNull
    private final C5101g2 f52250d;

    /* renamed from: e */
    @NonNull
    private final C5780t3 f52251e;

    /* renamed from: f */
    @NonNull
    private sv0.InterfaceC5763a f52252f;

    public C5376l4(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2, @NonNull C5724s3 c5724s3, @NonNull C5097fz c5097fz) {
        this.f52247a = adResponse;
        this.f52250d = c5101g2;
        this.f52252f = c5097fz;
        this.f52251e = new C5780t3(c5724s3);
        this.f52249c = C5730s8.m28078a(context);
    }

    /* renamed from: a */
    public final void m26349a() {
        tv0 tv0Var = new tv0(new HashMap());
        tv0Var.m28761b(this.f52247a.m21826p(), "block_id");
        tv0Var.m28761b(this.f52247a.m21826p(), "ad_unit_id");
        tv0Var.m28761b("Yandex", "adapter");
        tv0Var.m28761b(this.f52247a.m21800A(), "product_type");
        tv0Var.m28761b(this.f52247a.m21825o(), "ad_type_format");
        tv0Var.m28761b(this.f52247a.m21823m(), "ad_source");
        tv0Var.m28759a(this.f52247a.m21813c());
        tv0Var.m28760a(this.f52252f.mo22529a());
        tv0Var.m28760a(this.f52251e.m28440b());
        Map<String, Object> m21829s = this.f52247a.m21829s();
        if (m21829s != null) {
            tv0Var.m28760a(m21829s);
        }
        EnumC5007e6 m21824n = this.f52247a.m21824n();
        tv0Var.m28761b(m21824n != null ? m21824n.m24033a() : null, "ad_type");
        tv0Var.m28760a(this.f52248b.m28881a(this.f52250d.m24765a()));
        this.f52249c.mo23876a(new sv0(sv0.EnumC5764b.f54835c.m28361a(), tv0Var.m28756a()));
    }
}
