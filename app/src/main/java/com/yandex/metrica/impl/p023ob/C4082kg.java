package com.yandex.metrica.impl.p023ob;

import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.yandex.metrica.YandexMetricaDefaultValues;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.kg */
/* loaded from: classes2.dex */
public final class C4082kg extends AbstractC3909e {

    /* renamed from: A */
    public String f45616A;

    /* renamed from: B */
    public String f45617B;

    /* renamed from: C */
    public String f45618C;

    /* renamed from: D */
    public String f45619D;

    /* renamed from: E */
    public String f45620E;

    /* renamed from: F */
    public long f45621F;

    /* renamed from: G */
    public long f45622G;

    /* renamed from: H */
    public boolean f45623H;

    /* renamed from: I */
    public m f45624I;

    /* renamed from: J */
    public j f45625J;

    /* renamed from: K */
    public int f45626K;

    /* renamed from: L */
    public int f45627L;

    /* renamed from: M */
    public v f45628M;

    /* renamed from: N */
    public u f45629N;

    /* renamed from: O */
    public u f45630O;

    /* renamed from: P */
    public u f45631P;

    /* renamed from: Q */
    public s f45632Q;

    /* renamed from: R */
    public c f45633R;

    /* renamed from: S */
    public f f45634S;

    /* renamed from: T */
    public String[] f45635T;

    /* renamed from: U */
    public b f45636U;

    /* renamed from: V */
    public a f45637V;

    /* renamed from: W */
    public h f45638W;

    /* renamed from: X */
    public g f45639X;

    /* renamed from: Y */
    public q f45640Y;

    /* renamed from: b */
    public String f45641b;

    /* renamed from: c */
    public long f45642c;

    /* renamed from: d */
    public String[] f45643d;

    /* renamed from: e */
    public String f45644e;

    /* renamed from: f */
    public String f45645f;

    /* renamed from: g */
    public String[] f45646g;

    /* renamed from: h */
    public String[] f45647h;

    /* renamed from: i */
    public String[] f45648i;

    /* renamed from: j */
    public String[] f45649j;

    /* renamed from: k */
    public d[] f45650k;

    /* renamed from: l */
    public i f45651l;

    /* renamed from: m */
    public k[] f45652m;

    /* renamed from: n */
    public y f45653n;

    /* renamed from: o */
    public p f45654o;

    /* renamed from: p */
    public n[] f45655p;

    /* renamed from: q */
    public String f45656q;

    /* renamed from: r */
    public String f45657r;

    /* renamed from: s */
    public String f45658s;

    /* renamed from: t */
    public boolean f45659t;

    /* renamed from: u */
    public String f45660u;

    /* renamed from: v */
    public String[] f45661v;

    /* renamed from: w */
    public r f45662w;

    /* renamed from: x */
    public boolean f45663x;

    /* renamed from: y */
    public l[] f45664y;

    /* renamed from: z */
    public o f45665z;

    /* renamed from: com.yandex.metrica.impl.ob.kg$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: b */
        public b[] f45666b;

        public a() {
            m20237b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            b[] bVarArr = this.f45666b;
            if (bVarArr == null || bVarArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.f45666b;
                if (i2 >= bVarArr2.length) {
                    return;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    c3831b.m19615b(1, bVar);
                }
                i2++;
            }
        }

        /* renamed from: b */
        public a m20237b() {
            this.f45666b = b.m20239c();
            this.f44976a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$a$a, reason: collision with other inner class name */
        public static final class C7003a extends AbstractC3909e {

            /* renamed from: b */
            public String f45667b;

            public C7003a() {
                m20238b();
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                if (this.f45667b.equals("")) {
                    return;
                }
                c3831b.m19616b(1, this.f45667b);
            }

            /* renamed from: b */
            public C7003a m20238b() {
                this.f45667b = "";
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                if (this.f45667b.equals("")) {
                    return 0;
                }
                return 0 + C3831b.m19599a(1, this.f45667b);
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
                        this.f45667b = c3805a.m19561k();
                    }
                }
                return this;
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$a$b */
        public static final class b extends AbstractC3909e {

            /* renamed from: d */
            private static volatile b[] f45668d;

            /* renamed from: b */
            public String f45669b;

            /* renamed from: c */
            public C7003a f45670c;

            public b() {
                m20240b();
            }

            /* renamed from: c */
            public static b[] m20239c() {
                if (f45668d == null) {
                    synchronized (C3857c.f44857a) {
                        if (f45668d == null) {
                            f45668d = new b[0];
                        }
                    }
                }
                return f45668d;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                if (!this.f45669b.equals("")) {
                    c3831b.m19616b(1, this.f45669b);
                }
                C7003a c7003a = this.f45670c;
                if (c7003a != null) {
                    c3831b.m19615b(2, c7003a);
                }
            }

            /* renamed from: b */
            public b m20240b() {
                this.f45669b = "";
                this.f45670c = null;
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                int m19599a = this.f45669b.equals("") ? 0 : 0 + C3831b.m19599a(1, this.f45669b);
                C7003a c7003a = this.f45670c;
                return c7003a != null ? m19599a + C3831b.m19598a(2, c7003a) : m19599a;
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
                        this.f45669b = c3805a.m19561k();
                    } else if (m19562l != 18) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        if (this.f45670c == null) {
                            this.f45670c = new C7003a();
                        }
                        c3805a.m19545a(this.f45670c);
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            b[] bVarArr = this.f45666b;
            int i2 = 0;
            if (bVarArr == null || bVarArr.length <= 0) {
                return 0;
            }
            int i3 = 0;
            while (true) {
                b[] bVarArr2 = this.f45666b;
                if (i2 >= bVarArr2.length) {
                    return i3;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    i3 += C3831b.m19598a(1, bVar);
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
                    b[] bVarArr = this.f45666b;
                    int length = bVarArr == null ? 0 : bVarArr.length;
                    int i2 = m19920a + length;
                    b[] bVarArr2 = new b[i2];
                    if (length != 0) {
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        bVarArr2[length] = new b();
                        c3805a.m19545a(bVarArr2[length]);
                        c3805a.m19562l();
                        length++;
                    }
                    bVarArr2[length] = new b();
                    c3805a.m19545a(bVarArr2[length]);
                    this.f45666b = bVarArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$j */
    public static final class j extends AbstractC3909e {

        /* renamed from: b */
        public long f45716b;

        public j() {
            m20250b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19620c(1, this.f45716b);
        }

        /* renamed from: b */
        public j m20250b() {
            this.f45716b = 900L;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19597a(1, this.f45716b) + 0;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l != 8) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45716b = c3805a.m19559i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$n */
    public static final class n extends AbstractC3909e {

        /* renamed from: h */
        private static volatile n[] f45755h;

        /* renamed from: b */
        public String f45756b;

        /* renamed from: c */
        public String f45757c;

        /* renamed from: d */
        public String f45758d;

        /* renamed from: e */
        public a[] f45759e;

        /* renamed from: f */
        public long f45760f;

        /* renamed from: g */
        public int[] f45761g;

        public n() {
            m20263b();
        }

        /* renamed from: c */
        public static n[] m20262c() {
            if (f45755h == null) {
                synchronized (C3857c.f44857a) {
                    if (f45755h == null) {
                        f45755h = new n[0];
                    }
                }
            }
            return f45755h;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19616b(1, this.f45756b);
            c3831b.m19616b(2, this.f45757c);
            c3831b.m19616b(3, this.f45758d);
            a[] aVarArr = this.f45759e;
            int i2 = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i3 = 0;
                while (true) {
                    a[] aVarArr2 = this.f45759e;
                    if (i3 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i3];
                    if (aVar != null) {
                        c3831b.m19615b(4, aVar);
                    }
                    i3++;
                }
            }
            c3831b.m19620c(5, this.f45760f);
            int[] iArr = this.f45761g;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            while (true) {
                int[] iArr2 = this.f45761g;
                if (i2 >= iArr2.length) {
                    return;
                }
                c3831b.m19622d(6, iArr2[i2]);
                i2++;
            }
        }

        /* renamed from: b */
        public n m20263b() {
            this.f45756b = "";
            this.f45757c = "";
            this.f45758d = "";
            this.f45759e = a.m20264c();
            this.f45760f = 0L;
            this.f45761g = C3961g.f45149a;
            this.f44976a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$n$a */
        public static final class a extends AbstractC3909e {

            /* renamed from: d */
            private static volatile a[] f45762d;

            /* renamed from: b */
            public String f45763b;

            /* renamed from: c */
            public String f45764c;

            public a() {
                m20265b();
            }

            /* renamed from: c */
            public static a[] m20264c() {
                if (f45762d == null) {
                    synchronized (C3857c.f44857a) {
                        if (f45762d == null) {
                            f45762d = new a[0];
                        }
                    }
                }
                return f45762d;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                c3831b.m19616b(1, this.f45763b);
                c3831b.m19616b(2, this.f45764c);
            }

            /* renamed from: b */
            public a m20265b() {
                this.f45763b = "";
                this.f45764c = "";
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                return C3831b.m19599a(2, this.f45764c) + C3831b.m19599a(1, this.f45763b) + 0;
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
                        this.f45763b = c3805a.m19561k();
                    } else if (m19562l != 18) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        this.f45764c = c3805a.m19561k();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = 0;
            int m19599a = C3831b.m19599a(3, this.f45758d) + C3831b.m19599a(2, this.f45757c) + C3831b.m19599a(1, this.f45756b) + 0;
            a[] aVarArr = this.f45759e;
            if (aVarArr != null && aVarArr.length > 0) {
                int i3 = 0;
                while (true) {
                    a[] aVarArr2 = this.f45759e;
                    if (i3 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i3];
                    if (aVar != null) {
                        m19599a += C3831b.m19598a(4, aVar);
                    }
                    i3++;
                }
            }
            int m19597a = C3831b.m19597a(5, this.f45760f) + m19599a;
            int[] iArr = this.f45761g;
            if (iArr == null || iArr.length <= 0) {
                return m19597a;
            }
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f45761g;
                if (i2 < iArr2.length) {
                    i4 += C3831b.m19594a(iArr2[i2]);
                    i2++;
                } else {
                    return m19597a + i4 + (iArr2.length * 1);
                }
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
                if (m19562l == 10) {
                    this.f45756b = c3805a.m19561k();
                } else if (m19562l == 18) {
                    this.f45757c = c3805a.m19561k();
                } else if (m19562l == 26) {
                    this.f45758d = c3805a.m19561k();
                } else if (m19562l == 34) {
                    int m19920a = C3961g.m19920a(c3805a, 34);
                    a[] aVarArr = this.f45759e;
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
                    this.f45759e = aVarArr2;
                } else if (m19562l == 40) {
                    this.f45760f = c3805a.m19559i();
                } else if (m19562l == 48) {
                    int m19920a2 = C3961g.m19920a(c3805a, 48);
                    int[] iArr = new int[m19920a2];
                    int i3 = 0;
                    for (int i4 = 0; i4 < m19920a2; i4++) {
                        if (i4 != 0) {
                            c3805a.m19562l();
                        }
                        int m19558h = c3805a.m19558h();
                        if (m19558h == 1 || m19558h == 2) {
                            iArr[i3] = m19558h;
                            i3++;
                        }
                    }
                    if (i3 != 0) {
                        int[] iArr2 = this.f45761g;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i3 == m19920a2) {
                            this.f45761g = iArr;
                        } else {
                            int[] iArr3 = new int[length2 + i3];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i3);
                            this.f45761g = iArr3;
                        }
                    }
                } else if (m19562l != 50) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19548c = c3805a.m19548c(c3805a.m19558h());
                    int m19546b = c3805a.m19546b();
                    int i5 = 0;
                    while (c3805a.m19543a() > 0) {
                        int m19558h2 = c3805a.m19558h();
                        if (m19558h2 == 1 || m19558h2 == 2) {
                            i5++;
                        }
                    }
                    if (i5 != 0) {
                        c3805a.m19553e(m19546b);
                        int[] iArr4 = this.f45761g;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[i5 + length3];
                        if (length3 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length3);
                        }
                        while (c3805a.m19543a() > 0) {
                            int m19558h3 = c3805a.m19558h();
                            if (m19558h3 == 1 || m19558h3 == 2) {
                                iArr5[length3] = m19558h3;
                                length3++;
                            }
                        }
                        this.f45761g = iArr5;
                    }
                    c3805a.m19547b(m19548c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$r */
    public static final class r extends AbstractC3909e {

        /* renamed from: b */
        public long f45780b;

        public r() {
            m20269b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19620c(1, this.f45780b);
        }

        /* renamed from: b */
        public r m20269b() {
            this.f45780b = 18000000L;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19597a(1, this.f45780b) + 0;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l != 8) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45780b = c3805a.m19559i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$y */
    public static final class y extends AbstractC3909e {

        /* renamed from: b */
        public long f45814b;

        /* renamed from: c */
        public boolean f45815c;

        /* renamed from: d */
        public a[] f45816d;

        public y() {
            m20277b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19620c(1, this.f45814b);
            c3831b.m19617b(2, this.f45815c);
            a[] aVarArr = this.f45816d;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                a[] aVarArr2 = this.f45816d;
                if (i2 >= aVarArr2.length) {
                    return;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    c3831b.m19615b(5, aVar);
                }
                i2++;
            }
        }

        /* renamed from: b */
        public y m20277b() {
            this.f45814b = 60000L;
            this.f45815c = false;
            this.f45816d = a.m20278c();
            this.f44976a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$y$a */
        public static final class a extends AbstractC3909e {

            /* renamed from: d */
            private static volatile a[] f45817d;

            /* renamed from: b */
            public long f45818b;

            /* renamed from: c */
            public long f45819c;

            public a() {
                m20279b();
            }

            /* renamed from: c */
            public static a[] m20278c() {
                if (f45817d == null) {
                    synchronized (C3857c.f44857a) {
                        if (f45817d == null) {
                            f45817d = new a[0];
                        }
                    }
                }
                return f45817d;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                c3831b.m19620c(1, this.f45818b);
                c3831b.m19620c(2, this.f45819c);
            }

            /* renamed from: b */
            public a m20279b() {
                this.f45818b = 0L;
                this.f45819c = 0L;
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                return C3831b.m19597a(2, this.f45819c) + C3831b.m19597a(1, this.f45818b) + 0;
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
                        this.f45818b = c3805a.m19559i();
                    } else if (m19562l != 16) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        this.f45819c = c3805a.m19559i();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = 0;
            int m19600a = C3831b.m19600a(2, this.f45815c) + C3831b.m19597a(1, this.f45814b) + 0;
            a[] aVarArr = this.f45816d;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f45816d;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        m19600a += C3831b.m19598a(5, aVar);
                    }
                    i2++;
                }
            }
            return m19600a;
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
                    this.f45814b = c3805a.m19559i();
                } else if (m19562l == 16) {
                    this.f45815c = c3805a.m19549c();
                } else if (m19562l != 42) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19920a = C3961g.m19920a(c3805a, 42);
                    a[] aVarArr = this.f45816d;
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
                    this.f45816d = aVarArr2;
                }
            }
            return this;
        }
    }

