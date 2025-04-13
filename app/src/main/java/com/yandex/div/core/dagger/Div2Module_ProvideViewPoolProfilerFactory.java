package com.yandex.div.core.dagger;

import androidx.annotation.Nullable;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class Div2Module_ProvideViewPoolProfilerFactory implements Factory<ViewPoolProfiler> {

    /* renamed from: a */
    public final Provider<Boolean> f31139a;

    /* renamed from: b */
    public final Provider<ViewPoolProfiler.Reporter> f31140b;

    public Div2Module_ProvideViewPoolProfilerFactory(Provider<Boolean> provider, Provider<ViewPoolProfiler.Reporter> provider2) {
        this.f31139a = provider;
        this.f31140b = provider2;
    }

    @Override // javax.inject.Provider
    @Nullable
    public Object get() {
        boolean booleanValue = this.f31139a.get().booleanValue();
        ViewPoolProfiler.Reporter reporter = this.f31140b.get();
        if (booleanValue) {
            return new ViewPoolProfiler(reporter);
        }
        return null;
    }
}
