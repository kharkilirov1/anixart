package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ak1 implements InterfaceC5271j5 {

    /* renamed from: a */
    @NonNull
    private final AdResponse f48599a;

    public ak1(@NonNull AdResponse adResponse) {
        this.f48599a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5271j5
    @NonNull
    /* renamed from: a */
    public final Map<String, Object> mo22538a() {
        tv0 tv0Var = new tv0(new HashMap());
        tv0Var.m28761b(this.f48599a.m21823m(), "ad_source");
        tv0Var.m28761b(this.f48599a.m21825o(), "ad_type_format");
        tv0Var.m28761b(this.f48599a.m21826p(), "block_id");
        tv0Var.m28761b(this.f48599a.m21826p(), "ad_unit_id");
        tv0Var.m28761b(this.f48599a.m21800A(), "product_type");
        tv0Var.m28757a(this.f48599a.m21804E(), "server_log_id");
        return tv0Var.m28756a();
    }
}
