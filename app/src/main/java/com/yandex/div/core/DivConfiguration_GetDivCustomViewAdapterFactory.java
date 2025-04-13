package com.yandex.div.core;

import androidx.annotation.Nullable;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetDivCustomViewAdapterFactory implements Factory<DivCustomViewAdapter> {

    /* renamed from: a */
    public final DivConfiguration f30929a;

    public DivConfiguration_GetDivCustomViewAdapterFactory(DivConfiguration divConfiguration) {
        this.f30929a = divConfiguration;
    }

    @Override // javax.inject.Provider
    @Nullable
    public Object get() {
        return this.f30929a.f30892j;
    }
}
