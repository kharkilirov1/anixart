package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_IsContextMenuHandlerOverriddenFactory implements Factory<Boolean> {

    /* renamed from: a */
    public final DivConfiguration f30939a;

    public DivConfiguration_IsContextMenuHandlerOverriddenFactory(DivConfiguration divConfiguration) {
        this.f30939a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return Boolean.valueOf(this.f30939a.f30904v);
    }
}
