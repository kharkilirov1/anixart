package com.yandex.div.core.view2.divs;

import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivSliderBinder_Factory implements Factory<DivSliderBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32389a;

    /* renamed from: b */
    public final Provider<Div2Logger> f32390b;

    /* renamed from: c */
    public final Provider<DivTypefaceProvider> f32391c;

    /* renamed from: d */
    public final Provider<TwoWayIntegerVariableBinder> f32392d;

    /* renamed from: e */
    public final Provider<ErrorCollectors> f32393e;

    /* renamed from: f */
    public final Provider<Boolean> f32394f;

    public DivSliderBinder_Factory(Provider<DivBaseBinder> provider, Provider<Div2Logger> provider2, Provider<DivTypefaceProvider> provider3, Provider<TwoWayIntegerVariableBinder> provider4, Provider<ErrorCollectors> provider5, Provider<Boolean> provider6) {
        this.f32389a = provider;
        this.f32390b = provider2;
        this.f32391c = provider3;
        this.f32392d = provider4;
        this.f32393e = provider5;
        this.f32394f = provider6;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivSliderBinder(this.f32389a.get(), this.f32390b.get(), this.f32391c.get(), this.f32392d.get(), this.f32393e.get(), this.f32394f.get().booleanValue());
    }
}
