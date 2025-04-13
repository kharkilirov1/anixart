package com.yandex.metrica.impl.p023ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Rf */
/* loaded from: classes2.dex */
public final class C3596Rf extends AbstractC3909e {

    /* renamed from: b */
    public int f43822b;

    /* renamed from: c */
    public q f43823c;

    /* renamed from: d */
    public o f43824d;

    /* renamed from: e */
    public p f43825e;

    /* renamed from: f */
    public b f43826f;

    /* renamed from: g */
    public h f43827g;

    public C3596Rf() {
        m18967b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        int i2 = this.f43822b;
        if (i2 != 0) {
            c3831b.m19622d(1, i2);
        }
        q qVar = this.f43823c;
        if (qVar != null) {
            c3831b.m19615b(2, qVar);
        }
        o oVar = this.f43824d;
        if (oVar != null) {
            c3831b.m19615b(3, oVar);
        }
        p pVar = this.f43825e;
        if (pVar != null) {
            c3831b.m19615b(4, pVar);
        }
        b bVar = this.f43826f;
        if (bVar != null) {
            c3831b.m19615b(5, bVar);
        }
        h hVar = this.f43827g;
        if (hVar != null) {
            c3831b.m19615b(6, hVar);
        }
    }

    /* renamed from: b */
    public C3596Rf m18967b() {
        this.f43822b = 0;
        this.f43823c = null;
        this.f43824d = null;
        this.f43825e = null;
        this.f43826f = null;
        this.f43827g = null;
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$b */
    public static final class b extends AbstractC3909e {

        /* renamed from: b */
        public c f43831b;

        public b() {
            m18970b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c cVar = this.f43831b;
            if (cVar != null) {
                c3831b.m19615b(1, cVar);
            }
        }

        /* renamed from: b */
        public b m18970b() {
            this.f43831b = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            c cVar = this.f43831b;
            if (cVar != null) {
                return 0 + C3831b.m19598a(1, cVar);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l != 10) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f43831b == null) {
                        this.f43831b = new c();
                    }
                    c3805a.m19545a(this.f43831b);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$h */
    public static final class h extends AbstractC3909e {

        /* renamed from: b */
        public f f43847b;

        public h() {
            m18977b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            f fVar = this.f43847b;
            if (fVar != null) {
                c3831b.m19615b(1, fVar);
            }
        }

        /* renamed from: b */
        public h m18977b() {
            this.f43847b = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            f fVar = this.f43847b;
            if (fVar != null) {
                return 0 + C3831b.m19598a(1, fVar);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l != 10) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f43847b == null) {
                        this.f43847b = new f();
                    }
                    c3805a.m19545a(this.f43847b);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$l */
    public static final class l extends AbstractC3909e {

        /* renamed from: c */
        private static volatile l[] f43862c;

        /* renamed from: b */
        public byte[] f43863b;

        public l() {
            m18984b();
        }

        /* renamed from: c */
        public static l[] m18983c() {
            if (f43862c == null) {
                synchronized (C3857c.f44857a) {
                    if (f43862c == null) {
                        f43862c = new l[0];
                    }
                }
            }
            return f43862c;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            if (Arrays.equals(this.f43863b, C3961g.f45152d)) {
                return;
            }
            c3831b.m19618b(1, this.f43863b);
        }

        /* renamed from: b */
        public l m18984b() {
            this.f43863b = C3961g.f45152d;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            if (Arrays.equals(this.f43863b, C3961g.f45152d)) {
                return 0;
            }
            return 0 + C3831b.m19601a(1, this.f43863b);
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l != 10) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f43863b = c3805a.m19550d();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$q */
    public static final class q extends AbstractC3909e {

        /* renamed from: b */
        public n f43875b;

        public q() {
            m18989b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            n nVar = this.f43875b;
            if (nVar != null) {
                c3831b.m19615b(1, nVar);
            }
        }

        /* renamed from: b */
        public q m18989b() {
            this.f43875b = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            n nVar = this.f43875b;
            if (nVar != null) {
                return 0 + C3831b.m19598a(1, nVar);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l != 10) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f43875b == null) {
                        this.f43875b = new n();
                    }
                    c3805a.m19545a(this.f43875b);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$i */
    public static final class i extends AbstractC3909e {

        /* renamed from: b */
        public a[] f43848b;

        /* renamed from: c */
        public int f43849c;

        public i() {
            m18978b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            a[] aVarArr = this.f43848b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    a[] aVarArr2 = this.f43848b;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        c3831b.m19615b(1, aVar);
                    }
                    i2++;
                }
            }
            int i3 = this.f43849c;
            if (i3 != 0) {
                c3831b.m19627f(2, i3);
            }
        }

        /* renamed from: b */
        public i m18978b() {
            this.f43848b = a.m18979c();
            this.f43849c = 0;
            this.f44976a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Rf$i$a */
        public static final class a extends AbstractC3909e {

            /* renamed from: d */
            private static volatile a[] f43850d;

            /* renamed from: b */
            public byte[] f43851b;

            /* renamed from: c */
            public byte[] f43852c;

            public a() {
                m18980b();
            }

            /* renamed from: c */
            public static a[] m18979c() {
                if (f43850d == null) {
                    synchronized (C3857c.f44857a) {
                        if (f43850d == null) {
                            f43850d = new a[0];
                        }
                    }
                }
                return f43850d;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                byte[] bArr = this.f43851b;
                byte[] bArr2 = C3961g.f45152d;
                if (!Arrays.equals(bArr, bArr2)) {
                    c3831b.m19618b(1, this.f43851b);
                }
                if (Arrays.equals(this.f43852c, bArr2)) {
                    return;
                }
                c3831b.m19618b(2, this.f43852c);
            }

            /* renamed from: b */
            public a m18980b() {
                byte[] bArr = C3961g.f45152d;
                this.f43851b = bArr;
                this.f43852c = bArr;
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                byte[] bArr = this.f43851b;
                byte[] bArr2 = C3961g.f45152d;
                int m19601a = Arrays.equals(bArr, bArr2) ? 0 : 0 + C3831b.m19601a(1, this.f43851b);
                return !Arrays.equals(this.f43852c, bArr2) ? m19601a + C3831b.m19601a(2, this.f43852c) : m19601a;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
                while (true) {
                    int m19562l = c3805a.m19562l();
                    if (m19562l == 0) {
                        break;
                    }
                    if (m19562l == 10) {
                        this.f43851b = c3805a.m19550d();
                    } else if (m19562l != 18) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        this.f43852c = c3805a.m19550d();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            a[] aVarArr = this.f43848b;
            int i2 = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i3 = 0;
                while (true) {
                    a[] aVarArr2 = this.f43848b;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        i3 += C3831b.m19598a(1, aVar);
                    }
                    i2++;
                }
                i2 = i3;
            }
            int i4 = this.f43849c;
            return i4 != 0 ? i2 + C3831b.m19610c(2, i4) : i2;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 10) {
                    int m19920a = C3961g.m19920a(c3805a, 10);
                    a[] aVarArr = this.f43848b;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i2 = m19920a + length;
                    a[] aVarArr2 = new a[i2];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        aVarArr2[length] = new a();
                        c3805a.m19545a(aVarArr2[length]);
                        c3805a.m19562l();
                        length++;
                    }
                    aVarArr2[length] = new a();
                    c3805a.m19545a(aVarArr2[length]);
                    this.f43848b = aVarArr2;
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f43849c = c3805a.m19558h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: d */
        private static volatile a[] f43828d;

        /* renamed from: b */
        public byte[] f43829b;

        /* renamed from: c */
        public e f43830c;

        public a() {
            m18969b();
        }

        /* renamed from: c */
        public static a[] m18968c() {
            if (f43828d == null) {
                synchronized (C3857c.f44857a) {
                    if (f43828d == null) {
                        f43828d = new a[0];
                    }
                }
            }
            return f43828d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            if (!Arrays.equals(this.f43829b, C3961g.f45152d)) {
                c3831b.m19618b(1, this.f43829b);
            }
            e eVar = this.f43830c;
            if (eVar != null) {
                c3831b.m19615b(2, eVar);
            }
        }

        /* renamed from: b */
        public a m18969b() {
            this.f43829b = C3961g.f45152d;
            this.f43830c = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19601a = Arrays.equals(this.f43829b, C3961g.f45152d) ? 0 : 0 + C3831b.m19601a(1, this.f43829b);
            e eVar = this.f43830c;
            return eVar != null ? m19601a + C3831b.m19598a(2, eVar) : m19601a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 10) {
                    this.f43829b = c3805a.m19550d();
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f43830c == null) {
                        this.f43830c = new e();
                    }
                    c3805a.m19545a(this.f43830c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$d */
    public static final class d extends AbstractC3909e {

        /* renamed from: b */
        public byte[][] f43836b;

        public d() {
            m18972b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            byte[][] bArr = this.f43836b;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                byte[][] bArr2 = this.f43836b;
                if (i2 >= bArr2.length) {
                    return;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    c3831b.m19618b(1, bArr3);
                }
                i2++;
            }
        }

        /* renamed from: b */
        public d m18972b() {
            this.f43836b = C3961g.f45151c;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            byte[][] bArr = this.f43836b;
            if (bArr == null || bArr.length <= 0) {
                return 0;
            }
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte[][] bArr2 = this.f43836b;
                if (i2 >= bArr2.length) {
                    return 0 + i3 + (i4 * 1);
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    i4++;
                    i3 += C3831b.m19606b(bArr3.length) + bArr3.length;
                }
                i2++;
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l != 10) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19920a = C3961g.m19920a(c3805a, 10);
                    byte[][] bArr = this.f43836b;
                    int length = bArr == null ? 0 : bArr.length;
                    int i2 = m19920a + length;
                    byte[][] bArr2 = new byte[i2][];
                    if (length != 0) {
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        bArr2[length] = c3805a.m19550d();
                        c3805a.m19562l();
                        length++;
                    }
                    bArr2[length] = c3805a.m19550d();
                    this.f43836b = bArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$e */
    public static final class e extends AbstractC3909e {

        /* renamed from: b */
        public long f43837b;

        /* renamed from: c */
        public int f43838c;

        public e() {
            m18973b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            long j2 = this.f43837b;
            if (j2 != 0) {
                c3831b.m19620c(1, j2);
            }
            int i2 = this.f43838c;
            if (i2 != 0) {
                c3831b.m19622d(2, i2);
            }
        }

        /* renamed from: b */
        public e m18973b() {
            this.f43837b = 0L;
            this.f43838c = 0;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            long j2 = this.f43837b;
            int m19597a = j2 != 0 ? 0 + C3831b.m19597a(1, j2) : 0;
            int i2 = this.f43838c;
            return i2 != 0 ? m19597a + C3831b.m19596a(2, i2) : m19597a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 8) {
                    this.f43837b = c3805a.m19559i();
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f43838c = c3805a.m19558h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$g */
    public static final class g extends AbstractC3909e {

        /* renamed from: d */
        private static volatile g[] f43844d;

        /* renamed from: b */
        public int f43845b;

        /* renamed from: c */
        public c f43846c;

        public g() {
            m18976b();
        }

        /* renamed from: c */
        public static g[] m18975c() {
            if (f43844d == null) {
                synchronized (C3857c.f44857a) {
                    if (f43844d == null) {
                        f43844d = new g[0];
                    }
                }
            }
            return f43844d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            int i2 = this.f43845b;
            if (i2 != 0) {
                c3831b.m19627f(1, i2);
            }
            c cVar = this.f43846c;
            if (cVar != null) {
                c3831b.m19615b(2, cVar);
            }
        }

        /* renamed from: b */
        public g m18976b() {
            this.f43845b = 0;
            this.f43846c = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = this.f43845b;
            int m19610c = i2 != 0 ? 0 + C3831b.m19610c(1, i2) : 0;
            c cVar = this.f43846c;
            return cVar != null ? m19610c + C3831b.m19598a(2, cVar) : m19610c;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 8) {
                    this.f43845b = c3805a.m19558h();
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f43846c == null) {
                        this.f43846c = new c();
                    }
                    c3805a.m19545a(this.f43846c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$o */
    public static final class o extends AbstractC3909e {

        /* renamed from: b */
        public k f43871b;

        /* renamed from: c */
        public n f43872c;

        public o() {
            m18987b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            k kVar = this.f43871b;
            if (kVar != null) {
                c3831b.m19615b(1, kVar);
            }
            n nVar = this.f43872c;
            if (nVar != null) {
                c3831b.m19615b(2, nVar);
            }
        }

        /* renamed from: b */
        public o m18987b() {
            this.f43871b = null;
            this.f43872c = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            k kVar = this.f43871b;
            int m19598a = kVar != null ? 0 + C3831b.m19598a(1, kVar) : 0;
            n nVar = this.f43872c;
            return nVar != null ? m19598a + C3831b.m19598a(2, nVar) : m19598a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 10) {
                    if (this.f43871b == null) {
                        this.f43871b = new k();
                    }
                    c3805a.m19545a(this.f43871b);
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f43872c == null) {
                        this.f43872c = new n();
                    }
                    c3805a.m19545a(this.f43872c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$p */
    public static final class p extends AbstractC3909e {

        /* renamed from: b */
        public k f43873b;

        /* renamed from: c */
        public m f43874c;

        public p() {
            m18988b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            k kVar = this.f43873b;
            if (kVar != null) {
                c3831b.m19615b(1, kVar);
            }
            m mVar = this.f43874c;
            if (mVar != null) {
                c3831b.m19615b(2, mVar);
            }
        }

        /* renamed from: b */
        public p m18988b() {
            this.f43873b = null;
            this.f43874c = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            k kVar = this.f43873b;
            int m19598a = kVar != null ? 0 + C3831b.m19598a(1, kVar) : 0;
            m mVar = this.f43874c;
            return mVar != null ? m19598a + C3831b.m19598a(2, mVar) : m19598a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 10) {
                    if (this.f43873b == null) {
                        this.f43873b = new k();
                    }
                    c3805a.m19545a(this.f43873b);
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f43874c == null) {
                        this.f43874c = new m();
                    }
                    c3805a.m19545a(this.f43874c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$j */
    public static final class j extends AbstractC3909e {

        /* renamed from: b */
        public a f43853b;

        /* renamed from: c */
        public a[] f43854c;

        public j() {
            m18981b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            a aVar = this.f43853b;
            if (aVar != null) {
                c3831b.m19615b(1, aVar);
            }
            a[] aVarArr = this.f43854c;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                a[] aVarArr2 = this.f43854c;
                if (i2 >= aVarArr2.length) {
                    return;
                }
                a aVar2 = aVarArr2[i2];
                if (aVar2 != null) {
                    c3831b.m19615b(2, aVar2);
                }
                i2++;
            }
        }

        /* renamed from: b */
        public j m18981b() {
            this.f43853b = null;
            this.f43854c = a.m18968c();
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            a aVar = this.f43853b;
            int i2 = 0;
            int m19598a = aVar != null ? C3831b.m19598a(1, aVar) + 0 : 0;
            a[] aVarArr = this.f43854c;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f43854c;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar2 = aVarArr2[i2];
                    if (aVar2 != null) {
                        m19598a += C3831b.m19598a(2, aVar2);
                    }
                    i2++;
                }
            }
            return m19598a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 10) {
                    if (this.f43853b == null) {
                        this.f43853b = new a();
                    }
                    c3805a.m19545a(this.f43853b);
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19920a = C3961g.m19920a(c3805a, 18);
                    a[] aVarArr = this.f43854c;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i2 = m19920a + length;
                    a[] aVarArr2 = new a[i2];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        aVarArr2[length] = new a();
                        c3805a.m19545a(aVarArr2[length]);
                        c3805a.m19562l();
                        length++;
                    }
                    aVarArr2[length] = new a();
                    c3805a.m19545a(aVarArr2[length]);
                    this.f43854c = aVarArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$m */
    public static final class m extends AbstractC3909e {

        /* renamed from: b */
        public byte[] f43864b;

        /* renamed from: c */
        public byte[] f43865c;

        /* renamed from: d */
        public n f43866d;

        public m() {
            m18985b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            byte[] bArr = this.f43864b;
            byte[] bArr2 = C3961g.f45152d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3831b.m19618b(1, this.f43864b);
            }
            if (!Arrays.equals(this.f43865c, bArr2)) {
                c3831b.m19618b(2, this.f43865c);
            }
            n nVar = this.f43866d;
            if (nVar != null) {
                c3831b.m19615b(3, nVar);
            }
        }

        /* renamed from: b */
        public m m18985b() {
            byte[] bArr = C3961g.f45152d;
            this.f43864b = bArr;
            this.f43865c = bArr;
            this.f43866d = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            byte[] bArr = this.f43864b;
            byte[] bArr2 = C3961g.f45152d;
            int m19601a = Arrays.equals(bArr, bArr2) ? 0 : 0 + C3831b.m19601a(1, this.f43864b);
            if (!Arrays.equals(this.f43865c, bArr2)) {
                m19601a += C3831b.m19601a(2, this.f43865c);
            }
            n nVar = this.f43866d;
            return nVar != null ? m19601a + C3831b.m19598a(3, nVar) : m19601a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 10) {
                    this.f43864b = c3805a.m19550d();
                } else if (m19562l == 18) {
                    this.f43865c = c3805a.m19550d();
                } else if (m19562l != 26) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f43866d == null) {
                        this.f43866d = new n();
                    }
                    c3805a.m19545a(this.f43866d);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$c */
    public static final class c extends AbstractC3909e {

        /* renamed from: b */
        public k f43832b;

        /* renamed from: c */
        public m f43833c;

        /* renamed from: d */
        public e f43834d;

        /* renamed from: e */
        public j f43835e;

        public c() {
            m18971b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            k kVar = this.f43832b;
            if (kVar != null) {
                c3831b.m19615b(1, kVar);
            }
            m mVar = this.f43833c;
            if (mVar != null) {
                c3831b.m19615b(2, mVar);
            }
            e eVar = this.f43834d;
            if (eVar != null) {
                c3831b.m19615b(3, eVar);
            }
            j jVar = this.f43835e;
            if (jVar != null) {
                c3831b.m19615b(4, jVar);
            }
        }

        /* renamed from: b */
        public c m18971b() {
            this.f43832b = null;
            this.f43833c = null;
            this.f43834d = null;
            this.f43835e = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            k kVar = this.f43832b;
            int m19598a = kVar != null ? 0 + C3831b.m19598a(1, kVar) : 0;
            m mVar = this.f43833c;
            if (mVar != null) {
                m19598a += C3831b.m19598a(2, mVar);
            }
            e eVar = this.f43834d;
            if (eVar != null) {
                m19598a += C3831b.m19598a(3, eVar);
            }
            j jVar = this.f43835e;
            return jVar != null ? m19598a + C3831b.m19598a(4, jVar) : m19598a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 10) {
                    if (this.f43832b == null) {
                        this.f43832b = new k();
                    }
                    c3805a.m19545a(this.f43832b);
                } else if (m19562l == 18) {
                    if (this.f43833c == null) {
                        this.f43833c = new m();
                    }
                    c3805a.m19545a(this.f43833c);
                } else if (m19562l == 26) {
                    if (this.f43834d == null) {
                        this.f43834d = new e();
                    }
                    c3805a.m19545a(this.f43834d);
                } else if (m19562l != 34) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f43835e == null) {
                        this.f43835e = new j();
                    }
                    c3805a.m19545a(this.f43835e);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$n */
    public static final class n extends AbstractC3909e {

        /* renamed from: b */
        public byte[] f43867b;

        /* renamed from: c */
        public d f43868c;

        /* renamed from: d */
        public byte[] f43869d;

        /* renamed from: e */
        public i f43870e;

        public n() {
            m18986b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            byte[] bArr = this.f43867b;
            byte[] bArr2 = C3961g.f45152d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3831b.m19618b(1, this.f43867b);
            }
            d dVar = this.f43868c;
            if (dVar != null) {
                c3831b.m19615b(2, dVar);
            }
            if (!Arrays.equals(this.f43869d, bArr2)) {
                c3831b.m19618b(3, this.f43869d);
            }
            i iVar = this.f43870e;
            if (iVar != null) {
                c3831b.m19615b(4, iVar);
            }
        }

        /* renamed from: b */
        public n m18986b() {
            byte[] bArr = C3961g.f45152d;
            this.f43867b = bArr;
            this.f43868c = null;
            this.f43869d = bArr;
            this.f43870e = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            byte[] bArr = this.f43867b;
            byte[] bArr2 = C3961g.f45152d;
            int m19601a = Arrays.equals(bArr, bArr2) ? 0 : 0 + C3831b.m19601a(1, this.f43867b);
            d dVar = this.f43868c;
            if (dVar != null) {
                m19601a += C3831b.m19598a(2, dVar);
            }
            if (!Arrays.equals(this.f43869d, bArr2)) {
                m19601a += C3831b.m19601a(3, this.f43869d);
            }
            i iVar = this.f43870e;
            return iVar != null ? m19601a + C3831b.m19598a(4, iVar) : m19601a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 10) {
                    this.f43867b = c3805a.m19550d();
                } else if (m19562l == 18) {
                    if (this.f43868c == null) {
                        this.f43868c = new d();
                    }
                    c3805a.m19545a(this.f43868c);
                } else if (m19562l == 26) {
                    this.f43869d = c3805a.m19550d();
                } else if (m19562l != 34) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f43870e == null) {
                        this.f43870e = new i();
                    }
                    c3805a.m19545a(this.f43870e);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$f */
    public static final class f extends AbstractC3909e {

        /* renamed from: b */
        public byte[] f43839b;

        /* renamed from: c */
        public byte[] f43840c;

        /* renamed from: d */
        public i f43841d;

        /* renamed from: e */
        public g[] f43842e;

        /* renamed from: f */
        public int f43843f;

        public f() {
            m18974b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            byte[] bArr = this.f43839b;
            byte[] bArr2 = C3961g.f45152d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3831b.m19618b(1, this.f43839b);
            }
            if (!Arrays.equals(this.f43840c, bArr2)) {
                c3831b.m19618b(2, this.f43840c);
            }
            i iVar = this.f43841d;
            if (iVar != null) {
                c3831b.m19615b(3, iVar);
            }
            g[] gVarArr = this.f43842e;
            if (gVarArr != null && gVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    g[] gVarArr2 = this.f43842e;
                    if (i2 >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i2];
                    if (gVar != null) {
                        c3831b.m19615b(4, gVar);
                    }
                    i2++;
                }
            }
            int i3 = this.f43843f;
            if (i3 != 0) {
                c3831b.m19627f(5, i3);
            }
        }

        /* renamed from: b */
        public f m18974b() {
            byte[] bArr = C3961g.f45152d;
            this.f43839b = bArr;
            this.f43840c = bArr;
            this.f43841d = null;
            this.f43842e = g.m18975c();
            this.f43843f = 0;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            byte[] bArr = this.f43839b;
            byte[] bArr2 = C3961g.f45152d;
            int i2 = 0;
            int m19601a = !Arrays.equals(bArr, bArr2) ? C3831b.m19601a(1, this.f43839b) + 0 : 0;
            if (!Arrays.equals(this.f43840c, bArr2)) {
                m19601a += C3831b.m19601a(2, this.f43840c);
            }
            i iVar = this.f43841d;
            if (iVar != null) {
                m19601a += C3831b.m19598a(3, iVar);
            }
            g[] gVarArr = this.f43842e;
            if (gVarArr != null && gVarArr.length > 0) {
                while (true) {
                    g[] gVarArr2 = this.f43842e;
                    if (i2 >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i2];
                    if (gVar != null) {
                        m19601a += C3831b.m19598a(4, gVar);
                    }
                    i2++;
                }
            }
            int i3 = this.f43843f;
            return i3 != 0 ? m19601a + C3831b.m19610c(5, i3) : m19601a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 10) {
                    this.f43839b = c3805a.m19550d();
                } else if (m19562l == 18) {
                    this.f43840c = c3805a.m19550d();
                } else if (m19562l == 26) {
                    if (this.f43841d == null) {
                        this.f43841d = new i();
                    }
                    c3805a.m19545a(this.f43841d);
                } else if (m19562l == 34) {
                    int m19920a = C3961g.m19920a(c3805a, 34);
                    g[] gVarArr = this.f43842e;
                    int length = gVarArr == null ? 0 : gVarArr.length;
                    int i2 = m19920a + length;
                    g[] gVarArr2 = new g[i2];
                    if (length != 0) {
                        System.arraycopy(gVarArr, 0, gVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        gVarArr2[length] = new g();
                        c3805a.m19545a(gVarArr2[length]);
                        c3805a.m19562l();
                        length++;
                    }
                    gVarArr2[length] = new g();
                    c3805a.m19545a(gVarArr2[length]);
                    this.f43842e = gVarArr2;
                } else if (m19562l != 40) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f43843f = c3805a.m19558h();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2 = this.f43822b;
        int m19596a = i2 != 0 ? 0 + C3831b.m19596a(1, i2) : 0;
        q qVar = this.f43823c;
        if (qVar != null) {
            m19596a += C3831b.m19598a(2, qVar);
        }
        o oVar = this.f43824d;
        if (oVar != null) {
            m19596a += C3831b.m19598a(3, oVar);
        }
        p pVar = this.f43825e;
        if (pVar != null) {
            m19596a += C3831b.m19598a(4, pVar);
        }
        b bVar = this.f43826f;
        if (bVar != null) {
            m19596a += C3831b.m19598a(5, bVar);
        }
        h hVar = this.f43827g;
        return hVar != null ? m19596a + C3831b.m19598a(6, hVar) : m19596a;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$k */
    public static final class k extends AbstractC3909e {

        /* renamed from: b */
        public byte[] f43855b;

        /* renamed from: c */
        public byte[] f43856c;

        /* renamed from: d */
        public d f43857d;

        /* renamed from: e */
        public i f43858e;

        /* renamed from: f */
        public j f43859f;

        /* renamed from: g */
        public j f43860g;

        /* renamed from: h */
        public l[] f43861h;

        public k() {
            m18982b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            byte[] bArr = this.f43855b;
            byte[] bArr2 = C3961g.f45152d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3831b.m19618b(1, this.f43855b);
            }
            if (!Arrays.equals(this.f43856c, bArr2)) {
                c3831b.m19618b(2, this.f43856c);
            }
            d dVar = this.f43857d;
            if (dVar != null) {
                c3831b.m19615b(3, dVar);
            }
            i iVar = this.f43858e;
            if (iVar != null) {
                c3831b.m19615b(4, iVar);
            }
            j jVar = this.f43859f;
            if (jVar != null) {
                c3831b.m19615b(5, jVar);
            }
            j jVar2 = this.f43860g;
            if (jVar2 != null) {
                c3831b.m19615b(6, jVar2);
            }
            l[] lVarArr = this.f43861h;
            if (lVarArr == null || lVarArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                l[] lVarArr2 = this.f43861h;
                if (i2 >= lVarArr2.length) {
                    return;
                }
                l lVar = lVarArr2[i2];
                if (lVar != null) {
                    c3831b.m19615b(7, lVar);
                }
                i2++;
            }
        }

        /* renamed from: b */
        public k m18982b() {
            byte[] bArr = C3961g.f45152d;
            this.f43855b = bArr;
            this.f43856c = bArr;
            this.f43857d = null;
            this.f43858e = null;
            this.f43859f = null;
            this.f43860g = null;
            this.f43861h = l.m18983c();
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            byte[] bArr = this.f43855b;
            byte[] bArr2 = C3961g.f45152d;
            int i2 = 0;
            int m19601a = !Arrays.equals(bArr, bArr2) ? C3831b.m19601a(1, this.f43855b) + 0 : 0;
            if (!Arrays.equals(this.f43856c, bArr2)) {
                m19601a += C3831b.m19601a(2, this.f43856c);
            }
            d dVar = this.f43857d;
            if (dVar != null) {
                m19601a += C3831b.m19598a(3, dVar);
            }
            i iVar = this.f43858e;
            if (iVar != null) {
                m19601a += C3831b.m19598a(4, iVar);
            }
            j jVar = this.f43859f;
            if (jVar != null) {
                m19601a += C3831b.m19598a(5, jVar);
            }
            j jVar2 = this.f43860g;
            if (jVar2 != null) {
                m19601a += C3831b.m19598a(6, jVar2);
            }
            l[] lVarArr = this.f43861h;
            if (lVarArr != null && lVarArr.length > 0) {
                while (true) {
                    l[] lVarArr2 = this.f43861h;
                    if (i2 >= lVarArr2.length) {
                        break;
                    }
                    l lVar = lVarArr2[i2];
                    if (lVar != null) {
                        m19601a += C3831b.m19598a(7, lVar);
                    }
                    i2++;
                }
            }
            return m19601a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 10) {
                    this.f43855b = c3805a.m19550d();
                } else if (m19562l == 18) {
                    this.f43856c = c3805a.m19550d();
                } else if (m19562l == 26) {
                    if (this.f43857d == null) {
                        this.f43857d = new d();
                    }
                    c3805a.m19545a(this.f43857d);
                } else if (m19562l == 34) {
                    if (this.f43858e == null) {
                        this.f43858e = new i();
                    }
                    c3805a.m19545a(this.f43858e);
                } else if (m19562l == 42) {
                    if (this.f43859f == null) {
                        this.f43859f = new j();
                    }
                    c3805a.m19545a(this.f43859f);
                } else if (m19562l == 50) {
                    if (this.f43860g == null) {
                        this.f43860g = new j();
                    }
                    c3805a.m19545a(this.f43860g);
                } else if (m19562l != 58) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19920a = C3961g.m19920a(c3805a, 58);
                    l[] lVarArr = this.f43861h;
                    int length = lVarArr == null ? 0 : lVarArr.length;
                    int i2 = m19920a + length;
                    l[] lVarArr2 = new l[i2];
                    if (length != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        lVarArr2[length] = new l();
                        c3805a.m19545a(lVarArr2[length]);
                        c3805a.m19562l();
                        length++;
                    }
                    lVarArr2[length] = new l();
                    c3805a.m19545a(lVarArr2[length]);
                    this.f43861h = lVarArr2;
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
        while (true) {
            int m19562l = c3805a.m19562l();
            if (m19562l != 0) {
                if (m19562l == 8) {
                    int m19558h = c3805a.m19558h();
                    switch (m19558h) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f43822b = m19558h;
                            break;
                    }
                } else if (m19562l == 18) {
                    if (this.f43823c == null) {
                        this.f43823c = new q();
                    }
                    c3805a.m19545a(this.f43823c);
                } else if (m19562l == 26) {
                    if (this.f43824d == null) {
                        this.f43824d = new o();
                    }
                    c3805a.m19545a(this.f43824d);
                } else if (m19562l == 34) {
                    if (this.f43825e == null) {
                        this.f43825e = new p();
                    }
                    c3805a.m19545a(this.f43825e);
                } else if (m19562l == 42) {
                    if (this.f43826f == null) {
                        this.f43826f = new b();
                    }
                    c3805a.m19545a(this.f43826f);
                } else if (m19562l != 50) {
                    if (!c3805a.m19555f(m19562l)) {
                    }
                } else {
                    if (this.f43827g == null) {
                        this.f43827g = new h();
                    }
                    c3805a.m19545a(this.f43827g);
                }
            }
        }
        return this;
    }
}
