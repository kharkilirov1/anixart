package com.yandex.div.core.view2;

import android.content.Context;
import com.yandex.div.internal.viewpool.ViewPool;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivViewCreator_Factory implements Factory<DivViewCreator> {

    /* renamed from: a */
    public final Provider<Context> f31678a;

    /* renamed from: b */
    public final Provider<ViewPool> f31679b;

    /* renamed from: c */
    public final Provider<DivValidator> f31680c;

    public DivViewCreator_Factory(Provider<Context> provider, Provider<ViewPool> provider2, Provider<DivValidator> provider3) {
        this.f31678a = provider;
        this.f31679b = provider2;
        this.f31680c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivViewCreator(this.f31678a.get(), this.f31679b.get(), this.f31680c.get());
    }
}
