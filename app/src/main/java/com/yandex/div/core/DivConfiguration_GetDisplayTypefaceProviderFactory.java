package com.yandex.div.core;

import com.yandex.div.core.font.DivTypefaceProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetDisplayTypefaceProviderFactory implements Factory<DivTypefaceProvider> {

    /* renamed from: a */
    public final DivConfiguration f30926a;

    public DivConfiguration_GetDisplayTypefaceProviderFactory(DivConfiguration divConfiguration) {
        this.f30926a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        DivTypefaceProvider divTypefaceProvider = this.f30926a.f30898p;
        Objects.requireNonNull(divTypefaceProvider, "Cannot return null from a non-@Nullable @Provides method");
        return divTypefaceProvider;
    }
}
