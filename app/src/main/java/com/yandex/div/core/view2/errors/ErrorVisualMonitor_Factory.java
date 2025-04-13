package com.yandex.div.core.view2.errors;

import com.yandex.div.core.view2.ViewBindingProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class ErrorVisualMonitor_Factory implements Factory<ErrorVisualMonitor> {

    /* renamed from: a */
    public final Provider<ErrorCollectors> f32912a;

    /* renamed from: b */
    public final Provider<Boolean> f32913b;

    /* renamed from: c */
    public final Provider<ViewBindingProvider> f32914c;

    public ErrorVisualMonitor_Factory(Provider<ErrorCollectors> provider, Provider<Boolean> provider2, Provider<ViewBindingProvider> provider3) {
        this.f32912a = provider;
        this.f32913b = provider2;
        this.f32914c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ErrorVisualMonitor(this.f32912a.get(), this.f32913b.get().booleanValue(), this.f32914c.get());
    }
}
