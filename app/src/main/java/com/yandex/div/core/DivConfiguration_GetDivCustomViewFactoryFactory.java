package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetDivCustomViewFactoryFactory implements Factory<DivCustomViewFactory> {

    /* renamed from: a */
    public final DivConfiguration f30930a;

    public DivConfiguration_GetDivCustomViewFactoryFactory(DivConfiguration divConfiguration) {
        this.f30930a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        DivCustomViewFactory divCustomViewFactory = this.f30930a.f30891i;
        Objects.requireNonNull(divCustomViewFactory, "Cannot return null from a non-@Nullable @Provides method");
        return divCustomViewFactory;
    }
}
