package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class w01 {

    /* renamed from: a */
    @NonNull
    private final C5841u4 f55981a = new C5841u4();

    /* renamed from: b */
    @NonNull
    private final vv0 f55982b;

    /* renamed from: c */
    @NonNull
    private final AdResponse f55983c;

    /* renamed from: d */
    @NonNull
    private final C5101g2 f55984d;

    /* renamed from: e */
    @Nullable
    private final sv0.InterfaceC5763a f55985e;

    public w01(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2, @Nullable sv0.InterfaceC5763a interfaceC5763a) {
        this.f55984d = c5101g2;
        this.f55983c = adResponse;
        this.f55985e = interfaceC5763a;
        this.f55982b = C5730s8.m28078a(context);
    }

    /* renamed from: a */
    public final void m29359a(@NonNull List<u21> list) {
        tv0 tv0Var = new tv0(new HashMap());
        EnumC5007e6 m21824n = this.f55983c.m21824n();
        if (m21824n != null) {
            tv0Var.m28761b(m21824n.m24033a(), "ad_type");
        } else {
            tv0Var.m28758a("ad_type");
        }
        tv0Var.m28761b(this.f55983c.m21826p(), "block_id");
        tv0Var.m28761b(this.f55983c.m21826p(), "ad_unit_id");
        tv0Var.m28761b("Yandex", "adapter");
        tv0Var.m28761b(this.f55983c.m21825o(), "ad_type_format");
        tv0Var.m28761b(this.f55983c.m21800A(), "product_type");
        tv0Var.m28761b(this.f55983c.m21823m(), "ad_source");
        String[] strArr = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            strArr[i2] = list.get(i2).m28841b();
        }
        tv0Var.m28761b(strArr, "social_actions");
        tv0Var.m28760a(this.f55981a.m28881a(this.f55984d.m24765a()));
        sv0.InterfaceC5763a interfaceC5763a = this.f55985e;
        if (interfaceC5763a != null) {
            tv0Var.m28760a(interfaceC5763a.mo22529a());
        }
        sv0.EnumC5764b enumC5764b = sv0.EnumC5764b.f54817E;
        this.f55982b.mo23876a(new sv0(enumC5764b.m28361a(), tv0Var.m28756a()));
    }
}
