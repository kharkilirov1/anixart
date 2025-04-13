package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zf1 extends dg1<sl0, ob1> {

    /* renamed from: b */
    @NonNull
    private final nl0 f57139b;

    /* renamed from: c */
    @NonNull
    private final wf1 f57140c;

    /* renamed from: d */
    @NonNull
    private final xf1 f57141d;

    /* renamed from: e */
    @Nullable
    private vf1 f57142e;

    public zf1(@NonNull sl0 sl0Var, @NonNull qe1 qe1Var, @NonNull C5101g2 c5101g2, @NonNull AdResponse adResponse, @NonNull l20 l20Var, @NonNull cl0 cl0Var, @NonNull nj0 nj0Var) {
        super(sl0Var);
        Context context = sl0Var.getContext();
        this.f57140c = new wf1();
        this.f57139b = new nl0(context, this, qe1Var, c5101g2, adResponse, l20Var, cl0Var, nj0Var);
        xf1 xf1Var = new xf1();
        this.f57141d = xf1Var;
        l20Var.m26323a(xf1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22387a(@NonNull sl0 sl0Var) {
        sl0 sl0Var2 = sl0Var;
        this.f57139b.m26923a(sl0Var2);
        super.mo22387a(sl0Var2);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: b */
    public final void mo22389b(@NonNull sl0 sl0Var, @NonNull ob1 ob1Var) {
        sl0 sl0Var2 = sl0Var;
        hc1<il0> m27065a = ob1Var.m27065a();
        wf1 wf1Var = this.f57140c;
        Context context = sl0Var2.getContext();
        EnumC5778t1 enumC5778t1 = EnumC5778t1.f54920d;
        Objects.requireNonNull(wf1Var);
        vf1 m29480a = wf1.m29480a(context, m27065a, enumC5778t1);
        this.f57142e = m29480a;
        this.f57141d.m29749a(m29480a);
        this.f57139b.m26925a(sl0Var2, m27065a, this.f57142e);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22499a(@NonNull C5276ja c5276ja, @NonNull gg1 gg1Var, @Nullable ob1 ob1Var) {
        ob1 ob1Var2 = ob1Var;
        sl0 m23881b = m23881b();
        if (m23881b != null) {
            gg1Var.mo24889a(m23881b, c5276ja);
            if (ob1Var2 == null || this.f57142e == null) {
                return;
            }
            hc1<il0> m27065a = ob1Var2.m27065a();
            gg1Var.mo24890a(c5276ja, new de1(m23881b, m27065a.m25116a()));
            this.f57139b.m26924a(m23881b, m27065a);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo22388a(@NonNull sl0 sl0Var, @NonNull ob1 ob1Var) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo23312a() {
        vf1 vf1Var = this.f57142e;
        if (vf1Var != null) {
            vf1Var.mo25518k();
        }
        this.f57141d.m29749a(null);
    }
}
