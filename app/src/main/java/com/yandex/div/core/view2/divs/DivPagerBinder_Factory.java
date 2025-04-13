package com.yandex.div.core.view2.divs;

import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivPagerBinder_Factory implements Factory<DivPagerBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32282a;

    /* renamed from: b */
    public final Provider<DivViewCreator> f32283b;

    /* renamed from: c */
    public final Provider<DivBinder> f32284c;

    /* renamed from: d */
    public final Provider<DivPatchCache> f32285d;

    /* renamed from: e */
    public final Provider<DivActionBinder> f32286e;

    /* renamed from: f */
    public final Provider<PagerIndicatorConnector> f32287f;

    public DivPagerBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivViewCreator> provider2, Provider<DivBinder> provider3, Provider<DivPatchCache> provider4, Provider<DivActionBinder> provider5, Provider<PagerIndicatorConnector> provider6) {
        this.f32282a = provider;
        this.f32283b = provider2;
        this.f32284c = provider3;
        this.f32285d = provider4;
        this.f32286e = provider5;
        this.f32287f = provider6;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivPagerBinder(this.f32282a.get(), this.f32283b.get(), this.f32284c, this.f32285d.get(), this.f32286e.get(), this.f32287f.get());
    }
}
