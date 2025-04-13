package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5046ev;
import com.yandex.mobile.ads.impl.e01;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
abstract class h41 {

    /* renamed from: b */
    private y61 f50833b;

    /* renamed from: c */
    private InterfaceC5509nt f50834c;

    /* renamed from: d */
    private kn0 f50835d;

    /* renamed from: e */
    private long f50836e;

    /* renamed from: f */
    private long f50837f;

    /* renamed from: g */
    private long f50838g;

    /* renamed from: h */
    private int f50839h;

    /* renamed from: i */
    private int f50840i;

    /* renamed from: k */
    private long f50842k;

    /* renamed from: l */
    private boolean f50843l;

    /* renamed from: m */
    private boolean f50844m;

    /* renamed from: a */
    private final in0 f50832a = new in0();

    /* renamed from: j */
    private C5163a f50841j = new C5163a();

    /* renamed from: com.yandex.mobile.ads.impl.h41$a */
    public static class C5163a {

        /* renamed from: a */
        public C5606pv f50845a;

        /* renamed from: b */
        public C5046ev.a f50846b;
    }

    /* renamed from: com.yandex.mobile.ads.impl.h41$b */
    public static final class C5164b implements kn0 {
        private C5164b() {
        }

        @Override // com.yandex.mobile.ads.impl.kn0
        /* renamed from: a */
        public final long mo22562a(C5598pn c5598pn) {
            return -1L;
        }

        @Override // com.yandex.mobile.ads.impl.kn0
        /* renamed from: a */
        public final e01 mo22563a() {
            return new e01.C4998b(-9223372036854775807L, 0L);
        }

        @Override // com.yandex.mobile.ads.impl.kn0
        /* renamed from: a */
        public final void mo22564a(long j2) {
        }

        public /* synthetic */ C5164b(int i2) {
            this();
        }
    }

    /* renamed from: a */
    public abstract long mo24268a(ap0 ap0Var);

    /* renamed from: a */
    public final void m25055a(InterfaceC5509nt interfaceC5509nt, y61 y61Var) {
        this.f50834c = interfaceC5509nt;
        this.f50833b = y61Var;
        mo24269a(true);
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: a */
    public abstract boolean mo24270a(ap0 ap0Var, long j2, C5163a c5163a) throws IOException;

    /* renamed from: b */
    public final long m25056b(long j2) {
        return (this.f50840i * j2) / 1000000;
    }

    /* renamed from: c */
    public void mo25057c(long j2) {
        this.f50838g = j2;
    }

    /* renamed from: a */
    public void mo24269a(boolean z) {
        if (z) {
            this.f50841j = new C5163a();
            this.f50837f = 0L;
            this.f50839h = 0;
        } else {
            this.f50839h = 1;
        }
        this.f50836e = -1L;
        this.f50838g = 0L;
    }

    /* renamed from: a */
    public final void m25054a(long j2, long j3) {
        this.f50832a.m25576c();
        if (j2 == 0) {
            mo24269a(!this.f50843l);
            return;
        }
        if (this.f50839h != 0) {
            long m25056b = m25056b(j3);
            this.f50836e = m25056b;
            kn0 kn0Var = this.f50835d;
            int i2 = s91.f54530a;
            kn0Var.mo22564a(m25056b);
            this.f50839h = 2;
        }
    }

    /* renamed from: a */
    public final int m25052a(C5598pn c5598pn, qr0 qr0Var) throws IOException {
        boolean z;
        C5220ia.m25474b(this.f50833b);
        int i2 = s91.f54530a;
        int i3 = this.f50839h;
        int i4 = 0;
        if (i3 == 0) {
            while (true) {
                if (!this.f50832a.m25574a(c5598pn)) {
                    this.f50839h = 3;
                    z = false;
                    break;
                }
                this.f50842k = c5598pn.getPosition() - this.f50837f;
                if (!mo24270a(this.f50832a.m25575b(), this.f50837f, this.f50841j)) {
                    z = true;
                    break;
                }
                this.f50837f = c5598pn.getPosition();
            }
            if (!z) {
                return -1;
            }
            C5606pv c5606pv = this.f50841j.f50845a;
            this.f50840i = c5606pv.f53834z;
            if (!this.f50844m) {
                this.f50833b.mo28347a(c5606pv);
                this.f50844m = true;
            }
            C5046ev.a aVar = this.f50841j.f50846b;
            if (aVar != null) {
                this.f50835d = aVar;
            } else if (c5598pn.mo22717a() == -1) {
                this.f50835d = new C5164b(i4);
            } else {
                jn0 m25573a = this.f50832a.m25573a();
                this.f50835d = new C4817ao(this, this.f50837f, c5598pn.mo22717a(), m25573a.f51665d + m25573a.f51666e, m25573a.f51663b, (m25573a.f51662a & 4) != 0);
            }
            this.f50839h = 2;
            this.f50832a.m25577d();
            return 0;
        }
        if (i3 == 1) {
            c5598pn.mo26760a((int) this.f50837f);
            this.f50839h = 2;
            return 0;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                return -1;
            }
            throw new IllegalStateException();
        }
        long mo22562a = this.f50835d.mo22562a(c5598pn);
        if (mo22562a >= 0) {
            qr0Var.f54129a = mo22562a;
            return 1;
        }
        if (mo22562a < -1) {
            mo25057c(-(mo22562a + 2));
        }
        if (!this.f50843l) {
            this.f50834c.mo23024a((e01) C5220ia.m25474b(this.f50835d.mo22563a()));
            this.f50843l = true;
        }
        if (this.f50842k <= 0 && !this.f50832a.m25574a(c5598pn)) {
            this.f50839h = 3;
            return -1;
        }
        this.f50842k = 0L;
        ap0 m25575b = this.f50832a.m25575b();
        long mo24268a = mo24268a(m25575b);
        if (mo24268a >= 0) {
            long j2 = this.f50838g;
            if (j2 + mo24268a >= this.f50836e) {
                long m25053a = m25053a(j2);
                this.f50833b.mo28345a(m25575b.m22590e(), m25575b);
                this.f50833b.mo28346a(m25053a, 1, m25575b.m22590e(), 0, null);
                this.f50836e = -1L;
            }
        }
        this.f50838g += mo24268a;
        return 0;
    }

    /* renamed from: a */
    public final long m25053a(long j2) {
        return (j2 * 1000000) / this.f50840i;
    }
}
