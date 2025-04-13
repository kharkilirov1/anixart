package com.yandex.metrica.impl.p023ob;

import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Lf */
/* loaded from: classes2.dex */
public final class C3447Lf extends AbstractC3909e {

    /* renamed from: l */
    private static byte[] f43336l;

    /* renamed from: m */
    private static volatile boolean f43337m;

    /* renamed from: b */
    public C3572Qf f43338b;

    /* renamed from: c */
    public C3372If f43339c;

    /* renamed from: d */
    public String f43340d;

    /* renamed from: e */
    public int f43341e;

    /* renamed from: f */
    public C3522Of[] f43342f;

    /* renamed from: g */
    public int f43343g;

    /* renamed from: h */
    public a f43344h;

    /* renamed from: i */
    public byte[] f43345i;

    /* renamed from: j */
    public byte[] f43346j;

    /* renamed from: k */
    public C3422Kf[] f43347k;

    public C3447Lf() {
        if (!f43337m) {
            synchronized (C3857c.f44857a) {
                if (!f43337m) {
                    f43336l = C3857c.m19666a("JVM");
                    f43337m = true;
                }
            }
        }
        m18507b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        C3572Qf c3572Qf = this.f43338b;
        if (c3572Qf != null) {
            c3831b.m19615b(1, c3572Qf);
        }
        C3372If c3372If = this.f43339c;
        if (c3372If != null) {
            c3831b.m19615b(2, c3372If);
        }
        if (!this.f43340d.equals("")) {
            c3831b.m19616b(3, this.f43340d);
        }
        int i2 = this.f43341e;
        if (i2 != -1) {
            c3831b.m19622d(4, i2);
        }
        C3522Of[] c3522OfArr = this.f43342f;
        int i3 = 0;
        if (c3522OfArr != null && c3522OfArr.length > 0) {
            int i4 = 0;
            while (true) {
                C3522Of[] c3522OfArr2 = this.f43342f;
                if (i4 >= c3522OfArr2.length) {
                    break;
                }
                C3522Of c3522Of = c3522OfArr2[i4];
                if (c3522Of != null) {
                    c3831b.m19615b(5, c3522Of);
                }
                i4++;
            }
        }
        int i5 = this.f43343g;
        if (i5 != 0) {
            c3831b.m19622d(6, i5);
        }
        a aVar = this.f43344h;
        if (aVar != null) {
            c3831b.m19615b(7, aVar);
        }
        if (!Arrays.equals(this.f43345i, f43336l)) {
            c3831b.m19618b(8, this.f43345i);
        }
        if (!Arrays.equals(this.f43346j, C3961g.f45152d)) {
            c3831b.m19618b(9, this.f43346j);
        }
        C3422Kf[] c3422KfArr = this.f43347k;
        if (c3422KfArr == null || c3422KfArr.length <= 0) {
            return;
        }
        while (true) {
            C3422Kf[] c3422KfArr2 = this.f43347k;
            if (i3 >= c3422KfArr2.length) {
                return;
            }
            C3422Kf c3422Kf = c3422KfArr2[i3];
            if (c3422Kf != null) {
                c3831b.m19615b(10, c3422Kf);
            }
            i3++;
        }
    }

