package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_IsViewPoolProfilingEnabledFactory implements Factory<Boolean> {

    /* renamed from: a */
    public final DivConfiguration f30946a;

    public DivConfiguration_IsViewPoolProfilingEnabledFactory(DivConfiguration divConfiguration) {
        this.f30946a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return Boolean.valueOf(this.f30946a.f30879A);
    }
}
