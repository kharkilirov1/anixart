package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class pj1 implements mw0<pb1, List<pb1>> {

    /* renamed from: a */
    @NonNull
    private final fa1 f53564a;

    public pj1(@NonNull fa1 fa1Var) {
        this.f53564a = fa1Var;
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    /* renamed from: a */
    public final sv0 mo26777a(pb1 pb1Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", this.f53564a.m24380b());
        hashMap.put("imp_id", this.f53564a.m24379a());
        return new sv0(sv0.EnumC5764b.f54846n.m28361a(), hashMap);
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    /* renamed from: a */
    public final sv0 mo26776a(@Nullable tw0<List<pb1>> tw0Var, int i2, @NonNull pb1 pb1Var) {
        sv0.EnumC5765c enumC5765c;
        List<pb1> list;
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", this.f53564a.m24380b());
        hashMap.put("imp_id", this.f53564a.m24379a());
        if (204 == i2) {
            enumC5765c = sv0.EnumC5765c.f54862d;
        } else if (tw0Var != null && (list = tw0Var.f55247a) != null && i2 == 200) {
            enumC5765c = list.isEmpty() ? sv0.EnumC5765c.f54862d : sv0.EnumC5765c.f54860b;
        } else {
            enumC5765c = sv0.EnumC5765c.f54861c;
        }
        hashMap.put("status", enumC5765c.m28362a());
        return new sv0(sv0.EnumC5764b.f54847o.m28361a(), hashMap);
    }
}
