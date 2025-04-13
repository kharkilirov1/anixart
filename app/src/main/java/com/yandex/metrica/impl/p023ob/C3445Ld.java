package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.AbstractC3632T1;

/* renamed from: com.yandex.metrica.impl.ob.Ld */
/* loaded from: classes2.dex */
public class C3445Ld extends AbstractC3657U1<C4187oh> {

    /* renamed from: r */
    @NonNull
    private C3545Pd f43323r;

    /* renamed from: s */
    @NonNull
    private final C3459M2 f43324s;

    /* renamed from: t */
    @NonNull
    private final C3668Uc f43325t;

    /* renamed from: u */
    @NonNull
    private final C3340H8 f43326u;

    /* renamed from: v */
    @NonNull
    private final C3495Nd f43327v;

    /* renamed from: w */
    @NonNull
    private final InterfaceC4157nd f43328w;

    /* renamed from: x */
    private long f43329x;

    /* renamed from: y */
    private C3470Md f43330y;

    @VisibleForTesting
    public C3445Ld(@NonNull Context context, @NonNull C3545Pd c3545Pd, @NonNull C3459M2 c3459m2, @NonNull InterfaceC4157nd interfaceC4157nd, @NonNull C3340H8 c3340h8, @NonNull C4187oh c4187oh, @NonNull C3495Nd c3495Nd) {
        super(c4187oh);
        this.f43323r = c3545Pd;
        this.f43324s = c3459m2;
        this.f43328w = interfaceC4157nd;
        this.f43325t = c3545Pd.m18751A();
        this.f43326u = c3340h8;
        this.f43327v = c3495Nd;
        m18503F();
        m19114a(this.f43323r.m18752B());
    }

    /* renamed from: E */
    private boolean m18502E() {
        C3470Md m18613a = this.f43327v.m18613a(this.f43325t.f44135d);
        this.f43330y = m18613a;
        C3671Uf c3671Uf = m18613a.f43428c;
        if (c3671Uf.f44150c.length == 0 && c3671Uf.f44149b.length == 0) {
            return false;
        }
        return m19194c(AbstractC3909e.m19777a(c3671Uf));
    }

    /* renamed from: F */
    private void m18503F() {
        long m18212f = this.f43326u.m18212f() + 1;
        this.f43329x = m18212f;
        ((C4187oh) this.f44039j).m20513a(m18212f);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: A */
    public boolean mo18504A() {
        return super.mo18504A() & (!m19126m());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3657U1
    /* renamed from: C */
    public void mo18505C() {
        this.f43327v.m18614a(this.f43330y);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3657U1
    /* renamed from: D */
    public void mo18506D() {
        this.f43327v.m18614a(this.f43330y);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: a */
    public void mo18427a(@NonNull Uri.Builder builder) {
        ((C4187oh) this.f44039j).m20514a(builder, this.f43323r);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: b */
    public void mo18429b(@Nullable Throwable th) {
        this.f43326u.m18203a(this.f43329x);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    @Nullable
    /* renamed from: j */
    public C3225Ci mo18430j() {
        return this.f43323r.m19762r();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: o */
    public boolean mo18431o() {
        if (this.f43324s.m18566d() || TextUtils.isEmpty(this.f43323r.m19751g()) || TextUtils.isEmpty(this.f43323r.m19768x()) || C3658U2.m19217b(m19117c())) {
            return false;
        }
        return m18502E();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3657U1, com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: r */
    public boolean mo18432r() {
        boolean mo18432r = super.mo18432r();
        this.f43326u.m18203a(this.f43329x);
        return mo18432r;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: t */
    public void mo18434t() {
        this.f43328w.mo17827a();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    @Nullable
    /* renamed from: b */
    public AbstractC3632T1.a mo18428b() {
        return AbstractC3632T1.a.LOCATION;
    }
}
