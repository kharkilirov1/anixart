package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.we */
/* loaded from: classes3.dex */
public final class C5969we {

    /* renamed from: a */
    @NonNull
    private final C4849bb f56119a;

    /* renamed from: b */
    @NonNull
    private final vv0 f56120b;

    public C5969we(@NonNull Context context, @NonNull InterfaceC5373l3 interfaceC5373l3, @NonNull EnumC5007e6 enumC5007e6, @Nullable String str) {
        this.f56119a = new C4849bb(interfaceC5373l3, enumC5007e6, str);
        this.f56120b = C5730s8.m28078a(context);
    }

    /* renamed from: a */
    public final void m29475a(@NonNull sv0.InterfaceC5763a interfaceC5763a) {
        this.f56119a.m22761a(interfaceC5763a);
    }

    /* renamed from: a */
    public final void m29476a(@Nullable String str) {
        tv0 tv0Var = new tv0(new HashMap());
        tv0Var.m28761b(str, "asset_name");
        tv0 tv0Var2 = new tv0(this.f56119a.m22760a());
        tv0Var2.m28761b("no_view_for_asset", "reason");
        tv0Var.m28760a(tv0Var2.m28756a());
        sv0.EnumC5764b enumC5764b = sv0.EnumC5764b.f54821I;
        this.f56120b.mo23876a(new sv0(enumC5764b.m28361a(), tv0Var.m28756a()));
    }
}
