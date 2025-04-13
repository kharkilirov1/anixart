package com.yandex.div.core.player;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivVideoActionHandler_Factory implements Factory<DivVideoActionHandler> {

    public static final class InstanceHolder {

        /* renamed from: a */
        public static final DivVideoActionHandler_Factory f31306a = new DivVideoActionHandler_Factory();
    }

    /* renamed from: a */
    public static DivVideoActionHandler_Factory m16701a() {
        return InstanceHolder.f31306a;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivVideoActionHandler();
    }
}
