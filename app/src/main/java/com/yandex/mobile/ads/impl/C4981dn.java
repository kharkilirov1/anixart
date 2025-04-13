package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.dn */
/* loaded from: classes3.dex */
public class C4981dn<V extends View, T> implements InterfaceC5330ka<T> {

    /* renamed from: a */
    @NonNull
    private final dg1<V, T> f49684a;

    public C4981dn(@NonNull dg1<V, T> dg1Var) {
        this.f49684a = dg1Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: a */
    public final void mo23909a() {
        V m23881b = this.f49684a.m23881b();
        if (m23881b != null) {
            this.f49684a.mo22387a(m23881b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: b */
    public final boolean mo23912b() {
        return this.f49684a.m23881b() != null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: c */
    public final void mo23914c(@NonNull T t) {
        V m23881b = this.f49684a.m23881b();
        if (m23881b != null) {
            this.f49684a.mo22389b(m23881b, t);
            m23881b.setVisibility(0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: d */
    public final boolean mo23915d() {
        return tg1.m28655a(this.f49684a.m23881b(), 100);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    public final void destroy() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: e */
    public final boolean mo23916e() {
        V m23881b = this.f49684a.m23881b();
        if (m23881b == null || tg1.m28660d(m23881b)) {
            return false;
        }
        return !(m23881b.getWidth() < 1 || m23881b.getHeight() < 1);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: a */
    public final void mo23910a(@NonNull C5276ja<T> c5276ja, @NonNull gg1 gg1Var) {
        this.f49684a.mo22499a(c5276ja, gg1Var, c5276ja.m25826d());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: a */
    public final boolean mo23911a(@NonNull T t) {
        V m23881b = this.f49684a.m23881b();
        return m23881b != null && this.f49684a.mo22388a(m23881b, t);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    @Nullable
    /* renamed from: c */
    public final jg1 mo23913c() {
        V m23881b = this.f49684a.m23881b();
        if (m23881b != null) {
            return new jg1(m23881b);
        }
        return null;
    }
}
