package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.e01;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.se */
/* loaded from: classes3.dex */
public abstract class AbstractC5742se {

    /* renamed from: a */
    public final a f54631a;

    /* renamed from: b */
    public final f f54632b;

    /* renamed from: c */
    @Nullable
    public c f54633c;

    /* renamed from: d */
    private final int f54634d;

    /* renamed from: com.yandex.mobile.ads.impl.se$a */
    public static class a implements e01 {

        /* renamed from: a */
        private final d f54635a;

        /* renamed from: b */
        private final long f54636b;

        /* renamed from: c */
        private final long f54637c = 0;

        /* renamed from: d */
        private final long f54638d;

        /* renamed from: e */
        private final long f54639e;

        /* renamed from: f */
        private final long f54640f;

        /* renamed from: g */
        private final long f54641g;

        public a(d dVar, long j2, long j3, long j4, long j5, long j6) {
            this.f54635a = dVar;
            this.f54636b = j2;
            this.f54638d = j3;
            this.f54639e = j4;
            this.f54640f = j5;
            this.f54641g = j6;
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: b */
        public final boolean mo22566b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: b */
        public final e01.C4997a mo22565b(long j2) {
            g01 g01Var = new g01(j2, c.m28221a(this.f54635a.mo24215a(j2), this.f54637c, this.f54638d, this.f54639e, this.f54640f, this.f54641g));
            return new e01.C4997a(g01Var, g01Var);
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: c */
        public final long mo22567c() {
            return this.f54636b;
        }

        /* renamed from: c */
        public final long m28220c(long j2) {
            return this.f54635a.mo24215a(j2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.se$b */
    public static final class b implements d {
        @Override // com.yandex.mobile.ads.impl.AbstractC5742se.d
        /* renamed from: a */
        public final long mo24215a(long j2) {
            return j2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.se$c */
    public static class c {

        /* renamed from: a */
        private final long f54642a;

        /* renamed from: b */
        private final long f54643b;

        /* renamed from: c */
        private final long f54644c;

        /* renamed from: d */
        private long f54645d;

        /* renamed from: e */
        private long f54646e;

        /* renamed from: f */
        private long f54647f;

        /* renamed from: g */
        private long f54648g;

        /* renamed from: h */
        private long f54649h;

        public c(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
            this.f54642a = j2;
            this.f54643b = j3;
            this.f54645d = j4;
            this.f54646e = j5;
            this.f54647f = j6;
            this.f54648g = j7;
            this.f54644c = j8;
            this.f54649h = m28221a(j3, j4, j5, j6, j7, j8);
        }

        /* renamed from: a */
        public static long m28221a(long j2, long j3, long j4, long j5, long j6, long j7) {
            if (j5 + 1 >= j6 || j3 + 1 >= j4) {
                return j5;
            }
            long j8 = (long) ((j2 - j3) * ((j6 - j5) / (j4 - j3)));
            long j9 = j8 / 20;
            int i2 = s91.f54530a;
            return Math.max(j5, Math.min(((j8 + j5) - j7) - j9, j6 - 1));
        }

        /* renamed from: b */
        public static long m28224b(c cVar) {
            return cVar.f54647f;
        }

        /* renamed from: c */
        public static long m28226c(c cVar) {
            return cVar.f54648g;
        }

        /* renamed from: d */
        public static long m28227d(c cVar) {
            return cVar.f54649h;
        }

        /* renamed from: e */
        public static long m28228e(c cVar) {
            return cVar.f54643b;
        }

        /* renamed from: b */
        public static void m28225b(c cVar, long j2, long j3) {
            cVar.f54645d = j2;
            cVar.f54647f = j3;
            cVar.f54649h = m28221a(cVar.f54643b, j2, cVar.f54646e, j3, cVar.f54648g, cVar.f54644c);
        }

        /* renamed from: a */
        public static long m28222a(c cVar) {
            return cVar.f54642a;
        }

        /* renamed from: a */
        public static void m28223a(c cVar, long j2, long j3) {
            cVar.f54646e = j2;
            cVar.f54648g = j3;
            cVar.f54649h = m28221a(cVar.f54643b, cVar.f54645d, j2, cVar.f54647f, j3, cVar.f54644c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.se$d */
    public interface d {
        /* renamed from: a */
        long mo24215a(long j2);
    }

    /* renamed from: com.yandex.mobile.ads.impl.se$e */
    public static final class e {

        /* renamed from: d */
        public static final e f54650d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        private final int f54651a;

        /* renamed from: b */
        private final long f54652b;

        /* renamed from: c */
        private final long f54653c;

        private e(int i2, long j2, long j3) {
            this.f54651a = i2;
            this.f54652b = j2;
            this.f54653c = j3;
        }

        /* renamed from: a */
        public static e m28231a(long j2, long j3) {
            return new e(-1, j2, j3);
        }

        /* renamed from: b */
        public static e m28233b(long j2, long j3) {
            return new e(-2, j2, j3);
        }

        /* renamed from: a */
        public static e m28230a(long j2) {
            return new e(0, -9223372036854775807L, j2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.se$f */
    public interface f {
        /* renamed from: a */
        e mo22628a(C5598pn c5598pn, long j2) throws IOException;

        /* renamed from: a */
        void mo22629a();
    }

    public AbstractC5742se(d dVar, f fVar, long j2, long j3, long j4, long j5, long j6, int i2) {
        this.f54632b = fVar;
        this.f54634d = i2;
        this.f54631a = new a(dVar, j2, j3, j4, j5, j6);
    }

    /* renamed from: a */
    public final a m28212a() {
        return this.f54631a;
    }

    /* renamed from: b */
    public final boolean m28214b() {
        return this.f54633c != null;
    }

    /* renamed from: a */
    public final void m28213a(long j2) {
        c cVar = this.f54633c;
        if (cVar == null || c.m28222a(cVar) != j2) {
            this.f54633c = new c(j2, this.f54631a.m28220c(j2), this.f54631a.f54637c, this.f54631a.f54638d, this.f54631a.f54639e, this.f54631a.f54640f, this.f54631a.f54641g);
        }
    }

    /* renamed from: a */
    public final int m28211a(C5598pn c5598pn, qr0 qr0Var) throws IOException {
        boolean z;
        while (true) {
            c cVar = (c) C5220ia.m25474b(this.f54633c);
            long m28224b = c.m28224b(cVar);
            long m28226c = c.m28226c(cVar);
            long m28227d = c.m28227d(cVar);
            if (m28226c - m28224b <= this.f54634d) {
                this.f54633c = null;
                this.f54632b.mo22629a();
                if (m28224b == c5598pn.getPosition()) {
                    return 0;
                }
                qr0Var.f54129a = m28224b;
                return 1;
            }
            long position = m28227d - c5598pn.getPosition();
            if (position < 0 || position > 262144) {
                z = false;
            } else {
                c5598pn.mo26760a((int) position);
                z = true;
            }
            if (!z) {
                if (m28227d == c5598pn.getPosition()) {
                    return 0;
                }
                qr0Var.f54129a = m28227d;
                return 1;
            }
            c5598pn.mo26765c();
            e mo22628a = this.f54632b.mo22628a(c5598pn, c.m28228e(cVar));
            int i2 = mo22628a.f54651a;
            if (i2 == -3) {
                this.f54633c = null;
                this.f54632b.mo22629a();
                if (m28227d == c5598pn.getPosition()) {
                    return 0;
                }
                qr0Var.f54129a = m28227d;
                return 1;
            }
            if (i2 == -2) {
                c.m28225b(cVar, mo22628a.f54652b, mo22628a.f54653c);
            } else {
                if (i2 != -1) {
                    if (i2 == 0) {
                        long position2 = mo22628a.f54653c - c5598pn.getPosition();
                        if (position2 >= 0 && position2 <= 262144) {
                            c5598pn.mo26760a((int) position2);
                        }
                        this.f54633c = null;
                        this.f54632b.mo22629a();
                        long j2 = mo22628a.f54653c;
                        if (j2 == c5598pn.getPosition()) {
                            return 0;
                        }
                        qr0Var.f54129a = j2;
                        return 1;
                    }
                    throw new IllegalStateException("Invalid case");
                }
                c.m28223a(cVar, mo22628a.f54652b, mo22628a.f54653c);
            }
        }
    }
}
