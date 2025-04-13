package com.yandex.div.core.state;

import com.yandex.div.state.DivStateCache;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivStateManager_Factory implements Factory<DivStateManager> {

    /* renamed from: a */
    public final Provider<DivStateCache> f31328a;

    /* renamed from: b */
    public final Provider<TemporaryDivStateCache> f31329b;

    public DivStateManager_Factory(Provider<DivStateCache> provider, Provider<TemporaryDivStateCache> provider2) {
        this.f31328a = provider;
        this.f31329b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivStateManager(this.f31328a.get(), this.f31329b.get());
    }
}
