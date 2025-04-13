package com.yandex.div.core.view2;

import com.yandex.div.core.font.DivTypefaceProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivTypefaceResolver_Factory implements Factory<DivTypefaceResolver> {

    /* renamed from: a */
    public final Provider<DivTypefaceProvider> f31672a;

    /* renamed from: b */
    public final Provider<DivTypefaceProvider> f31673b;

    public DivTypefaceResolver_Factory(Provider<DivTypefaceProvider> provider, Provider<DivTypefaceProvider> provider2) {
        this.f31672a = provider;
        this.f31673b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivTypefaceResolver(this.f31672a.get(), this.f31673b.get());
    }
}
