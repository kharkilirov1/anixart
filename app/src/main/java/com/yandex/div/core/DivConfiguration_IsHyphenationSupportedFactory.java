package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_IsHyphenationSupportedFactory implements Factory<Boolean> {

    /* renamed from: a */
    public final DivConfiguration f30940a;

    public DivConfiguration_IsHyphenationSupportedFactory(DivConfiguration divConfiguration) {
        this.f30940a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return Boolean.valueOf(this.f30940a.f30906x);
    }
}
