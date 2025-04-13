package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3822ag;

/* renamed from: com.yandex.metrica.impl.ob.tf */
/* loaded from: classes2.dex */
public abstract class AbstractC4315tf<T> extends AbstractC4445yf {

    /* renamed from: f */
    @NonNull
    private final T f46547f;

    public AbstractC4315tf(int i2, @NonNull String str, @NonNull T t, @NonNull InterfaceC4350uo<String> interfaceC4350uo, @NonNull AbstractC4237qf abstractC4237qf) {
        super(i2, str, interfaceC4350uo, abstractC4237qf);
        this.f46547f = t;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3347Hf
    /* renamed from: a */
    public void mo17904a(@NonNull C3322Gf c3322Gf) {
        C3822ag.a mo17832a;
        if (!m21209e() || (mo17832a = m21206b().mo17832a(c3322Gf, c3322Gf.m18167a(m21208d(), m21207c()), this)) == null) {
            return;
        }
        mo18013a(mo17832a);
    }

    /* renamed from: a */
    public abstract void mo18013a(@NonNull C3822ag.a aVar);

    @NonNull
    /* renamed from: f */
    public T m20833f() {
        return this.f46547f;
    }
}
