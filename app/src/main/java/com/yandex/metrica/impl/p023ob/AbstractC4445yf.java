package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3822ag;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.yf */
/* loaded from: classes2.dex */
public abstract class AbstractC4445yf implements InterfaceC3347Hf, InterfaceC4185of {

    /* renamed from: a */
    @NonNull
    private final String f47003a;

    /* renamed from: b */
    private final int f47004b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC4350uo<String> f47005c;

    /* renamed from: d */
    @NonNull
    private final AbstractC4237qf f47006d;

    /* renamed from: e */
    @NonNull
    private C3379Im f47007e = AbstractC4478zm.m21311a();

    public AbstractC4445yf(int i2, @NonNull String str, @NonNull InterfaceC4350uo<String> interfaceC4350uo, @NonNull AbstractC4237qf abstractC4237qf) {
        this.f47004b = i2;
        this.f47003a = str;
        this.f47005c = interfaceC4350uo;
        this.f47006d = abstractC4237qf;
    }

    @NonNull
    /* renamed from: a */
    public final C3822ag.a m21204a() {
        C3822ag.a aVar = new C3822ag.a();
        aVar.f44747c = this.f47004b;
        aVar.f44746b = this.f47003a.getBytes();
        aVar.f44749e = new C3822ag.c();
        aVar.f44748d = new C3822ag.b();
        return aVar;
    }

    @NonNull
    /* renamed from: b */
    public AbstractC4237qf m21206b() {
        return this.f47006d;
    }

    @NonNull
    /* renamed from: c */
    public String m21207c() {
        return this.f47003a;
    }

    /* renamed from: d */
    public int m21208d() {
        return this.f47004b;
    }

    /* renamed from: e */
    public boolean m21209e() {
        C4298so mo18360a = this.f47005c.mo18360a(this.f47003a);
        if (mo18360a.m20772b()) {
            return true;
        }
        if (!this.f47007e.m21337c()) {
            return false;
        }
        C3379Im c3379Im = this.f47007e;
        StringBuilder m24u = C0000a.m24u("Attribute ");
        m24u.append(this.f47003a);
        m24u.append(" of type ");
        m24u.append(C3297Ff.m18100a(this.f47004b));
        m24u.append(" is skipped because ");
        m24u.append(mo18360a.m20771a());
        c3379Im.m21335c(m24u.toString());
        return false;
    }

    /* renamed from: a */
    public void m21205a(@NonNull C3379Im c3379Im) {
        this.f47007e = c3379Im;
    }
}
