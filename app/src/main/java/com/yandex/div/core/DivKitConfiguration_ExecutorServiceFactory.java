package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivKitConfiguration_ExecutorServiceFactory implements Factory<ExecutorService> {

    /* renamed from: a */
    public final DivKitConfiguration f30966a;

    public DivKitConfiguration_ExecutorServiceFactory(DivKitConfiguration divKitConfiguration) {
        this.f30966a = divKitConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        ExecutorService executorService = this.f30966a.f30963b;
        Objects.requireNonNull(executorService, "Cannot return null from a non-@Nullable @Provides method");
        return executorService;
    }
}
