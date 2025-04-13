package com.yandex.div.core.view2.divs;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivFocusBinder_Factory implements Factory<DivFocusBinder> {

    /* renamed from: a */
    public final Provider<DivActionBinder> f32065a;

    public DivFocusBinder_Factory(Provider<DivActionBinder> provider) {
        this.f32065a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivFocusBinder(this.f32065a.get());
    }
}
