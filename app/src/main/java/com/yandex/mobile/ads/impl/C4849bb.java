package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.bb */
/* loaded from: classes3.dex */
public final class C4849bb {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4836b1 f48810a;

    /* renamed from: b */
    @NonNull
    private final EnumC5007e6 f48811b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC5271j5 f48812c;

    /* renamed from: d */
    @Nullable
    private sv0.InterfaceC5763a f48813d;

    /* renamed from: e */
    @Nullable
    private final String f48814e;

    public C4849bb(@NonNull InterfaceC5373l3 interfaceC5373l3, @NonNull EnumC5007e6 enumC5007e6, @Nullable String str) {
        this.f48810a = interfaceC5373l3.mo26334a();
        this.f48812c = interfaceC5373l3.mo26335b();
        this.f48811b = enumC5007e6;
        this.f48814e = str;
    }

    /* renamed from: a */
    public final void m22761a(@NonNull sv0.InterfaceC5763a interfaceC5763a) {
        this.f48813d = interfaceC5763a;
    }

    @NonNull
    /* renamed from: a */
    public final Map<String, Object> m22760a() {
        tv0 tv0Var = new tv0(new HashMap());
        tv0Var.m28761b(this.f48811b.m24033a(), "ad_type");
        tv0Var.m28757a(this.f48814e, "ad_id");
        tv0Var.m28760a(this.f48810a.mo22689a());
        tv0Var.m28760a(this.f48812c.mo22538a());
        sv0.InterfaceC5763a interfaceC5763a = this.f48813d;
        if (interfaceC5763a != null) {
            tv0Var.m28760a(interfaceC5763a.mo22529a());
        }
        return tv0Var.m28756a();
    }
}
