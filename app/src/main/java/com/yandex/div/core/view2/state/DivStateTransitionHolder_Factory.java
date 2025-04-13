package com.yandex.div.core.view2.state;

import com.yandex.div.core.view2.Div2View;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivStateTransitionHolder_Factory implements Factory<DivStateTransitionHolder> {

    /* renamed from: a */
    public final Provider<Div2View> f32953a;

    public DivStateTransitionHolder_Factory(Provider<Div2View> provider) {
        this.f32953a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivStateTransitionHolder(this.f32953a.get());
    }
}
