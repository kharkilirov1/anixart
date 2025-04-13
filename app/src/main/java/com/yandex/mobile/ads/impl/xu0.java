package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xu0 {

    /* renamed from: a */
    @NonNull
    private final AdResponse f56569a;

    /* renamed from: b */
    @NonNull
    private final vv0 f56570b;

    /* renamed from: c */
    @NonNull
    private final C5101g2 f56571c;

    /* renamed from: d */
    @NonNull
    private final C5841u4 f56572d = new C5841u4();

    /* renamed from: e */
    @Nullable
    private sv0.InterfaceC5763a f56573e;

    public xu0(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2) {
        this.f56569a = adResponse;
        this.f56571c = c5101g2;
        this.f56570b = C5730s8.m28078a(context);
    }

    /* renamed from: a */
    public final void m29811a(@Nullable ek0 ek0Var) {
        this.f56573e = ek0Var;
    }

    /* renamed from: a */
    public final void m29810a() {
        tv0 tv0Var = new tv0(new HashMap());
        tv0Var.m28761b("Yandex", "adapter");
        tv0Var.m28761b(this.f56569a.m21826p(), "block_id");
        tv0Var.m28761b(this.f56569a.m21826p(), "ad_unit_id");
        tv0Var.m28761b(this.f56569a.m21825o(), "ad_type_format");
        tv0Var.m28761b(this.f56569a.m21800A(), "product_type");
        tv0Var.m28761b(this.f56569a.m21823m(), "ad_source");
        tv0Var.m28759a(this.f56569a.m21813c());
        Map<String, Object> m21829s = this.f56569a.m21829s();
        if (m21829s != null) {
            tv0Var.m28760a(m21829s);
        }
        EnumC5007e6 m21824n = this.f56569a.m21824n();
        tv0Var.m28761b(m21824n != null ? m21824n.m24033a() : null, "ad_type");
        sv0.InterfaceC5763a interfaceC5763a = this.f56573e;
        if (interfaceC5763a != null) {
            tv0Var.m28760a(interfaceC5763a.mo22529a());
        }
        tv0Var.m28760a(this.f56572d.m28881a(this.f56571c.m24765a()));
        this.f56570b.mo23876a(new sv0(sv0.EnumC5764b.f54853u.m28361a(), tv0Var.m28756a()));
    }
}
