package com.yandex.metrica.impl.p023ob;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3581R0;
import com.yandex.metrica.impl.p023ob.C3718Wc;
import java.util.Collection;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Pc */
/* loaded from: classes2.dex */
public class C3544Pc {

    /* renamed from: a */
    @NonNull
    private final C3569Qc f43629a;

    /* renamed from: b */
    @NonNull
    private final C3593Rc f43630b;

    /* renamed from: c */
    @NonNull
    private final C3504Nm f43631c;

    /* renamed from: d */
    @Nullable
    private C3668Uc f43632d;

    /* renamed from: e */
    @NonNull
    private final C3456M f43633e;

    /* renamed from: f */
    @NonNull
    private final C3835b3 f43634f;

    /* renamed from: g */
    @NonNull
    private final C3320Gd f43635g;

    /* renamed from: h */
    @NonNull
    private final C3256E f43636h;

    /* renamed from: i */
    private boolean f43637i;

    /* renamed from: j */
    private final Runnable f43638j;

    /* renamed from: com.yandex.metrica.impl.ob.Pc$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3544Pc.this.m18740b();
            C3544Pc.this.m18738c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Pc$b */
    public class b implements InterfaceC3725Wj {

        /* renamed from: a */
        public final /* synthetic */ C3643Tc f43640a;

        public b(C3544Pc c3544Pc, C3643Tc c3643Tc) {
            this.f43640a = c3643Tc;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3725Wj
        /* renamed from: a */
        public void mo18743a(Collection<C3700Vj> collection) {
            this.f43640a.m19150a(C4452ym.m21242a(collection));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3544Pc(@androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C3569Qc r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.Gd r0 = new com.yandex.metrica.impl.ob.Gd
            com.yandex.metrica.impl.ob.zc r1 = r4.f43699a
            android.content.Context r1 = r1.f47108a
            com.yandex.metrica.impl.ob.Uc r2 = r4.f43703e
            if (r2 != 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            com.yandex.metrica.impl.ob.Ec r2 = r2.f44144m
        Le:
            r0.<init>(r1, r2)
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3544Pc.<init>(com.yandex.metrica.impl.ob.Qc):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m18738c() {
        C3668Uc c3668Uc = this.f43632d;
        if (c3668Uc != null) {
            long j2 = c3668Uc.f44139h;
            if (j2 > 0) {
                this.f43629a.f43699a.f47109b.m20673a(this.f43638j, j2);
            }
        }
    }

    /* renamed from: b */
    public void m18740b() {
        C3643Tc c3643Tc = new C3643Tc();
        Objects.requireNonNull(this.f43631c);
        c3643Tc.m19152b(System.currentTimeMillis());
        Objects.requireNonNull(this.f43631c);
        c3643Tc.m19146a(SystemClock.elapsedRealtime());
        this.f43635g.m18163b();
        c3643Tc.m19153b(C3783Z2.m19493a(this.f43634f.m19640a().mo18725a()));
        this.f43629a.f43700b.mo19052a(new b(this, c3643Tc));
        c3643Tc.m19147a(this.f43633e.m18535b());
        c3643Tc.m19148a(C3718Wc.a.m19354a(this.f43636h.m17992c()));
        this.f43630b.m18964a(c3643Tc);
        this.f43629a.f43701c.mo17827a();
        this.f43629a.f43702d.m21199a();
    }

    /* renamed from: d */
    public void m18741d() {
        m18736a();
    }

    /* renamed from: e */
    public void m18742e() {
        this.f43629a.f43699a.f47109b.m20672a(this.f43638j);
    }

    /* renamed from: a */
    private void m18736a() {
        C3668Uc c3668Uc = this.f43632d;
        boolean z = c3668Uc != null && c3668Uc.f44140i;
        if (this.f43637i != z) {
            this.f43637i = z;
            if (z) {
                m18738c();
            } else {
                this.f43629a.f43699a.f47109b.m20672a(this.f43638j);
            }
        }
    }

    private C3544Pc(@NonNull C3569Qc c3569Qc, @NonNull C3320Gd c3320Gd) {
        this(c3569Qc, new C3593Rc(c3569Qc.f43699a.f47108a), new C3504Nm(), C3532P0.m18696i().m18702d(), C3532P0.m18696i().m18701c(), C3835b3.m19636a(c3569Qc.f43699a.f47108a), c3320Gd, new C3581R0.c());
    }

    /* renamed from: a */
    public void m18739a(@Nullable C3668Uc c3668Uc) {
        this.f43632d = c3668Uc;
        this.f43635g.m18162a(c3668Uc == null ? null : c3668Uc.f44144m);
        m18736a();
    }

    public C3544Pc(@NonNull C3569Qc c3569Qc, @NonNull C3593Rc c3593Rc, @NonNull C3504Nm c3504Nm, @NonNull C3456M c3456m, @NonNull C3256E c3256e, @NonNull C3835b3 c3835b3, @NonNull C3320Gd c3320Gd, @NonNull C3581R0.c cVar) {
        this.f43638j = new a();
        this.f43629a = c3569Qc;
        this.f43630b = c3593Rc;
        this.f43631c = c3504Nm;
        this.f43632d = c3569Qc.f43703e;
        this.f43633e = c3456m;
        this.f43636h = c3256e;
        this.f43634f = c3835b3;
        this.f43635g = c3320Gd;
        c3835b3.m19640a().m18771a(cVar.m18933a(c3569Qc.f43699a.f47109b, c3320Gd, c3835b3.m19640a()));
    }
}
