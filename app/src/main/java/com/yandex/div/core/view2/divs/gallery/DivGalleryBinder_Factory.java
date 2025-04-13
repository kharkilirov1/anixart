package com.yandex.div.core.view2.divs.gallery;

import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivGalleryBinder_Factory implements Factory<DivGalleryBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32615a;

    /* renamed from: b */
    public final Provider<DivViewCreator> f32616b;

    /* renamed from: c */
    public final Provider<DivBinder> f32617c;

    /* renamed from: d */
    public final Provider<DivPatchCache> f32618d;

    public DivGalleryBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivViewCreator> provider2, Provider<DivBinder> provider3, Provider<DivPatchCache> provider4) {
        this.f32615a = provider;
        this.f32616b = provider2;
        this.f32617c = provider3;
        this.f32618d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivGalleryBinder(this.f32615a.get(), this.f32616b.get(), this.f32617c, this.f32618d.get());
    }
}
