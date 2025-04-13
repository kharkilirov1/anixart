package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p023ob.C3156A;
import com.yandex.metrica.impl.p023ob.C3734X3;
import com.yandex.metrica.impl.p023ob.C3914e4;
import com.yandex.metrica.impl.p023ob.C4057jh;
import com.yandex.metrica.impl.p023ob.C4358v6;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.f4 */
/* loaded from: classes2.dex */
public class C3940f4 implements InterfaceC4122m4, InterfaceC4044j4, InterfaceC3717Wb, C4057jh.d {

    /* renamed from: a */
    @NonNull
    private final Context f45090a;

    /* renamed from: b */
    @NonNull
    private final C3862c4 f45091b;

    /* renamed from: c */
    @NonNull
    private final C3316G9 f45092c;

    /* renamed from: d */
    @NonNull
    private final C3366I9 f45093d;

    /* renamed from: e */
    @NonNull
    private final C3266E9 f45094e;

    /* renamed from: f */
    @NonNull
    private final C4120m2 f45095f;

    /* renamed from: g */
    @NonNull
    private final C4308t8 f45096g;

    /* renamed from: h */
    @NonNull
    private final C3967g5 f45097h;

    /* renamed from: i */
    @NonNull
    private final C3889d5 f45098i;

    /* renamed from: j */
    @NonNull
    private final C3156A f45099j;

    /* renamed from: k */
    @NonNull
    private final C3684V3 f45100k;

    /* renamed from: l */
    @NonNull
    private final C4358v6 f45101l;

    /* renamed from: m */
    @NonNull
    private final C4304t4 f45102m;

    /* renamed from: n */
    @NonNull
    private final C3968g6 f45103n;

    /* renamed from: o */
    @NonNull
    private final C3379Im f45104o;

    /* renamed from: p */
    @NonNull
    private final C4426xm f45105p;

    /* renamed from: q */
    @NonNull
    private final C4330u4 f45106q;

    /* renamed from: r */
    @NonNull
    private final C3914e4.b f45107r;

    /* renamed from: s */
    @NonNull
    private final C3692Vb f45108s;

    /* renamed from: t */
    @NonNull
    private final C3617Sb f45109t;

    /* renamed from: u */
    @NonNull
    private final C3742Xb f45110u;

    /* renamed from: v */
    @NonNull
    private final C3531P f45111v;

    /* renamed from: w */
    @NonNull
    private final C3583R2 f45112w;

    /* renamed from: x */
    @NonNull
    private final C3860c2 f45113x;

    /* renamed from: y */
    @NonNull
    private final C3365I8 f45114y;

    /* renamed from: com.yandex.metrica.impl.ob.f4$a */
    public class a implements C4358v6.a {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.C4358v6.a
        /* renamed from: a */
        public void mo19894a(@NonNull C4066k0 c4066k0, @NonNull C4384w6 c4384w6) {
            C3940f4.this.f45106q.m20858a(c4066k0, c4384w6);
        }
    }

