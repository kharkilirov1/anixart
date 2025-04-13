package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetDivVisibilityChangeListenerFactory implements Factory<DivVisibilityChangeListener> {

    /* renamed from: a */
    public final DivConfiguration f30932a;

    public DivConfiguration_GetDivVisibilityChangeListenerFactory(DivConfiguration divConfiguration) {
        this.f30932a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        DivVisibilityChangeListener divVisibilityChangeListener = this.f30932a.f30890h;
        Objects.requireNonNull(divVisibilityChangeListener, "Cannot return null from a non-@Nullable @Provides method");
        return divVisibilityChangeListener;
    }
}
