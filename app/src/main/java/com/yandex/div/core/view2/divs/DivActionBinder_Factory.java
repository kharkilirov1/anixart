package com.yandex.div.core.view2.divs;

import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivActionBinder_Factory implements Factory<DivActionBinder> {

    /* renamed from: a */
    public final Provider<DivActionHandler> f31858a;

    /* renamed from: b */
    public final Provider<Div2Logger> f31859b;

    /* renamed from: c */
    public final Provider<DivActionBeaconSender> f31860c;

    /* renamed from: d */
    public final Provider<Boolean> f31861d;

    /* renamed from: e */
    public final Provider<Boolean> f31862e;

    /* renamed from: f */
    public final Provider<Boolean> f31863f;

    public DivActionBinder_Factory(Provider<DivActionHandler> provider, Provider<Div2Logger> provider2, Provider<DivActionBeaconSender> provider3, Provider<Boolean> provider4, Provider<Boolean> provider5, Provider<Boolean> provider6) {
        this.f31858a = provider;
        this.f31859b = provider2;
        this.f31860c = provider3;
        this.f31861d = provider4;
        this.f31862e = provider5;
        this.f31863f = provider6;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivActionBinder(this.f31858a.get(), this.f31859b.get(), this.f31860c.get(), this.f31861d.get().booleanValue(), this.f31862e.get().booleanValue(), this.f31863f.get().booleanValue());
    }
}
