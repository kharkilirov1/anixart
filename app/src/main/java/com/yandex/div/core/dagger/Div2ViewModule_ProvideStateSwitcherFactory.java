package com.yandex.div.core.dagger;

import com.yandex.div.core.view2.state.DivJoinedStateSwitcher;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class Div2ViewModule_ProvideStateSwitcherFactory implements Factory<DivStateSwitcher> {

    /* renamed from: a */
    public final Provider<Boolean> f31141a;

    /* renamed from: b */
    public final Provider<DivJoinedStateSwitcher> f31142b;

    /* renamed from: c */
    public final Provider<DivMultipleStateSwitcher> f31143c;

    public Div2ViewModule_ProvideStateSwitcherFactory(Provider<Boolean> provider, Provider<DivJoinedStateSwitcher> provider2, Provider<DivMultipleStateSwitcher> provider3) {
        this.f31141a = provider;
        this.f31142b = provider2;
        this.f31143c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        DivStateSwitcher divStateSwitcher;
        String str;
        boolean booleanValue = this.f31141a.get().booleanValue();
        Provider<DivJoinedStateSwitcher> joinedStateSwitcher = this.f31142b;
        Provider<DivMultipleStateSwitcher> multipleStateSwitcher = this.f31143c;
        Intrinsics.m32179h(joinedStateSwitcher, "joinedStateSwitcher");
        Intrinsics.m32179h(multipleStateSwitcher, "multipleStateSwitcher");
        if (booleanValue) {
            divStateSwitcher = multipleStateSwitcher.get();
            str = "multipleStateSwitcher.get()";
        } else {
            divStateSwitcher = joinedStateSwitcher.get();
            str = "joinedStateSwitcher.get()";
        }
        Intrinsics.m32178g(divStateSwitcher, str);
        return divStateSwitcher;
    }
}
