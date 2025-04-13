package com.yandex.div.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetTooltipRestrictorFactory implements Factory<DivTooltipRestrictor> {

    /* renamed from: a */
    public final DivConfiguration f30935a;

    public DivConfiguration_GetTooltipRestrictorFactory(DivConfiguration divConfiguration) {
        this.f30935a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        DivTooltipRestrictor divTooltipRestrictor = this.f30935a.f30894l;
        Objects.requireNonNull(divTooltipRestrictor, "Cannot return null from a non-@Nullable @Provides method");
        return divTooltipRestrictor;
    }
}
