package com.yandex.div.core.view2.state;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivMultipleStateSwitcher_Factory implements Factory<DivMultipleStateSwitcher> {

    /* renamed from: a */
    public final Provider<Div2View> f32947a;

    /* renamed from: b */
    public final Provider<DivBinder> f32948b;

    public DivMultipleStateSwitcher_Factory(Provider<Div2View> provider, Provider<DivBinder> provider2) {
        this.f32947a = provider;
        this.f32948b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivMultipleStateSwitcher(this.f32947a.get(), this.f32948b.get());
    }
}
