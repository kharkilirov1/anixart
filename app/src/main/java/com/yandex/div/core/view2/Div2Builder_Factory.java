package com.yandex.div.core.view2;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class Div2Builder_Factory implements Factory<Div2Builder> {

    /* renamed from: a */
    public final Provider<DivViewCreator> f31539a;

    /* renamed from: b */
    public final Provider<DivBinder> f31540b;

    public Div2Builder_Factory(Provider<DivViewCreator> provider, Provider<DivBinder> provider2) {
        this.f31539a = provider;
        this.f31540b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new Div2Builder(this.f31539a.get(), this.f31540b.get());
    }
}
