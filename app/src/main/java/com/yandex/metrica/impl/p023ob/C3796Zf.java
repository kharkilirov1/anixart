package com.yandex.metrica.impl.p023ob;

import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Zf */
/* loaded from: classes2.dex */
public final class C3796Zf extends AbstractC3909e {

    /* renamed from: b */
    public int f44650b;

    /* renamed from: c */
    public double f44651c;

    /* renamed from: d */
    public byte[] f44652d;

    /* renamed from: e */
    public byte[] f44653e;

    /* renamed from: f */
    public byte[] f44654f;

    /* renamed from: g */
    public a f44655g;

    /* renamed from: h */
    public long f44656h;

    /* renamed from: i */
    public boolean f44657i;

    /* renamed from: j */
    public int f44658j;

    /* renamed from: k */
    public int f44659k;

    /* renamed from: l */
    public c f44660l;

    /* renamed from: m */
    public b f44661m;

    public C3796Zf() {
        m19511b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        int i2 = this.f44650b;
        if (i2 != 1) {
            c3831b.m19627f(1, i2);
        }
        if (Double.doubleToLongBits(this.f44651c) != Double.doubleToLongBits(0.0d)) {
            c3831b.m19614b(2, this.f44651c);
        }
        c3831b.m19618b(3, this.f44652d);
        byte[] bArr = this.f44653e;
        byte[] bArr2 = C3961g.f45152d;
        if (!Arrays.equals(bArr, bArr2)) {
            c3831b.m19618b(4, this.f44653e);
        }
        if (!Arrays.equals(this.f44654f, bArr2)) {
            c3831b.m19618b(5, this.f44654f);
        }
        a aVar = this.f44655g;
        if (aVar != null) {
            c3831b.m19615b(6, aVar);
        }
        long j2 = this.f44656h;
        if (j2 != 0) {
            c3831b.m19620c(7, j2);
        }
        boolean z = this.f44657i;
        if (z) {
            c3831b.m19617b(8, z);
        }
        int i3 = this.f44658j;
        if (i3 != 0) {
            c3831b.m19622d(9, i3);
        }
        int i4 = this.f44659k;
        if (i4 != 1) {
            c3831b.m19622d(10, i4);
        }
        c cVar = this.f44660l;
        if (cVar != null) {
            c3831b.m19615b(11, cVar);
        }
        b bVar = this.f44661m;
        if (bVar != null) {
            c3831b.m19615b(12, bVar);
        }
    }

