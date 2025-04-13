package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.InterfaceC3467Ma;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.z5 */
/* loaded from: classes2.dex */
public class C4461z5 extends AbstractC4279s5 {

    /* renamed from: b */
    private final C4054je f47094b;

    /* renamed from: c */
    @NonNull
    private final C3566Q9 f47095c;

    /* renamed from: d */
    @NonNull
    private final C3356I f47096d;

    /* renamed from: e */
    @NonNull
    private final C3231D f47097e;

    /* renamed from: f */
    @NonNull
    private final C3281F f47098f;

    public C4461z5(C3940f4 c3940f4, C4054je c4054je) {
        this(c3940f4, c4054je, InterfaceC3467Ma.b.m18577a(C3820ae.class).mo18575a(c3940f4.m19876g()), new C3356I(c3940f4.m19876g()), new C3231D(), new C3281F(c3940f4.m19876g()));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    public boolean mo17815a(@NonNull C4066k0 c4066k0) {
        C3820ae c3820ae;
        C3940f4 m20685a = m20685a();
        m20685a.m19874e().toString();
        if (!m20685a.m19891w().m18270m() || !m20685a.m19893z()) {
            return false;
        }
        C3820ae c3820ae2 = (C3820ae) this.f47095c.m18782b();
        List<C4028ie> list = c3820ae2.f44741a;
        C3331H c3331h = c3820ae2.f44742b;
        C3331H m18241a = this.f47096d.m18241a();
        List<String> list2 = c3820ae2.f44743c;
        List<String> m18021a = this.f47098f.m18021a();
        List<C4028ie> m20092a = this.f47094b.m20092a(m20685a().m19876g(), list);
        if (m20092a == null && C3658U2.m19213a(c3331h, m18241a) && C4013i.m20037a(list2, m18021a)) {
            c3820ae = null;
        } else {
            if (m20092a != null) {
                list = m20092a;
            }
            c3820ae = new C3820ae(list, m18241a, m18021a);
        }
        if (c3820ae != null) {
            m20685a.m19887r().m20865e(C4066k0.m20183a(c4066k0, c3820ae.f44741a, c3820ae.f44742b, this.f47097e, c3820ae.f44743c));
            this.f47095c.m18781a(c3820ae);
            return false;
        }
        if (!m20685a.m19865D()) {
            return false;
        }
        m20685a.m19887r().m20865e(C4066k0.m20183a(c4066k0, c3820ae2.f44741a, c3820ae2.f44742b, this.f47097e, c3820ae2.f44743c));
        return false;
    }

    @VisibleForTesting
    public C4461z5(C3940f4 c3940f4, C4054je c4054je, @NonNull C3566Q9 c3566q9, @NonNull C3356I c3356i, @NonNull C3231D c3231d, @NonNull C3281F c3281f) {
        super(c3940f4);
        this.f47094b = c4054je;
        this.f47095c = c3566q9;
        this.f47096d = c3356i;
        this.f47097e = c3231d;
        this.f47098f = c3281f;
    }
}
