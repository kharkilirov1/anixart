package com.yandex.div.core.expression.variables;

import com.yandex.div.core.expression.ExpressionsRuntimeProvider;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class TwoWayStringVariableBinder_Factory implements Factory<TwoWayStringVariableBinder> {

    /* renamed from: a */
    public final Provider<ErrorCollectors> f31248a;

    /* renamed from: b */
    public final Provider<ExpressionsRuntimeProvider> f31249b;

    public TwoWayStringVariableBinder_Factory(Provider<ErrorCollectors> provider, Provider<ExpressionsRuntimeProvider> provider2) {
        this.f31248a = provider;
        this.f31249b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new TwoWayStringVariableBinder(this.f31248a.get(), this.f31249b.get());
    }
}
