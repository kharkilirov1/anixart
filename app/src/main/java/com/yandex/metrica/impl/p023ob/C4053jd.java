package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3581R0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.jd */
/* loaded from: classes2.dex */
public class C4053jd implements InterfaceC3631T0 {

    /* renamed from: a */
    @NonNull
    private C4417xd f45408a;

    /* renamed from: b */
    @NonNull
    private C4079kd f45409b;

    /* renamed from: c */
    @NonNull
    private final List<C4131md<?>> f45410c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3743Xc<C3269Ec> f45411d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC3743Xc<C3269Ec> f45412e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC3743Xc<C3269Ec> f45413f;

    /* renamed from: g */
    @NonNull
    private final InterfaceC3743Xc<C3394Jc> f45414g;

    /* renamed from: h */
    @NonNull
    private final C3581R0 f45415h;

    /* renamed from: i */
    private boolean f45416i;

    public C4053jd(@NonNull C4079kd c4079kd, @NonNull C4417xd c4417xd) {
        this(c4079kd, c4417xd, C3532P0.m18696i().m18718u());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3631T0
    /* renamed from: a */
    public void mo18161a() {
        if (this.f45416i) {
            Iterator<C4131md<?>> it = this.f45410c.iterator();
            while (it.hasNext()) {
                it.next().m20401c();
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public Location m20089b() {
        if (this.f45416i) {
            return this.f45408a.m21142a();
        }
        return null;
    }

    /* renamed from: c */
    public void m20090c() {
        if (this.f45416i) {
            this.f45415h.m18930a();
            Iterator<C4131md<?>> it = this.f45410c.iterator();
            while (it.hasNext()) {
                it.next().m20398a();
            }
        }
    }

    /* renamed from: d */
    public void m20091d() {
        this.f45415h.m18932c();
        Iterator<C4131md<?>> it = this.f45410c.iterator();
        while (it.hasNext()) {
            it.next().m20400b();
        }
    }

    private C4053jd(@NonNull C4079kd c4079kd, @NonNull C4417xd c4417xd, @NonNull C3366I9 c3366i9) {
        this(c4079kd, c4417xd, new C3469Mc(c4079kd, c3366i9), new C3618Sc(c4079kd, c3366i9), new C4313td(c4079kd), new C3444Lc(c4079kd, c3366i9, c4417xd), new C3581R0.c());
    }

    @VisibleForTesting
    public C4053jd(@NonNull C4079kd c4079kd, @NonNull C4417xd c4417xd, @NonNull AbstractC4390wc abstractC4390wc, @NonNull AbstractC4390wc abstractC4390wc2, @NonNull C4313td c4313td, @NonNull C3444Lc c3444Lc, @NonNull C3581R0.c cVar) {
        C3269Ec c3269Ec;
        C3269Ec c3269Ec2;
        C3269Ec c3269Ec3;
        this.f45409b = c4079kd;
        C3668Uc c3668Uc = c4079kd.f45613c;
        C3394Jc c3394Jc = null;
        if (c3668Uc != null) {
            this.f45416i = c3668Uc.f44138g;
            C3269Ec c3269Ec4 = c3668Uc.f44145n;
            c3269Ec2 = c3668Uc.f44146o;
            c3269Ec3 = c3668Uc.f44147p;
            c3394Jc = c3668Uc.f44148q;
            c3269Ec = c3269Ec4;
        } else {
            c3269Ec = null;
            c3269Ec2 = null;
            c3269Ec3 = null;
        }
        this.f45408a = c4417xd;
        C4131md<C3269Ec> m21094a = abstractC4390wc.m21094a(c4417xd, c3269Ec2);
        C4131md<C3269Ec> m21094a2 = abstractC4390wc2.m21094a(c4417xd, c3269Ec);
        C4131md<C3269Ec> m20813a = c4313td.m20813a(c4417xd, c3269Ec3);
        C4131md<C3394Jc> m18499a = c3444Lc.m18499a(c3394Jc);
        this.f45410c = Arrays.asList(m21094a, m21094a2, m20813a, m18499a);
        this.f45411d = m21094a2;
        this.f45412e = m21094a;
        this.f45413f = m20813a;
        this.f45414g = m18499a;
        C3581R0 m18933a = cVar.m18933a(this.f45409b.f45611a.f47109b, this, this.f45408a.m21146b());
        this.f45415h = m18933a;
        this.f45408a.m21146b().m18771a(m18933a);
    }

    /* renamed from: a */
    public void m20087a(@NonNull C3575Qi c3575Qi) {
        this.f45408a.m21144a(c3575Qi);
    }

    /* renamed from: a */
    public void m20088a(@Nullable C3668Uc c3668Uc) {
        this.f45416i = c3668Uc != null && c3668Uc.f44138g;
        this.f45408a.m21145a(c3668Uc);
        ((C4131md) this.f45411d).m20399a(c3668Uc == null ? null : c3668Uc.f44145n);
        ((C4131md) this.f45412e).m20399a(c3668Uc == null ? null : c3668Uc.f44146o);
        ((C4131md) this.f45413f).m20399a(c3668Uc == null ? null : c3668Uc.f44147p);
        ((C4131md) this.f45414g).m20399a(c3668Uc != null ? c3668Uc.f44148q : null);
        mo18161a();
    }
}
