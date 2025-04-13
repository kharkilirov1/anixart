package com.yandex.div.core.dagger;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.resources.ContextThemeWrapperWithResourceCache;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class Div2Module_ProvideThemedContextFactory implements Factory<Context> {

    /* renamed from: a */
    public final Provider<ContextThemeWrapper> f31133a;

    /* renamed from: b */
    public final Provider<Integer> f31134b;

    /* renamed from: c */
    public final Provider<Boolean> f31135c;

    public Div2Module_ProvideThemedContextFactory(Provider<ContextThemeWrapper> provider, Provider<Integer> provider2, Provider<Boolean> provider3) {
        this.f31133a = provider;
        this.f31134b = provider2;
        this.f31135c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        ContextThemeWrapper contextThemeWrapper = this.f31133a.get();
        int intValue = this.f31134b.get().intValue();
        return this.f31135c.get().booleanValue() ? new ContextThemeWrapperWithResourceCache(contextThemeWrapper, intValue) : new ContextThemeWrapper(contextThemeWrapper, intValue);
    }
}
