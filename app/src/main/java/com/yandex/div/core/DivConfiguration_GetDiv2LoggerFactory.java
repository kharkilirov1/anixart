package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetDiv2LoggerFactory implements Factory<Div2Logger> {

    /* renamed from: a */
    public final DivConfiguration f30928a;

    public DivConfiguration_GetDiv2LoggerFactory(DivConfiguration divConfiguration) {
        this.f30928a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        Div2Logger div2Logger = this.f30928a.f30885c;
        Objects.requireNonNull(div2Logger, "Cannot return null from a non-@Nullable @Provides method");
        return div2Logger;
    }
}
