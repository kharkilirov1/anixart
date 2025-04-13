package com.yandex.div.core.view2.errors;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class ErrorCollectors_Factory implements Factory<ErrorCollectors> {

    public static final class InstanceHolder {

        /* renamed from: a */
        public static final ErrorCollectors_Factory f32881a = new ErrorCollectors_Factory();
    }

    /* renamed from: a */
    public static ErrorCollectors_Factory m17116a() {
        return InstanceHolder.f32881a;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ErrorCollectors();
    }
}
