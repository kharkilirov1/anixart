package com.yandex.div.core.expression.variables;

import com.yandex.div.core.expression.ExpressionsRuntimeProvider;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class TwoWayIntegerVariableBinder_Factory implements Factory<TwoWayIntegerVariableBinder> {

    /* renamed from: a */
    public final Provider<ErrorCollectors> f31246a;

    /* renamed from: b */
    public final Provider<ExpressionsRuntimeProvider> f31247b;

    public TwoWayIntegerVariableBinder_Factory(Provider<ErrorCollectors> provider, Provider<ExpressionsRuntimeProvider> provider2) {
        this.f31246a = provider;
        this.f31247b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new TwoWayIntegerVariableBinder(this.f31246a.get(), this.f31247b.get());
    }
}
