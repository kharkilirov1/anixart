package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_IsLongtapActionsPassToChildFactory implements Factory<Boolean> {

    /* renamed from: a */
    public final DivConfiguration f30941a;

    public DivConfiguration_IsLongtapActionsPassToChildFactory(DivConfiguration divConfiguration) {
        this.f30941a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return Boolean.valueOf(this.f30941a.f30903u);
    }
}
