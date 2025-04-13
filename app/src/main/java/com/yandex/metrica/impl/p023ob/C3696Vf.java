package com.yandex.metrica.impl.p023ob;

import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Vf */
/* loaded from: classes2.dex */
public final class C3696Vf extends AbstractC3909e {

    /* renamed from: b */
    public d[] f44230b;

    /* renamed from: c */
    public c f44231c;

    /* renamed from: d */
    public a[] f44232d;

    /* renamed from: e */
    public e[] f44233e;

    /* renamed from: f */
    public String[] f44234f;

    /* renamed from: com.yandex.metrica.impl.ob.Vf$c */
    public static final class c extends AbstractC3909e {

        /* renamed from: b */
        public String f44247b;

        /* renamed from: c */
        public String f44248c;

        /* renamed from: d */
        public String f44249d;

        /* renamed from: e */
        public int f44250e;

        /* renamed from: f */
        public String f44251f;

        /* renamed from: g */
        public String f44252g;

        /* renamed from: h */
        public boolean f44253h;

        /* renamed from: i */
        public int f44254i;

        /* renamed from: j */
        public String f44255j;

        /* renamed from: k */
        public String f44256k;

        /* renamed from: l */
        public int f44257l;

        /* renamed from: m */
        public a[] f44258m;

        /* renamed from: n */
        public String f44259n;

        public c() {
            m19281b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            if (!this.f44247b.equals("")) {
                c3831b.m19616b(1, this.f44247b);
            }
            if (!this.f44248c.equals("")) {
                c3831b.m19616b(2, this.f44248c);
            }
            if (!this.f44249d.equals("")) {
                c3831b.m19616b(4, this.f44249d);
            }
            int i2 = this.f44250e;
            if (i2 != 0) {
                c3831b.m19627f(5, i2);
            }
            if (!this.f44251f.equals("")) {
                c3831b.m19616b(10, this.f44251f);
            }
            if (!this.f44252g.equals("")) {
                c3831b.m19616b(15, this.f44252g);
            }
            boolean z = this.f44253h;
            if (z) {
                c3831b.m19617b(17, z);
            }
            int i3 = this.f44254i;
            if (i3 != 0) {
                c3831b.m19627f(18, i3);
            }
            if (!this.f44255j.equals("")) {
                c3831b.m19616b(19, this.f44255j);
            }
            if (!this.f44256k.equals("")) {
                c3831b.m19616b(21, this.f44256k);
            }
            int i4 = this.f44257l;
            if (i4 != 0) {
                c3831b.m19627f(22, i4);
            }
            a[] aVarArr = this.f44258m;
            if (aVarArr != null && aVarArr.length > 0) {
                int i5 = 0;
                while (true) {
                    a[] aVarArr2 = this.f44258m;
                    if (i5 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i5];
                    if (aVar != null) {
                        c3831b.m19615b(23, aVar);
                    }
                    i5++;
                }
            }
            if (this.f44259n.equals("")) {
                return;
            }
            c3831b.m19616b(24, this.f44259n);
        }

        /* renamed from: b */
        public c m19281b() {
            this.f44247b = "";
            this.f44248c = "";
            this.f44249d = "";
            this.f44250e = 0;
            this.f44251f = "";
            this.f44252g = "";
            this.f44253h = false;
            this.f44254i = 0;
            this.f44255j = "";
            this.f44256k = "";
            this.f44257l = 0;
            this.f44258m = a.m19282c();
            this.f44259n = "";
            this.f44976a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Vf$c$a */
        public static final class a extends AbstractC3909e {

            /* renamed from: d */
            private static volatile a[] f44260d;

            /* renamed from: b */
            public String f44261b;

            /* renamed from: c */
            public long f44262c;

            public a() {
                m19283b();
            }

            /* renamed from: c */
            public static a[] m19282c() {
                if (f44260d == null) {
                    synchronized (C3857c.f44857a) {
                        if (f44260d == null) {
                            f44260d = new a[0];
                        }
                    }
                }
                return f44260d;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                c3831b.m19616b(1, this.f44261b);
                c3831b.m19626e(2, this.f44262c);
            }

            /* renamed from: b */
            public a m19283b() {
                this.f44261b = "";
                this.f44262c = 0L;
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                return C3831b.m19608b(2, this.f44262c) + C3831b.m19599a(1, this.f44261b) + 0;
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
                        this.f44261b = c3805a.m19561k();
                    } else if (m19562l != 16) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        this.f44262c = c3805a.m19559i();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = 0;
            int m19599a = !this.f44247b.equals("") ? C3831b.m19599a(1, this.f44247b) + 0 : 0;
            if (!this.f44248c.equals("")) {
                m19599a += C3831b.m19599a(2, this.f44248c);
            }
            if (!this.f44249d.equals("")) {
                m19599a += C3831b.m19599a(4, this.f44249d);
            }
            int i3 = this.f44250e;
            if (i3 != 0) {
                m19599a += C3831b.m19610c(5, i3);
            }
            if (!this.f44251f.equals("")) {
                m19599a += C3831b.m19599a(10, this.f44251f);
            }
            if (!this.f44252g.equals("")) {
                m19599a += C3831b.m19599a(15, this.f44252g);
            }
            boolean z = this.f44253h;
            if (z) {
                m19599a += C3831b.m19600a(17, z);
            }
            int i4 = this.f44254i;
            if (i4 != 0) {
                m19599a += C3831b.m19610c(18, i4);
            }
            if (!this.f44255j.equals("")) {
                m19599a += C3831b.m19599a(19, this.f44255j);
            }
            if (!this.f44256k.equals("")) {
                m19599a += C3831b.m19599a(21, this.f44256k);
            }
            int i5 = this.f44257l;
            if (i5 != 0) {
                m19599a += C3831b.m19610c(22, i5);
            }
            a[] aVarArr = this.f44258m;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f44258m;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        m19599a += C3831b.m19598a(23, aVar);
                    }
                    i2++;
                }
            }
            return !this.f44259n.equals("") ? m19599a + C3831b.m19599a(24, this.f44259n) : m19599a;
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
                        this.f44247b = c3805a.m19561k();
                        break;
                    case 18:
                        this.f44248c = c3805a.m19561k();
                        break;
                    case 34:
                        this.f44249d = c3805a.m19561k();
                        break;
                    case 40:
                        this.f44250e = c3805a.m19558h();
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                        this.f44251f = c3805a.m19561k();
                        break;
                    case C4632R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                        this.f44252g = c3805a.m19561k();
                        break;
                    case 136:
                        this.f44253h = c3805a.m19549c();
                        break;
                    case 144:
                        this.f44254i = c3805a.m19558h();
                        break;
                    case 154:
                        this.f44255j = c3805a.m19561k();
                        break;
                    case 170:
                        this.f44256k = c3805a.m19561k();
                        break;
                    case 176:
                        this.f44257l = c3805a.m19558h();
                        break;
                    case 186:
                        int m19920a = C3961g.m19920a(c3805a, 186);
                        a[] aVarArr = this.f44258m;
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
                        this.f44258m = aVarArr2;
                        break;
                    case 194:
                        this.f44259n = c3805a.m19561k();
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

