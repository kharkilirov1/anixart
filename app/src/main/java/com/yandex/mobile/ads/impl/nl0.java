package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class nl0 {

    /* renamed from: a */
    @NonNull
    private final ae1 f53032a = new ae1();

    /* renamed from: b */
    @NonNull
    private final wk0 f53033b;

    /* renamed from: c */
    @NonNull
    private final ll0 f53034c;

    /* renamed from: d */
    @NonNull
    private final nj0 f53035d;

    /* renamed from: e */
    @Nullable
    private kl0 f53036e;

    /* renamed from: f */
    @Nullable
    private mj0 f53037f;

    public nl0(@NonNull Context context, @NonNull zf1 zf1Var, @NonNull qe1 qe1Var, @NonNull C5101g2 c5101g2, @NonNull AdResponse adResponse, @NonNull oe1 oe1Var, @NonNull cl0 cl0Var, @NonNull nj0 nj0Var) {
        this.f53034c = new ll0(zf1Var, qe1Var, c5101g2, adResponse, oe1Var, cl0Var);
        this.f53033b = new wk0(context, adResponse, c5101g2);
        this.f53035d = nj0Var;
    }

    /* renamed from: a */
    public final void m26925a(@NonNull sl0 sl0Var, @NonNull hc1<il0> hc1Var, @NonNull tf1 tf1Var) {
        C5987ws m29493a = this.f53033b.m29493a(hc1Var);
        kl0 m26496a = this.f53034c.m26496a(sl0Var.getContext(), m29493a, hc1Var, tf1Var);
        this.f53036e = m26496a;
        m26496a.m26156a(sl0Var);
        mj0 mj0Var = new mj0(m29493a);
        this.f53037f = mj0Var;
        this.f53035d.m26918a(mj0Var);
        sl0Var.setOnAttachStateChangeListener(new al0(m29493a, sl0Var));
    }

    /* renamed from: a */
    public final void m26924a(@NonNull sl0 sl0Var, @NonNull hc1<il0> hc1Var) {
        Objects.requireNonNull(this.f53032a);
        sl0Var.setAspectRatio(hc1Var.m25118c().getAdHeight() != 0 ? r3.getAdWidth() / r3.getAdHeight() : 1.7777778f);
        kl0 kl0Var = this.f53036e;
        if (kl0Var != null) {
            kl0Var.m26155a();
        }
    }

    /* renamed from: a */
    public final void m26923a(@NonNull sl0 sl0Var) {
        kl0 kl0Var = this.f53036e;
        if (kl0Var != null) {
            kl0Var.m26157b(sl0Var);
        }
        mj0 mj0Var = this.f53037f;
        if (mj0Var != null) {
            this.f53035d.m26919b(mj0Var);
            this.f53037f = null;
        }
        sl0Var.setOnAttachStateChangeListener(null);
    }
}
