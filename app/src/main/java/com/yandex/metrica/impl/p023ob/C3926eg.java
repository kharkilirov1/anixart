package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.eg */
/* loaded from: classes2.dex */
public final class C3926eg extends AbstractC3909e {

    /* renamed from: b */
    public boolean f45054b;

    /* renamed from: c */
    public int f45055c;

    /* renamed from: d */
    public int f45056d;

    /* renamed from: e */
    public int[] f45057e;

    public C3926eg() {
        m19819b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        c3831b.m19617b(1, this.f45054b);
        c3831b.m19627f(2, this.f45055c);
        c3831b.m19627f(3, this.f45056d);
        int[] iArr = this.f45057e;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.f45057e;
            if (i2 >= iArr2.length) {
                return;
            }
            c3831b.m19622d(4, iArr2[i2]);
            i2++;
        }
    }

    /* renamed from: b */
    public C3926eg m19819b() {
        this.f45054b = false;
        this.f45055c = 0;
        this.f45056d = 0;
        this.f45057e = C3961g.f45149a;
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2 = 0;
        int m19610c = C3831b.m19610c(3, this.f45056d) + C3831b.m19610c(2, this.f45055c) + C3831b.m19600a(1, this.f45054b) + 0;
        int[] iArr = this.f45057e;
        if (iArr == null || iArr.length <= 0) {
            return m19610c;
        }
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.f45057e;
            if (i2 < iArr2.length) {
                i3 += C3831b.m19594a(iArr2[i2]);
                i2++;
            } else {
                return m19610c + i3 + (iArr2.length * 1);
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
                this.f45054b = c3805a.m19549c();
            } else if (m19562l == 16) {
                this.f45055c = c3805a.m19558h();
            } else if (m19562l == 24) {
                this.f45056d = c3805a.m19558h();
            } else if (m19562l == 32) {
                int m19920a = C3961g.m19920a(c3805a, 32);
                int[] iArr = this.f45057e;
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
                this.f45057e = iArr2;
            } else if (m19562l != 34) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19548c = c3805a.m19548c(c3805a.m19558h());
                int m19546b = c3805a.m19546b();
                int i3 = 0;
                while (c3805a.m19543a() > 0) {
                    c3805a.m19558h();
                    i3++;
                }
                c3805a.m19553e(m19546b);
                int[] iArr3 = this.f45057e;
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
                this.f45057e = iArr4;
                c3805a.m19547b(m19548c);
            }
        }
        return this;
    }
}
