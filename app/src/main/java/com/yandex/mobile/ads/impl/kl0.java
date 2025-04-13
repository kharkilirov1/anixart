package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class kl0 {

    /* renamed from: a */
    @NonNull
    private final qe1 f52005a;

    /* renamed from: b */
    @NonNull
    private final zf1 f52006b;

    /* renamed from: c */
    @NonNull
    private final uk0 f52007c;

    /* renamed from: d */
    @NonNull
    private final hs0 f52008d;

    /* renamed from: e */
    @NonNull
    private final tl0 f52009e;

    /* renamed from: f */
    @NonNull
    private final kv0 f52010f;

    /* renamed from: g */
    @NonNull
    private final iq0 f52011g;

    /* renamed from: h */
    @NonNull
    private final iq0 f52012h;

    /* renamed from: i */
    @NonNull
    private final C5344a f52013i;

    /* renamed from: j */
    @NonNull
    private final hl0 f52014j;

    /* renamed from: k */
    @Nullable
    private iq0 f52015k;

    /* renamed from: com.yandex.mobile.ads.impl.kl0$a */
    public class C5344a implements wc1 {
        private C5344a() {
        }

        @Override // com.yandex.mobile.ads.impl.wc1
        /* renamed from: a */
        public final void mo25594a() {
            kl0.this.f52014j.mo22859a();
        }

        @Override // com.yandex.mobile.ads.impl.wc1
        /* renamed from: b */
        public final void mo25596b() {
            kl0.this.f52015k = null;
            kl0.this.f52010f.m26288a();
            kl0.this.f52014j.mo22861b();
        }

        @Override // com.yandex.mobile.ads.impl.wc1
        /* renamed from: c */
        public final void mo25597c() {
            sl0 m23881b = kl0.this.f52006b.m23881b();
            if (m23881b != null) {
                m23881b.setClickable(true);
            }
        }

        public /* synthetic */ C5344a(kl0 kl0Var, int i2) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kl0$b */
    public class C5345b implements qv0 {
        private C5345b() {
        }

        @Override // com.yandex.mobile.ads.impl.qv0
        /* renamed from: a */
        public final void mo26158a() {
            kl0 kl0Var = kl0.this;
            kl0.m26150a(kl0Var, kl0Var.f52011g);
        }

        public /* synthetic */ C5345b(kl0 kl0Var, int i2) {
            this();
        }
    }

    public kl0(@NonNull Context context, @NonNull C5987ws c5987ws, @NonNull hc1 hc1Var, @NonNull qe1 qe1Var, @NonNull zf1 zf1Var, @NonNull yc1 yc1Var, @NonNull tf1 tf1Var, @NonNull oe1 oe1Var, @NonNull hl0 hl0Var) {
        this.f52005a = qe1Var;
        this.f52006b = zf1Var;
        this.f52014j = hl0Var;
        wl0 wl0Var = new wl0(zf1Var);
        this.f52007c = new uk0(c5987ws);
        this.f52009e = new tl0(c5987ws);
        jd1 jd1Var = new jd1();
        new yk0(zf1Var, c5987ws, wl0Var, hl0Var).m29950a(jd1Var);
        gl0 gl0Var = new gl0(context, c5987ws, hc1Var, wl0Var, yc1Var, tf1Var, jd1Var, oe1Var);
        rv0 rv0Var = new rv0(c5987ws, hc1Var, jd1Var);
        ul0 ul0Var = new ul0(c5987ws, qe1Var);
        hs0 hs0Var = new hs0();
        this.f52008d = hs0Var;
        this.f52012h = new iq0(zf1Var, gl0Var, ul0Var, hs0Var);
        this.f52011g = new iq0(zf1Var, rv0Var, ul0Var, hs0Var);
        int i2 = 0;
        this.f52013i = new C5344a(this, i2);
        this.f52010f = new kv0(zf1Var, new C5345b(this, i2));
    }

    /* renamed from: a */
    public final void m26155a() {
        sl0 m23881b = this.f52006b.m23881b();
        if (m23881b != null) {
            m23881b.setClickable(false);
        }
    }

    /* renamed from: b */
    public final void m26157b(@NonNull sl0 sl0Var) {
        iq0 iq0Var = this.f52015k;
        if (iq0Var != null) {
            iq0Var.m25592a(sl0Var);
        }
        this.f52009e.m28673b(sl0Var);
    }

    /* renamed from: a */
    public final void m26156a(@NonNull sl0 sl0Var) {
        this.f52007c.m29038a(this.f52005a);
        this.f52009e.m28672a(sl0Var);
        te1 m28320b = sl0Var.m28320b();
        Objects.requireNonNull(this.f52008d);
        m28320b.m28645a().setVisibility(0);
        iq0 iq0Var = this.f52012h;
        this.f52015k = iq0Var;
        iq0Var.m25593a(this.f52013i);
        this.f52015k.m25591a();
    }

    /* renamed from: a */
    public static void m26150a(kl0 kl0Var, iq0 iq0Var) {
        kl0Var.f52015k = iq0Var;
        iq0Var.m25593a(kl0Var.f52013i);
        kl0Var.f52015k.m25591a();
    }
}
