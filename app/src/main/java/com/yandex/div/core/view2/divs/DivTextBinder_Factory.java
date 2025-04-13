package com.yandex.div.core.view2.divs;

import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.view2.DivTypefaceResolver;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivTextBinder_Factory implements Factory<DivTextBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32523a;

    /* renamed from: b */
    public final Provider<DivTypefaceResolver> f32524b;

    /* renamed from: c */
    public final Provider<DivImageLoader> f32525c;

    /* renamed from: d */
    public final Provider<Boolean> f32526d;

    public DivTextBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivTypefaceResolver> provider2, Provider<DivImageLoader> provider3, Provider<Boolean> provider4) {
        this.f32523a = provider;
        this.f32524b = provider2;
        this.f32525c = provider3;
        this.f32526d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivTextBinder(this.f32523a.get(), this.f32524b.get(), this.f32525c.get(), this.f32526d.get().booleanValue());
    }
}
