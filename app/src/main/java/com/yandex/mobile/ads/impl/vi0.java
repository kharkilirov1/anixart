package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class vi0 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @NonNull
    private final ti0 f55818a = new ti0();

    /* renamed from: b */
    @Nullable
    private AdResponse<qi0> f55819b;

    /* renamed from: a */
    public final void m29227a(@NonNull AdResponse<qi0> adResponse) {
        this.f55819b = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NonNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        tv0 tv0Var = new tv0(new HashMap());
        AdResponse<qi0> adResponse = this.f55819b;
        if (adResponse != null) {
            ArrayList m28668a = this.f55818a.m28668a(adResponse);
            if (!m28668a.isEmpty()) {
                tv0Var.m28757a(m28668a, "image_sizes");
            }
            ti0 ti0Var = this.f55818a;
            AdResponse<qi0> adResponse2 = this.f55819b;
            Objects.requireNonNull(ti0Var);
            ArrayList m28667c = ti0.m28667c(adResponse2);
            if (!m28667c.isEmpty()) {
                tv0Var.m28757a(m28667c, "native_ad_types");
            }
            ti0 ti0Var2 = this.f55818a;
            AdResponse<qi0> adResponse3 = this.f55819b;
            Objects.requireNonNull(ti0Var2);
            ArrayList m28666b = ti0.m28666b(adResponse3);
            if (!m28666b.isEmpty()) {
                tv0Var.m28757a(m28666b, "ad_id");
            }
            tv0Var.m28757a(this.f55819b.m21804E(), "server_log_id");
            tv0Var.m28761b(this.f55819b.m21823m(), "ad_source");
            tv0Var.m28759a(this.f55819b.m21813c());
            Map<String, Object> m21829s = this.f55819b.m21829s();
            if (m21829s != null) {
                tv0Var.m28760a(m21829s);
            }
            if (!this.f55819b.m21807H()) {
                tv0Var.m28761b(this.f55819b.m21825o(), "ad_type_format");
                tv0Var.m28761b(this.f55819b.m21800A(), "product_type");
            }
            tv0Var.m28757a(this.f55819b.m21833w(), "design");
        }
        return tv0Var.m28756a();
    }
}
