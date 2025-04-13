package com.yandex.div.core.view2;

import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivVisibilityChangeListener;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivVisibilityActionDispatcher_Factory implements Factory<DivVisibilityActionDispatcher> {

    /* renamed from: a */
    public final Provider<Div2Logger> f31692a;

    /* renamed from: b */
    public final Provider<DivVisibilityChangeListener> f31693b;

    /* renamed from: c */
    public final Provider<DivActionHandler> f31694c;

    /* renamed from: d */
    public final Provider<DivActionBeaconSender> f31695d;

    public DivVisibilityActionDispatcher_Factory(Provider<Div2Logger> provider, Provider<DivVisibilityChangeListener> provider2, Provider<DivActionHandler> provider3, Provider<DivActionBeaconSender> provider4) {
        this.f31692a = provider;
        this.f31693b = provider2;
        this.f31694c = provider3;
        this.f31695d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivVisibilityActionDispatcher(this.f31692a.get(), this.f31693b.get(), this.f31694c.get(), this.f31695d.get());
    }
}
