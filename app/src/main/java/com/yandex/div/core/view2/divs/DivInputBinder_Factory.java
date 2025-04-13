package com.yandex.div.core.view2.divs;

import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivInputBinder_Factory implements Factory<DivInputBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32232a;

    /* renamed from: b */
    public final Provider<DivTypefaceResolver> f32233b;

    /* renamed from: c */
    public final Provider<TwoWayStringVariableBinder> f32234c;

    /* renamed from: d */
    public final Provider<ErrorCollectors> f32235d;

    public DivInputBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivTypefaceResolver> provider2, Provider<TwoWayStringVariableBinder> provider3, Provider<ErrorCollectors> provider4) {
        this.f32232a = provider;
        this.f32233b = provider2;
        this.f32234c = provider3;
        this.f32235d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivInputBinder(this.f32232a.get(), this.f32233b.get(), this.f32234c.get(), this.f32235d.get());
    }
}
