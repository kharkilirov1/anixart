package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.mediation.base.C6164a;
import com.yandex.mobile.ads.mediation.base.C6165b;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class dd0 implements InterfaceC4836b1 {

    /* renamed from: a */
    @NonNull
    private final C6165b f49634a = new C6165b();

    /* renamed from: b */
    @Nullable
    private final vc0 f49635b;

    public dd0(@Nullable vc0 vc0Var) {
        this.f49635b = vc0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4836b1
    @NonNull
    /* renamed from: a */
    public final Map<String, Object> mo22689a() {
        tv0 tv0Var = new tv0(new HashMap());
        vc0 vc0Var = this.f49635b;
        if (vc0Var != null) {
            qd0 m29214b = vc0Var.m29214b();
            C6164a m29212a = this.f49635b.m29212a();
            tv0Var.m28761b(m29214b.m27676c(), "adapter");
            tv0Var.m28761b(m29214b.m27680g(), "adapter_parameters");
            Objects.requireNonNull(this.f49634a);
            tv0Var.m28760a(new HashMap(C6165b.m30417a(m29212a)));
        }
        return tv0Var.m28756a();
    }
}
