package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzyz implements zzabn {

    /* renamed from: a */
    public final zzyy f17130a;

    /* renamed from: b */
    public int f17131b;

    /* renamed from: c */
    public int f17132c;

    /* renamed from: d */
    public int f17133d = 0;

    public zzyz(zzyy zzyyVar) {
        Charset charset = zzaad.f16259a;
        this.f17130a = zzyyVar;
        zzyyVar.f17129b = this;
    }

    /* renamed from: A */
    public static final void m9547A(int i2) throws IOException {
        if ((i2 & 7) != 0) {
            throw zzaaf.m8583f();
        }
    }

    /* renamed from: z */
    public static final void m9548z(int i2) throws IOException {
        if ((i2 & 3) != 0) {
            throw zzaaf.m8583f();
        }
    }

    /* renamed from: B */
    public final double m9549B() throws IOException {
        m9584y(1);
        return Double.longBitsToDouble(((zzyw) this.f17130a).m9540q());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabn
    /* renamed from: C */
    public final String mo8677C() throws IOException {
        m9584y(2);
        return this.f17130a.mo9531f();
    }

    /* renamed from: D */
    public final float m9550D() throws IOException {
        m9584y(5);
        return Float.intBitsToFloat(((zzyw) this.f17130a).m9538o());
    }

    /* renamed from: E */
    public final int m9551E() throws IOException {
        m9584y(0);
        return ((zzyw) this.f17130a).m9539p();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabn
    /* renamed from: F */
    public final String mo8678F() throws IOException {
        m9584y(2);
        return this.f17130a.mo9530e();
    }

    /* renamed from: G */
    public final int m9552G() throws IOException {
        m9584y(0);
        return ((zzyw) this.f17130a).m9539p();
    }

    /* renamed from: H */
    public final int m9553H() throws IOException {
        m9584y(5);
        return ((zzyw) this.f17130a).m9538o();
    }

    /* renamed from: I */
    public final int m9554I() throws IOException {
        m9584y(0);
        return zzyy.m9545l(((zzyw) this.f17130a).m9539p());
    }

    /* renamed from: J */
    public final int m9555J() throws IOException {
        m9584y(0);
        return ((zzyw) this.f17130a).m9539p();
    }

    /* renamed from: K */
    public final long m9556K() throws IOException {
        m9584y(1);
        return ((zzyw) this.f17130a).m9540q();
    }

    /* renamed from: L */
    public final long m9557L() throws IOException {
        m9584y(0);
        return zzyy.m9546m(((zzyw) this.f17130a).m9541r());
    }

    /* renamed from: M */
    public final long m9558M() throws IOException {
        m9584y(0);
        return ((zzyw) this.f17130a).m9541r();
    }

    @Deprecated
    /* renamed from: N */
    public final Object m9559N(zzabo zzaboVar, zzzk zzzkVar) throws IOException {
        m9584y(3);
        return m9581t(zzaboVar, zzzkVar);
    }

    /* renamed from: O */
    public final Object m9560O(zzabo zzaboVar, zzzk zzzkVar) throws IOException {
        m9584y(2);
        return m9582u(zzaboVar, zzzkVar);
    }

    /* renamed from: P */
    public final void m9561P(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzyj)) {
            int i2 = this.f17131b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f17130a.mo9535j()));
                    zzyy zzyyVar = this.f17130a;
                    if (zzyyVar.mo9534i()) {
                        return;
                    } else {
                        mo9528c = zzyyVar.mo9528c();
                    }
                } while (mo9528c == this.f17131b);
                this.f17133d = mo9528c;
                return;
            }
            if (i2 != 2) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            int mo9526a = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
            do {
                list.add(Boolean.valueOf(this.f17130a.mo9535j()));
            } while (this.f17130a.mo9526a() < mo9526a);
            m9583w(mo9526a);
            return;
        }
        zzyj zzyjVar = (zzyj) list;
        int i4 = this.f17131b & 7;
        if (i4 == 0) {
            do {
                zzyjVar.m9505d(this.f17130a.mo9535j());
                zzyy zzyyVar2 = this.f17130a;
                if (zzyyVar2.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar2.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        if (i4 != 2) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        int mo9526a2 = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
        do {
            zzyjVar.m9505d(this.f17130a.mo9535j());
        } while (this.f17130a.mo9526a() < mo9526a2);
        m9583w(mo9526a2);
    }

    /* renamed from: Q */
    public final void m9562Q(List list) throws IOException {
        int mo9528c;
        if ((this.f17131b & 7) != 2) {
            int i2 = zzaaf.f16261b;
            throw new zzaae();
        }
        do {
            list.add(mo8680d());
            zzyy zzyyVar = this.f17130a;
            if (zzyyVar.mo9534i()) {
                return;
            } else {
                mo9528c = zzyyVar.mo9528c();
            }
        } while (mo9528c == this.f17131b);
        this.f17133d = mo9528c;
    }

    /* renamed from: R */
    public final void m9563R(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzzh)) {
            int i2 = this.f17131b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzyw) this.f17130a).m9540q())));
                    zzyy zzyyVar = this.f17130a;
                    if (zzyyVar.mo9534i()) {
                        return;
                    } else {
                        mo9528c = zzyyVar.mo9528c();
                    }
                } while (mo9528c == this.f17131b);
                this.f17133d = mo9528c;
                return;
            }
            if (i2 != 2) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            int m9539p = ((zzyw) this.f17130a).m9539p();
            m9547A(m9539p);
            int mo9526a = this.f17130a.mo9526a() + m9539p;
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(((zzyw) this.f17130a).m9540q())));
            } while (this.f17130a.mo9526a() < mo9526a);
            return;
        }
        zzzh zzzhVar = (zzzh) list;
        int i4 = this.f17131b & 7;
        if (i4 == 1) {
            do {
                zzzhVar.m9624d(Double.longBitsToDouble(((zzyw) this.f17130a).m9540q()));
                zzyy zzyyVar2 = this.f17130a;
                if (zzyyVar2.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar2.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        if (i4 != 2) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        int m9539p2 = ((zzyw) this.f17130a).m9539p();
        m9547A(m9539p2);
        int mo9526a2 = this.f17130a.mo9526a() + m9539p2;
        do {
            zzzhVar.m9624d(Double.longBitsToDouble(((zzyw) this.f17130a).m9540q()));
        } while (this.f17130a.mo9526a() < mo9526a2);
    }

    /* renamed from: S */
    public final void m9564S(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzzy)) {
            int i2 = this.f17131b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((zzyw) this.f17130a).m9539p()));
                    zzyy zzyyVar = this.f17130a;
                    if (zzyyVar.mo9534i()) {
                        return;
                    } else {
                        mo9528c = zzyyVar.mo9528c();
                    }
                } while (mo9528c == this.f17131b);
                this.f17133d = mo9528c;
                return;
            }
            if (i2 != 2) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            int mo9526a = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
            do {
                list.add(Integer.valueOf(((zzyw) this.f17130a).m9539p()));
            } while (this.f17130a.mo9526a() < mo9526a);
            m9583w(mo9526a);
            return;
        }
        zzzy zzzyVar = (zzzy) list;
        int i4 = this.f17131b & 7;
        if (i4 == 0) {
            do {
                zzzyVar.m9659e(((zzyw) this.f17130a).m9539p());
                zzyy zzyyVar2 = this.f17130a;
                if (zzyyVar2.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar2.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        if (i4 != 2) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        int mo9526a2 = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
        do {
            zzzyVar.m9659e(((zzyw) this.f17130a).m9539p());
        } while (this.f17130a.mo9526a() < mo9526a2);
        m9583w(mo9526a2);
    }

    /* renamed from: T */
    public final void m9565T(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzzy)) {
            int i2 = this.f17131b & 7;
            if (i2 == 2) {
                int m9539p = ((zzyw) this.f17130a).m9539p();
                m9548z(m9539p);
                int mo9526a = this.f17130a.mo9526a() + m9539p;
                do {
                    list.add(Integer.valueOf(((zzyw) this.f17130a).m9538o()));
                } while (this.f17130a.mo9526a() < mo9526a);
                return;
            }
            if (i2 != 5) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            do {
                list.add(Integer.valueOf(((zzyw) this.f17130a).m9538o()));
                zzyy zzyyVar = this.f17130a;
                if (zzyyVar.mo9534i()) {
                    return;
                } else {
                    mo9528c = zzyyVar.mo9528c();
                }
            } while (mo9528c == this.f17131b);
            this.f17133d = mo9528c;
            return;
        }
        zzzy zzzyVar = (zzzy) list;
        int i4 = this.f17131b & 7;
        if (i4 == 2) {
            int m9539p2 = ((zzyw) this.f17130a).m9539p();
            m9548z(m9539p2);
            int mo9526a2 = this.f17130a.mo9526a() + m9539p2;
            do {
                zzzyVar.m9659e(((zzyw) this.f17130a).m9538o());
            } while (this.f17130a.mo9526a() < mo9526a2);
            return;
        }
        if (i4 != 5) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        do {
            zzzyVar.m9659e(((zzyw) this.f17130a).m9538o());
            zzyy zzyyVar2 = this.f17130a;
            if (zzyyVar2.mo9534i()) {
                return;
            } else {
                mo9528c2 = zzyyVar2.mo9528c();
            }
        } while (mo9528c2 == this.f17131b);
        this.f17133d = mo9528c2;
    }

    /* renamed from: a */
    public final void m9566a(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzaar)) {
            int i2 = this.f17131b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((zzyw) this.f17130a).m9540q()));
                    zzyy zzyyVar = this.f17130a;
                    if (zzyyVar.mo9534i()) {
                        return;
                    } else {
                        mo9528c = zzyyVar.mo9528c();
                    }
                } while (mo9528c == this.f17131b);
                this.f17133d = mo9528c;
                return;
            }
            if (i2 != 2) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            int m9539p = ((zzyw) this.f17130a).m9539p();
            m9547A(m9539p);
            int mo9526a = this.f17130a.mo9526a() + m9539p;
            do {
                list.add(Long.valueOf(((zzyw) this.f17130a).m9540q()));
            } while (this.f17130a.mo9526a() < mo9526a);
            return;
        }
        zzaar zzaarVar = (zzaar) list;
        int i4 = this.f17131b & 7;
        if (i4 == 1) {
            do {
                zzaarVar.m8599e(((zzyw) this.f17130a).m9540q());
                zzyy zzyyVar2 = this.f17130a;
                if (zzyyVar2.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar2.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        if (i4 != 2) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        int m9539p2 = ((zzyw) this.f17130a).m9539p();
        m9547A(m9539p2);
        int mo9526a2 = this.f17130a.mo9526a() + m9539p2;
        do {
            zzaarVar.m8599e(((zzyw) this.f17130a).m9540q());
        } while (this.f17130a.mo9526a() < mo9526a2);
    }

    /* renamed from: b */
    public final void m9567b(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzzr)) {
            int i2 = this.f17131b & 7;
            if (i2 == 2) {
                int m9539p = ((zzyw) this.f17130a).m9539p();
                m9548z(m9539p);
                int mo9526a = this.f17130a.mo9526a() + m9539p;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzyw) this.f17130a).m9538o())));
                } while (this.f17130a.mo9526a() < mo9526a);
                return;
            }
            if (i2 != 5) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(((zzyw) this.f17130a).m9538o())));
                zzyy zzyyVar = this.f17130a;
                if (zzyyVar.mo9534i()) {
                    return;
                } else {
                    mo9528c = zzyyVar.mo9528c();
                }
            } while (mo9528c == this.f17131b);
            this.f17133d = mo9528c;
            return;
        }
        zzzr zzzrVar = (zzzr) list;
        int i4 = this.f17131b & 7;
        if (i4 == 2) {
            int m9539p2 = ((zzyw) this.f17130a).m9539p();
            m9548z(m9539p2);
            int mo9526a2 = this.f17130a.mo9526a() + m9539p2;
            do {
                zzzrVar.m9641d(Float.intBitsToFloat(((zzyw) this.f17130a).m9538o()));
            } while (this.f17130a.mo9526a() < mo9526a2);
            return;
        }
        if (i4 != 5) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        do {
            zzzrVar.m9641d(Float.intBitsToFloat(((zzyw) this.f17130a).m9538o()));
            zzyy zzyyVar2 = this.f17130a;
            if (zzyyVar2.mo9534i()) {
                return;
            } else {
                mo9528c2 = zzyyVar2.mo9528c();
            }
        } while (mo9528c2 == this.f17131b);
        this.f17133d = mo9528c2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabn
    /* renamed from: c */
    public final long mo8679c() throws IOException {
        m9584y(1);
        return ((zzyw) this.f17130a).m9540q();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabn
    /* renamed from: d */
    public final zzyu mo8680d() throws IOException {
        m9584y(2);
        return this.f17130a.mo9529d();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabn
    /* renamed from: e */
    public final long mo8681e() throws IOException {
        m9584y(0);
        return ((zzyw) this.f17130a).m9541r();
    }

    @Deprecated
    /* renamed from: f */
    public final void m9568f(List list, zzabo zzaboVar, zzzk zzzkVar) throws IOException {
        int mo9528c;
        int i2 = this.f17131b;
        if ((i2 & 7) != 3) {
            int i3 = zzaaf.f16261b;
            throw new zzaae();
        }
        do {
            list.add(m9581t(zzaboVar, zzzkVar));
            zzyy zzyyVar = this.f17130a;
            if (zzyyVar.mo9534i() || this.f17133d != 0) {
                return;
            } else {
                mo9528c = zzyyVar.mo9528c();
            }
        } while (mo9528c == i2);
        this.f17133d = mo9528c;
    }

    /* renamed from: g */
    public final void m9569g(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzzy)) {
            int i2 = this.f17131b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((zzyw) this.f17130a).m9539p()));
                    zzyy zzyyVar = this.f17130a;
                    if (zzyyVar.mo9534i()) {
                        return;
                    } else {
                        mo9528c = zzyyVar.mo9528c();
                    }
                } while (mo9528c == this.f17131b);
                this.f17133d = mo9528c;
                return;
            }
            if (i2 != 2) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            int mo9526a = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
            do {
                list.add(Integer.valueOf(((zzyw) this.f17130a).m9539p()));
            } while (this.f17130a.mo9526a() < mo9526a);
            m9583w(mo9526a);
            return;
        }
        zzzy zzzyVar = (zzzy) list;
        int i4 = this.f17131b & 7;
        if (i4 == 0) {
            do {
                zzzyVar.m9659e(((zzyw) this.f17130a).m9539p());
                zzyy zzyyVar2 = this.f17130a;
                if (zzyyVar2.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar2.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        if (i4 != 2) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        int mo9526a2 = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
        do {
            zzzyVar.m9659e(((zzyw) this.f17130a).m9539p());
        } while (this.f17130a.mo9526a() < mo9526a2);
        m9583w(mo9526a2);
    }

    /* renamed from: h */
    public final void m9570h(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzaar)) {
            int i2 = this.f17131b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((zzyw) this.f17130a).m9541r()));
                    zzyy zzyyVar = this.f17130a;
                    if (zzyyVar.mo9534i()) {
                        return;
                    } else {
                        mo9528c = zzyyVar.mo9528c();
                    }
                } while (mo9528c == this.f17131b);
                this.f17133d = mo9528c;
                return;
            }
            if (i2 != 2) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            int mo9526a = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
            do {
                list.add(Long.valueOf(((zzyw) this.f17130a).m9541r()));
            } while (this.f17130a.mo9526a() < mo9526a);
            m9583w(mo9526a);
            return;
        }
        zzaar zzaarVar = (zzaar) list;
        int i4 = this.f17131b & 7;
        if (i4 == 0) {
            do {
                zzaarVar.m8599e(((zzyw) this.f17130a).m9541r());
                zzyy zzyyVar2 = this.f17130a;
                if (zzyyVar2.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar2.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        if (i4 != 2) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        int mo9526a2 = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
        do {
            zzaarVar.m8599e(((zzyw) this.f17130a).m9541r());
        } while (this.f17130a.mo9526a() < mo9526a2);
        m9583w(mo9526a2);
    }

    /* renamed from: i */
    public final void m9571i(List list, zzabo zzaboVar, zzzk zzzkVar) throws IOException {
        int mo9528c;
        int i2 = this.f17131b;
        if ((i2 & 7) != 2) {
            int i3 = zzaaf.f16261b;
            throw new zzaae();
        }
        do {
            list.add(m9582u(zzaboVar, zzzkVar));
            zzyy zzyyVar = this.f17130a;
            if (zzyyVar.mo9534i() || this.f17133d != 0) {
                return;
            } else {
                mo9528c = zzyyVar.mo9528c();
            }
        } while (mo9528c == i2);
        this.f17133d = mo9528c;
    }

    /* renamed from: j */
    public final void m9572j(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzzy)) {
            int i2 = this.f17131b & 7;
            if (i2 == 2) {
                int m9539p = ((zzyw) this.f17130a).m9539p();
                m9548z(m9539p);
                int mo9526a = this.f17130a.mo9526a() + m9539p;
                do {
                    list.add(Integer.valueOf(((zzyw) this.f17130a).m9538o()));
                } while (this.f17130a.mo9526a() < mo9526a);
                return;
            }
            if (i2 != 5) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            do {
                list.add(Integer.valueOf(((zzyw) this.f17130a).m9538o()));
                zzyy zzyyVar = this.f17130a;
                if (zzyyVar.mo9534i()) {
                    return;
                } else {
                    mo9528c = zzyyVar.mo9528c();
                }
            } while (mo9528c == this.f17131b);
            this.f17133d = mo9528c;
            return;
        }
        zzzy zzzyVar = (zzzy) list;
        int i4 = this.f17131b & 7;
        if (i4 == 2) {
            int m9539p2 = ((zzyw) this.f17130a).m9539p();
            m9548z(m9539p2);
            int mo9526a2 = this.f17130a.mo9526a() + m9539p2;
            do {
                zzzyVar.m9659e(((zzyw) this.f17130a).m9538o());
            } while (this.f17130a.mo9526a() < mo9526a2);
            return;
        }
        if (i4 != 5) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        do {
            zzzyVar.m9659e(((zzyw) this.f17130a).m9538o());
            zzyy zzyyVar2 = this.f17130a;
            if (zzyyVar2.mo9534i()) {
                return;
            } else {
                mo9528c2 = zzyyVar2.mo9528c();
            }
        } while (mo9528c2 == this.f17131b);
        this.f17133d = mo9528c2;
    }

    /* renamed from: k */
    public final void m9573k(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzaar)) {
            int i2 = this.f17131b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((zzyw) this.f17130a).m9540q()));
                    zzyy zzyyVar = this.f17130a;
                    if (zzyyVar.mo9534i()) {
                        return;
                    } else {
                        mo9528c = zzyyVar.mo9528c();
                    }
                } while (mo9528c == this.f17131b);
                this.f17133d = mo9528c;
                return;
            }
            if (i2 != 2) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            int m9539p = ((zzyw) this.f17130a).m9539p();
            m9547A(m9539p);
            int mo9526a = this.f17130a.mo9526a() + m9539p;
            do {
                list.add(Long.valueOf(((zzyw) this.f17130a).m9540q()));
            } while (this.f17130a.mo9526a() < mo9526a);
            return;
        }
        zzaar zzaarVar = (zzaar) list;
        int i4 = this.f17131b & 7;
        if (i4 == 1) {
            do {
                zzaarVar.m8599e(((zzyw) this.f17130a).m9540q());
                zzyy zzyyVar2 = this.f17130a;
                if (zzyyVar2.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar2.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        if (i4 != 2) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        int m9539p2 = ((zzyw) this.f17130a).m9539p();
        m9547A(m9539p2);
        int mo9526a2 = this.f17130a.mo9526a() + m9539p2;
        do {
            zzaarVar.m8599e(((zzyw) this.f17130a).m9540q());
        } while (this.f17130a.mo9526a() < mo9526a2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabn
    /* renamed from: l */
    public final int mo8682l() throws IOException {
        m9584y(5);
        return ((zzyw) this.f17130a).m9538o();
    }

    /* renamed from: m */
    public final void m9574m(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzzy)) {
            int i2 = this.f17131b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(zzyy.m9545l(((zzyw) this.f17130a).m9539p())));
                    zzyy zzyyVar = this.f17130a;
                    if (zzyyVar.mo9534i()) {
                        return;
                    } else {
                        mo9528c = zzyyVar.mo9528c();
                    }
                } while (mo9528c == this.f17131b);
                this.f17133d = mo9528c;
                return;
            }
            if (i2 != 2) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            int mo9526a = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
            do {
                list.add(Integer.valueOf(zzyy.m9545l(((zzyw) this.f17130a).m9539p())));
            } while (this.f17130a.mo9526a() < mo9526a);
            m9583w(mo9526a);
            return;
        }
        zzzy zzzyVar = (zzzy) list;
        int i4 = this.f17131b & 7;
        if (i4 == 0) {
            do {
                zzzyVar.m9659e(zzyy.m9545l(((zzyw) this.f17130a).m9539p()));
                zzyy zzyyVar2 = this.f17130a;
                if (zzyyVar2.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar2.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        if (i4 != 2) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        int mo9526a2 = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
        do {
            zzzyVar.m9659e(zzyy.m9545l(((zzyw) this.f17130a).m9539p()));
        } while (this.f17130a.mo9526a() < mo9526a2);
        m9583w(mo9526a2);
    }

    /* renamed from: n */
    public final void m9575n(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzaar)) {
            int i2 = this.f17131b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(zzyy.m9546m(((zzyw) this.f17130a).m9541r())));
                    zzyy zzyyVar = this.f17130a;
                    if (zzyyVar.mo9534i()) {
                        return;
                    } else {
                        mo9528c = zzyyVar.mo9528c();
                    }
                } while (mo9528c == this.f17131b);
                this.f17133d = mo9528c;
                return;
            }
            if (i2 != 2) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            int mo9526a = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
            do {
                list.add(Long.valueOf(zzyy.m9546m(((zzyw) this.f17130a).m9541r())));
            } while (this.f17130a.mo9526a() < mo9526a);
            m9583w(mo9526a);
            return;
        }
        zzaar zzaarVar = (zzaar) list;
        int i4 = this.f17131b & 7;
        if (i4 == 0) {
            do {
                zzaarVar.m8599e(zzyy.m9546m(((zzyw) this.f17130a).m9541r()));
                zzyy zzyyVar2 = this.f17130a;
                if (zzyyVar2.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar2.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        if (i4 != 2) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        int mo9526a2 = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
        do {
            zzaarVar.m8599e(zzyy.m9546m(((zzyw) this.f17130a).m9541r()));
        } while (this.f17130a.mo9526a() < mo9526a2);
        m9583w(mo9526a2);
    }

    /* renamed from: o */
    public final void m9576o(List list, boolean z) throws IOException {
        String mo9530e;
        int mo9528c;
        int mo9528c2;
        if ((this.f17131b & 7) != 2) {
            int i2 = zzaaf.f16261b;
            throw new zzaae();
        }
        if ((list instanceof zzaak) && !z) {
            zzaak zzaakVar = (zzaak) list;
            do {
                zzaakVar.mo8591i(mo8680d());
                zzyy zzyyVar = this.f17130a;
                if (zzyyVar.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        do {
            if (z) {
                m9584y(2);
                mo9530e = this.f17130a.mo9531f();
            } else {
                m9584y(2);
                mo9530e = this.f17130a.mo9530e();
            }
            list.add(mo9530e);
            zzyy zzyyVar2 = this.f17130a;
            if (zzyyVar2.mo9534i()) {
                return;
            } else {
                mo9528c = zzyyVar2.mo9528c();
            }
        } while (mo9528c == this.f17131b);
        this.f17133d = mo9528c;
    }

    /* renamed from: p */
    public final void m9577p(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzzy)) {
            int i2 = this.f17131b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((zzyw) this.f17130a).m9539p()));
                    zzyy zzyyVar = this.f17130a;
                    if (zzyyVar.mo9534i()) {
                        return;
                    } else {
                        mo9528c = zzyyVar.mo9528c();
                    }
                } while (mo9528c == this.f17131b);
                this.f17133d = mo9528c;
                return;
            }
            if (i2 != 2) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            int mo9526a = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
            do {
                list.add(Integer.valueOf(((zzyw) this.f17130a).m9539p()));
            } while (this.f17130a.mo9526a() < mo9526a);
            m9583w(mo9526a);
            return;
        }
        zzzy zzzyVar = (zzzy) list;
        int i4 = this.f17131b & 7;
        if (i4 == 0) {
            do {
                zzzyVar.m9659e(((zzyw) this.f17130a).m9539p());
                zzyy zzyyVar2 = this.f17130a;
                if (zzyyVar2.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar2.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        if (i4 != 2) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        int mo9526a2 = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
        do {
            zzzyVar.m9659e(((zzyw) this.f17130a).m9539p());
        } while (this.f17130a.mo9526a() < mo9526a2);
        m9583w(mo9526a2);
    }

    /* renamed from: q */
    public final void m9578q(List list) throws IOException {
        int mo9528c;
        int mo9528c2;
        if (!(list instanceof zzaar)) {
            int i2 = this.f17131b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((zzyw) this.f17130a).m9541r()));
                    zzyy zzyyVar = this.f17130a;
                    if (zzyyVar.mo9534i()) {
                        return;
                    } else {
                        mo9528c = zzyyVar.mo9528c();
                    }
                } while (mo9528c == this.f17131b);
                this.f17133d = mo9528c;
                return;
            }
            if (i2 != 2) {
                int i3 = zzaaf.f16261b;
                throw new zzaae();
            }
            int mo9526a = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
            do {
                list.add(Long.valueOf(((zzyw) this.f17130a).m9541r()));
            } while (this.f17130a.mo9526a() < mo9526a);
            m9583w(mo9526a);
            return;
        }
        zzaar zzaarVar = (zzaar) list;
        int i4 = this.f17131b & 7;
        if (i4 == 0) {
            do {
                zzaarVar.m8599e(((zzyw) this.f17130a).m9541r());
                zzyy zzyyVar2 = this.f17130a;
                if (zzyyVar2.mo9534i()) {
                    return;
                } else {
                    mo9528c2 = zzyyVar2.mo9528c();
                }
            } while (mo9528c2 == this.f17131b);
            this.f17133d = mo9528c2;
            return;
        }
        if (i4 != 2) {
            int i5 = zzaaf.f16261b;
            throw new zzaae();
        }
        int mo9526a2 = this.f17130a.mo9526a() + ((zzyw) this.f17130a).m9539p();
        do {
            zzaarVar.m8599e(((zzyw) this.f17130a).m9541r());
        } while (this.f17130a.mo9526a() < mo9526a2);
        m9583w(mo9526a2);
    }

    /* renamed from: r */
    public final boolean m9579r() throws IOException {
        m9584y(0);
        return this.f17130a.mo9535j();
    }

    /* renamed from: s */
    public final boolean m9580s() throws IOException {
        int i2;
        zzyy zzyyVar = this.f17130a;
        if (zzyyVar.mo9534i() || (i2 = this.f17131b) == this.f17132c) {
            return false;
        }
        return zzyyVar.mo9536k(i2);
    }

    /* renamed from: t */
    public final Object m9581t(zzabo zzaboVar, zzzk zzzkVar) throws IOException {
        int i2 = this.f17132c;
        this.f17132c = ((this.f17131b >>> 3) << 3) | 4;
        try {
            Object mo8659j = zzaboVar.mo8659j();
            zzaboVar.mo8655f(mo8659j, this, zzzkVar);
            zzaboVar.mo8652c(mo8659j);
            if (this.f17131b == this.f17132c) {
                return mo8659j;
            }
            throw zzaaf.m8583f();
        } finally {
            this.f17132c = i2;
        }
    }

    /* renamed from: u */
    public final Object m9582u(zzabo zzaboVar, zzzk zzzkVar) throws IOException {
        int m9539p = ((zzyw) this.f17130a).m9539p();
        zzyy zzyyVar = this.f17130a;
        if (zzyyVar.f17128a >= 100) {
            throw new zzaaf("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int mo9527b = zzyyVar.mo9527b(m9539p);
        Object mo8659j = zzaboVar.mo8659j();
        this.f17130a.f17128a++;
        zzaboVar.mo8655f(mo8659j, this, zzzkVar);
        zzaboVar.mo8652c(mo8659j);
        this.f17130a.mo9532g(0);
        r5.f17128a--;
        this.f17130a.mo9533h(mo9527b);
        return mo8659j;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabn
    /* renamed from: v */
    public final int mo8683v() throws IOException {
        int i2 = this.f17133d;
        if (i2 != 0) {
            this.f17131b = i2;
            this.f17133d = 0;
        } else {
            i2 = this.f17130a.mo9528c();
            this.f17131b = i2;
        }
        if (i2 == 0 || i2 == this.f17132c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* renamed from: w */
    public final void m9583w(int i2) throws IOException {
        if (this.f17130a.mo9526a() != i2) {
            throw zzaaf.m8584g();
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabn
    /* renamed from: x */
    public final int mo8684x() {
        return this.f17131b;
    }

    /* renamed from: y */
    public final void m9584y(int i2) throws IOException {
        if ((this.f17131b & 7) == i2) {
            return;
        }
        int i3 = zzaaf.f16261b;
        throw new zzaae();
    }
}
