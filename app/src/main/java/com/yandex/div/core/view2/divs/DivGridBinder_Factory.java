package com.yandex.div.core.view2.divs;

import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.view2.DivBinder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivGridBinder_Factory implements Factory<DivGridBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32105a;

    /* renamed from: b */
    public final Provider<DivPatchManager> f32106b;

    /* renamed from: c */
    public final Provider<DivPatchCache> f32107c;

    /* renamed from: d */
    public final Provider<DivBinder> f32108d;

    public DivGridBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivPatchManager> provider2, Provider<DivPatchCache> provider3, Provider<DivBinder> provider4) {
        this.f32105a = provider;
        this.f32106b = provider2;
        this.f32107c = provider3;
        this.f32108d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivGridBinder(this.f32105a.get(), this.f32106b.get(), this.f32107c.get(), this.f32108d);
    }
}
