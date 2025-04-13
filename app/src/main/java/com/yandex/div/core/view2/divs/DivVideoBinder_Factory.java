package com.yandex.div.core.view2.divs;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivVideoBinder_Factory implements Factory<DivVideoBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32531a;

    /* renamed from: b */
    public final Provider<TwoWayIntegerVariableBinder> f32532b;

    /* renamed from: c */
    public final Provider<DivActionHandler> f32533c;

    public DivVideoBinder_Factory(Provider<DivBaseBinder> provider, Provider<TwoWayIntegerVariableBinder> provider2, Provider<DivActionHandler> provider3) {
        this.f32531a = provider;
        this.f32532b = provider2;
        this.f32533c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivVideoBinder(this.f32531a.get(), this.f32532b.get(), this.f32533c.get());
    }
}
