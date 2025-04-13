package com.yandex.div.core.expression;

import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class ExpressionsRuntimeProvider_Factory implements Factory<ExpressionsRuntimeProvider> {

    /* renamed from: a */
    public final Provider<GlobalVariableController> f31198a;

    /* renamed from: b */
    public final Provider<DivActionHandler> f31199b;

    /* renamed from: c */
    public final Provider<ErrorCollectors> f31200c;

    /* renamed from: d */
    public final Provider<Div2Logger> f31201d;

    public ExpressionsRuntimeProvider_Factory(Provider<GlobalVariableController> provider, Provider<DivActionHandler> provider2, Provider<ErrorCollectors> provider3, Provider<Div2Logger> provider4) {
        this.f31198a = provider;
        this.f31199b = provider2;
        this.f31200c = provider3;
        this.f31201d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ExpressionsRuntimeProvider(this.f31198a.get(), this.f31199b.get(), this.f31200c.get(), this.f31201d.get());
    }
}
