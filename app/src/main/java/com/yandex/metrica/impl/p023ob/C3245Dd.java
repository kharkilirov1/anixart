package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Dd */
/* loaded from: classes2.dex */
public class C3245Dd {

    /* renamed from: a */
    @NonNull
    private final C3897dd f42712a;

    /* renamed from: b */
    @NonNull
    private final C4450yk f42713b;

    /* renamed from: c */
    @NonNull
    private final C3835b3 f42714c;

    /* renamed from: d */
    @NonNull
    private final C3768Yc f42715d;

    /* renamed from: e */
    private final C3366I9 f42716e;

    public C3245Dd(@NonNull C3897dd c3897dd, @NonNull C3835b3 c3835b3, @NonNull C3366I9 c3366i9) {
        this(c3897dd, C3532P0.m18696i().m18720w(), c3835b3, c3366i9, C3532P0.m18696i().m18708k());
    }

    /* renamed from: a */
    private void m17962a() {
        boolean m18295f = this.f42716e.m18295f();
        this.f42712a.m19726a(m18295f);
        this.f42714c.m19642a(m18295f);
        this.f42713b.mo19053a(m18295f);
        this.f42715d.m19453c();
    }

    /* renamed from: b */
    public void m17966b(@NonNull Object obj) {
        this.f42712a.m19727b(obj);
        this.f42713b.mo19054b();
    }

    @VisibleForTesting
    public C3245Dd(@NonNull C3897dd c3897dd, @NonNull C4450yk c4450yk, @NonNull C3835b3 c3835b3, @NonNull C3366I9 c3366i9, @NonNull C3768Yc c3768Yc) {
        this.f42712a = c3897dd;
        this.f42713b = c4450yk;
        this.f42714c = c3835b3;
        this.f42716e = c3366i9;
        this.f42715d = c3768Yc;
        c3768Yc.m19451a(c4450yk);
        m17962a();
    }

    /* renamed from: a */
    public void m17964a(@NonNull Object obj) {
        this.f42712a.m19725a(obj);
        this.f42713b.mo19049a();
    }

    /* renamed from: a */
    public void m17965a(boolean z) {
        this.f42712a.m19726a(z);
        this.f42713b.mo19053a(z);
        this.f42714c.m19642a(z);
        this.f42716e.m18291d(z);
    }

    /* renamed from: a */
    public void m17963a(@NonNull C3575Qi c3575Qi) {
        this.f42715d.m19450a(c3575Qi);
        this.f42714c.m19641a(c3575Qi);
        this.f42713b.mo19051a(c3575Qi);
    }
}
