package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.fg */
/* loaded from: classes2.dex */
public final class C3952fg extends AbstractC3909e {

    /* renamed from: b */
    public a[] f45131b;

    public C3952fg() {
        m19903b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        a[] aVarArr = this.f45131b;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr2 = this.f45131b;
            if (i2 >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i2];
            if (aVar != null) {
                c3831b.m19615b(1, aVar);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public C3952fg m19903b() {
        this.f45131b = a.m19904c();
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.fg$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: d */
        private static volatile a[] f45132d;

        /* renamed from: b */
        public String f45133b;

        /* renamed from: c */
        public boolean f45134c;

        public a() {
            m19905b();
        }

        /* renamed from: c */
        public static a[] m19904c() {
            if (f45132d == null) {
                synchronized (C3857c.f44857a) {
                    if (f45132d == null) {
                        f45132d = new a[0];
                    }
                }
            }
            return f45132d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19616b(1, this.f45133b);
            c3831b.m19617b(2, this.f45134c);
        }

        /* renamed from: b */
        public a m19905b() {
            this.f45133b = "";
            this.f45134c = false;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19600a(2, this.f45134c) + C3831b.m19599a(1, this.f45133b) + 0;
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
                    this.f45133b = c3805a.m19561k();
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f45134c = c3805a.m19549c();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        a[] aVarArr = this.f45131b;
        int i2 = 0;
        if (aVarArr == null || aVarArr.length <= 0) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr2 = this.f45131b;
            if (i2 >= aVarArr2.length) {
                return i3;
            }
            a aVar = aVarArr2[i2];
            if (aVar != null) {
                i3 += C3831b.m19598a(1, aVar);
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
                a[] aVarArr = this.f45131b;
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
                this.f45131b = aVarArr2;
            }
        }
        return this;
    }
}
