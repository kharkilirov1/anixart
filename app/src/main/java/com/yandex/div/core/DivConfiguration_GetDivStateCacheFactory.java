package com.yandex.div.core;

import com.yandex.div.state.DivStateCache;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetDivStateCacheFactory implements Factory<DivStateCache> {

    /* renamed from: a */
    public final DivConfiguration f30931a;

    public DivConfiguration_GetDivStateCacheFactory(DivConfiguration divConfiguration) {
        this.f30931a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        DivStateCache divStateCache = this.f30931a.f30888f;
        Objects.requireNonNull(divStateCache, "Cannot return null from a non-@Nullable @Provides method");
        return divStateCache;
    }
}
