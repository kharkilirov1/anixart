package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_IsMultipleStateChangeEnabledFactory implements Factory<Boolean> {

    /* renamed from: a */
    public final DivConfiguration f30942a;

    public DivConfiguration_IsMultipleStateChangeEnabledFactory(DivConfiguration divConfiguration) {
        this.f30942a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return Boolean.valueOf(this.f30942a.f30881C);
    }
}
