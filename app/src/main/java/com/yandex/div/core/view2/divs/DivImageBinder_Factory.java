package com.yandex.div.core.view2.divs;

import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivImageBinder_Factory implements Factory<DivImageBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32153a;

    /* renamed from: b */
    public final Provider<DivImageLoader> f32154b;

    /* renamed from: c */
    public final Provider<DivPlaceholderLoader> f32155c;

    /* renamed from: d */
    public final Provider<ErrorCollectors> f32156d;

    public DivImageBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivImageLoader> provider2, Provider<DivPlaceholderLoader> provider3, Provider<ErrorCollectors> provider4) {
        this.f32153a = provider;
        this.f32154b = provider2;
        this.f32155c = provider3;
        this.f32156d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivImageBinder(this.f32153a.get(), this.f32154b.get(), this.f32155c.get(), this.f32156d.get());
    }
}
