package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.core.DivCustomViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.view2.Div2View;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class ReleaseViewVisitor_Factory implements Factory<ReleaseViewVisitor> {

    /* renamed from: a */
    public final Provider<Div2View> f32865a;

    /* renamed from: b */
    public final Provider<DivCustomViewAdapter> f32866b;

    /* renamed from: c */
    public final Provider<DivExtensionController> f32867c;

    public ReleaseViewVisitor_Factory(Provider<Div2View> provider, Provider<DivCustomViewAdapter> provider2, Provider<DivExtensionController> provider3) {
        this.f32865a = provider;
        this.f32866b = provider2;
        this.f32867c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ReleaseViewVisitor(this.f32865a.get(), this.f32866b.get(), this.f32867c.get());
    }
}
