package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class gl0 implements qc1 {

    /* renamed from: a */
    @NonNull
    private final tk0 f50659a;

    /* renamed from: b */
    @NonNull
    private final tc1 f50660b;

    /* renamed from: c */
    @NonNull
    private final da1<il0> f50661c;

    /* renamed from: d */
    @NonNull
    private final oe1 f50662d;

    /* renamed from: e */
    @Nullable
    private wc1 f50663e;

    /* renamed from: com.yandex.mobile.ads.impl.gl0$a */
    public class C5136a implements sc1<il0> {
        private C5136a() {
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: a */
        public final void mo24926a(@NonNull hc1<il0> hc1Var) {
            if (gl0.this.f50663e != null) {
                gl0.this.f50663e.mo25596b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: a */
        public final void mo24927a(@NonNull hc1<il0> hc1Var, float f2) {
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: b */
        public final void mo24929b(@NonNull hc1<il0> hc1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: c */
        public final void mo24930c(@NonNull hc1<il0> hc1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: d */
        public final void mo24931d(@NonNull hc1<il0> hc1Var) {
            gl0.this.f50660b.m28595b();
            if (gl0.this.f50663e != null) {
                gl0.this.f50663e.mo25597c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: e */
        public final void mo24932e(@NonNull hc1<il0> hc1Var) {
            gl0.this.f50661c.m23858c();
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: f */
        public final void mo24933f(@NonNull hc1<il0> hc1Var) {
            if (gl0.this.f50663e != null) {
                gl0.this.f50663e.mo25596b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: g */
        public final void mo24934g(@NonNull hc1<il0> hc1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: h */
        public final void mo24935h(@NonNull hc1<il0> hc1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: i */
        public final void mo24936i(@NonNull hc1<il0> hc1Var) {
            gl0.this.f50660b.m28594a();
            if (gl0.this.f50663e != null) {
                gl0.this.f50663e.mo25596b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: j */
        public final void mo24937j(@NonNull hc1<il0> hc1Var) {
            gl0.this.f50662d.mo26331g();
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: k */
        public final void mo24938k(@NonNull hc1<il0> hc1Var) {
            gl0.this.f50662d.mo26327c();
        }

        public /* synthetic */ C5136a(gl0 gl0Var, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.sc1
        /* renamed from: a */
        public final void mo24928a(@NonNull hc1<il0> hc1Var, @NonNull ed1 ed1Var) {
            ((C5987ws) gl0.this.f50659a).m29552f();
            if (gl0.this.f50663e != null) {
                gl0.this.f50663e.mo25594a();
            }
        }
    }

    public gl0(@NonNull Context context, @NonNull C5987ws c5987ws, @NonNull hc1 hc1Var, @NonNull wl0 wl0Var, @NonNull yc1 yc1Var, @NonNull tf1 tf1Var, @NonNull jd1 jd1Var, @NonNull oe1 oe1Var) {
        this.f50659a = c5987ws;
        this.f50662d = oe1Var;
        this.f50660b = new tc1(context, yc1Var);
        da1<il0> da1Var = new da1<>(context, new vk0(c5987ws), wl0Var, hc1Var, new ml0(wl0Var), new sd1(), tf1Var, jd1Var, new C5136a(this, 0));
        this.f50661c = da1Var;
        da1Var.m23856a(yc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qc1
    public final void play() {
        this.f50661c.m23859d();
    }

    @Override // com.yandex.mobile.ads.impl.qc1
    public final void stop() {
        this.f50661c.m23857b();
        ((C5987ws) this.f50659a).m29558l();
    }

    @Override // com.yandex.mobile.ads.impl.qc1
    /* renamed from: a */
    public final void mo24925a(@Nullable wc1 wc1Var) {
        this.f50663e = wc1Var;
    }
}
