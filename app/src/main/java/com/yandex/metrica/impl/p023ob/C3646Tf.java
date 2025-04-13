package com.yandex.metrica.impl.p023ob;

import com.yandex.mobile.ads.C4632R;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Tf */
/* loaded from: classes2.dex */
public final class C3646Tf extends AbstractC3909e {

    /* renamed from: r */
    private static volatile C3646Tf[] f44080r;

    /* renamed from: b */
    public int f44081b;

    /* renamed from: c */
    public int f44082c;

    /* renamed from: d */
    public int f44083d;

    /* renamed from: e */
    public int f44084e;

    /* renamed from: f */
    public int f44085f;

    /* renamed from: g */
    public String f44086g;

    /* renamed from: h */
    public boolean f44087h;

    /* renamed from: i */
    public int f44088i;

    /* renamed from: j */
    public int f44089j;

    /* renamed from: k */
    public long f44090k;

    /* renamed from: l */
    public int f44091l;

    /* renamed from: m */
    public int f44092m;

    /* renamed from: n */
    public int f44093n;

    /* renamed from: o */
    public int f44094o;

    /* renamed from: p */
    public int f44095p;

    /* renamed from: q */
    public int f44096q;

    public C3646Tf() {
        m19165b();
    }

    /* renamed from: c */
    public static C3646Tf[] m19164c() {
        if (f44080r == null) {
            synchronized (C3857c.f44857a) {
                if (f44080r == null) {
                    f44080r = new C3646Tf[0];
                }
            }
        }
        return f44080r;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        int i2 = this.f44081b;
        if (i2 != -1) {
            c3831b.m19627f(1, i2);
        }
        int i3 = this.f44082c;
        if (i3 != 0) {
            c3831b.m19625e(2, i3);
        }
        int i4 = this.f44083d;
        if (i4 != -1) {
            c3831b.m19627f(3, i4);
        }
        int i5 = this.f44084e;
        if (i5 != -1) {
            c3831b.m19627f(4, i5);
        }
        int i6 = this.f44085f;
        if (i6 != -1) {
            c3831b.m19627f(5, i6);
        }
        if (!this.f44086g.equals("")) {
            c3831b.m19616b(6, this.f44086g);
        }
        boolean z = this.f44087h;
        if (z) {
            c3831b.m19617b(7, z);
        }
        int i7 = this.f44088i;
        if (i7 != 0) {
            c3831b.m19622d(8, i7);
        }
        int i8 = this.f44089j;
        if (i8 != -1) {
            c3831b.m19627f(9, i8);
        }
        long j2 = this.f44090k;
        if (j2 != 0) {
            c3831b.m19626e(10, j2);
        }
        int i9 = this.f44091l;
        if (i9 != Integer.MAX_VALUE) {
            c3831b.m19625e(11, i9);
        }
        int i10 = this.f44092m;
        if (i10 != Integer.MAX_VALUE) {
            c3831b.m19625e(12, i10);
        }
        int i11 = this.f44093n;
        if (i11 != Integer.MAX_VALUE) {
            c3831b.m19625e(13, i11);
        }
        int i12 = this.f44094o;
        if (i12 != -1) {
            c3831b.m19627f(14, i12);
        }
        int i13 = this.f44095p;
        if (i13 != -1) {
            c3831b.m19627f(15, i13);
        }
        int i14 = this.f44096q;
        if (i14 != -1) {
            c3831b.m19627f(16, i14);
        }
    }

    /* renamed from: b */
    public C3646Tf m19165b() {
        this.f44081b = -1;
        this.f44082c = 0;
        this.f44083d = -1;
        this.f44084e = -1;
        this.f44085f = -1;
        this.f44086g = "";
        this.f44087h = false;
        this.f44088i = 0;
        this.f44089j = -1;
        this.f44090k = 0L;
        this.f44091l = Integer.MAX_VALUE;
        this.f44092m = Integer.MAX_VALUE;
        this.f44093n = Integer.MAX_VALUE;
        this.f44094o = -1;
        this.f44095p = -1;
        this.f44096q = -1;
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2 = this.f44081b;
        int m19610c = i2 != -1 ? 0 + C3831b.m19610c(1, i2) : 0;
        int i3 = this.f44082c;
        if (i3 != 0) {
            m19610c += C3831b.m19607b(2, i3);
        }
        int i4 = this.f44083d;
        if (i4 != -1) {
            m19610c += C3831b.m19610c(3, i4);
        }
        int i5 = this.f44084e;
        if (i5 != -1) {
            m19610c += C3831b.m19610c(4, i5);
        }
        int i6 = this.f44085f;
        if (i6 != -1) {
            m19610c += C3831b.m19610c(5, i6);
        }
        if (!this.f44086g.equals("")) {
            m19610c += C3831b.m19599a(6, this.f44086g);
        }
        boolean z = this.f44087h;
        if (z) {
            m19610c += C3831b.m19600a(7, z);
        }
        int i7 = this.f44088i;
        if (i7 != 0) {
            m19610c += C3831b.m19596a(8, i7);
        }
        int i8 = this.f44089j;
        if (i8 != -1) {
            m19610c += C3831b.m19610c(9, i8);
        }
        long j2 = this.f44090k;
        if (j2 != 0) {
            m19610c += C3831b.m19608b(10, j2);
        }
        int i9 = this.f44091l;
        if (i9 != Integer.MAX_VALUE) {
            m19610c += C3831b.m19607b(11, i9);
        }
        int i10 = this.f44092m;
        if (i10 != Integer.MAX_VALUE) {
            m19610c += C3831b.m19607b(12, i10);
        }
        int i11 = this.f44093n;
        if (i11 != Integer.MAX_VALUE) {
            m19610c += C3831b.m19607b(13, i11);
        }
        int i12 = this.f44094o;
        if (i12 != -1) {
            m19610c += C3831b.m19610c(14, i12);
        }
        int i13 = this.f44095p;
        if (i13 != -1) {
            m19610c += C3831b.m19610c(15, i13);
        }
        int i14 = this.f44096q;
        return i14 != -1 ? m19610c + C3831b.m19610c(16, i14) : m19610c;
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
                    this.f44081b = c3805a.m19558h();
                    break;
                case 16:
                    this.f44082c = c3805a.m19560j();
                    break;
                case 24:
                    this.f44083d = c3805a.m19558h();
                    break;
                case 32:
                    this.f44084e = c3805a.m19558h();
                    break;
                case 40:
                    this.f44085f = c3805a.m19558h();
                    break;
                case 50:
                    this.f44086g = c3805a.m19561k();
                    break;
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    this.f44087h = c3805a.m19549c();
                    break;
                case 64:
                    int m19558h = c3805a.m19558h();
                    if (m19558h != 0 && m19558h != 1 && m19558h != 2 && m19558h != 3 && m19558h != 4) {
                        break;
                    } else {
                        this.f44088i = m19558h;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    this.f44089j = c3805a.m19558h();
                    break;
                case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    this.f44090k = c3805a.m19559i();
                    break;
                case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                    this.f44091l = c3805a.m19560j();
                    break;
                case C4632R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                    this.f44092m = c3805a.m19560j();
                    break;
                case C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                    this.f44093n = c3805a.m19560j();
                    break;
                case C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                    this.f44094o = c3805a.m19558h();
                    break;
                case C4632R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                    this.f44095p = c3805a.m19558h();
                    break;
                case 128:
                    this.f44096q = c3805a.m19558h();
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
