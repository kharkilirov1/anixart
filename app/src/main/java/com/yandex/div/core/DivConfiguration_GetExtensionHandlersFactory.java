package com.yandex.div.core;

import com.yandex.div.core.extension.DivExtensionHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.List;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetExtensionHandlersFactory implements Factory<List<? extends DivExtensionHandler>> {

    /* renamed from: a */
    public final DivConfiguration f30933a;

    public DivConfiguration_GetExtensionHandlersFactory(DivConfiguration divConfiguration) {
        this.f30933a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        List<DivExtensionHandler> list = this.f30933a.f30895m;
        Objects.requireNonNull(list, "Cannot return null from a non-@Nullable @Provides method");
        return list;
    }
}
