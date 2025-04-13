package com.yandex.div.core.view2;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivVisibilityActionTracker_Factory implements Factory<DivVisibilityActionTracker> {

    /* renamed from: a */
    public final Provider<ViewVisibilityCalculator> f31714a;

    /* renamed from: b */
    public final Provider<DivVisibilityActionDispatcher> f31715b;

    public DivVisibilityActionTracker_Factory(Provider<ViewVisibilityCalculator> provider, Provider<DivVisibilityActionDispatcher> provider2) {
        this.f31714a = provider;
        this.f31715b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivVisibilityActionTracker(this.f31714a.get(), this.f31715b.get());
    }
}
