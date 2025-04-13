package com.yandex.div.core.view2.divs;

import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivSelectBinder_Factory implements Factory<DivSelectBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32328a;

    /* renamed from: b */
    public final Provider<DivTypefaceResolver> f32329b;

    /* renamed from: c */
    public final Provider<TwoWayStringVariableBinder> f32330c;

    /* renamed from: d */
    public final Provider<ErrorCollectors> f32331d;

    public DivSelectBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivTypefaceResolver> provider2, Provider<TwoWayStringVariableBinder> provider3, Provider<ErrorCollectors> provider4) {
        this.f32328a = provider;
        this.f32329b = provider2;
        this.f32330c = provider3;
        this.f32331d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivSelectBinder(this.f32328a.get(), this.f32329b.get(), this.f32330c.get(), this.f32331d.get());
    }
}
