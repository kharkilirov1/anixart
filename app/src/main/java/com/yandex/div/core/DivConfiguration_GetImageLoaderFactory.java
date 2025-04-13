package com.yandex.div.core;

import com.yandex.div.core.images.DivImageLoader;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetImageLoaderFactory implements Factory<DivImageLoader> {

    /* renamed from: a */
    public final DivConfiguration f30934a;

    public DivConfiguration_GetImageLoaderFactory(DivConfiguration divConfiguration) {
        this.f30934a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        DivImageLoader divImageLoader = this.f30934a.f30883a;
        Objects.requireNonNull(divImageLoader, "Cannot return null from a non-@Nullable @Provides method");
        return divImageLoader;
    }
}
