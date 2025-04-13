package com.yandex.div.core.view2.divs;

import com.yandex.div.core.DivCustomViewAdapter;
import com.yandex.div.core.DivCustomViewFactory;
import com.yandex.div.core.extension.DivExtensionController;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivCustomBinder_Factory implements Factory<DivCustomBinder> {

    /* renamed from: a */
    public final Provider<DivBaseBinder> f32053a;

    /* renamed from: b */
    public final Provider<DivCustomViewFactory> f32054b;

    /* renamed from: c */
    public final Provider<DivCustomViewAdapter> f32055c;

    /* renamed from: d */
    public final Provider<DivExtensionController> f32056d;

    public DivCustomBinder_Factory(Provider<DivBaseBinder> provider, Provider<DivCustomViewFactory> provider2, Provider<DivCustomViewAdapter> provider3, Provider<DivExtensionController> provider4) {
        this.f32053a = provider;
        this.f32054b = provider2;
        this.f32055c = provider3;
        this.f32056d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivCustomBinder(this.f32053a.get(), this.f32054b.get(), this.f32055c.get(), this.f32056d.get());
    }
}
