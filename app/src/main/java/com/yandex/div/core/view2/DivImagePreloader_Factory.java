package com.yandex.div.core.view2;

import com.yandex.div.core.images.DivImageLoader;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivImagePreloader_Factory implements Factory<DivImagePreloader> {

    /* renamed from: a */
    public final Provider<DivImageLoader> f31652a;

    public DivImagePreloader_Factory(Provider<DivImageLoader> provider) {
        this.f31652a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivImagePreloader(this.f31652a.get());
    }
}
