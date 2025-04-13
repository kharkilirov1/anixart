package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.fz */
/* loaded from: classes3.dex */
public final class C5097fz implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @Nullable
    private AdResponse<String> f50461a;

    /* renamed from: a */
    public final void m24758a(@NonNull AdResponse<String> adResponse) {
        this.f50461a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NonNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        tv0 tv0Var = new tv0(new HashMap());
        AdResponse<String> adResponse = this.f50461a;
        if (adResponse != null) {
            String m21815e = adResponse.m21815e();
            tv0Var.m28757a(m21815e != null ? Collections.singletonList(m21815e) : null, "ad_id");
            tv0Var.m28761b(this.f50461a.m21823m(), "ad_source");
            tv0Var.m28757a(this.f50461a.m21804E(), "server_log_id");
            tv0Var.m28759a(this.f50461a.m21813c());
            Map<String, Object> m21829s = this.f50461a.m21829s();
            if (m21829s != null) {
                tv0Var.m28760a(m21829s);
            }
            tv0Var.m28757a(this.f50461a.m21833w(), "design");
            if (!this.f50461a.m21807H()) {
                tv0Var.m28761b(this.f50461a.m21825o(), "ad_type_format");
                tv0Var.m28761b(this.f50461a.m21800A(), "product_type");
            }
        }
        return tv0Var.m28756a();
    }
}
