package com.yandex.div.core.view2.divs.tabs;

import android.content.Context;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivTabsBinder_Factory implements Factory<DivTabsBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32692a;

    /* renamed from: b */
    public final Provider<DivViewCreator> f32693b;

    /* renamed from: c */
    public final Provider<ViewPool> f32694c;

    /* renamed from: d */
    public final Provider<TabTextStyleProvider> f32695d;

    /* renamed from: e */
    public final Provider<DivActionBinder> f32696e;

    /* renamed from: f */
    public final Provider<Div2Logger> f32697f;

    /* renamed from: g */
    public final Provider<DivVisibilityActionTracker> f32698g;

    /* renamed from: h */
    public final Provider<DivPatchCache> f32699h;

    /* renamed from: i */
    public final Provider<Context> f32700i;

    public DivTabsBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivViewCreator> provider2, Provider<ViewPool> provider3, Provider<TabTextStyleProvider> provider4, Provider<DivActionBinder> provider5, Provider<Div2Logger> provider6, Provider<DivVisibilityActionTracker> provider7, Provider<DivPatchCache> provider8, Provider<Context> provider9) {
        this.f32692a = provider;
        this.f32693b = provider2;
        this.f32694c = provider3;
        this.f32695d = provider4;
        this.f32696e = provider5;
        this.f32697f = provider6;
        this.f32698g = provider7;
        this.f32699h = provider8;
        this.f32700i = provider9;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivTabsBinder(this.f32692a.get(), this.f32693b.get(), this.f32694c.get(), this.f32695d.get(), this.f32696e.get(), this.f32697f.get(), this.f32698g.get(), this.f32699h.get(), this.f32700i.get());
    }
}
