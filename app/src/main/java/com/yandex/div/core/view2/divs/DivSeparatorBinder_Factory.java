package com.yandex.div.core.view2.divs;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivSeparatorBinder_Factory implements Factory<DivSeparatorBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32335a;

    public DivSeparatorBinder_Factory(Provider<DivBaseBinder> provider) {
        this.f32335a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivSeparatorBinder(this.f32335a.get());
    }
}
