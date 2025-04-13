package com.yandex.div.core.view2.divs;

import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivContainerBinder_Factory implements Factory<DivContainerBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32043a;

    /* renamed from: b */
    public final Provider<DivViewCreator> f32044b;

    /* renamed from: c */
    public final Provider<DivPatchManager> f32045c;

    /* renamed from: d */
    public final Provider<DivPatchCache> f32046d;

    /* renamed from: e */
    public final Provider<DivBinder> f32047e;

    /* renamed from: f */
    public final Provider<ErrorCollectors> f32048f;

    public DivContainerBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivViewCreator> provider2, Provider<DivPatchManager> provider3, Provider<DivPatchCache> provider4, Provider<DivBinder> provider5, Provider<ErrorCollectors> provider6) {
        this.f32043a = provider;
        this.f32044b = provider2;
        this.f32045c = provider3;
        this.f32046d = provider4;
        this.f32047e = provider5;
        this.f32048f = provider6;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivContainerBinder(this.f32043a.get(), this.f32044b, this.f32045c.get(), this.f32046d.get(), this.f32047e, this.f32048f.get());
    }
}
