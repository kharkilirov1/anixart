package com.yandex.div.core.view2;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivAccessibilityBinder_Factory implements Factory<DivAccessibilityBinder> {

    /* renamed from: a */
    public final Provider<Boolean> f31602a;

    public DivAccessibilityBinder_Factory(Provider<Boolean> provider) {
        this.f31602a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivAccessibilityBinder(this.f31602a.get().booleanValue());
    }
}
