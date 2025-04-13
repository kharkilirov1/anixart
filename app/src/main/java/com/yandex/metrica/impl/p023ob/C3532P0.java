package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3459M2;
import com.yandex.metrica.impl.p023ob.C3922ec;
import com.yandex.metrica.impl.p023ob.C4108lg;
import com.yandex.metrica.impl.p023ob.InterfaceC3467Ma;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.P0 */
/* loaded from: classes2.dex */
public final class C3532P0 {

    /* renamed from: y */
    @SuppressLint
    private static volatile C3532P0 f43586y;

    /* renamed from: a */
    @NonNull
    private final Context f43587a;

    /* renamed from: b */
    private volatile C3672Ug f43588b;

    /* renamed from: c */
    private volatile C3424Kh f43589c;

    /* renamed from: d */
    @Nullable
    private volatile C4108lg f43590d;

    /* renamed from: e */
    @Nullable
    private volatile C3543Pb f43591e;

    /* renamed from: f */
    @Nullable
    private volatile C3459M2 f43592f;

    /* renamed from: h */
    @Nullable
    private volatile C3249Dh f43594h;

    /* renamed from: i */
    @Nullable
    private volatile C3457M0 f43595i;

    /* renamed from: k */
    @Nullable
    private volatile C4450yk f43597k;

    /* renamed from: l */
    @NonNull
    private volatile C3456M f43598l;

    /* renamed from: m */
    @Nullable
    private volatile C3234D2 f43599m;

    /* renamed from: n */
    @Nullable
    private volatile C3582R1 f43600n;

    /* renamed from: o */
    @Nullable
    private volatile C3768Yc f43601o;

    /* renamed from: p */
    @Nullable
    private volatile C3922ec f43602p;

    /* renamed from: q */
    @Nullable
    private volatile C4026ic f43603q;

    /* renamed from: r */
    @Nullable
    private volatile C3860c2 f43604r;

    /* renamed from: s */
    @Nullable
    private volatile C3556Q f43605s;

    /* renamed from: t */
    @Nullable
    private volatile C3366I9 f43606t;

    /* renamed from: u */
    @Nullable
    private volatile C3415K8 f43607u;

    /* renamed from: w */
    @NonNull
    private C4171o1 f43609w;

    /* renamed from: x */
    @Nullable
    private C3794Zd f43610x;

    /* renamed from: j */
    @NonNull
    private volatile C4479zn f43596j = new C4479zn();

    /* renamed from: g */
    @NonNull
    private C4377w f43593g = new C4377w();

    /* renamed from: v */
    @NonNull
    private C4432y2 f43608v = new C4432y2();

    private C3532P0(@NonNull Context context) {
        this.f43587a = context;
        this.f43609w = new C4171o1(context, this.f43596j.m21316b());
        this.f43598l = new C3456M(this.f43596j.m21316b(), this.f43609w.m20470b());
    }

    /* renamed from: A */
    private void m18694A() {
        if (this.f43604r == null) {
            synchronized (this) {
                if (this.f43604r == null) {
                    C3566Q9 mo18575a = InterfaceC3467Ma.b.m18577a(C3196Be.class).mo18575a(this.f43587a);
                    C3196Be c3196Be = (C3196Be) mo18575a.m18782b();
                    Context context = this.f43587a;
                    C3371Ie c3371Ie = new C3371Ie();
                    C3171Ae c3171Ae = new C3171Ae(c3196Be);
                    C3496Ne c3496Ne = new C3496Ne();
                    C3346He c3346He = new C3346He(this.f43587a);
                    C3532P0 m18696i = m18696i();
                    Intrinsics.m32178g(m18696i, "GlobalServiceLocator.getInstance()");
                    C3366I9 m18718u = m18696i.m18718u();
                    Intrinsics.m32178g(m18718u, "GlobalServiceLocator.get…ance().servicePreferences");
                    this.f43604r = new C3860c2(context, mo18575a, c3371Ie, c3171Ae, c3496Ne, c3346He, new C3396Je(m18718u), new C3221Ce(), c3196Be, "[PreloadInfoStorage]");
                }
            }
        }
    }

