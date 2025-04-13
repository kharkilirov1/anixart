package com.yandex.div.core.dagger;

import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class Div2Module_ProvideTabTextStyleProviderFactory implements Factory<TabTextStyleProvider> {

    /* renamed from: a */
    public final Provider<DivTypefaceProvider> f31132a;

    public Div2Module_ProvideTabTextStyleProviderFactory(Provider<DivTypefaceProvider> provider) {
        this.f31132a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new TabTextStyleProvider(this.f31132a.get());
    }
}
