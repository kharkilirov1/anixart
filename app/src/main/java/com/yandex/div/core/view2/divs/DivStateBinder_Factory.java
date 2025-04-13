package com.yandex.div.core.view2.divs;

import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.state.DivStateCache;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivStateBinder_Factory implements Factory<DivStateBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32425a;

    /* renamed from: b */
    public final Provider<DivViewCreator> f32426b;

    /* renamed from: c */
    public final Provider<DivBinder> f32427c;

    /* renamed from: d */
    public final Provider<DivStateCache> f32428d;

    /* renamed from: e */
    public final Provider<TemporaryDivStateCache> f32429e;

    /* renamed from: f */
    public final Provider<DivActionBinder> f32430f;

    /* renamed from: g */
    public final Provider<DivPatchManager> f32431g;

    /* renamed from: h */
    public final Provider<DivPatchCache> f32432h;

    /* renamed from: i */
    public final Provider<Div2Logger> f32433i;

    /* renamed from: j */
    public final Provider<DivVisibilityActionTracker> f32434j;

    /* renamed from: k */
    public final Provider<ErrorCollectors> f32435k;

    public DivStateBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivViewCreator> provider2, Provider<DivBinder> provider3, Provider<DivStateCache> provider4, Provider<TemporaryDivStateCache> provider5, Provider<DivActionBinder> provider6, Provider<DivPatchManager> provider7, Provider<DivPatchCache> provider8, Provider<Div2Logger> provider9, Provider<DivVisibilityActionTracker> provider10, Provider<ErrorCollectors> provider11) {
        this.f32425a = provider;
        this.f32426b = provider2;
        this.f32427c = provider3;
        this.f32428d = provider4;
        this.f32429e = provider5;
        this.f32430f = provider6;
        this.f32431g = provider7;
        this.f32432h = provider8;
        this.f32433i = provider9;
        this.f32434j = provider10;
        this.f32435k = provider11;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivStateBinder(this.f32425a.get(), this.f32426b.get(), this.f32427c, this.f32428d.get(), this.f32429e.get(), this.f32430f.get(), this.f32431g.get(), this.f32432h.get(), this.f32433i.get(), this.f32434j.get(), this.f32435k.get());
    }
}
