package com.yandex.div.core.view2.state;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivJoinedStateSwitcher_Factory implements Factory<DivJoinedStateSwitcher> {

    /* renamed from: a */
    public final Provider<Div2View> f32943a;

    /* renamed from: b */
    public final Provider<DivBinder> f32944b;

    public DivJoinedStateSwitcher_Factory(Provider<Div2View> provider, Provider<DivBinder> provider2) {
        this.f32943a = provider;
        this.f32944b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivJoinedStateSwitcher(this.f32943a.get(), this.f32944b.get());
    }
}
