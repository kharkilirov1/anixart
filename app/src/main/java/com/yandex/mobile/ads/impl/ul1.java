package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class ul1 {

    /* renamed from: c */
    private static ul1 f55559c = new ul1();

    /* renamed from: a */
    private final ArrayList<tl1> f55560a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<tl1> f55561b = new ArrayList<>();

    private ul1() {
    }

    /* renamed from: a */
    public static ul1 m29042a() {
        return f55559c;
    }

    /* renamed from: a */
    public final void m29043a(tl1 tl1Var) {
        this.f55560a.add(tl1Var);
    }

    /* renamed from: b */
    public final Collection<tl1> m29044b() {
        return Collections.unmodifiableCollection(this.f55560a);
    }

    /* renamed from: b */
    public final void m29045b(tl1 tl1Var) {
        boolean z = this.f55561b.size() > 0;
        this.f55561b.add(tl1Var);
        if (z) {
            return;
        }
        cn1.m23491a().m23494b();
    }

    /* renamed from: c */
    public final Collection<tl1> m29046c() {
        return Collections.unmodifiableCollection(this.f55561b);
    }

    /* renamed from: c */
    public final void m29047c(tl1 tl1Var) {
        boolean z = this.f55561b.size() > 0;
        this.f55560a.remove(tl1Var);
        this.f55561b.remove(tl1Var);
        if (z) {
            if (this.f55561b.size() > 0) {
                return;
            }
            cn1.m23491a().m23495c();
        }
    }
}
