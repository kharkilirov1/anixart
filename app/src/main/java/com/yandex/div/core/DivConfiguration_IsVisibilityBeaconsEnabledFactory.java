package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_IsVisibilityBeaconsEnabledFactory implements Factory<Boolean> {

    /* renamed from: a */
    public final DivConfiguration f30947a;

    public DivConfiguration_IsVisibilityBeaconsEnabledFactory(DivConfiguration divConfiguration) {
        this.f30947a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return Boolean.valueOf(this.f30947a.f30902t);
    }
}
