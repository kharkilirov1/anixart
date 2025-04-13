package com.yandex.mobile.ads.impl;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bc0;

/* loaded from: classes3.dex */
public abstract class d71 {

    /* renamed from: a */
    @Nullable
    private InterfaceC4959a f49595a;

    /* renamed from: b */
    @Nullable
    private InterfaceC5793tc f49596b;

    /* renamed from: com.yandex.mobile.ads.impl.d71$a */
    public interface InterfaceC4959a {
        /* renamed from: a */
        void mo23830a();
    }

    /* renamed from: a */
    public abstract e71 mo23822a(dv0[] dv0VarArr, x61 x61Var, bc0.C4858b c4858b, k61 k61Var) throws C5043es;

    @CallSuper
    /* renamed from: a */
    public final void m23824a(InterfaceC4959a interfaceC4959a, InterfaceC5793tc interfaceC5793tc) {
        this.f49595a = interfaceC4959a;
        this.f49596b = interfaceC5793tc;
    }

    /* renamed from: a */
    public void mo23825a(C5481nb c5481nb) {
    }

    /* renamed from: a */
    public abstract void mo23826a(@Nullable Object obj);

    /* renamed from: b */
    public final void m23827b() {
        InterfaceC4959a interfaceC4959a = this.f49595a;
        if (interfaceC4959a != null) {
            interfaceC4959a.mo23830a();
        }
    }

    /* renamed from: c */
    public boolean m23828c() {
        return this instanceof C5194ho;
    }

    @CallSuper
    /* renamed from: d */
    public void mo23829d() {
        this.f49595a = null;
        this.f49596b = null;
    }

    /* renamed from: a */
    public final InterfaceC5793tc m23823a() {
        return (InterfaceC5793tc) C5220ia.m25474b(this.f49596b);
    }
}
