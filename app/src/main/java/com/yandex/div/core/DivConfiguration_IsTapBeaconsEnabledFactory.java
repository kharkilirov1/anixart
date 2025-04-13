package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_IsTapBeaconsEnabledFactory implements Factory<Boolean> {

    /* renamed from: a */
    public final DivConfiguration f30944a;

    public DivConfiguration_IsTapBeaconsEnabledFactory(DivConfiguration divConfiguration) {
        this.f30944a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return Boolean.valueOf(this.f30944a.f30901s);
    }
}
