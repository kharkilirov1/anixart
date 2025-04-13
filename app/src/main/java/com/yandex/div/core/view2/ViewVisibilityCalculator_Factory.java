package com.yandex.div.core.view2;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class ViewVisibilityCalculator_Factory implements Factory<ViewVisibilityCalculator> {

    public static final class InstanceHolder {

        /* renamed from: a */
        public static final ViewVisibilityCalculator_Factory f31726a = new ViewVisibilityCalculator_Factory();
    }

    /* renamed from: a */
    public static ViewVisibilityCalculator_Factory m16879a() {
        return InstanceHolder.f31726a;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ViewVisibilityCalculator();
    }
}