    @VisibleForTesting
    public C3940f4(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3684V3 c3684v3, @NonNull C3583R2 c3583r2, @NonNull C3966g4 c3966g4) {
        this.f45090a = context.getApplicationContext();
        this.f45091b = c3862c4;
        this.f45100k = c3684v3;
        this.f45112w = c3583r2;
        C3365I8 m19939d = c3966g4.m19939d();
        this.f45114y = m19939d;
        this.f45113x = C3532P0.m18696i().m18710m();
        C4304t4 m19932a = c3966g4.m19932a(this);
        this.f45102m = m19932a;
        C3379Im m19943b = c3966g4.m19935b().m19943b();
        this.f45104o = m19943b;
        C4426xm m19942a = c3966g4.m19935b().m19942a();
        this.f45105p = m19942a;
        C3316G9 m19944a = c3966g4.m19938c().m19944a();
        this.f45092c = m19944a;
        this.f45094e = c3966g4.m19938c().m19945b();
        this.f45093d = C3532P0.m18696i().m18718u();
        C3156A m19268a = c3684v3.m19268a(c3862c4, m19943b, m19944a);
        this.f45099j = m19268a;
        this.f45103n = c3966g4.m19931a();
        C4308t8 m19936b = c3966g4.m19936b(this);
        this.f45096g = m19936b;
        C4120m2<C3940f4> m19941e = c3966g4.m19941e(this);
        this.f45095f = m19941e;
        this.f45107r = c3966g4.m19940d(this);
        C3742Xb m19929a = c3966g4.m19929a(m19936b, m19932a);
        this.f45110u = m19929a;
        C3617Sb m19927a = c3966g4.m19927a(m19936b);
        this.f45109t = m19927a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m19929a);
        arrayList.add(m19927a);
        this.f45108s = c3966g4.m19928a(arrayList, this);
        m19861y();
        C4358v6 m19934a = c3966g4.m19934a(this, m19939d, new a());
        this.f45101l = m19934a;
        if (m19942a.m21337c()) {
            m19942a.m21330a("Read app environment for component %s. Value: %s", c3862c4.toString(), m19268a.m17806a().f42518a);
        }
        this.f45106q = c3966g4.m19933a(m19944a, m19939d, m19934a, m19936b, m19268a, m19941e);
        C3889d5 m19937c = c3966g4.m19937c(this);
        this.f45098i = m19937c;
        this.f45097h = c3966g4.m19930a(this, m19937c);
        this.f45111v = c3966g4.m19926a(m19944a);
        m19936b.m20809e();
    }

    /* renamed from: y */
    private void m19861y() {
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        Integer m18148i = this.f45092c.m18148i();
        if (m18148i == null) {
            m18148i = Integer.valueOf(this.f45114y.m18262e());
        }
        if (m18148i.intValue() < libraryApiLevel) {
            this.f45107r.m19787a(new C4210pe(new C4236qe(this.f45090a, this.f45091b.m19668a()))).m19786a();
            this.f45114y.m18255b(libraryApiLevel);
        }
    }

    /* renamed from: A */
    public boolean m19862A() {
        return this.f45106q.m20864d() && m19882m().m19769y();
    }

    /* renamed from: B */
    public boolean m19863B() {
        return this.f45106q.m20862c() && m19882m().m20110P() && m19882m().m19769y();
    }

    /* renamed from: C */
    public void m19864C() {
        this.f45102m.m19913e();
    }

    /* renamed from: D */
    public boolean m19865D() {
        C4057jh m19882m = m19882m();
        return m19882m.m20113S() && this.f45112w.m18938b(this.f45106q.m20856a(), m19882m.m20107M(), "should force send permissions");
    }

    /* renamed from: E */
    public boolean m19866E() {
        return !(this.f45113x.m17845a().f43334d && this.f45102m.m19912d().m18833N());
    }

    /* renamed from: F */
    public void mo19867F() {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3450Li
    /* renamed from: a */
    public synchronized void mo18512a(@NonNull EnumC3350Hi enumC3350Hi, @Nullable C3575Qi c3575Qi) {
    }

    /* renamed from: b */
    public void m19870b(C4066k0 c4066k0) {
        boolean z;
        this.f45099j.m17807a(c4066k0.m20197b());
        C3156A.a m17806a = this.f45099j.m17806a();
        C3684V3 c3684v3 = this.f45100k;
        C3316G9 c3316g9 = this.f45092c;
        synchronized (c3684v3) {
            if (m17806a.f42519b > c3316g9.m18139e().f42519b) {
                c3316g9.m18133a(m17806a).m18227c();
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.f45104o.m21337c()) {
            this.f45104o.m21330a("Save new app environment for %s. Value: %s", this.f45091b, m17806a.f42518a);
        }
    }

    /* renamed from: c */
    public synchronized void m19872c() {
        this.f45095f.m18777d();
    }

    @NonNull
    /* renamed from: d */
    public C3531P m19873d() {
        return this.f45111v;
    }

    @NonNull
    /* renamed from: e */
    public C3862c4 m19874e() {
        return this.f45091b;
    }

    @NonNull
    /* renamed from: f */
    public C3316G9 m19875f() {
        return this.f45092c;
    }

    @NonNull
    /* renamed from: g */
    public Context m19876g() {
        return this.f45090a;
    }

    @Nullable
    /* renamed from: h */
    public String m19877h() {
        return this.f45092c.m18152m();
    }

    @NonNull
    /* renamed from: i */
    public C4308t8 m19878i() {
        return this.f45096g;
    }

    @NonNull
    /* renamed from: j */
    public C3968g6 m19879j() {
        return this.f45103n;
    }

    @NonNull
    /* renamed from: k */
    public C3889d5 m19880k() {
        return this.f45098i;
    }

    @NonNull
    /* renamed from: l */
    public C3692Vb m19881l() {
        return this.f45108s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: m */
    public C4057jh m19882m() {
        return (C4057jh) this.f45102m.m19910b();
    }

    @NonNull
    @Deprecated
    /* renamed from: n */
    public final C4236qe m19883n() {
        return new C4236qe(this.f45090a, this.f45091b.m19668a());
    }

    @NonNull
    /* renamed from: o */
    public C3266E9 m19884o() {
        return this.f45094e;
    }

    @Nullable
    /* renamed from: p */
    public String m19885p() {
        return this.f45092c.m18151l();
    }

    @NonNull
    /* renamed from: q */
    public C3379Im m19886q() {
        return this.f45104o;
    }

    @NonNull
    /* renamed from: r */
    public C4330u4 m19887r() {
        return this.f45106q;
    }

    @NonNull
    /* renamed from: s */
    public CounterConfiguration.EnumC3079b mo19350s() {
        return CounterConfiguration.EnumC3079b.MANUAL;
    }

    @NonNull
    /* renamed from: t */
    public C3366I9 m19888t() {
        return this.f45093d;
    }

    @NonNull
    /* renamed from: u */
    public C4358v6 m19889u() {
        return this.f45101l;
    }

    @NonNull
    /* renamed from: v */
    public C3575Qi m19890v() {
        return this.f45102m.m19912d();
    }

    @NonNull
    /* renamed from: w */
    public C3365I8 m19891w() {
        return this.f45114y;
    }

    /* renamed from: x */
    public void m19892x() {
        this.f45106q.m20859b();
    }

    /* renamed from: z */
    public boolean m19893z() {
        C4057jh m19882m = m19882m();
        return m19882m.m20113S() && m19882m.m19769y() && this.f45112w.m18938b(this.f45106q.m20856a(), m19882m.m20106L(), "need to check permissions");
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4122m4
    /* renamed from: a */
    public void mo19139a(@NonNull C4066k0 c4066k0) {
        if (this.f45104o.m21337c()) {
            C3379Im c3379Im = this.f45104o;
            Objects.requireNonNull(c3379Im);
            if (C3382J0.m18373c(c4066k0.m20212n())) {
                StringBuilder sb = new StringBuilder("Event received on service");
                sb.append(": ");
                sb.append(c4066k0.m20205g());
                if (C3382J0.m18375e(c4066k0.m20212n()) && !TextUtils.isEmpty(c4066k0.m20214p())) {
                    sb.append(" with value ");
                    sb.append(c4066k0.m20214p());
                }
                c3379Im.m21333b(sb.toString());
            }
        }
        String m19668a = this.f45091b.m19668a();
        if ((TextUtils.isEmpty(m19668a) || "-1".equals(m19668a)) ? false : true) {
            this.f45097h.m19946a(c4066k0);
        }
    }

    /* renamed from: b */
    public void m19869b() {
        this.f45099j.m17808b();
        C3684V3 c3684v3 = this.f45100k;
        C3156A.a m17806a = this.f45099j.m17806a();
        C3316G9 c3316g9 = this.f45092c;
        synchronized (c3684v3) {
            c3316g9.m18133a(m17806a).m18227c();
        }
    }

    /* renamed from: b */
    public void m19871b(@Nullable String str) {
        this.f45092c.m18146h(str).m18227c();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4122m4
    /* renamed from: a */
    public synchronized void mo19138a(@NonNull C3734X3.a aVar) {
        C4304t4 c4304t4 = this.f45102m;
        synchronized (c4304t4) {
            c4304t4.m19909a((C4304t4) aVar);
        }
        if (Boolean.TRUE.equals(aVar.f44454k)) {
            this.f45104o.m21339e();
        } else {
            if (Boolean.FALSE.equals(aVar.f44454k)) {
                this.f45104o.m21338d();
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3450Li
    /* renamed from: a */
    public synchronized void mo18513a(@NonNull C3575Qi c3575Qi) {
        this.f45102m.m19907a(c3575Qi);
        this.f45096g.m20807b(c3575Qi);
        this.f45108s.m19273c();
    }

    /* renamed from: a */
    public void m19868a(String str) {
        this.f45092c.m18147i(str).m18227c();
    }
}
