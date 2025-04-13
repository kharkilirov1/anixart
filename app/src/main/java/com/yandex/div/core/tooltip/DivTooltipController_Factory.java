package com.yandex.div.core.tooltip;

import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivTooltipController_Factory implements Factory<DivTooltipController> {

    /* renamed from: a */
    public final Provider<Div2Builder> f31428a;

    /* renamed from: b */
    public final Provider<DivTooltipRestrictor> f31429b;

    /* renamed from: c */
    public final Provider<DivVisibilityActionTracker> f31430c;

    /* renamed from: d */
    public final Provider<DivPreloader> f31431d;

    public DivTooltipController_Factory(Provider<Div2Builder> provider, Provider<DivTooltipRestrictor> provider2, Provider<DivVisibilityActionTracker> provider3, Provider<DivPreloader> provider4) {
        this.f31428a = provider;
        this.f31429b = provider2;
        this.f31430c = provider3;
        this.f31431d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivTooltipController(this.f31428a, this.f31429b.get(), this.f31430c.get(), this.f31431d.get());
    }
}
