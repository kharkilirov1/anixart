package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C5372l2;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class kz0 extends AbstractC4967de<cz0> {

    /* renamed from: r */
    @NonNull
    private final jw0<cz0> f52197r;

    /* renamed from: s */
    @NonNull
    private final Context f52198s;

    /* renamed from: t */
    @NonNull
    private final Map<String, String> f52199t;

    public kz0(@NonNull Context context, @NonNull String str, @NonNull lz0 lz0Var, @NonNull Map map, @NonNull mz0 mz0Var) {
        super(0, str, mz0Var);
        this.f52198s = context;
        this.f52197r = lz0Var;
        this.f52199t = map;
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: a */
    public final tw0<cz0> mo22616a(@NonNull km0 km0Var) {
        int i2;
        if (200 == km0Var.f52032a) {
            cz0 mo25992a = this.f52197r.mo25992a(km0Var);
            if (mo25992a != null) {
                return tw0.m28764a(mo25992a, k00.m26002a(km0Var));
            }
            i2 = 5;
        } else {
            i2 = 8;
        }
        return tw0.m28763a(new C5372l2(km0Var, i2));
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: b */
    public final qh1 mo24816b(qh1 qh1Var) {
        n60.m26808a(qh1Var, qh1Var.toString(), new Object[0]);
        km0 km0Var = qh1Var.f54052a;
        int i2 = C5372l2.f52212c;
        return C5372l2.a.m26320b(km0Var);
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: f */
    public final Map<String, String> mo26305f() throws C6069yb {
        HashMap hashMap = new HashMap();
        l00.m26308a(this.f52198s, hashMap);
        hashMap.putAll(this.f52199t);
        return hashMap;
    }
}
