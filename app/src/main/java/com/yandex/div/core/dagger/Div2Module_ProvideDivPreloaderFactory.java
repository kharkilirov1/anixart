package com.yandex.div.core.dagger;

import com.yandex.div.core.DivCustomViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.view2.DivImagePreloader;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class Div2Module_ProvideDivPreloaderFactory implements Factory<DivPreloader> {

    /* renamed from: a */
    public final Provider<DivImagePreloader> f31128a;

    /* renamed from: b */
    public final Provider<DivCustomViewAdapter> f31129b;

    /* renamed from: c */
    public final Provider<DivExtensionController> f31130c;

    public Div2Module_ProvideDivPreloaderFactory(Provider<DivImagePreloader> provider, Provider<DivCustomViewAdapter> provider2, Provider<DivExtensionController> provider3) {
        this.f31128a = provider;
        this.f31129b = provider2;
        this.f31130c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivPreloader(this.f31128a.get(), this.f31129b.get(), this.f31130c.get());
    }
}
