package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C4940cv;
import com.yandex.mobile.ads.impl.C4989dv;
import com.yandex.mobile.ads.impl.e01;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.bv */
/* loaded from: classes3.dex */
public final class C4888bv implements InterfaceC5412lt {

    /* renamed from: e */
    private InterfaceC5509nt f48993e;

    /* renamed from: f */
    private y61 f48994f;

    /* renamed from: h */
    @Nullable
    private Metadata f48996h;

    /* renamed from: i */
    private C5147gv f48997i;

    /* renamed from: j */
    private int f48998j;

    /* renamed from: k */
    private int f48999k;

    /* renamed from: l */
    private C4825av f49000l;

    /* renamed from: m */
    private int f49001m;

    /* renamed from: n */
    private long f49002n;

    /* renamed from: a */
    private final byte[] f48989a = new byte[42];

    /* renamed from: b */
    private final ap0 f48990b = new ap0(0, new byte[32768]);

    /* renamed from: c */
    private final boolean f48991c = false;

    /* renamed from: d */
    private final C4940cv.a f48992d = new C4940cv.a();

    /* renamed from: g */
    private int f48995g = 0;

    static {
        dn1 dn1Var = dn1.f49703n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static InterfaceC5412lt[] m22936a() {
        return new InterfaceC5412lt[]{new C4888bv()};
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        C5598pn c5598pn = (C5598pn) interfaceC5458mt;
        Metadata m23987a = new e10().m23987a(c5598pn, d10.f49524b);
        if (m23987a != null) {
            m23987a.m22237c();
        }
        ap0 ap0Var = new ap0(4);
        c5598pn.mo26764b(ap0Var.m22587c(), 0, 4, false);
        return ap0Var.m22609v() == 1716281667;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f48993e = interfaceC5509nt;
        this.f48994f = interfaceC5509nt.mo23022a(0, 1);
        interfaceC5509nt.mo23023a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final int mo22424a(InterfaceC5458mt interfaceC5458mt, qr0 qr0Var) throws IOException {
        e01 c4998b;
        long j2;
        boolean z;
        int i2 = this.f48995g;
        Metadata metadata = null;
        if (i2 == 0) {
            boolean z2 = !this.f48991c;
            C5598pn c5598pn = (C5598pn) interfaceC5458mt;
            c5598pn.mo26765c();
            long mo22718e = c5598pn.mo22718e();
            Metadata m23987a = new e10().m23987a(c5598pn, z2 ? null : d10.f49524b);
            if (m23987a != null && m23987a.m22237c() != 0) {
                metadata = m23987a;
            }
            c5598pn.mo26760a((int) (c5598pn.mo22718e() - mo22718e));
            this.f48996h = metadata;
            this.f48995g = 1;
            return 0;
        }
        if (i2 == 1) {
            byte[] bArr = this.f48989a;
            C5598pn c5598pn2 = (C5598pn) interfaceC5458mt;
            c5598pn2.mo26764b(bArr, 0, bArr.length, false);
            c5598pn2.mo26765c();
            this.f48995g = 2;
            return 0;
        }
        if (i2 == 2) {
            ap0 ap0Var = new ap0(4);
            ((C5598pn) interfaceC5458mt).mo26762a(ap0Var.m22587c(), 0, 4, false);
            if (ap0Var.m22609v() == 1716281667) {
                this.f48995g = 3;
                return 0;
            }
            throw ep0.m24225a("Failed to read FLAC stream marker.", (Exception) null);
        }
        if (i2 == 3) {
            C4989dv.a aVar = new C4989dv.a(this.f48997i);
            boolean z3 = false;
            while (!z3) {
                z3 = C4989dv.m23943a((C5598pn) interfaceC5458mt, aVar);
                C5147gv c5147gv = aVar.f49749a;
                int i3 = s91.f54530a;
                this.f48997i = c5147gv;
            }
            Objects.requireNonNull(this.f48997i);
            this.f48998j = Math.max(this.f48997i.f50743c, 6);
            y61 y61Var = this.f48994f;
            int i4 = s91.f54530a;
            y61Var.mo28347a(this.f48997i.m24985a(this.f48989a, this.f48996h));
            this.f48995g = 4;
            return 0;
        }
        long j3 = 0;
        if (i2 == 4) {
            C5598pn c5598pn3 = (C5598pn) interfaceC5458mt;
            c5598pn3.mo26765c();
            ap0 ap0Var2 = new ap0(2);
            c5598pn3.mo26764b(ap0Var2.m22587c(), 0, 2, false);
            int m22613z = ap0Var2.m22613z();
            if ((m22613z >> 2) == 16382) {
                c5598pn3.mo26765c();
                this.f48999k = m22613z;
                InterfaceC5509nt interfaceC5509nt = this.f48993e;
                int i5 = s91.f54530a;
                long position = c5598pn3.getPosition();
                long mo22717a = c5598pn3.mo22717a();
                Objects.requireNonNull(this.f48997i);
                C5147gv c5147gv2 = this.f48997i;
                if (c5147gv2.f50751k != null) {
                    c4998b = new C5093fv(c5147gv2, position);
                } else if (mo22717a != -1 && c5147gv2.f50750j > 0) {
                    C4825av c4825av = new C4825av(c5147gv2, this.f48999k, position, mo22717a);
                    this.f49000l = c4825av;
                    c4998b = c4825av.m28212a();
                } else {
                    c4998b = new e01.C4998b(c5147gv2.m24986b(), 0L);
                }
                interfaceC5509nt.mo23024a(c4998b);
                this.f48995g = 5;
                return 0;
            }
            c5598pn3.mo26765c();
            throw ep0.m24225a("First frame does not start with sync code.", (Exception) null);
        }
        if (i2 == 5) {
            Objects.requireNonNull(this.f48994f);
            Objects.requireNonNull(this.f48997i);
            C4825av c4825av2 = this.f49000l;
            if (c4825av2 != null && c4825av2.m28214b()) {
                return this.f49000l.m28211a((C5598pn) interfaceC5458mt, qr0Var);
            }
            if (this.f49002n == -1) {
                C5147gv c5147gv3 = this.f48997i;
                C5598pn c5598pn4 = (C5598pn) interfaceC5458mt;
                c5598pn4.mo26765c();
                c5598pn4.m27349a(false, 1);
                byte[] bArr2 = new byte[1];
                c5598pn4.mo26764b(bArr2, 0, 1, false);
                boolean z4 = (bArr2[0] & 1) == 1;
                c5598pn4.m27349a(false, 2);
                int i6 = z4 ? 7 : 6;
                ap0 ap0Var3 = new ap0(i6);
                byte[] m22587c = ap0Var3.m22587c();
                int i7 = 0;
                while (i7 < i6) {
                    int m27350b = c5598pn4.m27350b(m22587c, 0 + i7, i6 - i7);
                    if (m27350b == -1) {
                        break;
                    }
                    i7 += m27350b;
                }
                ap0Var3.m22589d(i7);
                c5598pn4.mo26765c();
                try {
                    long m22578A = ap0Var3.m22578A();
                    if (!z4) {
                        m22578A *= c5147gv3.f50742b;
                    }
                    j3 = m22578A;
                } catch (NumberFormatException unused) {
                    r3 = false;
                }
                if (r3) {
                    this.f49002n = j3;
                    return 0;
                }
                throw ep0.m24225a((String) null, (Exception) null);
            }
            int m22590e = this.f48990b.m22590e();
            if (m22590e < 32768) {
                int read = ((C5598pn) interfaceC5458mt).read(this.f48990b.m22587c(), m22590e, 32768 - m22590e);
                r3 = read == -1;
                if (!r3) {
                    this.f48990b.m22589d(m22590e + read);
                } else if (this.f48990b.m22579a() == 0) {
                    long j4 = this.f49002n * 1000000;
                    C5147gv c5147gv4 = this.f48997i;
                    int i8 = s91.f54530a;
                    this.f48994f.mo28346a(j4 / c5147gv4.f50745e, 1, this.f49001m, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int m22588d = this.f48990b.m22588d();
            int i9 = this.f49001m;
            int i10 = this.f48998j;
            if (i9 < i10) {
                ap0 ap0Var4 = this.f48990b;
                ap0Var4.m22593f(Math.min(i10 - i9, ap0Var4.m22579a()));
            }
            ap0 ap0Var5 = this.f48990b;
            Objects.requireNonNull(this.f48997i);
            int m22588d2 = ap0Var5.m22588d();
            while (true) {
                if (m22588d2 <= ap0Var5.m22590e() - 16) {
                    ap0Var5.m22591e(m22588d2);
                    if (C4940cv.m23518a(ap0Var5, this.f48997i, this.f48999k, this.f48992d)) {
                        ap0Var5.m22591e(m22588d2);
                        j2 = this.f48992d.f49363a;
                        break;
                    }
                    m22588d2++;
                } else {
                    if (r3) {
                        while (m22588d2 <= ap0Var5.m22590e() - this.f48998j) {
                            ap0Var5.m22591e(m22588d2);
                            try {
                                z = C4940cv.m23518a(ap0Var5, this.f48997i, this.f48999k, this.f48992d);
                            } catch (IndexOutOfBoundsException unused2) {
                                z = false;
                            }
                            if (ap0Var5.m22588d() > ap0Var5.m22590e()) {
                                z = false;
                            }
                            if (z) {
                                ap0Var5.m22591e(m22588d2);
                                j2 = this.f48992d.f49363a;
                                break;
                            }
                            m22588d2++;
                        }
                        ap0Var5.m22591e(ap0Var5.m22590e());
                    } else {
                        ap0Var5.m22591e(m22588d2);
                    }
                    j2 = -1;
                }
            }
            int m22588d3 = this.f48990b.m22588d() - m22588d;
            this.f48990b.m22591e(m22588d);
            this.f48994f.mo28345a(m22588d3, this.f48990b);
            int i11 = this.f49001m + m22588d3;
            this.f49001m = i11;
            if (j2 != -1) {
                long j5 = this.f49002n * 1000000;
                C5147gv c5147gv5 = this.f48997i;
                int i12 = s91.f54530a;
                this.f48994f.mo28346a(j5 / c5147gv5.f50745e, 1, i11, 0, null);
                this.f49001m = 0;
                this.f49002n = j2;
            }
            if (this.f48990b.m22579a() >= 16) {
                return 0;
            }
            int m22579a = this.f48990b.m22579a();
            System.arraycopy(this.f48990b.m22587c(), this.f48990b.m22588d(), this.f48990b.m22587c(), 0, m22579a);
            this.f48990b.m22591e(0);
            this.f48990b.m22589d(m22579a);
            return 0;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        if (j2 == 0) {
            this.f48995g = 0;
        } else {
            C4825av c4825av = this.f49000l;
            if (c4825av != null) {
                c4825av.m28213a(j3);
            }
        }
        this.f49002n = j3 != 0 ? -1L : 0L;
        this.f49001m = 0;
        this.f48990b.m22586c(0);
    }
}