    /* renamed from: b */
    public C3796Zf m19511b() {
        this.f44650b = 1;
        this.f44651c = 0.0d;
        byte[] bArr = C3961g.f45152d;
        this.f44652d = bArr;
        this.f44653e = bArr;
        this.f44654f = bArr;
        this.f44655g = null;
        this.f44656h = 0L;
        this.f44657i = false;
        this.f44658j = 0;
        this.f44659k = 1;
        this.f44660l = null;
        this.f44661m = null;
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zf$b */
    public static final class b extends AbstractC3909e {

        /* renamed from: b */
        public boolean f44664b;

        /* renamed from: c */
        public C7000b f44665c;

        /* renamed from: d */
        public a f44666d;

        public b() {
            m19513b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            boolean z = this.f44664b;
            if (z) {
                c3831b.m19617b(1, z);
            }
            C7000b c7000b = this.f44665c;
            if (c7000b != null) {
                c3831b.m19615b(2, c7000b);
            }
            a aVar = this.f44666d;
            if (aVar != null) {
                c3831b.m19615b(3, aVar);
            }
        }

        /* renamed from: b */
        public b m19513b() {
            this.f44664b = false;
            this.f44665c = null;
            this.f44666d = null;
            this.f44976a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Zf$b$b, reason: collision with other inner class name */
        public static final class C7000b extends AbstractC3909e {

            /* renamed from: b */
            public int f44671b;

            /* renamed from: c */
            public int f44672c;

            public C7000b() {
                m19515b();
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                int i2 = this.f44671b;
                if (i2 != 0) {
                    c3831b.m19627f(1, i2);
                }
                int i3 = this.f44672c;
                if (i3 != 0) {
                    c3831b.m19622d(2, i3);
                }
            }

            /* renamed from: b */
            public C7000b m19515b() {
                this.f44671b = 0;
                this.f44672c = 0;
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                int i2 = this.f44671b;
                int m19610c = i2 != 0 ? 0 + C3831b.m19610c(1, i2) : 0;
                int i3 = this.f44672c;
                return i3 != 0 ? m19610c + C3831b.m19596a(2, i3) : m19610c;
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
                        this.f44671b = c3805a.m19558h();
                    } else if (m19562l != 16) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        int m19558h = c3805a.m19558h();
                        if (m19558h == 0 || m19558h == 1 || m19558h == 2 || m19558h == 3 || m19558h == 4) {
                            this.f44672c = m19558h;
                        }
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            boolean z = this.f44664b;
            int m19600a = z ? 0 + C3831b.m19600a(1, z) : 0;
            C7000b c7000b = this.f44665c;
            if (c7000b != null) {
                m19600a += C3831b.m19598a(2, c7000b);
            }
            a aVar = this.f44666d;
            return aVar != null ? m19600a + C3831b.m19598a(3, aVar) : m19600a;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Zf$b$a */
        public static final class a extends AbstractC3909e {

            /* renamed from: b */
            public long f44667b;

            /* renamed from: c */
            public C7000b f44668c;

            /* renamed from: d */
            public int f44669d;

            /* renamed from: e */
            public byte[] f44670e;

            public a() {
                m19514b();
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                long j2 = this.f44667b;
                if (j2 != 0) {
                    c3831b.m19620c(1, j2);
                }
                C7000b c7000b = this.f44668c;
                if (c7000b != null) {
                    c3831b.m19615b(2, c7000b);
                }
                int i2 = this.f44669d;
                if (i2 != 0) {
                    c3831b.m19627f(3, i2);
                }
                if (Arrays.equals(this.f44670e, C3961g.f45152d)) {
                    return;
                }
                c3831b.m19618b(4, this.f44670e);
            }

            /* renamed from: b */
            public a m19514b() {
                this.f44667b = 0L;
                this.f44668c = null;
                this.f44669d = 0;
                this.f44670e = C3961g.f45152d;
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                long j2 = this.f44667b;
                int m19597a = j2 != 0 ? 0 + C3831b.m19597a(1, j2) : 0;
                C7000b c7000b = this.f44668c;
                if (c7000b != null) {
                    m19597a += C3831b.m19598a(2, c7000b);
                }
                int i2 = this.f44669d;
                if (i2 != 0) {
                    m19597a += C3831b.m19610c(3, i2);
                }
                return !Arrays.equals(this.f44670e, C3961g.f45152d) ? m19597a + C3831b.m19601a(4, this.f44670e) : m19597a;
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
                        this.f44667b = c3805a.m19559i();
                    } else if (m19562l == 18) {
                        if (this.f44668c == null) {
                            this.f44668c = new C7000b();
                        }
                        c3805a.m19545a(this.f44668c);
                    } else if (m19562l == 24) {
                        this.f44669d = c3805a.m19558h();
                    } else if (m19562l != 34) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        this.f44670e = c3805a.m19550d();
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
                if (m19562l == 8) {
                    this.f44664b = c3805a.m19549c();
                } else if (m19562l == 18) {
                    if (this.f44665c == null) {
                        this.f44665c = new C7000b();
                    }
                    c3805a.m19545a(this.f44665c);
                } else if (m19562l != 26) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f44666d == null) {
                        this.f44666d = new a();
                    }
                    c3805a.m19545a(this.f44666d);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zf$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: b */
        public byte[] f44662b;

        /* renamed from: c */
        public byte[] f44663c;

        public a() {
            m19512b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            byte[] bArr = this.f44662b;
            byte[] bArr2 = C3961g.f45152d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3831b.m19618b(1, this.f44662b);
            }
            if (Arrays.equals(this.f44663c, bArr2)) {
                return;
            }
            c3831b.m19618b(2, this.f44663c);
        }

        /* renamed from: b */
        public a m19512b() {
            byte[] bArr = C3961g.f45152d;
            this.f44662b = bArr;
            this.f44663c = bArr;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            byte[] bArr = this.f44662b;
            byte[] bArr2 = C3961g.f45152d;
            int m19601a = Arrays.equals(bArr, bArr2) ? 0 : 0 + C3831b.m19601a(1, this.f44662b);
            return !Arrays.equals(this.f44663c, bArr2) ? m19601a + C3831b.m19601a(2, this.f44663c) : m19601a;
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
                    this.f44662b = c3805a.m19550d();
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f44663c = c3805a.m19550d();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zf$c */
    public static final class c extends AbstractC3909e {

        /* renamed from: b */
        public byte[] f44673b;

        /* renamed from: c */
        public long f44674c;

        /* renamed from: d */
        public int f44675d;

        /* renamed from: e */
        public byte[] f44676e;

        /* renamed from: f */
        public long f44677f;

        public c() {
            m19516b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            byte[] bArr = this.f44673b;
            byte[] bArr2 = C3961g.f45152d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3831b.m19618b(1, this.f44673b);
            }
            long j2 = this.f44674c;
            if (j2 != 0) {
                c3831b.m19626e(2, j2);
            }
            int i2 = this.f44675d;
            if (i2 != 0) {
                c3831b.m19622d(3, i2);
            }
            if (!Arrays.equals(this.f44676e, bArr2)) {
                c3831b.m19618b(4, this.f44676e);
            }
            long j3 = this.f44677f;
            if (j3 != 0) {
                c3831b.m19626e(5, j3);
            }
        }

        /* renamed from: b */
        public c m19516b() {
            byte[] bArr = C3961g.f45152d;
            this.f44673b = bArr;
            this.f44674c = 0L;
            this.f44675d = 0;
            this.f44676e = bArr;
            this.f44677f = 0L;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            byte[] bArr = this.f44673b;
            byte[] bArr2 = C3961g.f45152d;
            int m19601a = Arrays.equals(bArr, bArr2) ? 0 : 0 + C3831b.m19601a(1, this.f44673b);
            long j2 = this.f44674c;
            if (j2 != 0) {
                m19601a += C3831b.m19608b(2, j2);
            }
            int i2 = this.f44675d;
            if (i2 != 0) {
                m19601a += C3831b.m19596a(3, i2);
            }
            if (!Arrays.equals(this.f44676e, bArr2)) {
                m19601a += C3831b.m19601a(4, this.f44676e);
            }
            long j3 = this.f44677f;
            return j3 != 0 ? m19601a + C3831b.m19608b(5, j3) : m19601a;
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
                    this.f44673b = c3805a.m19550d();
                } else if (m19562l == 16) {
                    this.f44674c = c3805a.m19559i();
                } else if (m19562l == 24) {
                    int m19558h = c3805a.m19558h();
                    if (m19558h == 0 || m19558h == 1 || m19558h == 2) {
                        this.f44675d = m19558h;
                    }
                } else if (m19562l == 34) {
                    this.f44676e = c3805a.m19550d();
                } else if (m19562l != 40) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f44677f = c3805a.m19559i();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2 = this.f44650b;
        int m19610c = i2 != 1 ? 0 + C3831b.m19610c(1, i2) : 0;
        if (Double.doubleToLongBits(this.f44651c) != Double.doubleToLongBits(0.0d)) {
            m19610c += C3831b.m19595a(2, this.f44651c);
        }
        int m19601a = C3831b.m19601a(3, this.f44652d) + m19610c;
        byte[] bArr = this.f44653e;
        byte[] bArr2 = C3961g.f45152d;
        if (!Arrays.equals(bArr, bArr2)) {
            m19601a += C3831b.m19601a(4, this.f44653e);
        }
        if (!Arrays.equals(this.f44654f, bArr2)) {
            m19601a += C3831b.m19601a(5, this.f44654f);
        }
        a aVar = this.f44655g;
        if (aVar != null) {
            m19601a += C3831b.m19598a(6, aVar);
        }
        long j2 = this.f44656h;
        if (j2 != 0) {
            m19601a += C3831b.m19597a(7, j2);
        }
        boolean z = this.f44657i;
        if (z) {
            m19601a += C3831b.m19600a(8, z);
        }
        int i3 = this.f44658j;
        if (i3 != 0) {
            m19601a += C3831b.m19596a(9, i3);
        }
        int i4 = this.f44659k;
        if (i4 != 1) {
            m19601a += C3831b.m19596a(10, i4);
        }
        c cVar = this.f44660l;
        if (cVar != null) {
            m19601a += C3831b.m19598a(11, cVar);
        }
        b bVar = this.f44661m;
        return bVar != null ? m19601a + C3831b.m19598a(12, bVar) : m19601a;
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
                    this.f44650b = c3805a.m19558h();
                    break;
                case 17:
                    this.f44651c = Double.longBitsToDouble(c3805a.m19556g());
                    break;
                case 26:
                    this.f44652d = c3805a.m19550d();
                    break;
                case 34:
                    this.f44653e = c3805a.m19550d();
                    break;
                case 42:
                    this.f44654f = c3805a.m19550d();
                    break;
                case 50:
                    if (this.f44655g == null) {
                        this.f44655g = new a();
                    }
                    c3805a.m19545a(this.f44655g);
                    break;
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    this.f44656h = c3805a.m19559i();
                    break;
                case 64:
                    this.f44657i = c3805a.m19549c();
                    break;
                case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    int m19558h = c3805a.m19558h();
                    if (m19558h != 0 && m19558h != 1 && m19558h != 2) {
                        break;
                    } else {
                        this.f44658j = m19558h;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    int m19558h2 = c3805a.m19558h();
                    if (m19558h2 != 1 && m19558h2 != 2) {
                        break;
                    } else {
                        this.f44659k = m19558h2;
                        break;
                    }
                case 90:
                    if (this.f44660l == null) {
                        this.f44660l = new c();
                    }
                    c3805a.m19545a(this.f44660l);
                    break;
                case C4632R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                    if (this.f44661m == null) {
                        this.f44661m = new b();
                    }
                    c3805a.m19545a(this.f44661m);
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
