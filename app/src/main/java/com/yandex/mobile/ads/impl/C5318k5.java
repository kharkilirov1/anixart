package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.k5 */
/* loaded from: classes3.dex */
public final class C5318k5 implements InterfaceC5473n5 {

    /* renamed from: a */
    @NonNull
    private final C5525o5 f51834a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5426m5 f51835b;

    /* renamed from: c */
    @NonNull
    private final tb1 f51836c;

    /* renamed from: d */
    @Nullable
    private InterfaceC5473n5 f51837d;

    public C5318k5(@NonNull InterfaceC5426m5 interfaceC5426m5) {
        this.f51835b = interfaceC5426m5;
        interfaceC5426m5.mo24860a(this);
        tb1 tb1Var = new tb1();
        this.f51836c = tb1Var;
        interfaceC5426m5.mo24861a(tb1Var);
        this.f51834a = new C5525o5();
    }

    /* renamed from: a */
    public final void m26025a(@Nullable InterfaceC5473n5 interfaceC5473n5) {
        this.f51837d = interfaceC5473n5;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
    /* renamed from: b */
    public final void mo26027b() {
        this.f51834a.m27000a(2);
        InterfaceC5473n5 interfaceC5473n5 = this.f51837d;
        if (interfaceC5473n5 != null) {
            interfaceC5473n5.mo26027b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
    /* renamed from: c */
    public final void mo26028c() {
        this.f51834a.m27000a(4);
        InterfaceC5473n5 interfaceC5473n5 = this.f51837d;
        if (interfaceC5473n5 != null) {
            interfaceC5473n5.mo26028c();
        }
    }

    /* renamed from: d */
    public final void m26029d() {
        int m28463a = C5782t5.m28463a(this.f51834a.m26999a());
        if (m28463a == 0 || m28463a == 1 || m28463a == 2) {
            this.f51835b.mo24864c();
        }
    }

    /* renamed from: e */
    public final void m26030e() {
        int m28463a = C5782t5.m28463a(this.f51834a.m26999a());
        if (m28463a == 0 || m28463a == 1 || m28463a == 2) {
            this.f51835b.mo24867f();
        }
    }

    /* renamed from: f */
    public final void m26031f() {
        InterfaceC5473n5 interfaceC5473n5;
        int m28463a = C5782t5.m28463a(this.f51834a.m26999a());
        if (m28463a == 0) {
            this.f51835b.prepare();
            return;
        }
        if (m28463a != 1) {
            if (m28463a == 4 && (interfaceC5473n5 = this.f51837d) != null) {
                interfaceC5473n5.mo26024a();
                return;
            }
            return;
        }
        InterfaceC5473n5 interfaceC5473n52 = this.f51837d;
        if (interfaceC5473n52 != null) {
            interfaceC5473n52.mo26027b();
        }
    }

    /* renamed from: g */
    public final void m26032g() {
        InterfaceC5473n5 interfaceC5473n5;
        int m28463a = C5782t5.m28463a(this.f51834a.m26999a());
        if (m28463a == 0) {
            this.f51835b.prepare();
            return;
        }
        if (m28463a == 2) {
            this.f51835b.resume();
            return;
        }
        if (m28463a != 3) {
            if (m28463a == 4 && (interfaceC5473n5 = this.f51837d) != null) {
                interfaceC5473n5.mo26024a();
                return;
            }
            return;
        }
        InterfaceC5473n5 interfaceC5473n52 = this.f51837d;
        if (interfaceC5473n52 != null) {
            interfaceC5473n52.mo26028c();
        }
    }

    /* renamed from: h */
    public final void m26033h() {
        InterfaceC5473n5 interfaceC5473n5;
        int m28463a = C5782t5.m28463a(this.f51834a.m26999a());
        if (m28463a == 0) {
            this.f51835b.prepare();
            return;
        }
        if (m28463a == 1) {
            this.f51834a.m27000a(3);
            this.f51835b.start();
            return;
        }
        if (m28463a == 2) {
            this.f51835b.resume();
            return;
        }
        if (m28463a != 3) {
            if (m28463a == 4 && (interfaceC5473n5 = this.f51837d) != null) {
                interfaceC5473n5.mo26024a();
                return;
            }
            return;
        }
        InterfaceC5473n5 interfaceC5473n52 = this.f51837d;
        if (interfaceC5473n52 != null) {
            interfaceC5473n52.mo26028c();
        }
    }

    /* renamed from: a */
    public final void m26026a(@Nullable sb1 sb1Var) {
        this.f51836c.m28583a(sb1Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
    /* renamed from: a */
    public final void mo26024a() {
        this.f51834a.m27000a(5);
        InterfaceC5473n5 interfaceC5473n5 = this.f51837d;
        if (interfaceC5473n5 != null) {
            interfaceC5473n5.mo26024a();
        }
    }
}
