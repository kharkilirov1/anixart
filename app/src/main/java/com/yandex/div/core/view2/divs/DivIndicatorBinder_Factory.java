package com.yandex.div.core.view2.divs;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivIndicatorBinder_Factory implements Factory<DivIndicatorBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32163a;

    /* renamed from: b */
    public final Provider<PagerIndicatorConnector> f32164b;

    public DivIndicatorBinder_Factory(Provider<DivBaseBinder> provider, Provider<PagerIndicatorConnector> provider2) {
        this.f32163a = provider;
        this.f32164b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivIndicatorBinder(this.f32163a.get(), this.f32164b.get());
    }
}
