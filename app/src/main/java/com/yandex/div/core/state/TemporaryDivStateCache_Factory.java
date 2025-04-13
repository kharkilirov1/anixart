package com.yandex.div.core.state;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class TemporaryDivStateCache_Factory implements Factory<TemporaryDivStateCache> {

    public static final class InstanceHolder {

        /* renamed from: a */
        public static final TemporaryDivStateCache_Factory f31341a = new TemporaryDivStateCache_Factory();
    }

    /* renamed from: a */
    public static TemporaryDivStateCache_Factory m16723a() {
        return InstanceHolder.f31341a;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new TemporaryDivStateCache();
    }
}