    /* renamed from: a */
    public static void m18695a(@NonNull Context context) {
        if (f43586y == null) {
            synchronized (C3532P0.class) {
                if (f43586y == null) {
                    f43586y = new C3532P0(context.getApplicationContext());
                }
            }
        }
    }

    /* renamed from: i */
    public static C3532P0 m18696i() {
        return f43586y;
    }

    @NonNull
    /* renamed from: b */
    public C4026ic m18700b() {
        if (this.f43603q == null) {
            synchronized (this) {
                if (this.f43603q == null) {
                    this.f43603q = new C4026ic(this.f43587a, C4052jc.m20086a());
                }
            }
        }
        return this.f43603q;
    }

    @NonNull
    /* renamed from: c */
    public C3256E m18701c() {
        return this.f43609w.m20468a();
    }

    @NonNull
    /* renamed from: d */
    public C3456M m18702d() {
        return this.f43598l;
    }

    @NonNull
    /* renamed from: e */
    public C3556Q m18703e() {
        if (this.f43605s == null) {
            synchronized (this) {
                if (this.f43605s == null) {
                    C3566Q9 mo18575a = InterfaceC3467Ma.b.m18577a(C3535P3.class).mo18575a(this.f43587a);
                    this.f43605s = new C3556Q(this.f43587a, mo18575a, new C3560Q3(), new C3435L3(), new C3609S3(), new C4328u2(this.f43587a), new C3584R3(m18718u()), new C3460M3(), (C3535P3) mo18575a.m18782b(), "[ClidsInfoStorage]");
                }
            }
        }
        return this.f43605s;
    }

    @NonNull
    /* renamed from: f */
    public Context m18704f() {
        return this.f43587a;
    }

    @NonNull
    /* renamed from: g */
    public C3543Pb m18705g() {
        if (this.f43591e == null) {
            synchronized (this) {
                if (this.f43591e == null) {
                    this.f43591e = new C3543Pb(this.f43609w.m20468a(), new C3493Nb());
                }
            }
        }
        return this.f43591e;
    }

    @NonNull
    /* renamed from: h */
    public C3457M0 m18706h() {
        if (this.f43595i == null) {
            synchronized (this) {
                if (this.f43595i == null) {
                    this.f43595i = new C3457M0();
                }
            }
        }
        return this.f43595i;
    }

    @NonNull
    /* renamed from: j */
    public C4171o1 m18707j() {
        return this.f43609w;
    }

    @NonNull
    /* renamed from: k */
    public C3768Yc m18708k() {
        C3768Yc c3768Yc = this.f43601o;
        if (c3768Yc == null) {
            synchronized (this) {
                c3768Yc = this.f43601o;
                if (c3768Yc == null) {
                    c3768Yc = new C3768Yc(this.f43587a);
                    this.f43601o = c3768Yc;
                }
            }
        }
        return c3768Yc;
    }

    @Nullable
    /* renamed from: l */
    public C3582R1 m18709l() {
        return this.f43600n;
    }

    @NonNull
    /* renamed from: m */
    public C3860c2 m18710m() {
        m18694A();
        return this.f43604r;
    }

    @NonNull
    /* renamed from: n */
    public C4108lg m18711n() {
        if (this.f43590d == null) {
            synchronized (this) {
                if (this.f43590d == null) {
                    Context context = this.f43587a;
                    C3566Q9 mo18575a = InterfaceC3467Ma.b.m18577a(C4108lg.e.class).mo18575a(this.f43587a);
                    C3459M2 m18719v = m18719v();
                    if (this.f43589c == null) {
                        synchronized (this) {
                            if (this.f43589c == null) {
                                this.f43589c = new C3424Kh();
                            }
                        }
                    }
                    this.f43590d = new C4108lg(context, mo18575a, m18719v, this.f43589c, this.f43596j.m21323h(), new C4270rm());
                }
            }
        }
        return this.f43590d;
    }

    @NonNull
    /* renamed from: o */
    public C3672Ug m18712o() {
        if (this.f43588b == null) {
            synchronized (this) {
                if (this.f43588b == null) {
                    this.f43588b = new C3672Ug(this.f43587a);
                }
            }
        }
        return this.f43588b;
    }

