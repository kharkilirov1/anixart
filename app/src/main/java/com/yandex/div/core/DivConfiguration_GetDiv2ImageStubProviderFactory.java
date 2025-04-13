package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetDiv2ImageStubProviderFactory implements Factory<Div2ImageStubProvider> {

    /* renamed from: a */
    public final DivConfiguration f30927a;

    public DivConfiguration_GetDiv2ImageStubProviderFactory(DivConfiguration divConfiguration) {
        this.f30927a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        Div2ImageStubProvider div2ImageStubProvider = this.f30927a.f30889g;
        Objects.requireNonNull(div2ImageStubProvider, "Cannot return null from a non-@Nullable @Provides method");
        return div2ImageStubProvider;
    }
}
