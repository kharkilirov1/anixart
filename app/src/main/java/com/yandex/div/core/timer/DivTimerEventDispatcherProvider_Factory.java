package com.yandex.div.core.timer;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivTimerEventDispatcherProvider_Factory implements Factory<DivTimerEventDispatcherProvider> {

    /* renamed from: a */
    public final Provider<DivActionHandler> f31355a;

    /* renamed from: b */
    public final Provider<ErrorCollectors> f31356b;

    public DivTimerEventDispatcherProvider_Factory(Provider<DivActionHandler> provider, Provider<ErrorCollectors> provider2) {
        this.f31355a = provider;
        this.f31356b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivTimerEventDispatcherProvider(this.f31355a.get(), this.f31356b.get());
    }
}
