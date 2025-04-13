package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class p20 {

    /* renamed from: a */
    @NonNull
    private final vv0 f53371a;

    /* renamed from: b */
    @NonNull
    private final C5101g2 f53372b;

    /* renamed from: c */
    @NonNull
    private final C5841u4 f53373c = new C5841u4();

    /* renamed from: d */
    @Nullable
    private AdResponse f53374d;

    /* renamed from: e */
    @Nullable
    private sv0.InterfaceC5763a f53375e;

    public p20(@NonNull Context context, @NonNull C5101g2 c5101g2) {
        this.f53372b = c5101g2;
        this.f53371a = C5730s8.m28078a(context);
    }

    /* renamed from: a */
    public final void m27150a(@NonNull sv0.EnumC5764b enumC5764b) {
        this.f53371a.mo23876a(new sv0(enumC5764b.m28361a(), m27146a()));
    }

    /* renamed from: b */
    public final void m27152b(@NonNull aa1 aa1Var) {
        Map<String, Object> m27146a = m27146a();
        m27146a.put("reason", aa1Var.m22447e().m22448a());
        String m22442a = aa1Var.m22442a();
        if (!TextUtils.isEmpty(m22442a)) {
            m27146a.put("asset_name", m22442a);
        }
        this.f53371a.mo23876a(new sv0(aa1Var.m22445c().m28361a(), m27146a));
    }

    /* renamed from: a */
    public final void m27151a(@NonNull sv0.EnumC5764b enumC5764b, @NonNull HashMap hashMap) {
        Map<String, Object> m27146a = m27146a();
        m27146a.putAll(hashMap);
        this.f53371a.mo23876a(new sv0(enumC5764b.m28361a(), m27146a));
    }

    /* renamed from: a */
    public final void m27148a(@NonNull aa1 aa1Var) {
        Map<String, Object> m27146a = m27146a();
        m27146a.put("reason", aa1Var.m22447e().m22448a());
        String m22442a = aa1Var.m22442a();
        if (!TextUtils.isEmpty(m22442a)) {
            m27146a.put("asset_name", m22442a);
        }
        this.f53371a.mo23876a(new sv0(aa1Var.m22444b().m28361a(), m27146a));
    }

    @NonNull
    /* renamed from: a */
    private Map<String, Object> m27146a() {
        tv0 tv0Var = new tv0(new HashMap());
        tv0Var.m28761b("Yandex", "adapter");
        AdResponse adResponse = this.f53374d;
        if (adResponse != null) {
            tv0Var.m28761b(adResponse.m21826p(), "block_id");
            tv0Var.m28761b(this.f53374d.m21826p(), "ad_unit_id");
            tv0Var.m28761b(this.f53374d.m21825o(), "ad_type_format");
            tv0Var.m28761b(this.f53374d.m21800A(), "product_type");
            tv0Var.m28761b(this.f53374d.m21823m(), "ad_source");
            tv0Var.m28759a(this.f53374d.m21813c());
            Map<String, Object> m21829s = this.f53374d.m21829s();
            if (m21829s != null) {
                tv0Var.m28760a(m21829s);
            }
            EnumC5007e6 m21824n = this.f53374d.m21824n();
            if (m21824n != null) {
                tv0Var.m28761b(m21824n.m24033a(), "ad_type");
            } else {
                tv0Var.m28758a("ad_type");
            }
        } else {
            tv0Var.m28758a("block_id");
            tv0Var.m28758a("ad_unit_id");
            tv0Var.m28758a("ad_type_format");
            tv0Var.m28758a("product_type");
            tv0Var.m28758a("ad_source");
        }
        tv0Var.m28760a(this.f53373c.m28881a(this.f53372b.m24765a()));
        sv0.InterfaceC5763a interfaceC5763a = this.f53375e;
        if (interfaceC5763a != null) {
            tv0Var.m28760a(interfaceC5763a.mo22529a());
        }
        return tv0Var.m28756a();
    }

    /* renamed from: a */
    public final void m27147a(@NonNull AdResponse adResponse) {
        this.f53374d = adResponse;
    }

    /* renamed from: a */
    public final void m27149a(@NonNull sv0.InterfaceC5763a interfaceC5763a) {
        this.f53375e = interfaceC5763a;
    }
}
