package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetActionHandlerFactory implements Factory<DivActionHandler> {

    /* renamed from: a */
    public final DivConfiguration f30924a;

    public DivConfiguration_GetActionHandlerFactory(DivConfiguration divConfiguration) {
        this.f30924a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        DivActionHandler divActionHandler = this.f30924a.f30884b;
        Objects.requireNonNull(divActionHandler, "Cannot return null from a non-@Nullable @Provides method");
        return divActionHandler;
    }
}
