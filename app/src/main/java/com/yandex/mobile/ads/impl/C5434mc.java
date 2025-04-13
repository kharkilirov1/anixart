package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4701q0;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.e01;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.mc */
/* loaded from: classes3.dex */
public final class C5434mc implements InterfaceC5412lt {

    /* renamed from: c */
    private int f52627c;

    /* renamed from: e */
    private C5482nc f52629e;

    /* renamed from: h */
    private long f52632h;

    /* renamed from: i */
    @Nullable
    private C5397lh f52633i;

    /* renamed from: m */
    private int f52637m;

    /* renamed from: n */
    private boolean f52638n;

    /* renamed from: a */
    private final ap0 f52625a = new ap0(12);

    /* renamed from: b */
    private final b f52626b = new b(0);

    /* renamed from: d */
    private InterfaceC5509nt f52628d = new C5704rq();

    /* renamed from: g */
    private C5397lh[] f52631g = new C5397lh[0];

    /* renamed from: k */
    private long f52635k = -1;

    /* renamed from: l */
    private long f52636l = -1;

    /* renamed from: j */
    private int f52634j = -1;

    /* renamed from: f */
    private long f52630f = -9223372036854775807L;

    /* renamed from: com.yandex.mobile.ads.impl.mc$a */
    public class a implements e01 {

        /* renamed from: a */
        private final long f52639a;

