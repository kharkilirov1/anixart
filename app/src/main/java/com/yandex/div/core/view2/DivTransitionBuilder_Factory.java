package com.yandex.div.core.view2;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivTransitionBuilder_Factory implements Factory<DivTransitionBuilder> {

    /* renamed from: a */
    public final Provider<Context> f31667a;

    /* renamed from: b */
    public final Provider<DivViewIdProvider> f31668b;

    public DivTransitionBuilder_Factory(Provider<Context> provider, Provider<DivViewIdProvider> provider2) {
        this.f31667a = provider;
        this.f31668b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivTransitionBuilder(this.f31667a.get(), this.f31668b.get());
    }
}