    public C3696Vf() {
        m19277b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        d[] dVarArr = this.f44230b;
        int i2 = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                d[] dVarArr2 = this.f44230b;
                if (i3 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i3];
                if (dVar != null) {
                    c3831b.m19615b(3, dVar);
                }
                i3++;
            }
        }
        c cVar = this.f44231c;
        if (cVar != null) {
            c3831b.m19615b(4, cVar);
        }
        a[] aVarArr = this.f44232d;
        if (aVarArr != null && aVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                a[] aVarArr2 = this.f44232d;
                if (i4 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i4];
                if (aVar != null) {
                    c3831b.m19615b(7, aVar);
                }
                i4++;
            }
        }
        e[] eVarArr = this.f44233e;
        if (eVarArr != null && eVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                e[] eVarArr2 = this.f44233e;
                if (i5 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i5];
                if (eVar != null) {
                    c3831b.m19615b(10, eVar);
                }
                i5++;
            }
        }
        String[] strArr = this.f44234f;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.f44234f;
            if (i2 >= strArr2.length) {
                return;
            }
            String str = strArr2[i2];
            if (str != null) {
                c3831b.m19616b(11, str);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public C3696Vf m19277b() {
        this.f44230b = d.m19284c();
        this.f44231c = null;
        this.f44232d = a.m19278c();
        this.f44233e = e.m19291c();
        this.f44234f = C3961g.f45150b;
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: d */
        private static volatile a[] f44235d;

        /* renamed from: b */
        public String f44236b;

        /* renamed from: c */
        public String f44237c;

        public a() {
            m19279b();
        }

        /* renamed from: c */
        public static a[] m19278c() {
            if (f44235d == null) {
                synchronized (C3857c.f44857a) {
                    if (f44235d == null) {
                        f44235d = new a[0];
                    }
                }
            }
            return f44235d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19616b(1, this.f44236b);
            c3831b.m19616b(2, this.f44237c);
        }

        /* renamed from: b */
        public a m19279b() {
            this.f44236b = "";
            this.f44237c = "";
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19599a(2, this.f44237c) + C3831b.m19599a(1, this.f44236b) + 0;
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
                    this.f44236b = c3805a.m19561k();
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f44237c = c3805a.m19561k();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$d */
    public static final class d extends AbstractC3909e {

        /* renamed from: e */
        private static volatile d[] f44263e;

        /* renamed from: b */
        public long f44264b;

        /* renamed from: c */
        public b f44265c;

        /* renamed from: d */
        public a[] f44266d;

        public d() {
            m19285b();
        }

        /* renamed from: c */
        public static d[] m19284c() {
            if (f44263e == null) {
                synchronized (C3857c.f44857a) {
                    if (f44263e == null) {
                        f44263e = new d[0];
                    }
                }
            }
            return f44263e;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19626e(1, this.f44264b);
            b bVar = this.f44265c;
            if (bVar != null) {
                c3831b.m19615b(2, bVar);
            }
            a[] aVarArr = this.f44266d;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                a[] aVarArr2 = this.f44266d;
                if (i2 >= aVarArr2.length) {
                    return;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    c3831b.m19615b(3, aVar);
                }
                i2++;
            }
        }

        /* renamed from: b */
        public d m19285b() {
            this.f44264b = 0L;
            this.f44265c = null;
            this.f44266d = a.m19286c();
            this.f44976a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Vf$d$a */
        public static final class a extends AbstractC3909e {

            /* renamed from: y */
            private static volatile a[] f44267y;

            /* renamed from: b */
            public long f44268b;

            /* renamed from: c */
            public long f44269c;

            /* renamed from: d */
            public int f44270d;

            /* renamed from: e */
            public String f44271e;

            /* renamed from: f */
            public byte[] f44272f;

            /* renamed from: g */
            public b f44273g;

            /* renamed from: h */
            public b f44274h;

            /* renamed from: i */
            public String f44275i;

            /* renamed from: j */
            public C6999a f44276j;

            /* renamed from: k */
            public int f44277k;

            /* renamed from: l */
            public int f44278l;

            /* renamed from: m */
            public int f44279m;

            /* renamed from: n */
            public byte[] f44280n;

            /* renamed from: o */
            public int f44281o;

            /* renamed from: p */
            public long f44282p;

            /* renamed from: q */
            public long f44283q;

            /* renamed from: r */
            public int f44284r;

            /* renamed from: s */
            public int f44285s;

            /* renamed from: t */
            public int f44286t;

            /* renamed from: u */
            public int f44287u;

            /* renamed from: v */
            public int f44288v;

            /* renamed from: w */
            public boolean f44289w;

            /* renamed from: x */
            public long f44290x;

            public a() {
                m19287b();
            }

            /* renamed from: c */
            public static a[] m19286c() {
                if (f44267y == null) {
                    synchronized (C3857c.f44857a) {
                        if (f44267y == null) {
                            f44267y = new a[0];
                        }
                    }
                }
                return f44267y;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                c3831b.m19626e(1, this.f44268b);
                c3831b.m19626e(2, this.f44269c);
                c3831b.m19627f(3, this.f44270d);
                if (!this.f44271e.equals("")) {
                    c3831b.m19616b(4, this.f44271e);
                }
                byte[] bArr = this.f44272f;
                byte[] bArr2 = C3961g.f45152d;
                if (!Arrays.equals(bArr, bArr2)) {
                    c3831b.m19618b(5, this.f44272f);
                }
                b bVar = this.f44273g;
                if (bVar != null) {
                    c3831b.m19615b(6, bVar);
                }
                b bVar2 = this.f44274h;
                if (bVar2 != null) {
                    c3831b.m19615b(7, bVar2);
                }
                if (!this.f44275i.equals("")) {
                    c3831b.m19616b(8, this.f44275i);
                }
                C6999a c6999a = this.f44276j;
                if (c6999a != null) {
                    c3831b.m19615b(9, c6999a);
                }
                int i2 = this.f44277k;
                if (i2 != 0) {
                    c3831b.m19627f(10, i2);
                }
                int i3 = this.f44278l;
                if (i3 != 0) {
                    c3831b.m19622d(12, i3);
                }
                int i4 = this.f44279m;
                if (i4 != -1) {
                    c3831b.m19622d(13, i4);
                }
                if (!Arrays.equals(this.f44280n, bArr2)) {
                    c3831b.m19618b(14, this.f44280n);
                }
                int i5 = this.f44281o;
                if (i5 != -1) {
                    c3831b.m19622d(15, i5);
                }
                long j2 = this.f44282p;
                if (j2 != 0) {
                    c3831b.m19626e(16, j2);
                }
                long j3 = this.f44283q;
                if (j3 != 0) {
                    c3831b.m19626e(17, j3);
                }
                int i6 = this.f44284r;
                if (i6 != 0) {
                    c3831b.m19622d(18, i6);
                }
                int i7 = this.f44285s;
                if (i7 != 0) {
                    c3831b.m19622d(19, i7);
                }
                int i8 = this.f44286t;
                if (i8 != -1) {
                    c3831b.m19622d(20, i8);
                }
                int i9 = this.f44287u;
                if (i9 != 0) {
                    c3831b.m19622d(21, i9);
                }
                int i10 = this.f44288v;
                if (i10 != 0) {
                    c3831b.m19622d(22, i10);
                }
                boolean z = this.f44289w;
                if (z) {
                    c3831b.m19617b(23, z);
                }
                long j4 = this.f44290x;
                if (j4 != 1) {
                    c3831b.m19626e(24, j4);
                }
            }

            /* renamed from: b */
            public a m19287b() {
                this.f44268b = 0L;
                this.f44269c = 0L;
                this.f44270d = 0;
                this.f44271e = "";
                byte[] bArr = C3961g.f45152d;
                this.f44272f = bArr;
                this.f44273g = null;
                this.f44274h = null;
                this.f44275i = "";
                this.f44276j = null;
                this.f44277k = 0;
                this.f44278l = 0;
                this.f44279m = -1;
                this.f44280n = bArr;
                this.f44281o = -1;
                this.f44282p = 0L;
                this.f44283q = 0L;
                this.f44284r = 0;
                this.f44285s = 0;
                this.f44286t = -1;
                this.f44287u = 0;
                this.f44288v = 0;
                this.f44289w = false;
                this.f44290x = 1L;
                this.f44976a = -1;
                return this;
            }

            /* renamed from: com.yandex.metrica.impl.ob.Vf$d$a$a, reason: collision with other inner class name */
            public static final class C6999a extends AbstractC3909e {

                /* renamed from: b */
                public String f44291b;

                /* renamed from: c */
                public String f44292c;

                /* renamed from: d */
                public String f44293d;

                public C6999a() {
                    m19288b();
                }

                @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                /* renamed from: a */
                public void mo18312a(C3831b c3831b) throws IOException {
                    c3831b.m19616b(1, this.f44291b);
                    if (!this.f44292c.equals("")) {
                        c3831b.m19616b(2, this.f44292c);
                    }
                    if (this.f44293d.equals("")) {
                        return;
                    }
                    c3831b.m19616b(3, this.f44293d);
                }

                /* renamed from: b */
                public C6999a m19288b() {
                    this.f44291b = "";
                    this.f44292c = "";
                    this.f44293d = "";
                    this.f44976a = -1;
                    return this;
                }

                @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                /* renamed from: a */
                public int mo18310a() {
                    int m19599a = C3831b.m19599a(1, this.f44291b) + 0;
                    if (!this.f44292c.equals("")) {
                        m19599a += C3831b.m19599a(2, this.f44292c);
                    }
                    return !this.f44293d.equals("") ? m19599a + C3831b.m19599a(3, this.f44293d) : m19599a;
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
                            this.f44291b = c3805a.m19561k();
                        } else if (m19562l == 18) {
                            this.f44292c = c3805a.m19561k();
                        } else if (m19562l != 26) {
                            if (!c3805a.m19555f(m19562l)) {
                                break;
                            }
                        } else {
                            this.f44293d = c3805a.m19561k();
                        }
                    }
                    return this;
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.Vf$d$a$b */
            public static final class b extends AbstractC3909e {

                /* renamed from: b */
                public C3646Tf[] f44294b;

                /* renamed from: c */
                public C3721Wf[] f44295c;

                /* renamed from: d */
                public int f44296d;

                /* renamed from: e */
                public String f44297e;

                public b() {
                    m19289b();
                }

                @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                /* renamed from: a */
                public void mo18312a(C3831b c3831b) throws IOException {
                    C3646Tf[] c3646TfArr = this.f44294b;
                    int i2 = 0;
                    if (c3646TfArr != null && c3646TfArr.length > 0) {
                        int i3 = 0;
                        while (true) {
                            C3646Tf[] c3646TfArr2 = this.f44294b;
                            if (i3 >= c3646TfArr2.length) {
                                break;
                            }
                            C3646Tf c3646Tf = c3646TfArr2[i3];
                            if (c3646Tf != null) {
                                c3831b.m19615b(1, c3646Tf);
                            }
                            i3++;
                        }
                    }
                    C3721Wf[] c3721WfArr = this.f44295c;
                    if (c3721WfArr != null && c3721WfArr.length > 0) {
                        while (true) {
                            C3721Wf[] c3721WfArr2 = this.f44295c;
                            if (i2 >= c3721WfArr2.length) {
                                break;
                            }
                            C3721Wf c3721Wf = c3721WfArr2[i2];
                            if (c3721Wf != null) {
                                c3831b.m19615b(2, c3721Wf);
                            }
                            i2++;
                        }
                    }
                    int i4 = this.f44296d;
                    if (i4 != 2) {
                        c3831b.m19622d(3, i4);
                    }
                    if (this.f44297e.equals("")) {
                        return;
                    }
                    c3831b.m19616b(4, this.f44297e);
                }

                /* renamed from: b */
                public b m19289b() {
                    this.f44294b = C3646Tf.m19164c();
                    this.f44295c = C3721Wf.m19358c();
                    this.f44296d = 2;
                    this.f44297e = "";
                    this.f44976a = -1;
                    return this;
                }

                @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                /* renamed from: a */
                public int mo18310a() {
                    int i2;
                    C3646Tf[] c3646TfArr = this.f44294b;
                    int i3 = 0;
                    if (c3646TfArr != null && c3646TfArr.length > 0) {
                        int i4 = 0;
                        i2 = 0;
                        while (true) {
                            C3646Tf[] c3646TfArr2 = this.f44294b;
                            if (i4 >= c3646TfArr2.length) {
                                break;
                            }
                            C3646Tf c3646Tf = c3646TfArr2[i4];
                            if (c3646Tf != null) {
                                i2 += C3831b.m19598a(1, c3646Tf);
                            }
                            i4++;
                        }
                    } else {
                        i2 = 0;
                    }
                    C3721Wf[] c3721WfArr = this.f44295c;
                    if (c3721WfArr != null && c3721WfArr.length > 0) {
                        while (true) {
                            C3721Wf[] c3721WfArr2 = this.f44295c;
                            if (i3 >= c3721WfArr2.length) {
                                break;
                            }
                            C3721Wf c3721Wf = c3721WfArr2[i3];
                            if (c3721Wf != null) {
                                i2 += C3831b.m19598a(2, c3721Wf);
                            }
                            i3++;
                        }
                    }
                    int i5 = this.f44296d;
                    if (i5 != 2) {
                        i2 += C3831b.m19596a(3, i5);
                    }
                    return !this.f44297e.equals("") ? i2 + C3831b.m19599a(4, this.f44297e) : i2;
                }

                @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
                /* renamed from: a */
                public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
                    while (true) {
                        int m19562l = c3805a.m19562l();
                        if (m19562l != 0) {
                            if (m19562l == 10) {
                                int m19920a = C3961g.m19920a(c3805a, 10);
                                C3646Tf[] c3646TfArr = this.f44294b;
                                int length = c3646TfArr == null ? 0 : c3646TfArr.length;
                                int i2 = m19920a + length;
                                C3646Tf[] c3646TfArr2 = new C3646Tf[i2];
                                if (length != 0) {
                                    System.arraycopy(c3646TfArr, 0, c3646TfArr2, 0, length);
                                }
                                while (length < i2 - 1) {
                                    c3646TfArr2[length] = new C3646Tf();
                                    c3805a.m19545a(c3646TfArr2[length]);
                                    c3805a.m19562l();
                                    length++;
                                }
                                c3646TfArr2[length] = new C3646Tf();
                                c3805a.m19545a(c3646TfArr2[length]);
                                this.f44294b = c3646TfArr2;
                            } else if (m19562l == 18) {
                                int m19920a2 = C3961g.m19920a(c3805a, 18);
                                C3721Wf[] c3721WfArr = this.f44295c;
                                int length2 = c3721WfArr == null ? 0 : c3721WfArr.length;
                                int i3 = m19920a2 + length2;
                                C3721Wf[] c3721WfArr2 = new C3721Wf[i3];
                                if (length2 != 0) {
                                    System.arraycopy(c3721WfArr, 0, c3721WfArr2, 0, length2);
                                }
                                while (length2 < i3 - 1) {
                                    c3721WfArr2[length2] = new C3721Wf();
                                    c3805a.m19545a(c3721WfArr2[length2]);
                                    c3805a.m19562l();
                                    length2++;
                                }
                                c3721WfArr2[length2] = new C3721Wf();
                                c3805a.m19545a(c3721WfArr2[length2]);
                                this.f44295c = c3721WfArr2;
                            } else if (m19562l == 24) {
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
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                        this.f44296d = m19558h;
                                        break;
                                }
                            } else if (m19562l != 34) {
                                if (!c3805a.m19555f(m19562l)) {
                                }
                            } else {
                                this.f44297e = c3805a.m19561k();
                            }
                        }
                    }
                    return this;
                }
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                int m19610c = C3831b.m19610c(3, this.f44270d) + C3831b.m19608b(2, this.f44269c) + C3831b.m19608b(1, this.f44268b) + 0;
                if (!this.f44271e.equals("")) {
                    m19610c += C3831b.m19599a(4, this.f44271e);
                }
                byte[] bArr = this.f44272f;
                byte[] bArr2 = C3961g.f45152d;
                if (!Arrays.equals(bArr, bArr2)) {
                    m19610c += C3831b.m19601a(5, this.f44272f);
                }
                b bVar = this.f44273g;
                if (bVar != null) {
                    m19610c += C3831b.m19598a(6, bVar);
                }
                b bVar2 = this.f44274h;
                if (bVar2 != null) {
                    m19610c += C3831b.m19598a(7, bVar2);
                }
                if (!this.f44275i.equals("")) {
                    m19610c += C3831b.m19599a(8, this.f44275i);
                }
                C6999a c6999a = this.f44276j;
                if (c6999a != null) {
                    m19610c += C3831b.m19598a(9, c6999a);
                }
                int i2 = this.f44277k;
                if (i2 != 0) {
                    m19610c += C3831b.m19610c(10, i2);
                }
                int i3 = this.f44278l;
                if (i3 != 0) {
                    m19610c += C3831b.m19596a(12, i3);
                }
                int i4 = this.f44279m;
                if (i4 != -1) {
                    m19610c += C3831b.m19596a(13, i4);
                }
                if (!Arrays.equals(this.f44280n, bArr2)) {
                    m19610c += C3831b.m19601a(14, this.f44280n);
                }
                int i5 = this.f44281o;
                if (i5 != -1) {
                    m19610c += C3831b.m19596a(15, i5);
                }
                long j2 = this.f44282p;
                if (j2 != 0) {
                    m19610c += C3831b.m19608b(16, j2);
                }
                long j3 = this.f44283q;
                if (j3 != 0) {
                    m19610c += C3831b.m19608b(17, j3);
                }
                int i6 = this.f44284r;
                if (i6 != 0) {
                    m19610c += C3831b.m19596a(18, i6);
                }
                int i7 = this.f44285s;
                if (i7 != 0) {
                    m19610c += C3831b.m19596a(19, i7);
                }
                int i8 = this.f44286t;
                if (i8 != -1) {
                    m19610c += C3831b.m19596a(20, i8);
                }
                int i9 = this.f44287u;
                if (i9 != 0) {
                    m19610c += C3831b.m19596a(21, i9);
                }
                int i10 = this.f44288v;
                if (i10 != 0) {
                    m19610c += C3831b.m19596a(22, i10);
                }
                boolean z = this.f44289w;
                if (z) {
                    m19610c += C3831b.m19600a(23, z);
                }
                long j4 = this.f44290x;
                return j4 != 1 ? m19610c + C3831b.m19608b(24, j4) : m19610c;
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
                            this.f44268b = c3805a.m19559i();
                            break;
                        case 16:
                            this.f44269c = c3805a.m19559i();
                            break;
                        case 24:
                            this.f44270d = c3805a.m19558h();
                            break;
                        case 34:
                            this.f44271e = c3805a.m19561k();
                            break;
                        case 42:
                            this.f44272f = c3805a.m19550d();
                            break;
                        case 50:
                            if (this.f44273g == null) {
                                this.f44273g = new b();
                            }
                            c3805a.m19545a(this.f44273g);
                            break;
                        case 58:
                            if (this.f44274h == null) {
                                this.f44274h = new b();
                            }
                            c3805a.m19545a(this.f44274h);
                            break;
                        case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            this.f44275i = c3805a.m19561k();
                            break;
                        case C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                            if (this.f44276j == null) {
                                this.f44276j = new C6999a();
                            }
                            c3805a.m19545a(this.f44276j);
                            break;
                        case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                            this.f44277k = c3805a.m19558h();
                            break;
                        case C4632R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                            int m19558h = c3805a.m19558h();
                            if (m19558h != 0 && m19558h != 1 && m19558h != 2) {
                                break;
                            } else {
                                this.f44278l = m19558h;
                                break;
                            }
                        case C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                            int m19558h2 = c3805a.m19558h();
                            if (m19558h2 != -1 && m19558h2 != 0 && m19558h2 != 1) {
                                break;
                            } else {
                                this.f44279m = m19558h2;
                                break;
                            }
                        case C4632R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                            this.f44280n = c3805a.m19550d();
                            break;
                        case C4632R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                            int m19558h3 = c3805a.m19558h();
                            if (m19558h3 != -1 && m19558h3 != 0 && m19558h3 != 1) {
                                break;
                            } else {
                                this.f44281o = m19558h3;
                                break;
                            }
                        case 128:
                            this.f44282p = c3805a.m19559i();
                            break;
                        case 136:
                            this.f44283q = c3805a.m19559i();
                            break;
                        case 144:
                            int m19558h4 = c3805a.m19558h();
                            if (m19558h4 != 0 && m19558h4 != 1 && m19558h4 != 2 && m19558h4 != 3 && m19558h4 != 4) {
                                break;
                            } else {
                                this.f44284r = m19558h4;
                                break;
                            }
                        case 152:
                            int m19558h5 = c3805a.m19558h();
                            if (m19558h5 != 0 && m19558h5 != 1 && m19558h5 != 2 && m19558h5 != 3) {
                                break;
                            } else {
                                this.f44285s = m19558h5;
                                break;
                            }
                        case 160:
                            int m19558h6 = c3805a.m19558h();
                            if (m19558h6 != -1 && m19558h6 != 0 && m19558h6 != 1) {
                                break;
                            } else {
                                this.f44286t = m19558h6;
                                break;
                            }
                        case 168:
                            int m19558h7 = c3805a.m19558h();
                            if (m19558h7 != 0 && m19558h7 != 1 && m19558h7 != 2 && m19558h7 != 3) {
                                break;
                            } else {
                                this.f44287u = m19558h7;
                                break;
                            }
                        case 176:
                            int m19558h8 = c3805a.m19558h();
                            if (m19558h8 != 0 && m19558h8 != 1) {
                                break;
                            } else {
                                this.f44288v = m19558h8;
                                break;
                            }
                        case 184:
                            this.f44289w = c3805a.m19549c();
                            break;
                        case 192:
                            this.f44290x = c3805a.m19559i();
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

        /* renamed from: com.yandex.metrica.impl.ob.Vf$d$b */
        public static final class b extends AbstractC3909e {

            /* renamed from: b */
            public f f44298b;

            /* renamed from: c */
            public String f44299c;

            /* renamed from: d */
            public int f44300d;

            public b() {
                m19290b();
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                f fVar = this.f44298b;
                if (fVar != null) {
                    c3831b.m19615b(1, fVar);
                }
                c3831b.m19616b(2, this.f44299c);
                int i2 = this.f44300d;
                if (i2 != 0) {
                    c3831b.m19622d(5, i2);
                }
            }

            /* renamed from: b */
            public b m19290b() {
                this.f44298b = null;
                this.f44299c = "";
                this.f44300d = 0;
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                f fVar = this.f44298b;
                int m19599a = C3831b.m19599a(2, this.f44299c) + (fVar != null ? 0 + C3831b.m19598a(1, fVar) : 0);
                int i2 = this.f44300d;
                return i2 != 0 ? m19599a + C3831b.m19596a(5, i2) : m19599a;
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
                        if (this.f44298b == null) {
                            this.f44298b = new f();
                        }
                        c3805a.m19545a(this.f44298b);
                    } else if (m19562l == 18) {
                        this.f44299c = c3805a.m19561k();
                    } else if (m19562l != 40) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        int m19558h = c3805a.m19558h();
                        if (m19558h == 0 || m19558h == 1 || m19558h == 2) {
                            this.f44300d = m19558h;
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
            int m19608b = C3831b.m19608b(1, this.f44264b) + 0;
            b bVar = this.f44265c;
            if (bVar != null) {
                m19608b += C3831b.m19598a(2, bVar);
            }
            a[] aVarArr = this.f44266d;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f44266d;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        m19608b += C3831b.m19598a(3, aVar);
                    }
                    i2++;
                }
            }
            return m19608b;
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
                    this.f44264b = c3805a.m19559i();
                } else if (m19562l == 18) {
                    if (this.f44265c == null) {
                        this.f44265c = new b();
                    }
                    c3805a.m19545a(this.f44265c);
                } else if (m19562l != 26) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19920a = C3961g.m19920a(c3805a, 26);
                    a[] aVarArr = this.f44266d;
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
                    this.f44266d = aVarArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$f */
    public static final class f extends AbstractC3909e {

        /* renamed from: b */
        public long f44306b;

        /* renamed from: c */
        public int f44307c;

        /* renamed from: d */
        public long f44308d;

        /* renamed from: e */
        public boolean f44309e;

        public f() {
            m19293b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19626e(1, this.f44306b);
            c3831b.m19625e(2, this.f44307c);
            long j2 = this.f44308d;
            if (j2 != 0) {
                c3831b.m19620c(3, j2);
            }
            boolean z = this.f44309e;
            if (z) {
                c3831b.m19617b(4, z);
            }
        }

        /* renamed from: b */
        public f m19293b() {
            this.f44306b = 0L;
            this.f44307c = 0;
            this.f44308d = 0L;
            this.f44309e = false;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19607b = C3831b.m19607b(2, this.f44307c) + C3831b.m19608b(1, this.f44306b) + 0;
            long j2 = this.f44308d;
            if (j2 != 0) {
                m19607b += C3831b.m19597a(3, j2);
            }
            boolean z = this.f44309e;
            return z ? m19607b + C3831b.m19600a(4, z) : m19607b;
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
                    this.f44306b = c3805a.m19559i();
                } else if (m19562l == 16) {
                    this.f44307c = c3805a.m19560j();
                } else if (m19562l == 24) {
                    this.f44308d = c3805a.m19559i();
                } else if (m19562l != 32) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f44309e = c3805a.m19549c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$e */
    public static final class e extends AbstractC3909e {

        /* renamed from: f */
        private static volatile e[] f44301f;

        /* renamed from: b */
        public int f44302b;

        /* renamed from: c */
        public int f44303c;

        /* renamed from: d */
        public String f44304d;

        /* renamed from: e */
        public boolean f44305e;

        public e() {
            m19292b();
        }

        /* renamed from: c */
        public static e[] m19291c() {
            if (f44301f == null) {
                synchronized (C3857c.f44857a) {
                    if (f44301f == null) {
                        f44301f = new e[0];
                    }
                }
            }
            return f44301f;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            int i2 = this.f44302b;
            if (i2 != 0) {
                c3831b.m19627f(1, i2);
            }
            int i3 = this.f44303c;
            if (i3 != 0) {
                c3831b.m19627f(2, i3);
            }
            if (!this.f44304d.equals("")) {
                c3831b.m19616b(3, this.f44304d);
            }
            boolean z = this.f44305e;
            if (z) {
                c3831b.m19617b(4, z);
            }
        }

        /* renamed from: b */
        public e m19292b() {
            this.f44302b = 0;
            this.f44303c = 0;
            this.f44304d = "";
            this.f44305e = false;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = this.f44302b;
            int m19610c = i2 != 0 ? 0 + C3831b.m19610c(1, i2) : 0;
            int i3 = this.f44303c;
            if (i3 != 0) {
                m19610c += C3831b.m19610c(2, i3);
            }
            if (!this.f44304d.equals("")) {
                m19610c += C3831b.m19599a(3, this.f44304d);
            }
            boolean z = this.f44305e;
            return z ? m19610c + C3831b.m19600a(4, z) : m19610c;
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
                    this.f44302b = c3805a.m19558h();
                } else if (m19562l == 16) {
                    this.f44303c = c3805a.m19558h();
                } else if (m19562l == 26) {
                    this.f44304d = c3805a.m19561k();
                } else if (m19562l != 32) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f44305e = c3805a.m19549c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$b */
    public static final class b extends AbstractC3909e {

        /* renamed from: b */
        public double f44238b;

        /* renamed from: c */
        public double f44239c;

        /* renamed from: d */
        public long f44240d;

        /* renamed from: e */
        public int f44241e;

        /* renamed from: f */
        public int f44242f;

        /* renamed from: g */
        public int f44243g;

        /* renamed from: h */
        public int f44244h;

        /* renamed from: i */
        public int f44245i;

        /* renamed from: j */
        public String f44246j;

        public b() {
            m19280b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19614b(1, this.f44238b);
            c3831b.m19614b(2, this.f44239c);
            long j2 = this.f44240d;
            if (j2 != 0) {
                c3831b.m19626e(3, j2);
            }
            int i2 = this.f44241e;
            if (i2 != 0) {
                c3831b.m19627f(4, i2);
            }
            int i3 = this.f44242f;
            if (i3 != 0) {
                c3831b.m19627f(5, i3);
            }
            int i4 = this.f44243g;
            if (i4 != 0) {
                c3831b.m19627f(6, i4);
            }
            int i5 = this.f44244h;
            if (i5 != 0) {
                c3831b.m19622d(7, i5);
            }
            int i6 = this.f44245i;
            if (i6 != 0) {
                c3831b.m19622d(8, i6);
            }
            if (this.f44246j.equals("")) {
                return;
            }
            c3831b.m19616b(9, this.f44246j);
        }

        /* renamed from: b */
        public b m19280b() {
            this.f44238b = 0.0d;
            this.f44239c = 0.0d;
            this.f44240d = 0L;
            this.f44241e = 0;
            this.f44242f = 0;
            this.f44243g = 0;
            this.f44244h = 0;
            this.f44245i = 0;
            this.f44246j = "";
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19595a = C3831b.m19595a(2, this.f44239c) + C3831b.m19595a(1, this.f44238b) + 0;
            long j2 = this.f44240d;
            if (j2 != 0) {
                m19595a += C3831b.m19608b(3, j2);
            }
            int i2 = this.f44241e;
            if (i2 != 0) {
                m19595a += C3831b.m19610c(4, i2);
            }
            int i3 = this.f44242f;
            if (i3 != 0) {
                m19595a += C3831b.m19610c(5, i3);
            }
            int i4 = this.f44243g;
            if (i4 != 0) {
                m19595a += C3831b.m19610c(6, i4);
            }
            int i5 = this.f44244h;
            if (i5 != 0) {
                m19595a += C3831b.m19596a(7, i5);
            }
            int i6 = this.f44245i;
            if (i6 != 0) {
                m19595a += C3831b.m19596a(8, i6);
            }
            return !this.f44246j.equals("") ? m19595a + C3831b.m19599a(9, this.f44246j) : m19595a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 9) {
                    this.f44238b = Double.longBitsToDouble(c3805a.m19556g());
                } else if (m19562l == 17) {
                    this.f44239c = Double.longBitsToDouble(c3805a.m19556g());
                } else if (m19562l == 24) {
                    this.f44240d = c3805a.m19559i();
                } else if (m19562l == 32) {
                    this.f44241e = c3805a.m19558h();
                } else if (m19562l == 40) {
                    this.f44242f = c3805a.m19558h();
                } else if (m19562l == 48) {
                    this.f44243g = c3805a.m19558h();
                } else if (m19562l == 56) {
                    this.f44244h = c3805a.m19558h();
                } else if (m19562l == 64) {
                    int m19558h = c3805a.m19558h();
                    if (m19558h == 0 || m19558h == 1 || m19558h == 2) {
                        this.f44245i = m19558h;
                    }
                } else if (m19562l != 74) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f44246j = c3805a.m19561k();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2;
        d[] dVarArr = this.f44230b;
        int i3 = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i4 = 0;
            i2 = 0;
            while (true) {
                d[] dVarArr2 = this.f44230b;
                if (i4 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i4];
                if (dVar != null) {
                    i2 += C3831b.m19598a(3, dVar);
                }
                i4++;
            }
        } else {
            i2 = 0;
        }
        c cVar = this.f44231c;
        if (cVar != null) {
            i2 += C3831b.m19598a(4, cVar);
        }
        a[] aVarArr = this.f44232d;
        if (aVarArr != null && aVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                a[] aVarArr2 = this.f44232d;
                if (i5 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i5];
                if (aVar != null) {
                    i2 = C3831b.m19598a(7, aVar) + i2;
                }
                i5++;
            }
        }
        e[] eVarArr = this.f44233e;
        if (eVarArr != null && eVarArr.length > 0) {
            int i6 = 0;
            while (true) {
                e[] eVarArr2 = this.f44233e;
                if (i6 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i6];
                if (eVar != null) {
                    i2 += C3831b.m19598a(10, eVar);
                }
                i6++;
            }
        }
        String[] strArr = this.f44234f;
        if (strArr == null || strArr.length <= 0) {
            return i2;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            String[] strArr2 = this.f44234f;
            if (i3 >= strArr2.length) {
                return i2 + i7 + (i8 * 1);
            }
            String str = strArr2[i3];
            if (str != null) {
                i8++;
                i7 = C3831b.m19604a(str) + i7;
            }
            i3++;
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
            if (m19562l == 26) {
                int m19920a = C3961g.m19920a(c3805a, 26);
                d[] dVarArr = this.f44230b;
                int length = dVarArr == null ? 0 : dVarArr.length;
                int i2 = m19920a + length;
                d[] dVarArr2 = new d[i2];
                if (length != 0) {
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    dVarArr2[length] = new d();
                    c3805a.m19545a(dVarArr2[length]);
                    c3805a.m19562l();
                    length++;
                }
                dVarArr2[length] = new d();
                c3805a.m19545a(dVarArr2[length]);
                this.f44230b = dVarArr2;
            } else if (m19562l == 34) {
                if (this.f44231c == null) {
                    this.f44231c = new c();
                }
                c3805a.m19545a(this.f44231c);
            } else if (m19562l == 58) {
                int m19920a2 = C3961g.m19920a(c3805a, 58);
                a[] aVarArr = this.f44232d;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i3 = m19920a2 + length2;
                a[] aVarArr2 = new a[i3];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    aVarArr2[length2] = new a();
                    c3805a.m19545a(aVarArr2[length2]);
                    c3805a.m19562l();
                    length2++;
                }
                aVarArr2[length2] = new a();
                c3805a.m19545a(aVarArr2[length2]);
                this.f44232d = aVarArr2;
            } else if (m19562l == 82) {
                int m19920a3 = C3961g.m19920a(c3805a, 82);
                e[] eVarArr = this.f44233e;
                int length3 = eVarArr == null ? 0 : eVarArr.length;
                int i4 = m19920a3 + length3;
                e[] eVarArr2 = new e[i4];
                if (length3 != 0) {
                    System.arraycopy(eVarArr, 0, eVarArr2, 0, length3);
                }
                while (length3 < i4 - 1) {
                    eVarArr2[length3] = new e();
                    c3805a.m19545a(eVarArr2[length3]);
                    c3805a.m19562l();
                    length3++;
                }
                eVarArr2[length3] = new e();
                c3805a.m19545a(eVarArr2[length3]);
                this.f44233e = eVarArr2;
            } else if (m19562l != 90) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19920a4 = C3961g.m19920a(c3805a, 90);
                String[] strArr = this.f44234f;
                int length4 = strArr == null ? 0 : strArr.length;
                int i5 = m19920a4 + length4;
                String[] strArr2 = new String[i5];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i5 - 1) {
                    strArr2[length4] = c3805a.m19561k();
                    c3805a.m19562l();
                    length4++;
                }
                strArr2[length4] = c3805a.m19561k();
                this.f44234f = strArr2;
            }
        }
        return this;
    }
}