        public a(long j2) {
            this.f52639a = j2;
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: b */
        public final e01.C4997a mo22565b(long j2) {
            e01.C4997a m26461b = C5434mc.this.f52631g[0].m26461b(j2);
            for (int i2 = 1; i2 < C5434mc.this.f52631g.length; i2++) {
                e01.C4997a m26461b2 = C5434mc.this.f52631g[i2].m26461b(j2);
                if (m26461b2.f49774a.f50469b < m26461b.f49774a.f50469b) {
                    m26461b = m26461b2;
                }
            }
            return m26461b;
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: b */
        public final boolean mo22566b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: c */
        public final long mo22567c() {
            return this.f52639a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mc$b */
    public static class b {

        /* renamed from: a */
        public int f52641a;

        /* renamed from: b */
        public int f52642b;

        /* renamed from: c */
        public int f52643c;

        private b() {
        }

        public /* synthetic */ b(int i2) {
            this();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f52627c = 0;
        this.f52628d = interfaceC5509nt;
        this.f52632h = -1L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        ((C5598pn) interfaceC5458mt).mo26764b(this.f52625a.m22587c(), 0, 12, false);
        this.f52625a.m22591e(0);
        if (this.f52625a.m22598k() != 1179011410) {
            return false;
        }
        this.f52625a.m22593f(4);
        return this.f52625a.m22598k() == 541677121;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final int mo22424a(InterfaceC5458mt interfaceC5458mt, qr0 qr0Var) throws IOException {
        InterfaceC5392lc interfaceC5392lc;
        Object obj;
        Object obj2;
        InterfaceC5392lc interfaceC5392lc2;
        long j2;
        C5397lh c5397lh;
        C5598pn c5598pn = (C5598pn) interfaceC5458mt;
        if (m26609a(c5598pn, qr0Var)) {
            return 1;
        }
        C5397lh c5397lh2 = null;
        switch (this.f52627c) {
            case 0:
                if (mo22432a(interfaceC5458mt)) {
                    c5598pn.mo26760a(12);
                    this.f52627c = 1;
                    return 0;
                }
                throw ep0.m24225a("AVI Header List not found", (Exception) null);
            case 1:
                c5598pn.mo26762a(this.f52625a.m22587c(), 0, 12, false);
                this.f52625a.m22591e(0);
                b bVar = this.f52626b;
                ap0 ap0Var = this.f52625a;
                Objects.requireNonNull(bVar);
                bVar.f52641a = ap0Var.m22598k();
                bVar.f52642b = ap0Var.m22598k();
                bVar.f52643c = 0;
                if (bVar.f52641a == 1414744396) {
                    bVar.f52643c = ap0Var.m22598k();
                    b bVar2 = this.f52626b;
                    if (bVar2.f52643c == 1819436136) {
                        this.f52634j = bVar2.f52642b;
                        this.f52627c = 2;
                        return 0;
                    }
                    StringBuilder m26356a = l60.m26356a("hdrl expected, found: ");
                    m26356a.append(this.f52626b.f52643c);
                    throw ep0.m24225a(m26356a.toString(), (Exception) null);
                }
                StringBuilder m26356a2 = l60.m26356a("LIST expected, found: ");
                m26356a2.append(bVar.f52641a);
                throw ep0.m24225a(m26356a2.toString(), (Exception) null);
            case 2:
                int i2 = this.f52634j - 4;
                ap0 ap0Var2 = new ap0(i2);
                c5598pn.mo26762a(ap0Var2.m22587c(), 0, i2, false);
                d80 m23833a = d80.m23833a(1819436136, ap0Var2);
                if (m23833a.getType() == 1819436136) {
                    AbstractC4701q0<InterfaceC5392lc> listIterator = m23833a.f49599a.listIterator(0);
                    while (true) {
                        if (listIterator.hasNext()) {
                            interfaceC5392lc = listIterator.next();
                            if (interfaceC5392lc.getClass() == C5482nc.class) {
                            }
                        } else {
                            interfaceC5392lc = null;
                        }
                    }
                    C5482nc c5482nc = (C5482nc) interfaceC5392lc;
                    if (c5482nc != null) {
                        this.f52629e = c5482nc;
                        this.f52630f = c5482nc.f52910c * c5482nc.f52908a;
                        ArrayList arrayList = new ArrayList();
                        AbstractC4701q0<InterfaceC5392lc> listIterator2 = m23833a.f49599a.listIterator(0);
                        int i3 = 0;
                        while (listIterator2.hasNext()) {
                            InterfaceC5392lc next = listIterator2.next();
                            if (next.getType() == 1819440243) {
                                d80 d80Var = (d80) next;
                                int i4 = i3 + 1;
                                AbstractC4701q0<InterfaceC5392lc> listIterator3 = d80Var.f49599a.listIterator(0);
                                while (true) {
                                    if (listIterator3.hasNext()) {
                                        obj = (InterfaceC5392lc) listIterator3.next();
                                        if (obj.getClass() == C5533oc.class) {
                                        }
                                    } else {
                                        obj = c5397lh2;
                                    }
                                }
                                C5533oc c5533oc = (C5533oc) obj;
                                AbstractC4701q0<InterfaceC5392lc> listIterator4 = d80Var.f49599a.listIterator(0);
                                while (true) {
                                    if (listIterator4.hasNext()) {
                                        obj2 = (InterfaceC5392lc) listIterator4.next();
                                        if (obj2.getClass() == f41.class) {
                                        }
                                    } else {
                                        obj2 = c5397lh2;
                                    }
                                }
                                f41 f41Var = (f41) obj2;
                                if (c5533oc == null) {
                                    d90.m23842d("AviExtractor", "Missing Stream Header");
                                } else if (f41Var == null) {
                                    d90.m23842d("AviExtractor", "Missing Stream Format");
                                } else {
                                    long m28097a = s91.m28097a(c5533oc.f53242d, 1000000 * c5533oc.f53240b, c5533oc.f53241c);
                                    C5606pv c5606pv = f41Var.f50124a;
                                    C5606pv.a m27508a = c5606pv.m27508a();
                                    m27508a.m27563h(i3);
                                    int i5 = c5533oc.f53243e;
                                    if (i5 != 0) {
                                        m27508a.m27564i(i5);
                                    }
                                    AbstractC4701q0<InterfaceC5392lc> listIterator5 = d80Var.f49599a.listIterator(0);
                                    while (true) {
                                        if (listIterator5.hasNext()) {
                                            interfaceC5392lc2 = listIterator5.next();
                                            if (interfaceC5392lc2.getClass() == g41.class) {
                                            }
                                        } else {
                                            interfaceC5392lc2 = null;
                                        }
                                    }
                                    g41 g41Var = (g41) interfaceC5392lc2;
                                    if (g41Var != null) {
                                        m27508a.m27557d(g41Var.f50500a);
                                    }
                                    int m25138a = he0.m25138a(c5606pv.f53820l);
                                    if (m25138a == 1 || m25138a == 2) {
                                        y61 mo23022a = this.f52628d.mo23022a(i3, m25138a);
                                        mo23022a.mo28347a(m27508a.m27550a());
                                        C5397lh c5397lh3 = new C5397lh(i3, m25138a, m28097a, c5533oc.f53242d, mo23022a);
                                        this.f52630f = m28097a;
                                        c5397lh2 = c5397lh3;
                                    } else {
                                        c5397lh2 = null;
                                    }
                                }
                                if (c5397lh2 != null) {
                                    arrayList.add(c5397lh2);
                                }
                                i3 = i4;
                                c5397lh2 = null;
                            }
                        }
                        this.f52631g = (C5397lh[]) arrayList.toArray(new C5397lh[0]);
                        this.f52628d.mo23023a();
                        this.f52627c = 3;
                        return 0;
                    }
                    throw ep0.m24225a("AviHeader not found", (Exception) null);
                }
                StringBuilder m26356a3 = l60.m26356a("Unexpected header list type ");
                m26356a3.append(m23833a.getType());
                throw ep0.m24225a(m26356a3.toString(), (Exception) null);
            case 3:
                if (this.f52635k != -1) {
                    long position = c5598pn.getPosition();
                    long j3 = this.f52635k;
                    if (position != j3) {
                        this.f52632h = j3;
                        return 0;
                    }
                }
                c5598pn.mo26764b(this.f52625a.m22587c(), 0, 12, false);
                c5598pn.mo26765c();
                this.f52625a.m22591e(0);
                b bVar3 = this.f52626b;
                ap0 ap0Var3 = this.f52625a;
                Objects.requireNonNull(bVar3);
                bVar3.f52641a = ap0Var3.m22598k();
                bVar3.f52642b = ap0Var3.m22598k();
                bVar3.f52643c = 0;
                int m22598k = this.f52625a.m22598k();
                int i6 = this.f52626b.f52641a;
                if (i6 == 1179011410) {
                    c5598pn.mo26760a(12);
                    return 0;
                }
                if (i6 == 1414744396 && m22598k == 1769369453) {
                    long position2 = c5598pn.getPosition();
                    this.f52635k = position2;
                    this.f52636l = position2 + this.f52626b.f52642b + 8;
                    if (!this.f52638n) {
                        C5482nc c5482nc2 = this.f52629e;
                        Objects.requireNonNull(c5482nc2);
                        if ((c5482nc2.f52909b & 16) == 16) {
                            this.f52627c = 4;
                            this.f52632h = this.f52636l;
                            return 0;
                        }
                        this.f52628d.mo23024a(new e01.C4998b(this.f52630f, 0L));
                        this.f52638n = true;
                    }
                    this.f52632h = c5598pn.getPosition() + 12;
                    this.f52627c = 6;
                    return 0;
                }
                this.f52632h = c5598pn.getPosition() + this.f52626b.f52642b + 8;
                return 0;
            case 4:
                c5598pn.mo26762a(this.f52625a.m22587c(), 0, 8, false);
                this.f52625a.m22591e(0);
                int m22598k2 = this.f52625a.m22598k();
                int m22598k3 = this.f52625a.m22598k();
                if (m22598k2 == 829973609) {
                    this.f52627c = 5;
                    this.f52637m = m22598k3;
                } else {
                    this.f52632h = c5598pn.getPosition() + m22598k3;
                }
                return 0;
            case 5:
                ap0 ap0Var4 = new ap0(this.f52637m);
                c5598pn.mo26762a(ap0Var4.m22587c(), 0, this.f52637m, false);
                if (ap0Var4.m22579a() < 16) {
                    j2 = 0;
                } else {
                    int m22588d = ap0Var4.m22588d();
                    ap0Var4.m22593f(8);
                    long m22598k4 = ap0Var4.m22598k();
                    long j4 = this.f52635k;
                    j2 = m22598k4 > j4 ? 0L : j4 + 8;
                    ap0Var4.m22591e(m22588d);
                }
                while (ap0Var4.m22579a() >= 16) {
                    int m22598k5 = ap0Var4.m22598k();
                    int m22598k6 = ap0Var4.m22598k();
                    long m22598k7 = ap0Var4.m22598k() + j2;
                    ap0Var4.m22598k();
                    C5397lh[] c5397lhArr = this.f52631g;
                    int length = c5397lhArr.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length) {
                            c5397lh = c5397lhArr[i7];
                            if (!c5397lh.m26459a(m22598k5)) {
                                i7++;
                            }
                        } else {
                            c5397lh = null;
                        }
                    }
                    if (c5397lh != null) {
                        if ((m22598k6 & 16) == 16) {
                            c5397lh.m26458a(m22598k7);
                        }
                        c5397lh.m26462b();
                    }
                }
                for (C5397lh c5397lh4 : this.f52631g) {
                    c5397lh4.m26457a();
                }
                this.f52638n = true;
                this.f52628d.mo23024a(new a(this.f52630f));
                this.f52627c = 6;
                this.f52632h = this.f52635k;
                return 0;
            case 6:
                if (c5598pn.getPosition() >= this.f52636l) {
                    return -1;
                }
                C5397lh c5397lh5 = this.f52633i;
                if (c5397lh5 != null) {
                    if (!c5397lh5.m26460a(c5598pn)) {
                        return 0;
                    }
                    this.f52633i = null;
                    return 0;
                }
                if ((c5598pn.getPosition() & 1) == 1) {
                    c5598pn.mo26760a(1);
                }
                c5598pn.mo26764b(this.f52625a.m22587c(), 0, 12, false);
                this.f52625a.m22591e(0);
                int m22598k8 = this.f52625a.m22598k();
                if (m22598k8 == 1414744396) {
                    this.f52625a.m22591e(8);
                    c5598pn.mo26760a(this.f52625a.m22598k() == 1769369453 ? 12 : 8);
                    c5598pn.mo26765c();
                    return 0;
                }
                int m22598k9 = this.f52625a.m22598k();
                if (m22598k8 == 1263424842) {
                    this.f52632h = c5598pn.getPosition() + m22598k9 + 8;
                    return 0;
                }
                c5598pn.mo26760a(8);
                c5598pn.mo26765c();
                C5397lh[] c5397lhArr2 = this.f52631g;
                int length2 = c5397lhArr2.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length2) {
                        C5397lh c5397lh6 = c5397lhArr2[i8];
                        if (c5397lh6.m26459a(m22598k8)) {
                            c5397lh2 = c5397lh6;
                        } else {
                            i8++;
                        }
                    }
                }
                if (c5397lh2 == null) {
                    this.f52632h = c5598pn.getPosition() + m22598k9;
                    return 0;
                }
                c5397lh2.m26463b(m22598k9);
                this.f52633i = c5397lh2;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        this.f52632h = -1L;
        this.f52633i = null;
        for (C5397lh c5397lh : this.f52631g) {
            c5397lh.m26464c(j2);
        }
        if (j2 == 0) {
            if (this.f52631g.length == 0) {
                this.f52627c = 0;
                return;
            } else {
                this.f52627c = 3;
                return;
            }
        }
        this.f52627c = 6;
    }

    /* renamed from: a */
    private boolean m26609a(C5598pn c5598pn, qr0 qr0Var) throws IOException {
        boolean z;
        if (this.f52632h != -1) {
            long position = c5598pn.getPosition();
            long j2 = this.f52632h;
            if (j2 >= position && j2 <= 262144 + position) {
                c5598pn.mo26760a((int) (j2 - position));
            } else {
                qr0Var.f54129a = j2;
                z = true;
                this.f52632h = -1L;
                return z;
            }
        }
        z = false;
        this.f52632h = -1L;
        return z;
    }
}
