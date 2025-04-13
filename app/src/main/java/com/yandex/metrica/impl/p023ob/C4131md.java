package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.md */
/* loaded from: classes2.dex */
public class C4131md<T> implements InterfaceC3743Xc<T> {

    /* renamed from: a */
    @NonNull
    private final AbstractC4105ld<T> f45950a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC4286sc<T> f45951b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC4183od f45952c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC4416xc<T> f45953d;

    /* renamed from: e */
    @NonNull
    private final Runnable f45954e = new a();

    /* renamed from: f */
    @Nullable
    private T f45955f;

    /* renamed from: com.yandex.metrica.impl.ob.md$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4131md.this.m20400b();
        }
    }

    public C4131md(@NonNull AbstractC4105ld<T> abstractC4105ld, @NonNull InterfaceC4286sc<T> interfaceC4286sc, @NonNull InterfaceC4183od interfaceC4183od, @NonNull InterfaceC4416xc<T> interfaceC4416xc, @Nullable T t) {
        this.f45950a = abstractC4105ld;
        this.f45951b = interfaceC4286sc;
        this.f45952c = interfaceC4183od;
        this.f45953d = interfaceC4416xc;
        this.f45955f = t;
    }

    /* renamed from: a */
    public void m20398a() {
        T t = this.f45955f;
        if (t != null && this.f45951b.mo18159a(t) && this.f45950a.mo17899a(this.f45955f)) {
            this.f45952c.mo20507a();
            this.f45953d.mo18308a(this.f45954e, this.f45955f);
        }
    }

    /* renamed from: b */
    public void m20400b() {
        this.f45953d.mo17895a();
        this.f45950a.mo17898a();
    }

    /* renamed from: c */
    public void m20401c() {
        T t = this.f45955f;
        if (t != null && this.f45951b.mo18160b(t)) {
            this.f45950a.mo17900b();
        }
        m20398a();
    }

    /* renamed from: a */
    public void m20399a(@Nullable T t) {
        if (C3658U2.m19213a(this.f45955f, t)) {
            return;
        }
        this.f45955f = t;
        m20400b();
        m20398a();
    }
}
