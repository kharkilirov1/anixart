package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class eg1<V extends View, T> {

    /* renamed from: a */
    @NonNull
    private final dg1<V, T> f49963a;

    public eg1(@NonNull dg1<V, T> dg1Var) {
        this.f49963a = dg1Var;
    }

    /* renamed from: a */
    public final void m24149a() {
        V m23881b = this.f49963a.m23881b();
        if (m23881b != null) {
            this.f49963a.mo22387a(m23881b);
        }
    }

    /* renamed from: b */
    public final void m24153b(@NonNull T t) {
        V m23881b = this.f49963a.m23881b();
        if (m23881b != null) {
            this.f49963a.mo22389b(m23881b, t);
            m23881b.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void m24150a(@NonNull C5276ja c5276ja, @NonNull gg1 gg1Var, @Nullable T t) {
        if (this.f49963a.m23881b() != null) {
            this.f49963a.mo22499a(c5276ja, gg1Var, t);
        }
    }

    /* renamed from: b */
    public final void m24152b() {
        this.f49963a.mo23312a();
    }

    /* renamed from: a */
    public final boolean m24151a(@NonNull T t) {
        V m23881b = this.f49963a.m23881b();
        return m23881b != null && this.f49963a.mo22388a(m23881b, t);
    }
}
