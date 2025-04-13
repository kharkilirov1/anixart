package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.zh */
/* loaded from: classes3.dex */
public final class C6123zh implements wv0 {

    /* renamed from: a */
    @NonNull
    private final C5841u4 f57183a = new C5841u4();

    /* renamed from: b */
    @NonNull
    private final vv0 f57184b;

    /* renamed from: c */
    @NonNull
    private final AdResponse f57185c;

    /* renamed from: d */
    @Nullable
    private final C5101g2 f57186d;

    /* renamed from: e */
    @Nullable
    private final sv0.InterfaceC5763a f57187e;

    public C6123zh(@NonNull Context context, @NonNull AdResponse adResponse, @Nullable C5101g2 c5101g2, @Nullable oh0 oh0Var) {
        this.f57185c = adResponse;
        this.f57186d = c5101g2;
        this.f57187e = oh0Var;
        this.f57184b = C5730s8.m28078a(context);
    }

    /* renamed from: a */
    public final void m30190a(@NonNull HashMap hashMap) {
        this.f57184b.mo23876a(m30188a(sv0.EnumC5764b.f54813A, hashMap));
    }

    /* renamed from: a */
    public final void m30189a(@NonNull sv0.EnumC5764b enumC5764b) {
        this.f57184b.mo23876a(m30188a(enumC5764b, new HashMap()));
    }

    /* renamed from: a */
    private sv0 m30188a(@NonNull sv0.EnumC5764b enumC5764b, @NonNull HashMap hashMap) {
        tv0 tv0Var = new tv0(hashMap);
        EnumC5007e6 m21824n = this.f57185c.m21824n();
        if (m21824n != null) {
            tv0Var.m28761b(m21824n.m24033a(), "ad_type");
        } else {
            tv0Var.m28758a("ad_type");
        }
        tv0Var.m28761b(this.f57185c.m21826p(), "block_id");
        tv0Var.m28761b(this.f57185c.m21826p(), "ad_unit_id");
        tv0Var.m28761b("Yandex", "adapter");
        tv0Var.m28761b(this.f57185c.m21825o(), "ad_type_format");
        tv0Var.m28761b(this.f57185c.m21800A(), "product_type");
        tv0Var.m28761b(this.f57185c.m21823m(), "ad_source");
        Map<String, Object> m21829s = this.f57185c.m21829s();
        if (m21829s != null) {
            tv0Var.m28760a(m21829s);
        }
        tv0Var.m28759a(this.f57185c.m21813c());
        C5101g2 c5101g2 = this.f57186d;
        if (c5101g2 != null) {
            hashMap.putAll(this.f57183a.m28881a(c5101g2.m24765a()));
        }
        sv0.InterfaceC5763a interfaceC5763a = this.f57187e;
        if (interfaceC5763a != null) {
            hashMap.putAll(interfaceC5763a.mo22529a());
        }
        return new sv0(enumC5764b.m28361a(), tv0Var.m28756a());
    }
}