    @NonNull
    /* renamed from: p */
    public C4432y2 m18713p() {
        return this.f43608v;
    }

    @NonNull
    /* renamed from: q */
    public C3249Dh m18714q() {
        if (this.f43594h == null) {
            synchronized (this) {
                if (this.f43594h == null) {
                    this.f43594h = new C3249Dh(this.f43587a, this.f43596j.m21323h());
                }
            }
        }
        return this.f43594h;
    }

    @Nullable
    /* renamed from: r */
    public synchronized C3234D2 m18715r() {
        return this.f43599m;
    }

    @NonNull
    /* renamed from: s */
    public C4479zn m18716s() {
        return this.f43596j;
    }

    @NonNull
    /* renamed from: t */
    public C3922ec m18717t() {
        if (this.f43602p == null) {
            synchronized (this) {
                if (this.f43602p == null) {
                    this.f43602p = new C3922ec(new C3922ec.h(), new C3922ec.d(), new C3922ec.c(), this.f43596j.m21316b(), "ServiceInternal");
                }
            }
        }
        return this.f43602p;
    }

    @NonNull
    /* renamed from: u */
    public C3366I9 m18718u() {
        if (this.f43606t == null) {
            synchronized (this) {
                if (this.f43606t == null) {
                    this.f43606t = new C3366I9(C3567Qa.m18783a(this.f43587a).m18801i());
                }
            }
        }
        return this.f43606t;
    }

    @NonNull
    /* renamed from: v */
    public C3459M2 m18719v() {
        if (this.f43592f == null) {
            synchronized (this) {
                if (this.f43592f == null) {
                    this.f43592f = new C3459M2(new C3459M2.b(m18718u()));
                }
            }
        }
        return this.f43592f;
    }

    @NonNull
    /* renamed from: w */
    public C4450yk m18720w() {
        if (this.f43597k == null) {
            synchronized (this) {
                if (this.f43597k == null) {
                    this.f43597k = new C4450yk(this.f43587a, this.f43596j.m21325j());
                }
            }
        }
        return this.f43597k;
    }

    @NonNull
    /* renamed from: x */
    public synchronized C3794Zd m18721x() {
        if (this.f43610x == null) {
            this.f43610x = new C3794Zd(this.f43587a, new C3769Yd(), new C3744Xd());
        }
        return this.f43610x;
    }

    @NonNull
    /* renamed from: y */
    public synchronized C3415K8 m18722y() {
        if (this.f43607u == null) {
            this.f43607u = new C3415K8(this.f43587a);
        }
        return this.f43607u;
    }

    /* renamed from: z */
    public synchronized void m18723z() {
        m18711n().m20368a();
        m18694A();
        if (this.f43600n == null) {
            C3582R1 c3582r1 = new C3582R1(this.f43587a, this.f43596j.m21324i(), m18718u());
            c3582r1.setName(ThreadFactoryC4401wn.m21119a("YMM-NC"));
            this.f43609w.m20469a(c3582r1);
            c3582r1.start();
            this.f43600n = c3582r1;
        }
        m18708k().m19452b();
    }

    @NonNull
    /* renamed from: a */
    public C4377w m18697a() {
        return this.f43593g;
    }

    /* renamed from: a */
    public synchronized void m18699a(@NonNull C3575Qi c3575Qi) {
        if (this.f43602p != null) {
            this.f43602p.m19809a(c3575Qi);
        }
        if (this.f43594h != null) {
            this.f43594h.m17979b(c3575Qi);
        }
        if (this.f43595i != null) {
            this.f43595i.m18540a(c3575Qi);
        }
        if (this.f43591e != null) {
            this.f43591e.m18735b(c3575Qi);
        }
        C3794Zd c3794Zd = this.f43610x;
        if (c3794Zd != null) {
            c3794Zd.m19509a(c3575Qi);
        }
    }

    /* renamed from: a */
    public synchronized void m18698a(@NonNull C3259E2 c3259e2) {
        this.f43599m = new C3234D2(this.f43587a, c3259e2);
    }
}
