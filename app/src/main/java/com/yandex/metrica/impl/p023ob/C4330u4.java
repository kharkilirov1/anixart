package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3966g4;

/* renamed from: com.yandex.metrica.impl.ob.u4 */
/* loaded from: classes2.dex */
public class C4330u4 {

    /* renamed from: a */
    @NonNull
    private final C3316G9 f46576a;

    /* renamed from: b */
    @NonNull
    private final C3365I8 f46577b;

    /* renamed from: c */
    @NonNull
    private C4358v6 f46578c;

    /* renamed from: d */
    @NonNull
    private C4308t8 f46579d;

    /* renamed from: e */
    @NonNull
    private final C4115ln f46580e;

    /* renamed from: f */
    @NonNull
    private final C3156A f46581f;

    /* renamed from: g */
    @NonNull
    private final C4018i4 f46582g;

    /* renamed from: h */
    @NonNull
    private a f46583h;

    /* renamed from: i */
    @NonNull
    private final InterfaceC3529Om f46584i;

    /* renamed from: j */
    private final int f46585j;

    /* renamed from: k */
    private long f46586k;

    /* renamed from: l */
    private long f46587l;

    /* renamed from: m */
    private int f46588m;

    /* renamed from: com.yandex.metrica.impl.ob.u4$a */
    public interface a {
    }

    @VisibleForTesting
    public C4330u4(@NonNull C3316G9 c3316g9, @NonNull C3365I8 c3365i8, @NonNull C4358v6 c4358v6, @NonNull C4308t8 c4308t8, @NonNull C3156A c3156a, @NonNull C4115ln c4115ln, int i2, @NonNull a aVar, @NonNull C4018i4 c4018i4, @NonNull InterfaceC3529Om interfaceC3529Om) {
        this.f46576a = c3316g9;
        this.f46577b = c3365i8;
        this.f46578c = c4358v6;
        this.f46579d = c4308t8;
        this.f46581f = c3156a;
        this.f46580e = c4115ln;
        this.f46585j = i2;
        this.f46582g = c4018i4;
        this.f46584i = interfaceC3529Om;
        this.f46583h = aVar;
        this.f46586k = c3316g9.m18135b(0L);
        this.f46587l = c3316g9.m18150k();
        this.f46588m = c3316g9.m18145h();
    }

    /* renamed from: a */
    public void m20857a(C4066k0 c4066k0) {
        this.f46578c.m20921c(c4066k0);
    }

    /* renamed from: b */
    public void m20860b(C4066k0 c4066k0) {
        m20858a(c4066k0, this.f46578c.m20920b(c4066k0));
    }

    /* renamed from: c */
    public void m20861c(C4066k0 c4066k0) {
        m20858a(c4066k0, this.f46578c.m20920b(c4066k0));
        int i2 = this.f46585j;
        this.f46588m = i2;
        this.f46576a.m18132a(i2).m18227c();
    }

    /* renamed from: d */
    public void m20863d(C4066k0 c4066k0) {
        m20858a(c4066k0, this.f46578c.m20920b(c4066k0));
        long mo18644b = this.f46584i.mo18644b();
        this.f46586k = mo18644b;
        this.f46576a.m18136c(mo18644b).m18227c();
    }

    /* renamed from: e */
    public void m20865e(C4066k0 c4066k0) {
        m20858a(c4066k0, this.f46578c.m20920b(c4066k0));
        long mo18644b = this.f46584i.mo18644b();
        this.f46587l = mo18644b;
        this.f46576a.m18140e(mo18644b).m18227c();
    }

    /* renamed from: f */
    public void m20866f(@NonNull C4066k0 c4066k0) {
        m20858a(c4066k0, this.f46578c.m20923f(c4066k0));
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m20858a(@NonNull C4066k0 c4066k0, @NonNull C4384w6 c4384w6) {
        if (TextUtils.isEmpty(c4066k0.m20213o())) {
            c4066k0.mo19070e(this.f46576a.m18152m());
        }
        c4066k0.mo19069d(this.f46576a.m18151l());
        c4066k0.m20194a(Integer.valueOf(this.f46577b.m18264g()));
        this.f46579d.m20803a(this.f46580e.m20390a(c4066k0).mo19917a(c4066k0), c4066k0.m20212n(), c4384w6, this.f46581f.m17806a(), this.f46582g);
        ((C3966g4.a) this.f46583h).f45172a.m20392g();
    }

    /* renamed from: b */
    public void m20859b() {
        int i2 = this.f46585j;
        this.f46588m = i2;
        this.f46576a.m18132a(i2).m18227c();
    }

    /* renamed from: c */
    public boolean m20862c() {
        return this.f46588m < this.f46585j;
    }

    /* renamed from: d */
    public boolean m20864d() {
        return this.f46584i.mo18644b() - this.f46586k > C4280s6.f46344a;
    }

    /* renamed from: a */
    public long m20856a() {
        return this.f46587l;
    }
}
