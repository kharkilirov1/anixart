package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.e01;
import com.yandex.mobile.ads.impl.g81;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class f81 implements InterfaceC5412lt {

    /* renamed from: a */
    private final int f50157a;

    /* renamed from: b */
    private final int f50158b;

    /* renamed from: c */
    private final List<p61> f50159c;

    /* renamed from: d */
    private final ap0 f50160d;

    /* renamed from: e */
    private final SparseIntArray f50161e;

    /* renamed from: f */
    private final g81.InterfaceC5111c f50162f;

    /* renamed from: g */
    private final SparseArray<g81> f50163g;

    /* renamed from: h */
    private final SparseBooleanArray f50164h;

    /* renamed from: i */
    private final SparseBooleanArray f50165i;

    /* renamed from: j */
    private final e81 f50166j;

    /* renamed from: k */
    private d81 f50167k;

    /* renamed from: l */
    private InterfaceC5509nt f50168l;

    /* renamed from: m */
    private int f50169m;

    /* renamed from: n */
    private boolean f50170n;

    /* renamed from: o */
    private boolean f50171o;

    /* renamed from: p */
    private boolean f50172p;

    /* renamed from: q */
    @Nullable
    private g81 f50173q;

    /* renamed from: r */
    private int f50174r;

    /* renamed from: s */
    private int f50175s;

    /* renamed from: com.yandex.mobile.ads.impl.f81$a */
    public class C5066a implements c01 {

        /* renamed from: a */
        private final zo0 f50176a = new zo0(new byte[4]);

        public C5066a() {
        }

        @Override // com.yandex.mobile.ads.impl.c01
        /* renamed from: a */
        public final void mo22998a(ap0 ap0Var) {
            if (ap0Var.m22607t() == 0 && (ap0Var.m22607t() & 128) != 0) {
                ap0Var.m22593f(6);
                int m22579a = ap0Var.m22579a() / 4;
                for (int i2 = 0; i2 < m22579a; i2++) {
                    zo0 zo0Var = this.f50176a;
                    ap0Var.m22583a(zo0Var.f57274a, 0, 4);
                    zo0Var.m30255c(0);
                    int m30252b = this.f50176a.m30252b(16);
                    this.f50176a.m30257d(3);
                    if (m30252b == 0) {
                        this.f50176a.m30257d(13);
                    } else {
                        int m30252b2 = this.f50176a.m30252b(13);
                        if (f81.this.f50163g.get(m30252b2) == null) {
                            f81.this.f50163g.put(m30252b2, new d01(f81.this.new C5067b(m30252b2)));
                            f81.m24359e(f81.this);
                        }
                    }
                }
                if (f81.this.f50157a != 2) {
                    f81.this.f50163g.remove(0);
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.c01
        /* renamed from: a */
        public final void mo22999a(p61 p61Var, InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.f81$b */
    public class C5067b implements c01 {

        /* renamed from: a */
        private final zo0 f50178a = new zo0(new byte[5]);

        /* renamed from: b */
        private final SparseArray<g81> f50179b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f50180c = new SparseIntArray();

        /* renamed from: d */
        private final int f50181d;

        public C5067b(int i2) {
            this.f50181d = i2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x0182, code lost:
        
            if (r26.m22607t() == r14) goto L57;
         */
        @Override // com.yandex.mobile.ads.impl.c01
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo22998a(com.yandex.mobile.ads.impl.ap0 r26) {
            /*
                Method dump skipped, instructions count: 810
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.f81.C5067b.mo22998a(com.yandex.mobile.ads.impl.ap0):void");
        }

        @Override // com.yandex.mobile.ads.impl.c01
        /* renamed from: a */
        public final void mo22999a(p61 p61Var, InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        }
    }

    static {
        dn1 dn1Var = dn1.f49710u;
    }

    public f81(int i2) {
        this(new p61(0L), new C5241io());
    }

    /* renamed from: e */
    public static /* synthetic */ void m24359e(f81 f81Var) {
        f81Var.f50169m++;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    public f81(p61 p61Var, C5241io c5241io) {
        this.f50162f = (g81.InterfaceC5111c) C5220ia.m25469a(c5241io);
        this.f50158b = 112800;
        this.f50157a = 1;
        this.f50159c = Collections.singletonList(p61Var);
        this.f50160d = new ap0(0, new byte[9400]);
        this.f50164h = new SparseBooleanArray();
        this.f50165i = new SparseBooleanArray();
        this.f50163g = new SparseArray<>();
        this.f50161e = new SparseIntArray();
        this.f50166j = new e81();
        this.f50168l = InterfaceC5509nt.f53089a;
        this.f50175s = -1;
        m24354b();
    }

    /* renamed from: b */
    private void m24354b() {
        this.f50164h.clear();
        this.f50163g.clear();
        SparseArray<g81> mo24819a = this.f50162f.mo24819a();
        int size = mo24819a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f50163g.put(mo24819a.keyAt(i2), mo24819a.valueAt(i2));
        }
        this.f50163g.put(0, new d01(new C5066a()));
        this.f50173q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static InterfaceC5412lt[] m24352a() {
        return new InterfaceC5412lt[]{new f81(0)};
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        boolean z;
        byte[] m22587c = this.f50160d.m22587c();
        C5598pn c5598pn = (C5598pn) interfaceC5458mt;
        c5598pn.mo26764b(m22587c, 0, 940, false);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    z = true;
                    break;
                }
                if (m22587c[(i3 * 188) + i2] != 71) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                c5598pn.mo26760a(i2);
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f50168l = interfaceC5509nt;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        d81 d81Var;
        C5220ia.m25476b(this.f50157a != 2);
        int size = this.f50159c.size();
        for (int i2 = 0; i2 < size; i2++) {
            p61 p61Var = this.f50159c.get(i2);
            boolean z = p61Var.m27174c() == -9223372036854775807L;
            if (!z) {
                long m27170a = p61Var.m27170a();
                z = (m27170a == -9223372036854775807L || m27170a == 0 || m27170a == j3) ? false : true;
            }
            if (z) {
                p61Var.m27175c(j3);
            }
        }
        if (j3 != 0 && (d81Var = this.f50167k) != null) {
            d81Var.m28213a(j3);
        }
        this.f50160d.m22586c(0);
        this.f50161e.clear();
        for (int i3 = 0; i3 < this.f50163g.size(); i3++) {
            this.f50163g.valueAt(i3).mo23746a();
        }
        this.f50174r = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final int mo22424a(InterfaceC5458mt interfaceC5458mt, qr0 qr0Var) throws IOException {
        C5598pn c5598pn;
        ?? r14;
        ?? r15;
        boolean z;
        C5598pn c5598pn2;
        long j2;
        boolean z2;
        boolean z3;
        C5598pn c5598pn3 = (C5598pn) interfaceC5458mt;
        long mo22717a = c5598pn3.mo22717a();
        if (this.f50170n) {
            if (((mo22717a == -1 || this.f50157a == 2) ? false : true) && !this.f50166j.m24043c()) {
                return this.f50166j.m24040a(c5598pn3, qr0Var, this.f50175s);
            }
            if (this.f50171o) {
                c5598pn2 = c5598pn3;
                j2 = 0;
                z2 = true;
                z3 = false;
            } else {
                this.f50171o = true;
                if (this.f50166j.m24041a() != -9223372036854775807L) {
                    c5598pn2 = c5598pn3;
                    j2 = 0;
                    z3 = false;
                    z2 = true;
                    d81 d81Var = new d81(this.f50166j.m24042b(), this.f50166j.m24041a(), mo22717a, this.f50175s, this.f50158b);
                    this.f50167k = d81Var;
                    this.f50168l.mo23024a(d81Var.m28212a());
                } else {
                    c5598pn2 = c5598pn3;
                    j2 = 0;
                    z2 = true;
                    z3 = false;
                    this.f50168l.mo23024a(new e01.C4998b(this.f50166j.m24041a(), 0L));
                }
            }
            if (this.f50172p) {
                this.f50172p = z3;
                mo22430a(j2, j2);
                if (c5598pn2.getPosition() != j2) {
                    qr0Var.f54129a = j2;
                    return z2 ? 1 : 0;
                }
            }
            d81 d81Var2 = this.f50167k;
            if (d81Var2 != null && d81Var2.m28214b()) {
                return this.f50167k.m28211a(c5598pn2, qr0Var);
            }
            c5598pn = c5598pn2;
            r14 = z2;
            r15 = z3;
        } else {
            c5598pn = c5598pn3;
            r14 = 1;
            r15 = 0;
        }
        byte[] m22587c = this.f50160d.m22587c();
        if (9400 - this.f50160d.m22588d() < 188) {
            int m22579a = this.f50160d.m22579a();
            if (m22579a > 0) {
                System.arraycopy(m22587c, this.f50160d.m22588d(), m22587c, r15, m22579a);
            }
            this.f50160d.m22582a(m22579a, m22587c);
        }
        while (true) {
            if (this.f50160d.m22579a() >= 188) {
                z = true;
                break;
            }
            int m22590e = this.f50160d.m22590e();
            int read = c5598pn.read(m22587c, m22590e, 9400 - m22590e);
            if (read == -1) {
                z = false;
                break;
            }
            this.f50160d.m22589d(m22590e + read);
        }
        if (!z) {
            return -1;
        }
        int m22588d = this.f50160d.m22588d();
        int m22590e2 = this.f50160d.m22590e();
        byte[] m22587c2 = this.f50160d.m22587c();
        int i2 = m22588d;
        while (i2 < m22590e2 && m22587c2[i2] != 71) {
            i2++;
        }
        this.f50160d.m22591e(i2);
        int i3 = i2 + 188;
        if (i3 > m22590e2) {
            int i4 = (i2 - m22588d) + this.f50174r;
            this.f50174r = i4;
            if (this.f50157a == 2 && i4 > 376) {
                throw ep0.m24225a("Cannot find sync byte. Most likely not a Transport Stream.", (Exception) null);
            }
        } else {
            this.f50174r = r15;
        }
        int m22590e3 = this.f50160d.m22590e();
        if (i3 > m22590e3) {
            return r15;
        }
        int m22595h = this.f50160d.m22595h();
        if ((8388608 & m22595h) != 0) {
            this.f50160d.m22591e(i3);
            return r15;
        }
        int i5 = ((4194304 & m22595h) != 0 ? 1 : 0) | 0;
        int i6 = (2096896 & m22595h) >> 8;
        boolean z4 = (m22595h & 32) != 0;
        g81 g81Var = (m22595h & 16) != 0 ? this.f50163g.get(i6) : null;
        if (g81Var == null) {
            this.f50160d.m22591e(i3);
            return r15;
        }
        if (this.f50157a != 2) {
            int i7 = m22595h & 15;
            int i8 = this.f50161e.get(i6, i7 - 1);
            this.f50161e.put(i6, i7);
            if (i8 == i7) {
                this.f50160d.m22591e(i3);
                return r15;
            }
            if (i7 != ((i8 + r14) & 15)) {
                g81Var.mo23746a();
            }
        }
        if (z4) {
            int m22607t = this.f50160d.m22607t();
            i5 |= (this.f50160d.m22607t() & 64) != 0 ? 2 : 0;
            this.f50160d.m22593f(m22607t - r14);
        }
        boolean z5 = this.f50170n;
        if (this.f50157a == 2 || z5 || !this.f50165i.get(i6, r15)) {
            this.f50160d.m22589d(i3);
            g81Var.mo23747a(i5, this.f50160d);
            this.f50160d.m22589d(m22590e3);
        }
        if (this.f50157a != 2 && !z5 && this.f50170n && mo22717a != -1) {
            this.f50172p = r14;
        }
        this.f50160d.m22591e(i3);
        return r15;
    }
}
