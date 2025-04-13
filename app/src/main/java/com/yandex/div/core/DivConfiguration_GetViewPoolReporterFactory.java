package com.yandex.div.core;

import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivConfiguration_GetViewPoolReporterFactory implements Factory<ViewPoolProfiler.Reporter> {

    /* renamed from: a */
    public final DivConfiguration f30937a;

    public DivConfiguration_GetViewPoolReporterFactory(DivConfiguration divConfiguration) {
        this.f30937a = divConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        ViewPoolProfiler.Reporter reporter = this.f30937a.f30899q;
        Objects.requireNonNull(reporter, "Cannot return null from a non-@Nullable @Provides method");
        return reporter;
    }
}
