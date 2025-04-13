package com.yandex.div.core;

import com.yandex.div.core.font.DivTypefaceProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetTypefaceProviderFactory implements Factory<DivTypefaceProvider> {

    /* renamed from: a */
    public final DivConfiguration f30936a;

    public DivConfiguration_GetTypefaceProviderFactory(DivConfiguration divConfiguration) {
        this.f30936a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        DivTypefaceProvider divTypefaceProvider = this.f30936a.f30897o;
        Objects.requireNonNull(divTypefaceProvider, "Cannot return null from a non-@Nullable @Provides method");
        return divTypefaceProvider;
    }
}
