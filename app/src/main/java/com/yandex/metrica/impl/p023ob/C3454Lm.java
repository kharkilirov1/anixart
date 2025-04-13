package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Lm */
/* loaded from: classes2.dex */
public class C3454Lm implements InterfaceC3807a1 {

    /* renamed from: a */
    private volatile long f43357a;

    /* renamed from: b */
    private C3366I9 f43358b;

    /* renamed from: c */
    private InterfaceC3529Om f43359c;

    /* renamed from: com.yandex.metrica.impl.ob.Lm$b */
    public static class b {

        /* renamed from: a */
        public static C3454Lm f43360a = new C3454Lm();
    }

    /* renamed from: c */
    public static C3454Lm m18520c() {
        return b.f43360a;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3807a1
    /* renamed from: a */
    public synchronized long mo18321a() {
        return this.f43357a;
    }

    /* renamed from: b */
    public synchronized void m18522b() {
        this.f43358b.m18289c(false);
        this.f43358b.m18227c();
    }

    /* renamed from: d */
    public synchronized void m18523d() {
        C3366I9 m18718u = C3532P0.m18696i().m18718u();
        C3504Nm c3504Nm = new C3504Nm();
        this.f43358b = m18718u;
        this.f43357a = m18718u.m18282b(0);
        this.f43359c = c3504Nm;
    }

    /* renamed from: e */
    public synchronized boolean m18524e() {
        return this.f43358b.m18281a(true);
    }

    private C3454Lm() {
    }

    /* renamed from: a */
    public synchronized void m18521a(long j2, @Nullable Long l2) {
        this.f43357a = (j2 - this.f43359c.mo18643a()) / 1000;
        boolean z = true;
        if (this.f43358b.m18281a(true)) {
            if (l2 != null) {
                long abs = Math.abs(j2 - this.f43359c.mo18643a());
                C3366I9 c3366i9 = this.f43358b;
                if (abs <= TimeUnit.SECONDS.toMillis(l2.longValue())) {
                    z = false;
                }
                c3366i9.m18289c(z);
            } else {
                this.f43358b.m18289c(false);
            }
        }
        this.f43358b.m18306l(this.f43357a);
        this.f43358b.m18227c();
    }
}
