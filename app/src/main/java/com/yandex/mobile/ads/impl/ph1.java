package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ph1 implements mw0<lh1, gh1> {
    @Override // com.yandex.mobile.ads.impl.mw0
    /* renamed from: a */
    public final sv0 mo26777a(lh1 lh1Var) {
        lh1 lh1Var2 = lh1Var;
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", lh1Var2.m26467c());
        hashMap.put("category_id", lh1Var2.m26466b());
        return new sv0(sv0.EnumC5764b.f54851s.m28361a(), hashMap);
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    /* renamed from: a */
    public final sv0 mo26776a(@Nullable tw0<gh1> tw0Var, int i2, @NonNull lh1 lh1Var) {
        lh1 lh1Var2 = lh1Var;
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", lh1Var2.m26467c());
        hashMap.put("category_id", lh1Var2.m26466b());
        if (i2 != -1) {
            hashMap.put("code", Integer.valueOf(i2));
        }
        return new sv0(sv0.EnumC5764b.f54852t.m28361a(), hashMap);
    }
}
