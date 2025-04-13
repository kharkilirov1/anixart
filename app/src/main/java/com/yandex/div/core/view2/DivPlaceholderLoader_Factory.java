package com.yandex.div.core.view2;

import com.yandex.div.core.Div2ImageStubProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivPlaceholderLoader_Factory implements Factory<DivPlaceholderLoader> {

    /* renamed from: a */
    public final Provider<Div2ImageStubProvider> f31663a;

    /* renamed from: b */
    public final Provider<ExecutorService> f31664b;

    public DivPlaceholderLoader_Factory(Provider<Div2ImageStubProvider> provider, Provider<ExecutorService> provider2) {
        this.f31663a = provider;
        this.f31664b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivPlaceholderLoader(this.f31663a.get(), this.f31664b.get());
    }
}