    /* renamed from: b */
    public C3447Lf m18507b() {
        this.f43338b = null;
        this.f43339c = null;
        this.f43340d = "";
        this.f43341e = -1;
        this.f43342f = C3522Of.m18669c();
        this.f43343g = 0;
        this.f43344h = null;
        this.f43345i = (byte[]) f43336l.clone();
        this.f43346j = C3961g.f45152d;
        this.f43347k = C3422Kf.m18446c();
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Lf$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: b */
        public byte[] f43348b;

        /* renamed from: c */
        public C3497Nf f43349c;

        public a() {
            m18508b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            if (!Arrays.equals(this.f43348b, C3961g.f45152d)) {
                c3831b.m19618b(1, this.f43348b);
            }
            C3497Nf c3497Nf = this.f43349c;
            if (c3497Nf != null) {
                c3831b.m19615b(2, c3497Nf);
            }
        }

        /* renamed from: b */
        public a m18508b() {
            this.f43348b = C3961g.f45152d;
            this.f43349c = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19601a = Arrays.equals(this.f43348b, C3961g.f45152d) ? 0 : 0 + C3831b.m19601a(1, this.f43348b);
            C3497Nf c3497Nf = this.f43349c;
            return c3497Nf != null ? m19601a + C3831b.m19598a(2, c3497Nf) : m19601a;
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
                    this.f43348b = c3805a.m19550d();
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f43349c == null) {
                        this.f43349c = new C3497Nf();
                    }
                    c3805a.m19545a(this.f43349c);
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        C3572Qf c3572Qf = this.f43338b;
        int i2 = 0;
        int m19598a = c3572Qf != null ? C3831b.m19598a(1, c3572Qf) + 0 : 0;
        C3372If c3372If = this.f43339c;
        if (c3372If != null) {
            m19598a += C3831b.m19598a(2, c3372If);
        }
        if (!this.f43340d.equals("")) {
            m19598a += C3831b.m19599a(3, this.f43340d);
        }
        int i3 = this.f43341e;
        if (i3 != -1) {
            m19598a += C3831b.m19596a(4, i3);
        }
        C3522Of[] c3522OfArr = this.f43342f;
        if (c3522OfArr != null && c3522OfArr.length > 0) {
            int i4 = 0;
            while (true) {
                C3522Of[] c3522OfArr2 = this.f43342f;
                if (i4 >= c3522OfArr2.length) {
                    break;
                }
                C3522Of c3522Of = c3522OfArr2[i4];
                if (c3522Of != null) {
                    m19598a += C3831b.m19598a(5, c3522Of);
                }
                i4++;
            }
        }
        int i5 = this.f43343g;
        if (i5 != 0) {
            m19598a += C3831b.m19596a(6, i5);
        }
        a aVar = this.f43344h;
        if (aVar != null) {
            m19598a += C3831b.m19598a(7, aVar);
        }
        if (!Arrays.equals(this.f43345i, f43336l)) {
            m19598a += C3831b.m19601a(8, this.f43345i);
        }
        if (!Arrays.equals(this.f43346j, C3961g.f45152d)) {
            m19598a += C3831b.m19601a(9, this.f43346j);
        }
        C3422Kf[] c3422KfArr = this.f43347k;
        if (c3422KfArr != null && c3422KfArr.length > 0) {
            while (true) {
                C3422Kf[] c3422KfArr2 = this.f43347k;
                if (i2 >= c3422KfArr2.length) {
                    break;
                }
                C3422Kf c3422Kf = c3422KfArr2[i2];
                if (c3422Kf != null) {
                    m19598a += C3831b.m19598a(10, c3422Kf);
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
            switch (m19562l) {
                case 0:
                    break;
                case 10:
                    if (this.f43338b == null) {
                        this.f43338b = new C3572Qf();
                    }
                    c3805a.m19545a(this.f43338b);
                    break;
                case 18:
                    if (this.f43339c == null) {
                        this.f43339c = new C3372If();
                    }
                    c3805a.m19545a(this.f43339c);
                    break;
                case 26:
                    this.f43340d = c3805a.m19561k();
                    break;
                case 32:
                    int m19558h = c3805a.m19558h();
                    if (m19558h != -1 && m19558h != 0 && m19558h != 1) {
                        break;
                    } else {
                        this.f43341e = m19558h;
                        break;
                    }
                    break;
                case 42:
                    int m19920a = C3961g.m19920a(c3805a, 42);
                    C3522Of[] c3522OfArr = this.f43342f;
                    int length = c3522OfArr == null ? 0 : c3522OfArr.length;
                    int i2 = m19920a + length;
                    C3522Of[] c3522OfArr2 = new C3522Of[i2];
                    if (length != 0) {
                        System.arraycopy(c3522OfArr, 0, c3522OfArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        c3522OfArr2[length] = new C3522Of();
                        c3805a.m19545a(c3522OfArr2[length]);
                        c3805a.m19562l();
                        length++;
                    }
                    c3522OfArr2[length] = new C3522Of();
                    c3805a.m19545a(c3522OfArr2[length]);
                    this.f43342f = c3522OfArr2;
                    break;
                case 48:
                    int m19558h2 = c3805a.m19558h();
                    if (m19558h2 != 0 && m19558h2 != 1) {
                        break;
                    } else {
                        this.f43343g = m19558h2;
                        break;
                    }
                case 58:
                    if (this.f43344h == null) {
                        this.f43344h = new a();
                    }
                    c3805a.m19545a(this.f43344h);
                    break;
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    this.f43345i = c3805a.m19550d();
                    break;
                case C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                    this.f43346j = c3805a.m19550d();
                    break;
                case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                    int m19920a2 = C3961g.m19920a(c3805a, 82);
                    C3422Kf[] c3422KfArr = this.f43347k;
                    int length2 = c3422KfArr == null ? 0 : c3422KfArr.length;
                    int i3 = m19920a2 + length2;
                    C3422Kf[] c3422KfArr2 = new C3422Kf[i3];
                    if (length2 != 0) {
                        System.arraycopy(c3422KfArr, 0, c3422KfArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        c3422KfArr2[length2] = new C3422Kf();
                        c3805a.m19545a(c3422KfArr2[length2]);
                        c3805a.m19562l();
                        length2++;
                    }
                    c3422KfArr2[length2] = new C3422Kf();
                    c3805a.m19545a(c3422KfArr2[length2]);
                    this.f43347k = c3422KfArr2;
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
