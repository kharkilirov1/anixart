package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_IsViewPoolEnabledFactory implements Factory<Boolean> {

    /* renamed from: a */
    public final DivConfiguration f30945a;

    public DivConfiguration_IsViewPoolEnabledFactory(DivConfiguration divConfiguration) {
        this.f30945a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return Boolean.valueOf(this.f30945a.f30908z);
    }
}