    public C4082kg() {
        m20236b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        if (!this.f45641b.equals("")) {
            c3831b.m19616b(1, this.f45641b);
        }
        c3831b.m19620c(3, this.f45642c);
        String[] strArr = this.f45643d;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f45643d;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    c3831b.m19616b(4, str);
                }
                i3++;
            }
        }
        if (!this.f45644e.equals("")) {
            c3831b.m19616b(5, this.f45644e);
        }
        if (!this.f45645f.equals("")) {
            c3831b.m19616b(6, this.f45645f);
        }
        String[] strArr3 = this.f45646g;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.f45646g;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i4];
                if (str2 != null) {
                    c3831b.m19616b(7, str2);
                }
                i4++;
            }
        }
        String[] strArr5 = this.f45647h;
        if (strArr5 != null && strArr5.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr6 = this.f45647h;
                if (i5 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i5];
                if (str3 != null) {
                    c3831b.m19616b(8, str3);
                }
                i5++;
            }
        }
        String[] strArr7 = this.f45648i;
        if (strArr7 != null && strArr7.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr8 = this.f45648i;
                if (i6 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i6];
                if (str4 != null) {
                    c3831b.m19616b(9, str4);
                }
                i6++;
            }
        }
        i iVar = this.f45651l;
        if (iVar != null) {
            c3831b.m19615b(10, iVar);
        }
        k[] kVarArr = this.f45652m;
        if (kVarArr != null && kVarArr.length > 0) {
            int i7 = 0;
            while (true) {
                k[] kVarArr2 = this.f45652m;
                if (i7 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i7];
                if (kVar != null) {
                    c3831b.m19615b(11, kVar);
                }
                i7++;
            }
        }
        y yVar = this.f45653n;
        if (yVar != null) {
            c3831b.m19615b(12, yVar);
        }
        p pVar = this.f45654o;
        if (pVar != null) {
            c3831b.m19615b(13, pVar);
        }
        n[] nVarArr = this.f45655p;
        if (nVarArr != null && nVarArr.length > 0) {
            int i8 = 0;
            while (true) {
                n[] nVarArr2 = this.f45655p;
                if (i8 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i8];
                if (nVar != null) {
                    c3831b.m19615b(14, nVar);
                }
                i8++;
            }
        }
        if (!this.f45656q.equals("")) {
            c3831b.m19616b(15, this.f45656q);
        }
        if (!this.f45657r.equals("")) {
            c3831b.m19616b(16, this.f45657r);
        }
        c3831b.m19617b(17, this.f45659t);
        if (!this.f45660u.equals("")) {
            c3831b.m19616b(19, this.f45660u);
        }
        String[] strArr9 = this.f45661v;
        if (strArr9 != null && strArr9.length > 0) {
            int i9 = 0;
            while (true) {
                String[] strArr10 = this.f45661v;
                if (i9 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i9];
                if (str5 != null) {
                    c3831b.m19616b(20, str5);
                }
                i9++;
            }
        }
        r rVar = this.f45662w;
        if (rVar != null) {
            c3831b.m19615b(21, rVar);
        }
        boolean z = this.f45663x;
        if (z) {
            c3831b.m19617b(22, z);
        }
        l[] lVarArr = this.f45664y;
        if (lVarArr != null && lVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                l[] lVarArr2 = this.f45664y;
                if (i10 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i10];
                if (lVar != null) {
                    c3831b.m19615b(23, lVar);
                }
                i10++;
            }
        }
        o oVar = this.f45665z;
        if (oVar != null) {
            c3831b.m19615b(24, oVar);
        }
        if (!this.f45616A.equals("")) {
            c3831b.m19616b(25, this.f45616A);
        }
        if (!this.f45617B.equals("")) {
            c3831b.m19616b(26, this.f45617B);
        }
        if (!this.f45619D.equals("")) {
            c3831b.m19616b(27, this.f45619D);
        }
        c3831b.m19620c(28, this.f45621F);
        c3831b.m19620c(29, this.f45622G);
        boolean z2 = this.f45623H;
        if (z2) {
            c3831b.m19617b(30, z2);
        }
        if (!this.f45618C.equals("")) {
            c3831b.m19616b(31, this.f45618C);
        }
        m mVar = this.f45624I;
        if (mVar != null) {
            c3831b.m19615b(32, mVar);
        }
        j jVar = this.f45625J;
        if (jVar != null) {
            c3831b.m19615b(33, jVar);
        }
        c3831b.m19622d(35, this.f45626K);
        c3831b.m19622d(36, this.f45627L);
        v vVar = this.f45628M;
        if (vVar != null) {
            c3831b.m19615b(37, vVar);
        }
        u uVar = this.f45629N;
        if (uVar != null) {
            c3831b.m19615b(38, uVar);
        }
        u uVar2 = this.f45630O;
        if (uVar2 != null) {
            c3831b.m19615b(39, uVar2);
        }
        s sVar = this.f45632Q;
        if (sVar != null) {
            c3831b.m19615b(41, sVar);
        }
        c cVar = this.f45633R;
        if (cVar != null) {
            c3831b.m19615b(42, cVar);
        }
        u uVar3 = this.f45631P;
        if (uVar3 != null) {
            c3831b.m19615b(43, uVar3);
        }
        if (!this.f45658s.equals("")) {
            c3831b.m19616b(44, this.f45658s);
        }
        f fVar = this.f45634S;
        if (fVar != null) {
            c3831b.m19615b(45, fVar);
        }
        String[] strArr11 = this.f45649j;
        if (strArr11 != null && strArr11.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr12 = this.f45649j;
                if (i11 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i11];
                if (str6 != null) {
                    c3831b.m19616b(46, str6);
                }
                i11++;
            }
        }
        String[] strArr13 = this.f45635T;
        if (strArr13 != null && strArr13.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr14 = this.f45635T;
                if (i12 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i12];
                if (str7 != null) {
                    c3831b.m19616b(47, str7);
                }
                i12++;
            }
        }
        b bVar = this.f45636U;
        if (bVar != null) {
            c3831b.m19615b(48, bVar);
        }
        if (!this.f45620E.equals("")) {
            c3831b.m19616b(49, this.f45620E);
        }
        a aVar = this.f45637V;
        if (aVar != null) {
            c3831b.m19615b(51, aVar);
        }
        h hVar = this.f45638W;
        if (hVar != null) {
            c3831b.m19615b(52, hVar);
        }
        g gVar = this.f45639X;
        if (gVar != null) {
            c3831b.m19615b(53, gVar);
        }
        d[] dVarArr = this.f45650k;
        if (dVarArr != null && dVarArr.length > 0) {
            while (true) {
                d[] dVarArr2 = this.f45650k;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    c3831b.m19615b(54, dVar);
                }
                i2++;
            }
        }
        q qVar = this.f45640Y;
        if (qVar != null) {
            c3831b.m19615b(55, qVar);
        }
    }

    /* renamed from: b */
    public C4082kg m20236b() {
        this.f45641b = "";
        this.f45642c = 0L;
        String[] strArr = C3961g.f45150b;
        this.f45643d = strArr;
        this.f45644e = "";
        this.f45645f = "";
        this.f45646g = strArr;
        this.f45647h = strArr;
        this.f45648i = strArr;
        this.f45649j = strArr;
        this.f45650k = d.m20243c();
        this.f45651l = null;
        this.f45652m = k.m20251c();
        this.f45653n = null;
        this.f45654o = null;
        this.f45655p = n.m20262c();
        this.f45656q = "";
        this.f45657r = "";
        this.f45658s = "";
        this.f45659t = false;
        this.f45660u = "";
        this.f45661v = strArr;
        this.f45662w = null;
        this.f45663x = false;
        this.f45664y = l.m20259c();
        this.f45665z = null;
        this.f45616A = "";
        this.f45617B = "";
        this.f45618C = "";
        this.f45619D = "";
        this.f45620E = "";
        this.f45621F = 0L;
        this.f45622G = 0L;
        this.f45623H = false;
        this.f45624I = null;
        this.f45625J = null;
        this.f45626K = 600;
        this.f45627L = 1;
        this.f45628M = null;
        this.f45629N = null;
        this.f45630O = null;
        this.f45631P = null;
        this.f45632Q = null;
        this.f45633R = null;
        this.f45634S = null;
        this.f45635T = strArr;
        this.f45636U = null;
        this.f45637V = null;
        this.f45638W = null;
        this.f45639X = null;
        this.f45640Y = null;
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$g */
    public static final class g extends AbstractC3909e {

        /* renamed from: b */
        public long f45685b;

        public g() {
            m20247b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            long j2 = this.f45685b;
            if (j2 != 1209600) {
                c3831b.m19626e(1, j2);
            }
        }

        /* renamed from: b */
        public g m20247b() {
            this.f45685b = 1209600L;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            long j2 = this.f45685b;
            if (j2 != 1209600) {
                return 0 + C3831b.m19608b(1, j2);
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
                if (m19562l != 8) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45685b = c3805a.m19559i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$l */
    public static final class l extends AbstractC3909e {

        /* renamed from: d */
        private static volatile l[] f45750d;

        /* renamed from: b */
        public String f45751b;

        /* renamed from: c */
        public boolean f45752c;

        public l() {
            m20260b();
        }

        /* renamed from: c */
        public static l[] m20259c() {
            if (f45750d == null) {
                synchronized (C3857c.f44857a) {
                    if (f45750d == null) {
                        f45750d = new l[0];
                    }
                }
            }
            return f45750d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19616b(1, this.f45751b);
            c3831b.m19617b(2, this.f45752c);
        }

        /* renamed from: b */
        public l m20260b() {
            this.f45751b = "";
            this.f45752c = false;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19600a(2, this.f45752c) + C3831b.m19599a(1, this.f45751b) + 0;
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
                    this.f45751b = c3805a.m19561k();
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45752c = c3805a.m19549c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$m */
    public static final class m extends AbstractC3909e {

        /* renamed from: b */
        public long f45753b;

        /* renamed from: c */
        public long f45754c;

        public m() {
            m20261b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19620c(1, this.f45753b);
            c3831b.m19620c(2, this.f45754c);
        }

        /* renamed from: b */
        public m m20261b() {
            this.f45753b = 86400L;
            this.f45754c = 432000L;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19597a(2, this.f45754c) + C3831b.m19597a(1, this.f45753b) + 0;
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
                    this.f45753b = c3805a.m19559i();
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45754c = c3805a.m19559i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$q */
    public static final class q extends AbstractC3909e {

        /* renamed from: b */
        public int f45779b;

        public q() {
            m20268b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            int i2 = this.f45779b;
            if (i2 != 86400) {
                c3831b.m19627f(1, i2);
            }
        }

        /* renamed from: b */
        public q m20268b() {
            this.f45779b = 86400;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = this.f45779b;
            if (i2 != 86400) {
                return 0 + C3831b.m19610c(1, i2);
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
                if (m19562l != 8) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45779b = c3805a.m19558h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$w */
    public static final class w extends AbstractC3909e {

        /* renamed from: b */
        public boolean f45809b;

        /* renamed from: c */
        public boolean f45810c;

        public w() {
            m20274b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19617b(1, this.f45809b);
            c3831b.m19617b(2, this.f45810c);
        }

        /* renamed from: b */
        public w m20274b() {
            this.f45809b = true;
            this.f45810c = false;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19600a(2, this.f45810c) + C3831b.m19600a(1, this.f45809b) + 0;
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
                    this.f45809b = c3805a.m19549c();
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45810c = c3805a.m19549c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$x */
    public static final class x extends AbstractC3909e {

        /* renamed from: d */
        private static volatile x[] f45811d;

        /* renamed from: b */
        public int f45812b;

        /* renamed from: c */
        public String f45813c;

        public x() {
            m20276b();
        }

        /* renamed from: c */
        public static x[] m20275c() {
            if (f45811d == null) {
                synchronized (C3857c.f44857a) {
                    if (f45811d == null) {
                        f45811d = new x[0];
                    }
                }
            }
            return f45811d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19622d(1, this.f45812b);
            c3831b.m19616b(2, this.f45813c);
        }

        /* renamed from: b */
        public x m20276b() {
            this.f45812b = 0;
            this.f45813c = "";
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19599a(2, this.f45813c) + C3831b.m19596a(1, this.f45812b) + 0;
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
                    int m19558h = c3805a.m19558h();
                    if (m19558h == 0 || m19558h == 1 || m19558h == 2 || m19558h == 3) {
                        this.f45812b = m19558h;
                    }
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45813c = c3805a.m19561k();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$e */
    public static final class e extends AbstractC3909e {

        /* renamed from: b */
        public long f45680b;

        /* renamed from: c */
        public int f45681c;

        public e() {
            m20245b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19620c(1, this.f45680b);
            int i2 = this.f45681c;
            if (i2 != 86400) {
                c3831b.m19622d(2, i2);
            }
        }

        /* renamed from: b */
        public e m20245b() {
            this.f45680b = 0L;
            this.f45681c = 86400;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19597a = C3831b.m19597a(1, this.f45680b) + 0;
            int i2 = this.f45681c;
            return i2 != 86400 ? m19597a + C3831b.m19596a(2, i2) : m19597a;
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
                    this.f45680b = c3805a.m19559i();
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45681c = c3805a.m19558h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$b */
    public static final class b extends AbstractC3909e {

        /* renamed from: b */
        public int f45671b;

        /* renamed from: c */
        public int f45672c;

        public b() {
            m20241b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            int i2 = this.f45671b;
            if (i2 != 86400) {
                c3831b.m19622d(1, i2);
            }
            int i3 = this.f45672c;
            if (i3 != 86400) {
                c3831b.m19622d(2, i3);
            }
        }

        /* renamed from: b */
        public b m20241b() {
            this.f45671b = 86400;
            this.f45672c = 86400;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = this.f45671b;
            int m19596a = i2 != 86400 ? 0 + C3831b.m19596a(1, i2) : 0;
            int i3 = this.f45672c;
            return i3 != 86400 ? m19596a + C3831b.m19596a(2, i3) : m19596a;
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
                    this.f45671b = c3805a.m19558h();
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45672c = c3805a.m19558h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$k */
    public static final class k extends AbstractC3909e {

        /* renamed from: d */
        private static volatile k[] f45717d;

        /* renamed from: b */
        public a f45718b;

        /* renamed from: c */
        public b f45719c;

        /* renamed from: com.yandex.metrica.impl.ob.kg$k$a */
        public static final class a extends AbstractC3909e {

            /* renamed from: b */
            public long f45720b;

            /* renamed from: c */
            public float f45721c;

            /* renamed from: d */
            public int f45722d;

            /* renamed from: e */
            public int f45723e;

            /* renamed from: f */
            public long f45724f;

            /* renamed from: g */
            public int f45725g;

            /* renamed from: h */
            public boolean f45726h;

            /* renamed from: i */
            public boolean f45727i;

            /* renamed from: j */
            public boolean f45728j;

            /* renamed from: k */
            public long f45729k;

            /* renamed from: l */
            public C7004a f45730l;

            /* renamed from: m */
            public C7004a f45731m;

            /* renamed from: n */
            public C7004a f45732n;

            /* renamed from: o */
            public C7004a f45733o;

            /* renamed from: p */
            public b f45734p;

            /* renamed from: q */
            public boolean f45735q;

            /* renamed from: r */
            public boolean f45736r;

            /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$a, reason: collision with other inner class name */
            public static final class C7004a extends AbstractC3909e {

                /* renamed from: b */
                public boolean f45737b;

                /* renamed from: c */
                public boolean f45738c;

                /* renamed from: d */
                public C7005a f45739d;

                public C7004a() {
                    m20254b();
                }

                @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                /* renamed from: a */
                public void mo18312a(C3831b c3831b) throws IOException {
                    c3831b.m19617b(1, this.f45737b);
                    c3831b.m19617b(2, this.f45738c);
                    C7005a c7005a = this.f45739d;
                    if (c7005a != null) {
                        c3831b.m19615b(3, c7005a);
                    }
                }

                /* renamed from: b */
                public C7004a m20254b() {
                    this.f45737b = true;
                    this.f45738c = false;
                    this.f45739d = null;
                    this.f44976a = -1;
                    return this;
                }

                /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$a$a, reason: collision with other inner class name */
                public static final class C7005a extends AbstractC3909e {

                    /* renamed from: b */
                    public long f45740b;

                    /* renamed from: c */
                    public long f45741c;

                    public C7005a() {
                        m20255b();
                    }

                    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                    /* renamed from: a */
                    public void mo18312a(C3831b c3831b) throws IOException {
                        c3831b.m19620c(1, this.f45740b);
                        c3831b.m19620c(2, this.f45741c);
                    }

                    /* renamed from: b */
                    public C7005a m20255b() {
                        this.f45740b = 0L;
                        this.f45741c = 0L;
                        this.f44976a = -1;
                        return this;
                    }

                    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                    /* renamed from: a */
                    public int mo18310a() {
                        return C3831b.m19597a(2, this.f45741c) + C3831b.m19597a(1, this.f45740b) + 0;
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
                                this.f45740b = c3805a.m19559i();
                            } else if (m19562l != 16) {
                                if (!c3805a.m19555f(m19562l)) {
                                    break;
                                }
                            } else {
                                this.f45741c = c3805a.m19559i();
                            }
                        }
                        return this;
                    }
                }

                @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                /* renamed from: a */
                public int mo18310a() {
                    int m19600a = C3831b.m19600a(2, this.f45738c) + C3831b.m19600a(1, this.f45737b) + 0;
                    C7005a c7005a = this.f45739d;
                    return c7005a != null ? m19600a + C3831b.m19598a(3, c7005a) : m19600a;
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
                            this.f45737b = c3805a.m19549c();
                        } else if (m19562l == 16) {
                            this.f45738c = c3805a.m19549c();
                        } else if (m19562l != 26) {
                            if (!c3805a.m19555f(m19562l)) {
                                break;
                            }
                        } else {
                            if (this.f45739d == null) {
                                this.f45739d = new C7005a();
                            }
                            c3805a.m19545a(this.f45739d);
                        }
                    }
                    return this;
                }
            }

            public a() {
                m20253b();
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                c3831b.m19620c(1, this.f45720b);
                c3831b.m19612a(2, this.f45721c);
                c3831b.m19622d(3, this.f45722d);
                c3831b.m19622d(4, this.f45723e);
                c3831b.m19620c(5, this.f45724f);
                c3831b.m19622d(6, this.f45725g);
                c3831b.m19617b(7, this.f45726h);
                c3831b.m19617b(8, this.f45727i);
                c3831b.m19620c(9, this.f45729k);
                C7004a c7004a = this.f45730l;
                if (c7004a != null) {
                    c3831b.m19615b(10, c7004a);
                }
                C7004a c7004a2 = this.f45731m;
                if (c7004a2 != null) {
                    c3831b.m19615b(11, c7004a2);
                }
                C7004a c7004a3 = this.f45732n;
                if (c7004a3 != null) {
                    c3831b.m19615b(12, c7004a3);
                }
                c3831b.m19617b(13, this.f45728j);
                C7004a c7004a4 = this.f45733o;
                if (c7004a4 != null) {
                    c3831b.m19615b(14, c7004a4);
                }
                b bVar = this.f45734p;
                if (bVar != null) {
                    c3831b.m19615b(15, bVar);
                }
                boolean z = this.f45735q;
                if (z) {
                    c3831b.m19617b(16, z);
                }
                boolean z2 = this.f45736r;
                if (z2) {
                    c3831b.m19617b(17, z2);
                }
            }

            /* renamed from: b */
            public a m20253b() {
                this.f45720b = 5000L;
                this.f45721c = 10.0f;
                this.f45722d = 20;
                this.f45723e = DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER;
                this.f45724f = 60000L;
                this.f45725g = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
                this.f45726h = false;
                this.f45727i = false;
                this.f45728j = true;
                this.f45729k = 60000L;
                this.f45730l = null;
                this.f45731m = null;
                this.f45732n = null;
                this.f45733o = null;
                this.f45734p = null;
                this.f45735q = false;
                this.f45736r = false;
                this.f44976a = -1;
                return this;
            }

            /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$b */
            public static final class b extends AbstractC3909e {

                /* renamed from: b */
                public boolean f45742b;

                /* renamed from: c */
                public boolean f45743c;

                /* renamed from: d */
                public C7006a f45744d;

                public b() {
                    m20256b();
                }

                @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                /* renamed from: a */
                public void mo18312a(C3831b c3831b) throws IOException {
                    c3831b.m19617b(1, this.f45742b);
                    c3831b.m19617b(2, this.f45743c);
                    C7006a c7006a = this.f45744d;
                    if (c7006a != null) {
                        c3831b.m19615b(3, c7006a);
                    }
                }

                /* renamed from: b */
                public b m20256b() {
                    this.f45742b = true;
                    this.f45743c = false;
                    this.f45744d = null;
                    this.f44976a = -1;
                    return this;
                }

                /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$b$a, reason: collision with other inner class name */
                public static final class C7006a extends AbstractC3909e {

                    /* renamed from: b */
                    public long f45745b;

                    /* renamed from: c */
                    public long f45746c;

                    /* renamed from: d */
                    public int f45747d;

                    public C7006a() {
                        m20257b();
                    }

                    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                    /* renamed from: a */
                    public void mo18312a(C3831b c3831b) throws IOException {
                        c3831b.m19620c(1, this.f45745b);
                        c3831b.m19620c(2, this.f45746c);
                        c3831b.m19622d(3, this.f45747d);
                    }

                    /* renamed from: b */
                    public C7006a m20257b() {
                        this.f45745b = 0L;
                        this.f45746c = 0L;
                        this.f45747d = 0;
                        this.f44976a = -1;
                        return this;
                    }

                    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                    /* renamed from: a */
                    public int mo18310a() {
                        return C3831b.m19596a(3, this.f45747d) + C3831b.m19597a(2, this.f45746c) + C3831b.m19597a(1, this.f45745b) + 0;
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
                                this.f45745b = c3805a.m19559i();
                            } else if (m19562l == 16) {
                                this.f45746c = c3805a.m19559i();
                            } else if (m19562l != 24) {
                                if (!c3805a.m19555f(m19562l)) {
                                    break;
                                }
                            } else {
                                int m19558h = c3805a.m19558h();
                                if (m19558h == 0 || m19558h == 1 || m19558h == 2 || m19558h == 3) {
                                    this.f45747d = m19558h;
                                }
                            }
                        }
                        return this;
                    }
                }

                @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                /* renamed from: a */
                public int mo18310a() {
                    int m19600a = C3831b.m19600a(2, this.f45743c) + C3831b.m19600a(1, this.f45742b) + 0;
                    C7006a c7006a = this.f45744d;
                    return c7006a != null ? m19600a + C3831b.m19598a(3, c7006a) : m19600a;
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
                            this.f45742b = c3805a.m19549c();
                        } else if (m19562l == 16) {
                            this.f45743c = c3805a.m19549c();
                        } else if (m19562l != 26) {
                            if (!c3805a.m19555f(m19562l)) {
                                break;
                            }
                        } else {
                            if (this.f45744d == null) {
                                this.f45744d = new C7006a();
                            }
                            c3805a.m19545a(this.f45744d);
                        }
                    }
                    return this;
                }
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                int m19597a = C3831b.m19597a(9, this.f45729k) + C3831b.m19600a(8, this.f45727i) + C3831b.m19600a(7, this.f45726h) + C3831b.m19596a(6, this.f45725g) + C3831b.m19597a(5, this.f45724f) + C3831b.m19596a(4, this.f45723e) + C3831b.m19596a(3, this.f45722d) + C3831b.m19609c(2) + 4 + C3831b.m19597a(1, this.f45720b) + 0;
                C7004a c7004a = this.f45730l;
                if (c7004a != null) {
                    m19597a += C3831b.m19598a(10, c7004a);
                }
                C7004a c7004a2 = this.f45731m;
                if (c7004a2 != null) {
                    m19597a += C3831b.m19598a(11, c7004a2);
                }
                C7004a c7004a3 = this.f45732n;
                if (c7004a3 != null) {
                    m19597a += C3831b.m19598a(12, c7004a3);
                }
                int m19600a = C3831b.m19600a(13, this.f45728j) + m19597a;
                C7004a c7004a4 = this.f45733o;
                if (c7004a4 != null) {
                    m19600a += C3831b.m19598a(14, c7004a4);
                }
                b bVar = this.f45734p;
                if (bVar != null) {
                    m19600a += C3831b.m19598a(15, bVar);
                }
                boolean z = this.f45735q;
                if (z) {
                    m19600a += C3831b.m19600a(16, z);
                }
                boolean z2 = this.f45736r;
                return z2 ? m19600a + C3831b.m19600a(17, z2) : m19600a;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
                while (true) {
                    int m19562l = c3805a.m19562l();
                    switch (m19562l) {
                        case 0:
                            break;
                        case 8:
                            this.f45720b = c3805a.m19559i();
                            break;
                        case 21:
                            this.f45721c = Float.intBitsToFloat(c3805a.m19554f());
                            break;
                        case 24:
                            this.f45722d = c3805a.m19558h();
                            break;
                        case 32:
                            this.f45723e = c3805a.m19558h();
                            break;
                        case 40:
                            this.f45724f = c3805a.m19559i();
                            break;
                        case 48:
                            this.f45725g = c3805a.m19558h();
                            break;
                        case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                            this.f45726h = c3805a.m19549c();
                            break;
                        case 64:
                            this.f45727i = c3805a.m19549c();
                            break;
                        case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                            this.f45729k = c3805a.m19559i();
                            break;
                        case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                            if (this.f45730l == null) {
                                this.f45730l = new C7004a();
                            }
                            c3805a.m19545a(this.f45730l);
                            break;
                        case 90:
                            if (this.f45731m == null) {
                                this.f45731m = new C7004a();
                            }
                            c3805a.m19545a(this.f45731m);
                            break;
                        case C4632R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                            if (this.f45732n == null) {
                                this.f45732n = new C7004a();
                            }
                            c3805a.m19545a(this.f45732n);
                            break;
                        case C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                            this.f45728j = c3805a.m19549c();
                            break;
                        case C4632R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                            if (this.f45733o == null) {
                                this.f45733o = new C7004a();
                            }
                            c3805a.m19545a(this.f45733o);
                            break;
                        case C4632R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                            if (this.f45734p == null) {
                                this.f45734p = new b();
                            }
                            c3805a.m19545a(this.f45734p);
                            break;
                        case 128:
                            this.f45735q = c3805a.m19549c();
                            break;
                        case 136:
                            this.f45736r = c3805a.m19549c();
                            break;
                        default:
                            if (!c3805a.m19555f(m19562l)) {
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return this;
            }
        }

        public k() {
            m20252b();
        }

        /* renamed from: c */
        public static k[] m20251c() {
            if (f45717d == null) {
                synchronized (C3857c.f44857a) {
                    if (f45717d == null) {
                        f45717d = new k[0];
                    }
                }
            }
            return f45717d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            a aVar = this.f45718b;
            if (aVar != null) {
                c3831b.m19615b(1, aVar);
            }
            b bVar = this.f45719c;
            if (bVar != null) {
                c3831b.m19615b(2, bVar);
            }
        }

        /* renamed from: b */
        public k m20252b() {
            this.f45718b = null;
            this.f45719c = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            a aVar = this.f45718b;
            int m19598a = aVar != null ? 0 + C3831b.m19598a(1, aVar) : 0;
            b bVar = this.f45719c;
            return bVar != null ? m19598a + C3831b.m19598a(2, bVar) : m19598a;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$k$b */
        public static final class b extends AbstractC3909e {

            /* renamed from: b */
            public int[] f45748b;

            /* renamed from: c */
            public int[] f45749c;

            public b() {
                m20258b();
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                int[] iArr = this.f45748b;
                int i2 = 0;
                if (iArr != null && iArr.length > 0) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr2 = this.f45748b;
                        if (i3 >= iArr2.length) {
                            break;
                        }
                        c3831b.m19622d(1, iArr2[i3]);
                        i3++;
                    }
                }
                int[] iArr3 = this.f45749c;
                if (iArr3 == null || iArr3.length <= 0) {
                    return;
                }
                while (true) {
                    int[] iArr4 = this.f45749c;
                    if (i2 >= iArr4.length) {
                        return;
                    }
                    c3831b.m19622d(2, iArr4[i2]);
                    i2++;
                }
            }

            /* renamed from: b */
            public b m20258b() {
                int[] iArr = C3961g.f45149a;
                this.f45748b = iArr;
                this.f45749c = iArr;
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                int i2;
                int[] iArr;
                int[] iArr2 = this.f45748b;
                int i3 = 0;
                if (iArr2 == null || iArr2.length <= 0) {
                    i2 = 0;
                } else {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        iArr = this.f45748b;
                        if (i4 >= iArr.length) {
                            break;
                        }
                        i5 += C3831b.m19594a(iArr[i4]);
                        i4++;
                    }
                    i2 = (iArr.length * 1) + i5 + 0;
                }
                int[] iArr3 = this.f45749c;
                if (iArr3 == null || iArr3.length <= 0) {
                    return i2;
                }
                int i6 = 0;
                while (true) {
                    int[] iArr4 = this.f45749c;
                    if (i3 < iArr4.length) {
                        i6 += C3831b.m19594a(iArr4[i3]);
                        i3++;
                    } else {
                        return i2 + i6 + (iArr4.length * 1);
                    }
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
                    if (m19562l == 8) {
                        int m19920a = C3961g.m19920a(c3805a, 8);
                        int[] iArr = new int[m19920a];
                        int i2 = 0;
                        for (int i3 = 0; i3 < m19920a; i3++) {
                            if (i3 != 0) {
                                c3805a.m19562l();
                            }
                            int m19558h = c3805a.m19558h();
                            if (m19558h == 0 || m19558h == 1 || m19558h == 2 || m19558h == 3 || m19558h == 4) {
                                iArr[i2] = m19558h;
                                i2++;
                            }
                        }
                        if (i2 != 0) {
                            int[] iArr2 = this.f45748b;
                            int length = iArr2 == null ? 0 : iArr2.length;
                            if (length == 0 && i2 == m19920a) {
                                this.f45748b = iArr;
                            } else {
                                int[] iArr3 = new int[length + i2];
                                if (length != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length);
                                }
                                System.arraycopy(iArr, 0, iArr3, length, i2);
                                this.f45748b = iArr3;
                            }
                        }
                    } else if (m19562l == 10) {
                        int m19548c = c3805a.m19548c(c3805a.m19558h());
                        int m19546b = c3805a.m19546b();
                        int i4 = 0;
                        while (c3805a.m19543a() > 0) {
                            int m19558h2 = c3805a.m19558h();
                            if (m19558h2 == 0 || m19558h2 == 1 || m19558h2 == 2 || m19558h2 == 3 || m19558h2 == 4) {
                                i4++;
                            }
                        }
                        if (i4 != 0) {
                            c3805a.m19553e(m19546b);
                            int[] iArr4 = this.f45748b;
                            int length2 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[i4 + length2];
                            if (length2 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length2);
                            }
                            while (c3805a.m19543a() > 0) {
                                int m19558h3 = c3805a.m19558h();
                                if (m19558h3 == 0 || m19558h3 == 1 || m19558h3 == 2 || m19558h3 == 3 || m19558h3 == 4) {
                                    iArr5[length2] = m19558h3;
                                    length2++;
                                }
                            }
                            this.f45748b = iArr5;
                        }
                        c3805a.m19547b(m19548c);
                    } else if (m19562l == 16) {
                        int m19920a2 = C3961g.m19920a(c3805a, 16);
                        int[] iArr6 = new int[m19920a2];
                        int i5 = 0;
                        for (int i6 = 0; i6 < m19920a2; i6++) {
                            if (i6 != 0) {
                                c3805a.m19562l();
                            }
                            int m19558h4 = c3805a.m19558h();
                            if (m19558h4 == 0 || m19558h4 == 2 || m19558h4 == 3) {
                                iArr6[i5] = m19558h4;
                                i5++;
                            }
                        }
                        if (i5 != 0) {
                            int[] iArr7 = this.f45749c;
                            int length3 = iArr7 == null ? 0 : iArr7.length;
                            if (length3 == 0 && i5 == m19920a2) {
                                this.f45749c = iArr6;
                            } else {
                                int[] iArr8 = new int[length3 + i5];
                                if (length3 != 0) {
                                    System.arraycopy(iArr7, 0, iArr8, 0, length3);
                                }
                                System.arraycopy(iArr6, 0, iArr8, length3, i5);
                                this.f45749c = iArr8;
                            }
                        }
                    } else if (m19562l != 18) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        int m19548c2 = c3805a.m19548c(c3805a.m19558h());
                        int m19546b2 = c3805a.m19546b();
                        int i7 = 0;
                        while (c3805a.m19543a() > 0) {
                            int m19558h5 = c3805a.m19558h();
                            if (m19558h5 == 0 || m19558h5 == 2 || m19558h5 == 3) {
                                i7++;
                            }
                        }
                        if (i7 != 0) {
                            c3805a.m19553e(m19546b2);
                            int[] iArr9 = this.f45749c;
                            int length4 = iArr9 == null ? 0 : iArr9.length;
                            int[] iArr10 = new int[i7 + length4];
                            if (length4 != 0) {
                                System.arraycopy(iArr9, 0, iArr10, 0, length4);
                            }
                            while (c3805a.m19543a() > 0) {
                                int m19558h6 = c3805a.m19558h();
                                if (m19558h6 == 0 || m19558h6 == 2 || m19558h6 == 3) {
                                    iArr10[length4] = m19558h6;
                                    length4++;
                                }
                            }
                            this.f45749c = iArr10;
                        }
                        c3805a.m19547b(m19548c2);
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
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 10) {
                    if (this.f45718b == null) {
                        this.f45718b = new a();
                    }
                    c3805a.m19545a(this.f45718b);
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f45719c == null) {
                        this.f45719c = new b();
                    }
                    c3805a.m19545a(this.f45719c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$s */
    public static final class s extends AbstractC3909e {

        /* renamed from: b */
        public t f45781b;

        /* renamed from: c */
        public t f45782c;

        public s() {
            m20270b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            t tVar = this.f45781b;
            if (tVar != null) {
                c3831b.m19615b(1, tVar);
            }
            t tVar2 = this.f45782c;
            if (tVar2 != null) {
                c3831b.m19615b(2, tVar2);
            }
        }

        /* renamed from: b */
        public s m20270b() {
            this.f45781b = null;
            this.f45782c = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            t tVar = this.f45781b;
            int m19598a = tVar != null ? 0 + C3831b.m19598a(1, tVar) : 0;
            t tVar2 = this.f45782c;
            return tVar2 != null ? m19598a + C3831b.m19598a(2, tVar2) : m19598a;
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
                    if (this.f45781b == null) {
                        this.f45781b = new t();
                    }
                    c3805a.m19545a(this.f45781b);
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f45782c == null) {
                        this.f45782c = new t();
                    }
                    c3805a.m19545a(this.f45782c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$t */
    public static final class t extends AbstractC3909e {

        /* renamed from: b */
        public int f45783b;

        /* renamed from: c */
        public long f45784c;

        public t() {
            m20271b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            int i2 = this.f45783b;
            if (i2 != 100) {
                c3831b.m19622d(1, i2);
            }
            long j2 = this.f45784c;
            if (j2 != 60) {
                c3831b.m19620c(2, j2);
            }
        }

        /* renamed from: b */
        public t m20271b() {
            this.f45783b = 100;
            this.f45784c = 60L;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = this.f45783b;
            int m19596a = i2 != 100 ? 0 + C3831b.m19596a(1, i2) : 0;
            long j2 = this.f45784c;
            return j2 != 60 ? m19596a + C3831b.m19597a(2, j2) : m19596a;
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
                    this.f45783b = c3805a.m19558h();
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45784c = c3805a.m19559i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$d */
    public static final class d extends AbstractC3909e {

        /* renamed from: d */
        private static volatile d[] f45677d;

        /* renamed from: b */
        public String f45678b;

        /* renamed from: c */
        public String[] f45679c;

        public d() {
            m20244b();
        }

        /* renamed from: c */
        public static d[] m20243c() {
            if (f45677d == null) {
                synchronized (C3857c.f44857a) {
                    if (f45677d == null) {
                        f45677d = new d[0];
                    }
                }
            }
            return f45677d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            if (!this.f45678b.equals("")) {
                c3831b.m19616b(1, this.f45678b);
            }
            String[] strArr = this.f45679c;
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f45679c;
                if (i2 >= strArr2.length) {
                    return;
                }
                String str = strArr2[i2];
                if (str != null) {
                    c3831b.m19616b(2, str);
                }
                i2++;
            }
        }

        /* renamed from: b */
        public d m20244b() {
            this.f45678b = "";
            this.f45679c = C3961g.f45150b;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = 0;
            int m19599a = !this.f45678b.equals("") ? C3831b.m19599a(1, this.f45678b) + 0 : 0;
            String[] strArr = this.f45679c;
            if (strArr == null || strArr.length <= 0) {
                return m19599a;
            }
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f45679c;
                if (i2 >= strArr2.length) {
                    return m19599a + i3 + (i4 * 1);
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    i3 = C3831b.m19604a(str) + i3;
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
                if (m19562l == 10) {
                    this.f45678b = c3805a.m19561k();
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19920a = C3961g.m19920a(c3805a, 18);
                    String[] strArr = this.f45679c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i2 = m19920a + length;
                    String[] strArr2 = new String[i2];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        strArr2[length] = c3805a.m19561k();
                        c3805a.m19562l();
                        length++;
                    }
                    strArr2[length] = c3805a.m19561k();
                    this.f45679c = strArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$f */
    public static final class f extends AbstractC3909e {

        /* renamed from: b */
        public e f45682b;

        /* renamed from: c */
        public e f45683c;

        /* renamed from: d */
        public e f45684d;

        public f() {
            m20246b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            e eVar = this.f45682b;
            if (eVar != null) {
                c3831b.m19615b(1, eVar);
            }
            e eVar2 = this.f45683c;
            if (eVar2 != null) {
                c3831b.m19615b(2, eVar2);
            }
            e eVar3 = this.f45684d;
            if (eVar3 != null) {
                c3831b.m19615b(3, eVar3);
            }
        }

        /* renamed from: b */
        public f m20246b() {
            this.f45682b = null;
            this.f45683c = null;
            this.f45684d = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            e eVar = this.f45682b;
            int m19598a = eVar != null ? 0 + C3831b.m19598a(1, eVar) : 0;
            e eVar2 = this.f45683c;
            if (eVar2 != null) {
                m19598a += C3831b.m19598a(2, eVar2);
            }
            e eVar3 = this.f45684d;
            return eVar3 != null ? m19598a + C3831b.m19598a(3, eVar3) : m19598a;
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
                    if (this.f45682b == null) {
                        this.f45682b = new e();
                    }
                    c3805a.m19545a(this.f45682b);
                } else if (m19562l == 18) {
                    if (this.f45683c == null) {
                        this.f45683c = new e();
                    }
                    c3805a.m19545a(this.f45683c);
                } else if (m19562l != 26) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f45684d == null) {
                        this.f45684d = new e();
                    }
                    c3805a.m19545a(this.f45684d);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$c */
    public static final class c extends AbstractC3909e {

        /* renamed from: b */
        public long f45673b;

        /* renamed from: c */
        public long f45674c;

        /* renamed from: d */
        public long f45675d;

        /* renamed from: e */
        public long f45676e;

        public c() {
            m20242b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            long j2 = this.f45673b;
            if (j2 != 10000) {
                c3831b.m19620c(1, j2);
            }
            long j3 = this.f45674c;
            if (j3 != 10000) {
                c3831b.m19620c(2, j3);
            }
            long j4 = this.f45675d;
            if (j4 != 10000) {
                c3831b.m19620c(3, j4);
            }
            long j5 = this.f45676e;
            if (j5 != 10000) {
                c3831b.m19620c(4, j5);
            }
        }

        /* renamed from: b */
        public c m20242b() {
            this.f45673b = 10000L;
            this.f45674c = 10000L;
            this.f45675d = 10000L;
            this.f45676e = 10000L;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            long j2 = this.f45673b;
            int m19597a = j2 != 10000 ? 0 + C3831b.m19597a(1, j2) : 0;
            long j3 = this.f45674c;
            if (j3 != 10000) {
                m19597a += C3831b.m19597a(2, j3);
            }
            long j4 = this.f45675d;
            if (j4 != 10000) {
                m19597a += C3831b.m19597a(3, j4);
            }
            long j5 = this.f45676e;
            return j5 != 10000 ? m19597a + C3831b.m19597a(4, j5) : m19597a;
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
                    this.f45673b = c3805a.m19559i();
                } else if (m19562l == 16) {
                    this.f45674c = c3805a.m19559i();
                } else if (m19562l == 24) {
                    this.f45675d = c3805a.m19559i();
                } else if (m19562l != 32) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45676e = c3805a.m19559i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$o */
    public static final class o extends AbstractC3909e {

        /* renamed from: b */
        public long f45765b;

        /* renamed from: c */
        public long f45766c;

        /* renamed from: d */
        public long f45767d;

        /* renamed from: e */
        public long f45768e;

        public o() {
            m20266b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            long j2 = this.f45765b;
            if (j2 != 432000000) {
                c3831b.m19620c(1, j2);
            }
            long j3 = this.f45766c;
            if (j3 != 86400000) {
                c3831b.m19620c(2, j3);
            }
            long j4 = this.f45767d;
            if (j4 != 10000) {
                c3831b.m19620c(3, j4);
            }
            long j5 = this.f45768e;
            if (j5 != 3600000) {
                c3831b.m19620c(4, j5);
            }
        }

        /* renamed from: b */
        public o m20266b() {
            this.f45765b = 432000000L;
            this.f45766c = 86400000L;
            this.f45767d = 10000L;
            this.f45768e = 3600000L;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            long j2 = this.f45765b;
            int m19597a = j2 != 432000000 ? 0 + C3831b.m19597a(1, j2) : 0;
            long j3 = this.f45766c;
            if (j3 != 86400000) {
                m19597a += C3831b.m19597a(2, j3);
            }
            long j4 = this.f45767d;
            if (j4 != 10000) {
                m19597a += C3831b.m19597a(3, j4);
            }
            long j5 = this.f45768e;
            return j5 != 3600000 ? m19597a + C3831b.m19597a(4, j5) : m19597a;
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
                    this.f45765b = c3805a.m19559i();
                } else if (m19562l == 16) {
                    this.f45766c = c3805a.m19559i();
                } else if (m19562l == 24) {
                    this.f45767d = c3805a.m19559i();
                } else if (m19562l != 32) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45768e = c3805a.m19559i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$h */
    public static final class h extends AbstractC3909e {

        /* renamed from: b */
        public String f45686b;

        /* renamed from: c */
        public int f45687c;

        /* renamed from: d */
        public int f45688d;

        /* renamed from: e */
        public boolean f45689e;

        /* renamed from: f */
        public boolean f45690f;

        public h() {
            m20248b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            if (!this.f45686b.equals("")) {
                c3831b.m19616b(1, this.f45686b);
            }
            int i2 = this.f45687c;
            if (i2 != 600) {
                c3831b.m19627f(2, i2);
            }
            int i3 = this.f45688d;
            if (i3 != 300) {
                c3831b.m19627f(3, i3);
            }
            boolean z = this.f45689e;
            if (z) {
                c3831b.m19617b(4, z);
            }
            boolean z2 = this.f45690f;
            if (!z2) {
                c3831b.m19617b(5, z2);
            }
        }

        /* renamed from: b */
        public h m20248b() {
            this.f45686b = "";
            this.f45687c = 600;
            this.f45688d = 300;
            this.f45689e = false;
            this.f45690f = true;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19599a = this.f45686b.equals("") ? 0 : 0 + C3831b.m19599a(1, this.f45686b);
            int i2 = this.f45687c;
            if (i2 != 600) {
                m19599a += C3831b.m19610c(2, i2);
            }
            int i3 = this.f45688d;
            if (i3 != 300) {
                m19599a += C3831b.m19610c(3, i3);
            }
            boolean z = this.f45689e;
            if (z) {
                m19599a += C3831b.m19600a(4, z);
            }
            boolean z2 = this.f45690f;
            return !z2 ? m19599a + C3831b.m19600a(5, z2) : m19599a;
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
                    this.f45686b = c3805a.m19561k();
                } else if (m19562l == 16) {
                    this.f45687c = c3805a.m19558h();
                } else if (m19562l == 24) {
                    this.f45688d = c3805a.m19558h();
                } else if (m19562l == 32) {
                    this.f45689e = c3805a.m19549c();
                } else if (m19562l != 40) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45690f = c3805a.m19549c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$v */
    public static final class v extends AbstractC3909e {

        /* renamed from: b */
        public int f45801b;

        /* renamed from: c */
        public int f45802c;

        /* renamed from: d */
        public int f45803d;

        /* renamed from: e */
        public long f45804e;

        /* renamed from: f */
        public boolean f45805f;

        /* renamed from: g */
        public boolean f45806g;

        /* renamed from: h */
        public boolean f45807h;

        /* renamed from: i */
        public x[] f45808i;

        public v() {
            m20273b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19622d(1, this.f45801b);
            c3831b.m19622d(2, this.f45802c);
            c3831b.m19622d(3, this.f45803d);
            c3831b.m19620c(4, this.f45804e);
            c3831b.m19617b(5, this.f45805f);
            c3831b.m19617b(6, this.f45806g);
            c3831b.m19617b(7, this.f45807h);
            x[] xVarArr = this.f45808i;
            if (xVarArr == null || xVarArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                x[] xVarArr2 = this.f45808i;
                if (i2 >= xVarArr2.length) {
                    return;
                }
                x xVar = xVarArr2[i2];
                if (xVar != null) {
                    c3831b.m19615b(8, xVar);
                }
                i2++;
            }
        }

        /* renamed from: b */
        public v m20273b() {
            this.f45801b = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
            this.f45802c = 1000;
            this.f45803d = 100;
            this.f45804e = 5000L;
            this.f45805f = true;
            this.f45806g = false;
            this.f45807h = true;
            this.f45808i = x.m20275c();
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = 0;
            int m19600a = C3831b.m19600a(7, this.f45807h) + C3831b.m19600a(6, this.f45806g) + C3831b.m19600a(5, this.f45805f) + C3831b.m19597a(4, this.f45804e) + C3831b.m19596a(3, this.f45803d) + C3831b.m19596a(2, this.f45802c) + C3831b.m19596a(1, this.f45801b) + 0;
            x[] xVarArr = this.f45808i;
            if (xVarArr != null && xVarArr.length > 0) {
                while (true) {
                    x[] xVarArr2 = this.f45808i;
                    if (i2 >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i2];
                    if (xVar != null) {
                        m19600a += C3831b.m19598a(8, xVar);
                    }
                    i2++;
                }
            }
            return m19600a;
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
                    this.f45801b = c3805a.m19558h();
                } else if (m19562l == 16) {
                    this.f45802c = c3805a.m19558h();
                } else if (m19562l == 24) {
                    this.f45803d = c3805a.m19558h();
                } else if (m19562l == 32) {
                    this.f45804e = c3805a.m19559i();
                } else if (m19562l == 40) {
                    this.f45805f = c3805a.m19549c();
                } else if (m19562l == 48) {
                    this.f45806g = c3805a.m19549c();
                } else if (m19562l == 56) {
                    this.f45807h = c3805a.m19549c();
                } else if (m19562l != 66) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19920a = C3961g.m19920a(c3805a, 66);
                    x[] xVarArr = this.f45808i;
                    int length = xVarArr == null ? 0 : xVarArr.length;
                    int i2 = m19920a + length;
                    x[] xVarArr2 = new x[i2];
                    if (length != 0) {
                        System.arraycopy(xVarArr, 0, xVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        xVarArr2[length] = new x();
                        c3805a.m19545a(xVarArr2[length]);
                        c3805a.m19562l();
                        length++;
                    }
                    xVarArr2[length] = new x();
                    c3805a.m19545a(xVarArr2[length]);
                    this.f45808i = xVarArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$p */
    public static final class p extends AbstractC3909e {

        /* renamed from: b */
        public long f45769b;

        /* renamed from: c */
        public String f45770c;

        /* renamed from: d */
        public int[] f45771d;

        /* renamed from: e */
        public int[] f45772e;

        /* renamed from: f */
        public long f45773f;

        /* renamed from: g */
        public int f45774g;

        /* renamed from: h */
        public long f45775h;

        /* renamed from: i */
        public long f45776i;

        /* renamed from: j */
        public long f45777j;

        /* renamed from: k */
        public long f45778k;

        public p() {
            m20267b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19620c(1, this.f45769b);
            c3831b.m19616b(2, this.f45770c);
            int[] iArr = this.f45771d;
            int i2 = 0;
            if (iArr != null && iArr.length > 0) {
                int i3 = 0;
                while (true) {
                    int[] iArr2 = this.f45771d;
                    if (i3 >= iArr2.length) {
                        break;
                    }
                    c3831b.m19622d(3, iArr2[i3]);
                    i3++;
                }
            }
            c3831b.m19620c(4, this.f45773f);
            c3831b.m19622d(5, this.f45774g);
            long j2 = this.f45775h;
            if (j2 != 43200) {
                c3831b.m19620c(6, j2);
            }
            long j3 = this.f45776i;
            if (j3 != 3600) {
                c3831b.m19620c(7, j3);
            }
            long j4 = this.f45777j;
            if (j4 != 86400) {
                c3831b.m19620c(8, j4);
            }
            int[] iArr3 = this.f45772e;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.f45772e;
                    if (i2 >= iArr4.length) {
                        break;
                    }
                    c3831b.m19622d(9, iArr4[i2]);
                    i2++;
                }
            }
            long j5 = this.f45778k;
            if (j5 != 30) {
                c3831b.m19620c(10, j5);
            }
        }

        /* renamed from: b */
        public p m20267b() {
            this.f45769b = 0L;
            this.f45770c = "";
            int[] iArr = C3961g.f45149a;
            this.f45771d = iArr;
            this.f45772e = iArr;
            this.f45773f = 259200L;
            this.f45774g = 10;
            this.f45775h = 43200L;
            this.f45776i = 3600L;
            this.f45777j = 86400L;
            this.f45778k = 30L;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int[] iArr;
            int[] iArr2;
            int i2 = 0;
            int m19599a = C3831b.m19599a(2, this.f45770c) + C3831b.m19597a(1, this.f45769b) + 0;
            int[] iArr3 = this.f45771d;
            if (iArr3 != null && iArr3.length > 0) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    iArr2 = this.f45771d;
                    if (i3 >= iArr2.length) {
                        break;
                    }
                    i4 += C3831b.m19594a(iArr2[i3]);
                    i3++;
                }
                m19599a = m19599a + i4 + (iArr2.length * 1);
            }
            int m19596a = C3831b.m19596a(5, this.f45774g) + C3831b.m19597a(4, this.f45773f) + m19599a;
            long j2 = this.f45775h;
            if (j2 != 43200) {
                m19596a += C3831b.m19597a(6, j2);
            }
            long j3 = this.f45776i;
            if (j3 != 3600) {
                m19596a += C3831b.m19597a(7, j3);
            }
            long j4 = this.f45777j;
            if (j4 != 86400) {
                m19596a += C3831b.m19597a(8, j4);
            }
            int[] iArr4 = this.f45772e;
            if (iArr4 != null && iArr4.length > 0) {
                int i5 = 0;
                while (true) {
                    iArr = this.f45772e;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    i5 += C3831b.m19594a(iArr[i2]);
                    i2++;
                }
                m19596a = m19596a + i5 + (iArr.length * 1);
            }
            long j5 = this.f45778k;
            return j5 != 30 ? m19596a + C3831b.m19597a(10, j5) : m19596a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                switch (m19562l) {
                    case 0:
                        break;
                    case 8:
                        this.f45769b = c3805a.m19559i();
                        break;
                    case 18:
                        this.f45770c = c3805a.m19561k();
                        break;
                    case 24:
                        int m19920a = C3961g.m19920a(c3805a, 24);
                        int[] iArr = this.f45771d;
                        int length = iArr == null ? 0 : iArr.length;
                        int i2 = m19920a + length;
                        int[] iArr2 = new int[i2];
                        if (length != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length);
                        }
                        while (length < i2 - 1) {
                            iArr2[length] = c3805a.m19558h();
                            c3805a.m19562l();
                            length++;
                        }
                        iArr2[length] = c3805a.m19558h();
                        this.f45771d = iArr2;
                        break;
                    case 26:
                        int m19548c = c3805a.m19548c(c3805a.m19558h());
                        int m19546b = c3805a.m19546b();
                        int i3 = 0;
                        while (c3805a.m19543a() > 0) {
                            c3805a.m19558h();
                            i3++;
                        }
                        c3805a.m19553e(m19546b);
                        int[] iArr3 = this.f45771d;
                        int length2 = iArr3 == null ? 0 : iArr3.length;
                        int i4 = i3 + length2;
                        int[] iArr4 = new int[i4];
                        if (length2 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length2);
                        }
                        while (length2 < i4) {
                            iArr4[length2] = c3805a.m19558h();
                            length2++;
                        }
                        this.f45771d = iArr4;
                        c3805a.m19547b(m19548c);
                        break;
                    case 32:
                        this.f45773f = c3805a.m19559i();
                        break;
                    case 40:
                        this.f45774g = c3805a.m19558h();
                        break;
                    case 48:
                        this.f45775h = c3805a.m19559i();
                        break;
                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                        this.f45776i = c3805a.m19559i();
                        break;
                    case 64:
                        this.f45777j = c3805a.m19559i();
                        break;
                    case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        int m19920a2 = C3961g.m19920a(c3805a, 72);
                        int[] iArr5 = this.f45772e;
                        int length3 = iArr5 == null ? 0 : iArr5.length;
                        int i5 = m19920a2 + length3;
                        int[] iArr6 = new int[i5];
                        if (length3 != 0) {
                            System.arraycopy(iArr5, 0, iArr6, 0, length3);
                        }
                        while (length3 < i5 - 1) {
                            iArr6[length3] = c3805a.m19558h();
                            c3805a.m19562l();
                            length3++;
                        }
                        iArr6[length3] = c3805a.m19558h();
                        this.f45772e = iArr6;
                        break;
                    case C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                        int m19548c2 = c3805a.m19548c(c3805a.m19558h());
                        int m19546b2 = c3805a.m19546b();
                        int i6 = 0;
                        while (c3805a.m19543a() > 0) {
                            c3805a.m19558h();
                            i6++;
                        }
                        c3805a.m19553e(m19546b2);
                        int[] iArr7 = this.f45772e;
                        int length4 = iArr7 == null ? 0 : iArr7.length;
                        int i7 = i6 + length4;
                        int[] iArr8 = new int[i7];
                        if (length4 != 0) {
                            System.arraycopy(iArr7, 0, iArr8, 0, length4);
                        }
                        while (length4 < i7) {
                            iArr8[length4] = c3805a.m19558h();
                            length4++;
                        }
                        this.f45772e = iArr8;
                        c3805a.m19547b(m19548c2);
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        this.f45778k = c3805a.m19559i();
                        break;
                    default:
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$i */
    public static final class i extends AbstractC3909e {

        /* renamed from: b */
        public boolean f45691b;

        /* renamed from: c */
        public boolean f45692c;

        /* renamed from: d */
        public boolean f45693d;

        /* renamed from: e */
        public boolean f45694e;

        /* renamed from: f */
        public boolean f45695f;

        /* renamed from: g */
        public boolean f45696g;

        /* renamed from: h */
        public boolean f45697h;

        /* renamed from: i */
        public boolean f45698i;

        /* renamed from: j */
        public boolean f45699j;

        /* renamed from: k */
        public boolean f45700k;

        /* renamed from: l */
        public boolean f45701l;

        /* renamed from: m */
        public boolean f45702m;

        /* renamed from: n */
        public boolean f45703n;

        /* renamed from: o */
        public boolean f45704o;

        /* renamed from: p */
        public boolean f45705p;

        /* renamed from: q */
        public boolean f45706q;

        /* renamed from: r */
        public boolean f45707r;

        /* renamed from: s */
        public boolean f45708s;

        /* renamed from: t */
        public boolean f45709t;

        /* renamed from: u */
        public boolean f45710u;

        /* renamed from: v */
        public boolean f45711v;

        /* renamed from: w */
        public boolean f45712w;

        /* renamed from: x */
        public boolean f45713x;

        /* renamed from: y */
        public boolean f45714y;

        /* renamed from: z */
        public int f45715z;

        public i() {
            m20249b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19617b(1, this.f45691b);
            c3831b.m19617b(2, this.f45692c);
            c3831b.m19617b(3, this.f45693d);
            c3831b.m19617b(4, this.f45694e);
            c3831b.m19617b(6, this.f45695f);
            c3831b.m19617b(8, this.f45696g);
            c3831b.m19617b(9, this.f45697h);
            c3831b.m19617b(11, this.f45698i);
            c3831b.m19617b(12, this.f45699j);
            c3831b.m19617b(15, this.f45700k);
            c3831b.m19617b(16, this.f45701l);
            c3831b.m19617b(18, this.f45702m);
            c3831b.m19617b(19, this.f45703n);
            c3831b.m19617b(20, this.f45704o);
            c3831b.m19617b(21, this.f45705p);
            c3831b.m19617b(22, this.f45706q);
            c3831b.m19617b(23, this.f45707r);
            c3831b.m19617b(24, this.f45708s);
            c3831b.m19617b(25, this.f45709t);
            c3831b.m19617b(26, this.f45710u);
            c3831b.m19617b(27, this.f45711v);
            c3831b.m19617b(28, this.f45712w);
            boolean z = this.f45713x;
            if (z) {
                c3831b.m19617b(29, z);
            }
            boolean z2 = this.f45714y;
            if (z2) {
                c3831b.m19617b(33, z2);
            }
            int i2 = this.f45715z;
            if (i2 != -1) {
                c3831b.m19622d(34, i2);
            }
        }

        /* renamed from: b */
        public i m20249b() {
            this.f45691b = false;
            this.f45692c = false;
            this.f45693d = false;
            this.f45694e = false;
            this.f45695f = false;
            this.f45696g = false;
            this.f45697h = false;
            this.f45698i = false;
            this.f45699j = false;
            this.f45700k = false;
            this.f45701l = true;
            this.f45702m = false;
            this.f45703n = false;
            this.f45704o = false;
            this.f45705p = false;
            this.f45706q = false;
            this.f45707r = false;
            this.f45708s = false;
            this.f45709t = false;
            this.f45710u = false;
            this.f45711v = true;
            this.f45712w = false;
            this.f45713x = false;
            this.f45714y = false;
            this.f45715z = -1;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19600a = C3831b.m19600a(28, this.f45712w) + C3831b.m19600a(27, this.f45711v) + C3831b.m19600a(26, this.f45710u) + C3831b.m19600a(25, this.f45709t) + C3831b.m19600a(24, this.f45708s) + C3831b.m19600a(23, this.f45707r) + C3831b.m19600a(22, this.f45706q) + C3831b.m19600a(21, this.f45705p) + C3831b.m19600a(20, this.f45704o) + C3831b.m19600a(19, this.f45703n) + C3831b.m19600a(18, this.f45702m) + C3831b.m19600a(16, this.f45701l) + C3831b.m19600a(15, this.f45700k) + C3831b.m19600a(12, this.f45699j) + C3831b.m19600a(11, this.f45698i) + C3831b.m19600a(9, this.f45697h) + C3831b.m19600a(8, this.f45696g) + C3831b.m19600a(6, this.f45695f) + C3831b.m19600a(4, this.f45694e) + C3831b.m19600a(3, this.f45693d) + C3831b.m19600a(2, this.f45692c) + C3831b.m19600a(1, this.f45691b) + 0;
            boolean z = this.f45713x;
            if (z) {
                m19600a += C3831b.m19600a(29, z);
            }
            boolean z2 = this.f45714y;
            if (z2) {
                m19600a += C3831b.m19600a(33, z2);
            }
            int i2 = this.f45715z;
            return i2 != -1 ? m19600a + C3831b.m19596a(34, i2) : m19600a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                switch (m19562l) {
                    case 0:
                        break;
                    case 8:
                        this.f45691b = c3805a.m19549c();
                        break;
                    case 16:
                        this.f45692c = c3805a.m19549c();
                        break;
                    case 24:
                        this.f45693d = c3805a.m19549c();
                        break;
                    case 32:
                        this.f45694e = c3805a.m19549c();
                        break;
                    case 48:
                        this.f45695f = c3805a.m19549c();
                        break;
                    case 64:
                        this.f45696g = c3805a.m19549c();
                        break;
                    case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        this.f45697h = c3805a.m19549c();
                        break;
                    case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                        this.f45698i = c3805a.m19549c();
                        break;
                    case C4632R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                        this.f45699j = c3805a.m19549c();
                        break;
                    case C4632R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                        this.f45700k = c3805a.m19549c();
                        break;
                    case 128:
                        this.f45701l = c3805a.m19549c();
                        break;
                    case 144:
                        this.f45702m = c3805a.m19549c();
                        break;
                    case 152:
                        this.f45703n = c3805a.m19549c();
                        break;
                    case 160:
                        this.f45704o = c3805a.m19549c();
                        break;
                    case 168:
                        this.f45705p = c3805a.m19549c();
                        break;
                    case 176:
                        this.f45706q = c3805a.m19549c();
                        break;
                    case 184:
                        this.f45707r = c3805a.m19549c();
                        break;
                    case 192:
                        this.f45708s = c3805a.m19549c();
                        break;
                    case DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER /* 200 */:
                        this.f45709t = c3805a.m19549c();
                        break;
                    case 208:
                        this.f45710u = c3805a.m19549c();
                        break;
                    case 216:
                        this.f45711v = c3805a.m19549c();
                        break;
                    case 224:
                        this.f45712w = c3805a.m19549c();
                        break;
                    case 232:
                        this.f45713x = c3805a.m19549c();
                        break;
                    case 264:
                        this.f45714y = c3805a.m19549c();
                        break;
                    case 272:
                        int m19558h = c3805a.m19558h();
                        if (m19558h != -1 && m19558h != 0 && m19558h != 1) {
                            break;
                        } else {
                            this.f45715z = m19558h;
                            break;
                        }
                    default:
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$u */
    public static final class u extends AbstractC3909e {

        /* renamed from: b */
        public boolean f45785b;

        /* renamed from: c */
        public boolean f45786c;

        /* renamed from: d */
        public boolean f45787d;

        /* renamed from: e */
        public boolean f45788e;

        /* renamed from: f */
        public int f45789f;

        /* renamed from: g */
        public int f45790g;

        /* renamed from: h */
        public int f45791h;

        /* renamed from: i */
        public int f45792i;

        /* renamed from: j */
        public boolean f45793j;

        /* renamed from: k */
        public boolean f45794k;

        /* renamed from: l */
        public boolean f45795l;

        /* renamed from: m */
        public boolean f45796m;

        /* renamed from: n */
        public x[] f45797n;

        /* renamed from: o */
        public boolean f45798o;

        /* renamed from: p */
        public boolean f45799p;

        /* renamed from: q */
        public int f45800q;

        public u() {
            m20272b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            boolean z = this.f45785b;
            if (!z) {
                c3831b.m19617b(1, z);
            }
            boolean z2 = this.f45786c;
            if (!z2) {
                c3831b.m19617b(2, z2);
            }
            boolean z3 = this.f45787d;
            if (!z3) {
                c3831b.m19617b(3, z3);
            }
            boolean z4 = this.f45788e;
            if (!z4) {
                c3831b.m19617b(4, z4);
            }
            int i2 = this.f45789f;
            if (i2 != 10000) {
                c3831b.m19622d(5, i2);
            }
            int i3 = this.f45790g;
            if (i3 != 1000) {
                c3831b.m19622d(6, i3);
            }
            int i4 = this.f45791h;
            if (i4 != 1000) {
                c3831b.m19622d(7, i4);
            }
            int i5 = this.f45792i;
            if (i5 != 200000) {
                c3831b.m19622d(8, i5);
            }
            boolean z5 = this.f45793j;
            if (z5) {
                c3831b.m19617b(9, z5);
            }
            boolean z6 = this.f45794k;
            if (z6) {
                c3831b.m19617b(10, z6);
            }
            boolean z7 = this.f45795l;
            if (z7) {
                c3831b.m19617b(11, z7);
            }
            boolean z8 = this.f45796m;
            if (z8) {
                c3831b.m19617b(12, z8);
            }
            x[] xVarArr = this.f45797n;
            if (xVarArr != null && xVarArr.length > 0) {
                int i6 = 0;
                while (true) {
                    x[] xVarArr2 = this.f45797n;
                    if (i6 >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i6];
                    if (xVar != null) {
                        c3831b.m19615b(13, xVar);
                    }
                    i6++;
                }
            }
            boolean z9 = this.f45798o;
            if (z9) {
                c3831b.m19617b(14, z9);
            }
            boolean z10 = this.f45799p;
            if (z10) {
                c3831b.m19617b(15, z10);
            }
            int i7 = this.f45800q;
            if (i7 != 4000) {
                c3831b.m19622d(16, i7);
            }
        }

        /* renamed from: b */
        public u m20272b() {
            this.f45785b = true;
            this.f45786c = true;
            this.f45787d = true;
            this.f45788e = true;
            this.f45789f = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
            this.f45790g = 1000;
            this.f45791h = 1000;
            this.f45792i = 200000;
            this.f45793j = false;
            this.f45794k = false;
            this.f45795l = false;
            this.f45796m = false;
            this.f45797n = x.m20275c();
            this.f45798o = false;
            this.f45799p = false;
            this.f45800q = 4000;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            boolean z = this.f45785b;
            int i2 = 0;
            int m19600a = !z ? C3831b.m19600a(1, z) + 0 : 0;
            boolean z2 = this.f45786c;
            if (!z2) {
                m19600a += C3831b.m19600a(2, z2);
            }
            boolean z3 = this.f45787d;
            if (!z3) {
                m19600a += C3831b.m19600a(3, z3);
            }
            boolean z4 = this.f45788e;
            if (!z4) {
                m19600a += C3831b.m19600a(4, z4);
            }
            int i3 = this.f45789f;
            if (i3 != 10000) {
                m19600a += C3831b.m19596a(5, i3);
            }
            int i4 = this.f45790g;
            if (i4 != 1000) {
                m19600a += C3831b.m19596a(6, i4);
            }
            int i5 = this.f45791h;
            if (i5 != 1000) {
                m19600a += C3831b.m19596a(7, i5);
            }
            int i6 = this.f45792i;
            if (i6 != 200000) {
                m19600a += C3831b.m19596a(8, i6);
            }
            boolean z5 = this.f45793j;
            if (z5) {
                m19600a += C3831b.m19600a(9, z5);
            }
            boolean z6 = this.f45794k;
            if (z6) {
                m19600a += C3831b.m19600a(10, z6);
            }
            boolean z7 = this.f45795l;
            if (z7) {
                m19600a += C3831b.m19600a(11, z7);
            }
            boolean z8 = this.f45796m;
            if (z8) {
                m19600a += C3831b.m19600a(12, z8);
            }
            x[] xVarArr = this.f45797n;
            if (xVarArr != null && xVarArr.length > 0) {
                while (true) {
                    x[] xVarArr2 = this.f45797n;
                    if (i2 >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i2];
                    if (xVar != null) {
                        m19600a += C3831b.m19598a(13, xVar);
                    }
                    i2++;
                }
            }
            boolean z9 = this.f45798o;
            if (z9) {
                m19600a += C3831b.m19600a(14, z9);
            }
            boolean z10 = this.f45799p;
            if (z10) {
                m19600a += C3831b.m19600a(15, z10);
            }
            int i7 = this.f45800q;
            return i7 != 4000 ? m19600a + C3831b.m19596a(16, i7) : m19600a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                switch (m19562l) {
                    case 0:
                        break;
                    case 8:
                        this.f45785b = c3805a.m19549c();
                        break;
                    case 16:
                        this.f45786c = c3805a.m19549c();
                        break;
                    case 24:
                        this.f45787d = c3805a.m19549c();
                        break;
                    case 32:
                        this.f45788e = c3805a.m19549c();
                        break;
                    case 40:
                        this.f45789f = c3805a.m19558h();
                        break;
                    case 48:
                        this.f45790g = c3805a.m19558h();
                        break;
                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                        this.f45791h = c3805a.m19558h();
                        break;
                    case 64:
                        this.f45792i = c3805a.m19558h();
                        break;
                    case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        this.f45793j = c3805a.m19549c();
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        this.f45794k = c3805a.m19549c();
                        break;
                    case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                        this.f45795l = c3805a.m19549c();
                        break;
                    case C4632R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                        this.f45796m = c3805a.m19549c();
                        break;
                    case C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                        int m19920a = C3961g.m19920a(c3805a, C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader);
                        x[] xVarArr = this.f45797n;
                        int length = xVarArr == null ? 0 : xVarArr.length;
                        int i2 = m19920a + length;
                        x[] xVarArr2 = new x[i2];
                        if (length != 0) {
                            System.arraycopy(xVarArr, 0, xVarArr2, 0, length);
                        }
                        while (length < i2 - 1) {
                            xVarArr2[length] = new x();
                            c3805a.m19545a(xVarArr2[length]);
                            c3805a.m19562l();
                            length++;
                        }
                        xVarArr2[length] = new x();
                        c3805a.m19545a(xVarArr2[length]);
                        this.f45797n = xVarArr2;
                        break;
                    case C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                        this.f45798o = c3805a.m19549c();
                        break;
                    case C4632R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                        this.f45799p = c3805a.m19549c();
                        break;
                    case 128:
                        this.f45800q = c3805a.m19558h();
                        break;
                    default:
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2 = 0;
        int m19597a = C3831b.m19597a(3, this.f45642c) + (!this.f45641b.equals("") ? C3831b.m19599a(1, this.f45641b) + 0 : 0);
        String[] strArr = this.f45643d;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f45643d;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    i5++;
                    i4 += C3831b.m19604a(str);
                }
                i3++;
            }
            m19597a = m19597a + i4 + (i5 * 1);
        }
        if (!this.f45644e.equals("")) {
            m19597a += C3831b.m19599a(5, this.f45644e);
        }
        if (!this.f45645f.equals("")) {
            m19597a += C3831b.m19599a(6, this.f45645f);
        }
        String[] strArr3 = this.f45646g;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr4 = this.f45646g;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i6];
                if (str2 != null) {
                    i8++;
                    i7 += C3831b.m19604a(str2);
                }
                i6++;
            }
            m19597a = m19597a + i7 + (i8 * 1);
        }
        String[] strArr5 = this.f45647h;
        if (strArr5 != null && strArr5.length > 0) {
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr6 = this.f45647h;
                if (i9 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i9];
                if (str3 != null) {
                    i11++;
                    i10 += C3831b.m19604a(str3);
                }
                i9++;
            }
            m19597a = m19597a + i10 + (i11 * 1);
        }
        String[] strArr7 = this.f45648i;
        if (strArr7 != null && strArr7.length > 0) {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr8 = this.f45648i;
                if (i12 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i12];
                if (str4 != null) {
                    i14++;
                    i13 += C3831b.m19604a(str4);
                }
                i12++;
            }
            m19597a = m19597a + i13 + (i14 * 1);
        }
        i iVar = this.f45651l;
        if (iVar != null) {
            m19597a += C3831b.m19598a(10, iVar);
        }
        k[] kVarArr = this.f45652m;
        if (kVarArr != null && kVarArr.length > 0) {
            int i15 = 0;
            while (true) {
                k[] kVarArr2 = this.f45652m;
                if (i15 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i15];
                if (kVar != null) {
                    m19597a += C3831b.m19598a(11, kVar);
                }
                i15++;
            }
        }
        y yVar = this.f45653n;
        if (yVar != null) {
            m19597a += C3831b.m19598a(12, yVar);
        }
        p pVar = this.f45654o;
        if (pVar != null) {
            m19597a += C3831b.m19598a(13, pVar);
        }
        n[] nVarArr = this.f45655p;
        if (nVarArr != null && nVarArr.length > 0) {
            int i16 = 0;
            while (true) {
                n[] nVarArr2 = this.f45655p;
                if (i16 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i16];
                if (nVar != null) {
                    m19597a += C3831b.m19598a(14, nVar);
                }
                i16++;
            }
        }
        if (!this.f45656q.equals("")) {
            m19597a += C3831b.m19599a(15, this.f45656q);
        }
        if (!this.f45657r.equals("")) {
            m19597a += C3831b.m19599a(16, this.f45657r);
        }
        int m19600a = C3831b.m19600a(17, this.f45659t) + m19597a;
        if (!this.f45660u.equals("")) {
            m19600a += C3831b.m19599a(19, this.f45660u);
        }
        String[] strArr9 = this.f45661v;
        if (strArr9 != null && strArr9.length > 0) {
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                String[] strArr10 = this.f45661v;
                if (i17 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i17];
                if (str5 != null) {
                    i19++;
                    i18 += C3831b.m19604a(str5);
                }
                i17++;
            }
            m19600a = m19600a + i18 + (i19 * 2);
        }
        r rVar = this.f45662w;
        if (rVar != null) {
            m19600a += C3831b.m19598a(21, rVar);
        }
        boolean z = this.f45663x;
        if (z) {
            m19600a += C3831b.m19600a(22, z);
        }
        l[] lVarArr = this.f45664y;
        if (lVarArr != null && lVarArr.length > 0) {
            int i20 = 0;
            while (true) {
                l[] lVarArr2 = this.f45664y;
                if (i20 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i20];
                if (lVar != null) {
                    m19600a += C3831b.m19598a(23, lVar);
                }
                i20++;
            }
        }
        o oVar = this.f45665z;
        if (oVar != null) {
            m19600a += C3831b.m19598a(24, oVar);
        }
        if (!this.f45616A.equals("")) {
            m19600a += C3831b.m19599a(25, this.f45616A);
        }
        if (!this.f45617B.equals("")) {
            m19600a += C3831b.m19599a(26, this.f45617B);
        }
        if (!this.f45619D.equals("")) {
            m19600a += C3831b.m19599a(27, this.f45619D);
        }
        int m19597a2 = C3831b.m19597a(29, this.f45622G) + C3831b.m19597a(28, this.f45621F) + m19600a;
        boolean z2 = this.f45623H;
        if (z2) {
            m19597a2 += C3831b.m19600a(30, z2);
        }
        if (!this.f45618C.equals("")) {
            m19597a2 += C3831b.m19599a(31, this.f45618C);
        }
        m mVar = this.f45624I;
        if (mVar != null) {
            m19597a2 += C3831b.m19598a(32, mVar);
        }
        j jVar = this.f45625J;
        if (jVar != null) {
            m19597a2 += C3831b.m19598a(33, jVar);
        }
        int m19596a = C3831b.m19596a(36, this.f45627L) + C3831b.m19596a(35, this.f45626K) + m19597a2;
        v vVar = this.f45628M;
        if (vVar != null) {
            m19596a += C3831b.m19598a(37, vVar);
        }
        u uVar = this.f45629N;
        if (uVar != null) {
            m19596a += C3831b.m19598a(38, uVar);
        }
        u uVar2 = this.f45630O;
        if (uVar2 != null) {
            m19596a += C3831b.m19598a(39, uVar2);
        }
        s sVar = this.f45632Q;
        if (sVar != null) {
            m19596a += C3831b.m19598a(41, sVar);
        }
        c cVar = this.f45633R;
        if (cVar != null) {
            m19596a += C3831b.m19598a(42, cVar);
        }
        u uVar3 = this.f45631P;
        if (uVar3 != null) {
            m19596a += C3831b.m19598a(43, uVar3);
        }
        if (!this.f45658s.equals("")) {
            m19596a += C3831b.m19599a(44, this.f45658s);
        }
        f fVar = this.f45634S;
        if (fVar != null) {
            m19596a += C3831b.m19598a(45, fVar);
        }
        String[] strArr11 = this.f45649j;
        if (strArr11 != null && strArr11.length > 0) {
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (true) {
                String[] strArr12 = this.f45649j;
                if (i21 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i21];
                if (str6 != null) {
                    i23++;
                    i22 += C3831b.m19604a(str6);
                }
                i21++;
            }
            m19596a = m19596a + i22 + (i23 * 2);
        }
        String[] strArr13 = this.f45635T;
        if (strArr13 != null && strArr13.length > 0) {
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (true) {
                String[] strArr14 = this.f45635T;
                if (i24 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i24];
                if (str7 != null) {
                    i26++;
                    i25 += C3831b.m19604a(str7);
                }
                i24++;
            }
            m19596a = m19596a + i25 + (i26 * 2);
        }
        b bVar = this.f45636U;
        if (bVar != null) {
            m19596a += C3831b.m19598a(48, bVar);
        }
        if (!this.f45620E.equals("")) {
            m19596a += C3831b.m19599a(49, this.f45620E);
        }
        a aVar = this.f45637V;
        if (aVar != null) {
            m19596a += C3831b.m19598a(51, aVar);
        }
        h hVar = this.f45638W;
        if (hVar != null) {
            m19596a += C3831b.m19598a(52, hVar);
        }
        g gVar = this.f45639X;
        if (gVar != null) {
            m19596a += C3831b.m19598a(53, gVar);
        }
        d[] dVarArr = this.f45650k;
        if (dVarArr != null && dVarArr.length > 0) {
            while (true) {
                d[] dVarArr2 = this.f45650k;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    m19596a += C3831b.m19598a(54, dVar);
                }
                i2++;
            }
        }
        q qVar = this.f45640Y;
        return qVar != null ? m19596a + C3831b.m19598a(55, qVar) : m19596a;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
        while (true) {
            int m19562l = c3805a.m19562l();
            switch (m19562l) {
                case 0:
                    break;
                case 10:
                    this.f45641b = c3805a.m19561k();
                    break;
                case 24:
                    this.f45642c = c3805a.m19559i();
                    break;
                case 34:
                    int m19920a = C3961g.m19920a(c3805a, 34);
                    String[] strArr = this.f45643d;
                    int length = strArr == null ? 0 : strArr.length;
                    int i2 = m19920a + length;
                    String[] strArr2 = new String[i2];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        strArr2[length] = c3805a.m19561k();
                        c3805a.m19562l();
                        length++;
                    }
                    strArr2[length] = c3805a.m19561k();
                    this.f45643d = strArr2;
                    break;
                case 42:
                    this.f45644e = c3805a.m19561k();
                    break;
                case 50:
                    this.f45645f = c3805a.m19561k();
                    break;
                case 58:
                    int m19920a2 = C3961g.m19920a(c3805a, 58);
                    String[] strArr3 = this.f45646g;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i3 = m19920a2 + length2;
                    String[] strArr4 = new String[i3];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        strArr4[length2] = c3805a.m19561k();
                        c3805a.m19562l();
                        length2++;
                    }
                    strArr4[length2] = c3805a.m19561k();
                    this.f45646g = strArr4;
                    break;
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    int m19920a3 = C3961g.m19920a(c3805a, 66);
                    String[] strArr5 = this.f45647h;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i4 = m19920a3 + length3;
                    String[] strArr6 = new String[i4];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        strArr6[length3] = c3805a.m19561k();
                        c3805a.m19562l();
                        length3++;
                    }
                    strArr6[length3] = c3805a.m19561k();
                    this.f45647h = strArr6;
                    break;
                case C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                    int m19920a4 = C3961g.m19920a(c3805a, 74);
                    String[] strArr7 = this.f45648i;
                    int length4 = strArr7 == null ? 0 : strArr7.length;
                    int i5 = m19920a4 + length4;
                    String[] strArr8 = new String[i5];
                    if (length4 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length4);
                    }
                    while (length4 < i5 - 1) {
                        strArr8[length4] = c3805a.m19561k();
                        c3805a.m19562l();
                        length4++;
                    }
                    strArr8[length4] = c3805a.m19561k();
                    this.f45648i = strArr8;
                    break;
                case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                    if (this.f45651l == null) {
                        this.f45651l = new i();
                    }
                    c3805a.m19545a(this.f45651l);
                    break;
                case 90:
                    int m19920a5 = C3961g.m19920a(c3805a, 90);
                    k[] kVarArr = this.f45652m;
                    int length5 = kVarArr == null ? 0 : kVarArr.length;
                    int i6 = m19920a5 + length5;
                    k[] kVarArr2 = new k[i6];
                    if (length5 != 0) {
                        System.arraycopy(kVarArr, 0, kVarArr2, 0, length5);
                    }
                    while (length5 < i6 - 1) {
                        kVarArr2[length5] = new k();
                        c3805a.m19545a(kVarArr2[length5]);
                        c3805a.m19562l();
                        length5++;
                    }
                    kVarArr2[length5] = new k();
                    c3805a.m19545a(kVarArr2[length5]);
                    this.f45652m = kVarArr2;
                    break;
                case C4632R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                    if (this.f45653n == null) {
                        this.f45653n = new y();
                    }
                    c3805a.m19545a(this.f45653n);
                    break;
                case C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                    if (this.f45654o == null) {
                        this.f45654o = new p();
                    }
                    c3805a.m19545a(this.f45654o);
                    break;
                case C4632R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                    int m19920a6 = C3961g.m19920a(c3805a, C4632R.styleable.AppCompatTheme_tooltipForegroundColor);
                    n[] nVarArr = this.f45655p;
                    int length6 = nVarArr == null ? 0 : nVarArr.length;
                    int i7 = m19920a6 + length6;
                    n[] nVarArr2 = new n[i7];
                    if (length6 != 0) {
                        System.arraycopy(nVarArr, 0, nVarArr2, 0, length6);
                    }
                    while (length6 < i7 - 1) {
                        nVarArr2[length6] = new n();
                        c3805a.m19545a(nVarArr2[length6]);
                        c3805a.m19562l();
                        length6++;
                    }
                    nVarArr2[length6] = new n();
                    c3805a.m19545a(nVarArr2[length6]);
                    this.f45655p = nVarArr2;
                    break;
                case C4632R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                    this.f45656q = c3805a.m19561k();
                    break;
                case 130:
                    this.f45657r = c3805a.m19561k();
                    break;
                case 136:
                    this.f45659t = c3805a.m19549c();
                    break;
                case 154:
                    this.f45660u = c3805a.m19561k();
                    break;
                case 162:
                    int m19920a7 = C3961g.m19920a(c3805a, 162);
                    String[] strArr9 = this.f45661v;
                    int length7 = strArr9 == null ? 0 : strArr9.length;
                    int i8 = m19920a7 + length7;
                    String[] strArr10 = new String[i8];
                    if (length7 != 0) {
                        System.arraycopy(strArr9, 0, strArr10, 0, length7);
                    }
                    while (length7 < i8 - 1) {
                        strArr10[length7] = c3805a.m19561k();
                        c3805a.m19562l();
                        length7++;
                    }
                    strArr10[length7] = c3805a.m19561k();
                    this.f45661v = strArr10;
                    break;
                case 170:
                    if (this.f45662w == null) {
                        this.f45662w = new r();
                    }
                    c3805a.m19545a(this.f45662w);
                    break;
                case 176:
                    this.f45663x = c3805a.m19549c();
                    break;
                case 186:
                    int m19920a8 = C3961g.m19920a(c3805a, 186);
                    l[] lVarArr = this.f45664y;
                    int length8 = lVarArr == null ? 0 : lVarArr.length;
                    int i9 = m19920a8 + length8;
                    l[] lVarArr2 = new l[i9];
                    if (length8 != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length8);
                    }
                    while (length8 < i9 - 1) {
                        lVarArr2[length8] = new l();
                        c3805a.m19545a(lVarArr2[length8]);
                        c3805a.m19562l();
                        length8++;
                    }
                    lVarArr2[length8] = new l();
                    c3805a.m19545a(lVarArr2[length8]);
                    this.f45664y = lVarArr2;
                    break;
                case 194:
                    if (this.f45665z == null) {
                        this.f45665z = new o();
                    }
                    c3805a.m19545a(this.f45665z);
                    break;
                case DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER /* 202 */:
                    this.f45616A = c3805a.m19561k();
                    break;
                case 210:
                    this.f45617B = c3805a.m19561k();
                    break;
                case 218:
                    this.f45619D = c3805a.m19561k();
                    break;
                case 224:
                    this.f45621F = c3805a.m19559i();
                    break;
                case 232:
                    this.f45622G = c3805a.m19559i();
                    break;
                case 240:
                    this.f45623H = c3805a.m19549c();
                    break;
                case 250:
                    this.f45618C = c3805a.m19561k();
                    break;
                case 258:
                    if (this.f45624I == null) {
                        this.f45624I = new m();
                    }
                    c3805a.m19545a(this.f45624I);
                    break;
                case 266:
                    if (this.f45625J == null) {
                        this.f45625J = new j();
                    }
                    c3805a.m19545a(this.f45625J);
                    break;
                case 280:
                    this.f45626K = c3805a.m19558h();
                    break;
                case 288:
                    this.f45627L = c3805a.m19558h();
                    break;
                case 298:
                    if (this.f45628M == null) {
                        this.f45628M = new v();
                    }
                    c3805a.m19545a(this.f45628M);
                    break;
                case 306:
                    if (this.f45629N == null) {
                        this.f45629N = new u();
                    }
                    c3805a.m19545a(this.f45629N);
                    break;
                case 314:
                    if (this.f45630O == null) {
                        this.f45630O = new u();
                    }
                    c3805a.m19545a(this.f45630O);
                    break;
                case 330:
                    if (this.f45632Q == null) {
                        this.f45632Q = new s();
                    }
                    c3805a.m19545a(this.f45632Q);
                    break;
                case 338:
                    if (this.f45633R == null) {
                        this.f45633R = new c();
                    }
                    c3805a.m19545a(this.f45633R);
                    break;
                case 346:
                    if (this.f45631P == null) {
                        this.f45631P = new u();
                    }
                    c3805a.m19545a(this.f45631P);
                    break;
                case 354:
                    this.f45658s = c3805a.m19561k();
                    break;
                case 362:
                    if (this.f45634S == null) {
                        this.f45634S = new f();
                    }
                    c3805a.m19545a(this.f45634S);
                    break;
                case 370:
                    int m19920a9 = C3961g.m19920a(c3805a, 370);
                    String[] strArr11 = this.f45649j;
                    int length9 = strArr11 == null ? 0 : strArr11.length;
                    int i10 = m19920a9 + length9;
                    String[] strArr12 = new String[i10];
                    if (length9 != 0) {
                        System.arraycopy(strArr11, 0, strArr12, 0, length9);
                    }
                    while (length9 < i10 - 1) {
                        strArr12[length9] = c3805a.m19561k();
                        c3805a.m19562l();
                        length9++;
                    }
                    strArr12[length9] = c3805a.m19561k();
                    this.f45649j = strArr12;
                    break;
                case 378:
                    int m19920a10 = C3961g.m19920a(c3805a, 378);
                    String[] strArr13 = this.f45635T;
                    int length10 = strArr13 == null ? 0 : strArr13.length;
                    int i11 = m19920a10 + length10;
                    String[] strArr14 = new String[i11];
                    if (length10 != 0) {
                        System.arraycopy(strArr13, 0, strArr14, 0, length10);
                    }
                    while (length10 < i11 - 1) {
                        strArr14[length10] = c3805a.m19561k();
                        c3805a.m19562l();
                        length10++;
                    }
                    strArr14[length10] = c3805a.m19561k();
                    this.f45635T = strArr14;
                    break;
                case 386:
                    if (this.f45636U == null) {
                        this.f45636U = new b();
                    }
                    c3805a.m19545a(this.f45636U);
                    break;
                case 394:
                    this.f45620E = c3805a.m19561k();
                    break;
                case 410:
                    if (this.f45637V == null) {
                        this.f45637V = new a();
                    }
                    c3805a.m19545a(this.f45637V);
                    break;
                case 418:
                    if (this.f45638W == null) {
                        this.f45638W = new h();
                    }
                    c3805a.m19545a(this.f45638W);
                    break;
                case 426:
                    if (this.f45639X == null) {
                        this.f45639X = new g();
                    }
                    c3805a.m19545a(this.f45639X);
                    break;
                case 434:
                    int m19920a11 = C3961g.m19920a(c3805a, 434);
                    d[] dVarArr = this.f45650k;
                    int length11 = dVarArr == null ? 0 : dVarArr.length;
                    int i12 = m19920a11 + length11;
                    d[] dVarArr2 = new d[i12];
                    if (length11 != 0) {
                        System.arraycopy(dVarArr, 0, dVarArr2, 0, length11);
                    }
                    while (length11 < i12 - 1) {
                        dVarArr2[length11] = new d();
                        c3805a.m19545a(dVarArr2[length11]);
                        c3805a.m19562l();
                        length11++;
                    }
                    dVarArr2[length11] = new d();
                    c3805a.m19545a(dVarArr2[length11]);
                    this.f45650k = dVarArr2;
                    break;
                case 442:
                    if (this.f45640Y == null) {
                        this.f45640Y = new q();
                    }
                    c3805a.m19545a(this.f45640Y);
                    break;
                default:
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
