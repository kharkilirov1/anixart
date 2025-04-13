package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_IsAccessibilityEnabledFactory implements Factory<Boolean> {

    /* renamed from: a */
    public final DivConfiguration f30938a;

    public DivConfiguration_IsAccessibilityEnabledFactory(DivConfiguration divConfiguration) {
        this.f30938a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return Boolean.valueOf(this.f30938a.f30907y);
    }
}
