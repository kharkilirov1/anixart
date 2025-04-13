package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetAreVisualErrorsEnabledFactory implements Factory<Boolean> {

    /* renamed from: a */
    public final DivConfiguration f30925a;

    public DivConfiguration_GetAreVisualErrorsEnabledFactory(DivConfiguration divConfiguration) {
        this.f30925a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return Boolean.valueOf(this.f30925a.f30905w);
    }
}
