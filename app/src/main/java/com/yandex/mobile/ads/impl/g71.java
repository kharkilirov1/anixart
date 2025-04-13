package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.AbstractC4967de;

/* loaded from: classes3.dex */
public abstract class g71<R, T> extends AbstractC4967de<T> {

    /* renamed from: r */
    @NonNull
    private final R f50517r;

    /* renamed from: s */
    @NonNull
    private final mw0<R, T> f50518s;

    /* renamed from: t */
    @NonNull
    private final vv0 f50519t;

    public g71(@NonNull Context context, int i2, @NonNull String str, @NonNull AbstractC4967de.a<T> aVar, @NonNull R r, @NonNull mw0<R, T> mw0Var) {
        super(i2, str, aVar);
        this.f50517r = r;
        this.f50518s = mw0Var;
        this.f50519t = C5730s8.m28078a(context);
        m24814a(context);
        m24815t();
    }

    /* renamed from: t */
    private void m24815t() {
        this.f50519t.mo23876a(this.f50518s.mo26777a(this.f50517r));
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: a */
    public final tw0<T> mo22616a(@NonNull km0 km0Var) {
        int i2 = km0Var.f52032a;
        tw0<T> mo24051a = mo24051a(km0Var, i2);
        sv0 mo26776a = this.f50518s.mo26776a(mo24051a, i2, this.f50517r);
        new tv0(mo26776a.m28359a()).m28757a(km0Var.f52034c.get(j00.m25754b(21)), "server_log_id");
        this.f50519t.mo23876a(mo26776a);
        return mo24051a;
    }

    /* renamed from: a */
    public abstract tw0<T> mo24051a(@NonNull km0 km0Var, int i2);

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: b */
    public qh1 mo24816b(qh1 qh1Var) {
        km0 km0Var = qh1Var.f54052a;
        this.f50519t.mo23876a(this.f50518s.mo26776a(null, km0Var != null ? km0Var.f52032a : -1, this.f50517r));
        return qh1Var;
    }

    /* renamed from: a */
    private void m24814a(@NonNull Context context) {
        m30310a(new C5956w4().m29373a(context));
    }
}
