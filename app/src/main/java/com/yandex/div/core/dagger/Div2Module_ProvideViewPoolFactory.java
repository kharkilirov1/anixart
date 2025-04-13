package com.yandex.div.core.dagger;

import com.yandex.div.internal.viewpool.AdvanceViewPool;
import com.yandex.div.internal.viewpool.PseudoViewPool;
import com.yandex.div.internal.viewpool.ViewCreator;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class Div2Module_ProvideViewPoolFactory implements Factory<ViewPool> {

    /* renamed from: a */
    public final Provider<Boolean> f31136a;

    /* renamed from: b */
    public final Provider<ViewPoolProfiler> f31137b;

    /* renamed from: c */
    public final Provider<ViewCreator> f31138c;

    public Div2Module_ProvideViewPoolFactory(Provider<Boolean> provider, Provider<ViewPoolProfiler> provider2, Provider<ViewCreator> provider3) {
        this.f31136a = provider;
        this.f31137b = provider2;
        this.f31138c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f31136a.get().booleanValue() ? new AdvanceViewPool(this.f31137b.get(), this.f31138c.get()) : new PseudoViewPool();
    }
}
