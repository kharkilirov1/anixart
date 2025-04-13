package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yc1 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @NonNull
    private final C5101g2 f56799a;

    /* renamed from: b */
    @NonNull
    private final AdResponse<?> f56800b;

    /* renamed from: c */
    @NonNull
    private final C5841u4 f56801c = new C5841u4();

    public yc1(@NonNull C5101g2 c5101g2, @NonNull AdResponse<?> adResponse) {
        this.f56799a = c5101g2;
        this.f56800b = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NonNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        tv0 tv0Var = new tv0(new HashMap());
        tv0Var.m28761b("Yandex", "adapter");
        tv0Var.m28761b(this.f56800b.m21826p(), "block_id");
        tv0Var.m28761b(this.f56800b.m21826p(), "ad_unit_id");
        tv0Var.m28761b(this.f56800b.m21825o(), "ad_type_format");
        tv0Var.m28761b(this.f56800b.m21800A(), "product_type");
        tv0Var.m28761b(this.f56800b.m21823m(), "ad_source");
        tv0Var.m28759a(this.f56800b.m21813c());
        EnumC5007e6 m21824n = this.f56800b.m21824n();
        if (m21824n != null) {
            tv0Var.m28761b(m21824n.m24033a(), "ad_type");
        } else {
            tv0Var.m28758a("ad_type");
        }
        Map<String, Object> m21829s = this.f56800b.m21829s();
        if (m21829s != null) {
            tv0Var.m28760a(m21829s);
        }
        tv0Var.m28760a(this.f56801c.m28881a(this.f56799a.m24765a()));
        return tv0Var.m28756a();
    }
}
