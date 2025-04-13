package com.yandex.metrica.impl.p023ob;

import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Mf */
/* loaded from: classes2.dex */
public final class C3472Mf extends AbstractC3909e {

    /* renamed from: m */
    private static byte[] f43430m;

    /* renamed from: n */
    private static volatile boolean f43431n;

    /* renamed from: b */
    public C3572Qf f43432b;

    /* renamed from: c */
    public C3372If f43433c;

    /* renamed from: d */
    public String f43434d;

    /* renamed from: e */
    public int f43435e;

    /* renamed from: f */
    public C3522Of[] f43436f;

    /* renamed from: g */
    public String f43437g;

    /* renamed from: h */
    public int f43438h;

    /* renamed from: i */
    public a f43439i;

    /* renamed from: j */
    public byte[] f43440j;

    /* renamed from: k */
    public byte[] f43441k;

    /* renamed from: l */
    public C3422Kf[] f43442l;

    /* renamed from: com.yandex.metrica.impl.ob.Mf$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: b */
        public String f43443b;

        public a() {
            m18594b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19616b(1, this.f43443b);
        }

        /* renamed from: b */
        public a m18594b() {
            this.f43443b = "";
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19599a(1, this.f43443b) + 0;
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
                    this.f43443b = c3805a.m19561k();
                }
            }
            return this;
        }
    }

    public C3472Mf() {
        if (!f43431n) {
            synchronized (C3857c.f44857a) {
                if (!f43431n) {
                    f43430m = C3857c.m19666a("JVM");
                    f43431n = true;
                }
            }
        }
        m18593b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        C3572Qf c3572Qf = this.f43432b;
        if (c3572Qf != null) {
            c3831b.m19615b(1, c3572Qf);
        }
        C3372If c3372If = this.f43433c;
        if (c3372If != null) {
            c3831b.m19615b(2, c3372If);
        }
        if (!this.f43434d.equals("")) {
            c3831b.m19616b(3, this.f43434d);
        }
        int i2 = this.f43435e;
        if (i2 != -1) {
            c3831b.m19622d(4, i2);
        }
        C3522Of[] c3522OfArr = this.f43436f;
        int i3 = 0;
        if (c3522OfArr != null && c3522OfArr.length > 0) {
            int i4 = 0;
            while (true) {
                C3522Of[] c3522OfArr2 = this.f43436f;
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
        if (!this.f43437g.equals("")) {
            c3831b.m19616b(6, this.f43437g);
        }
        int i5 = this.f43438h;
        if (i5 != 0) {
            c3831b.m19622d(7, i5);
        }
        a aVar = this.f43439i;
        if (aVar != null) {
            c3831b.m19615b(8, aVar);
        }
        if (!Arrays.equals(this.f43440j, f43430m)) {
            c3831b.m19618b(9, this.f43440j);
        }
        if (!Arrays.equals(this.f43441k, C3961g.f45152d)) {
            c3831b.m19618b(10, this.f43441k);
        }
        C3422Kf[] c3422KfArr = this.f43442l;
        if (c3422KfArr == null || c3422KfArr.length <= 0) {
            return;
        }
        while (true) {
            C3422Kf[] c3422KfArr2 = this.f43442l;
            if (i3 >= c3422KfArr2.length) {
                return;
            }
            C3422Kf c3422Kf = c3422KfArr2[i3];
            if (c3422Kf != null) {
                c3831b.m19615b(11, c3422Kf);
            }
            i3++;
        }
    }

    /* renamed from: b */
    public C3472Mf m18593b() {
        this.f43432b = null;
        this.f43433c = null;
        this.f43434d = "";
        this.f43435e = -1;
        this.f43436f = C3522Of.m18669c();
        this.f43437g = "";
        this.f43438h = 0;
        this.f43439i = null;
        this.f43440j = (byte[]) f43430m.clone();
        this.f43441k = C3961g.f45152d;
        this.f43442l = C3422Kf.m18446c();
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        C3572Qf c3572Qf = this.f43432b;
        int i2 = 0;
        int m19598a = c3572Qf != null ? C3831b.m19598a(1, c3572Qf) + 0 : 0;
        C3372If c3372If = this.f43433c;
        if (c3372If != null) {
            m19598a += C3831b.m19598a(2, c3372If);
        }
        if (!this.f43434d.equals("")) {
            m19598a += C3831b.m19599a(3, this.f43434d);
        }
        int i3 = this.f43435e;
        if (i3 != -1) {
            m19598a += C3831b.m19596a(4, i3);
        }
        C3522Of[] c3522OfArr = this.f43436f;
        if (c3522OfArr != null && c3522OfArr.length > 0) {
            int i4 = 0;
            while (true) {
                C3522Of[] c3522OfArr2 = this.f43436f;
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
        if (!this.f43437g.equals("")) {
            m19598a += C3831b.m19599a(6, this.f43437g);
        }
        int i5 = this.f43438h;
        if (i5 != 0) {
            m19598a += C3831b.m19596a(7, i5);
        }
        a aVar = this.f43439i;
        if (aVar != null) {
            m19598a += C3831b.m19598a(8, aVar);
        }
        if (!Arrays.equals(this.f43440j, f43430m)) {
            m19598a += C3831b.m19601a(9, this.f43440j);
        }
        if (!Arrays.equals(this.f43441k, C3961g.f45152d)) {
            m19598a += C3831b.m19601a(10, this.f43441k);
        }
        C3422Kf[] c3422KfArr = this.f43442l;
        if (c3422KfArr != null && c3422KfArr.length > 0) {
            while (true) {
                C3422Kf[] c3422KfArr2 = this.f43442l;
                if (i2 >= c3422KfArr2.length) {
                    break;
                }
                C3422Kf c3422Kf = c3422KfArr2[i2];
                if (c3422Kf != null) {
                    m19598a += C3831b.m19598a(11, c3422Kf);
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
                    if (this.f43432b == null) {
                        this.f43432b = new C3572Qf();
                    }
                    c3805a.m19545a(this.f43432b);
                    break;
                case 18:
                    if (this.f43433c == null) {
                        this.f43433c = new C3372If();
                    }
                    c3805a.m19545a(this.f43433c);
                    break;
                case 26:
                    this.f43434d = c3805a.m19561k();
                    break;
                case 32:
                    int m19558h = c3805a.m19558h();
                    if (m19558h != -1 && m19558h != 0 && m19558h != 1) {
                        break;
                    } else {
                        this.f43435e = m19558h;
                        break;
                    }
                case 42:
                    int m19920a = C3961g.m19920a(c3805a, 42);
                    C3522Of[] c3522OfArr = this.f43436f;
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
                    this.f43436f = c3522OfArr2;
                    break;
                case 50:
                    this.f43437g = c3805a.m19561k();
                    break;
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    int m19558h2 = c3805a.m19558h();
                    if (m19558h2 != 0 && m19558h2 != 1) {
                        break;
                    } else {
                        this.f43438h = m19558h2;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (this.f43439i == null) {
                        this.f43439i = new a();
                    }
                    c3805a.m19545a(this.f43439i);
                    break;
                case C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                    this.f43440j = c3805a.m19550d();
                    break;
                case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                    this.f43441k = c3805a.m19550d();
                    break;
                case 90:
                    int m19920a2 = C3961g.m19920a(c3805a, 90);
                    C3422Kf[] c3422KfArr = this.f43442l;
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
                    this.f43442l = c3422KfArr2;
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
