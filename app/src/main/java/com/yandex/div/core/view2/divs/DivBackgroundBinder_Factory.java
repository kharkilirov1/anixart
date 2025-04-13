package com.yandex.div.core.view2.divs;

import com.yandex.div.core.images.DivImageLoader;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivBackgroundBinder_Factory implements Factory<DivBackgroundBinder> {

    /* renamed from: a */
    public final Provider<DivImageLoader> f31910a;

    public DivBackgroundBinder_Factory(Provider<DivImageLoader> provider) {
        this.f31910a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivBackgroundBinder(this.f31910a.get());
    }
}
