package com.yandex.div.core.view2.divs;

import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivGifImageBinder_Factory implements Factory<DivGifImageBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32088a;

    /* renamed from: b */
    public final Provider<DivImageLoader> f32089b;

    /* renamed from: c */
    public final Provider<DivPlaceholderLoader> f32090c;

    /* renamed from: d */
    public final Provider<ErrorCollectors> f32091d;

    public DivGifImageBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivImageLoader> provider2, Provider<DivPlaceholderLoader> provider3, Provider<ErrorCollectors> provider4) {
        this.f32088a = provider;
        this.f32089b = provider2;
        this.f32090c = provider3;
        this.f32091d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivGifImageBinder(this.f32088a.get(), this.f32089b.get(), this.f32090c.get(), this.f32091d.get());
    }
}
