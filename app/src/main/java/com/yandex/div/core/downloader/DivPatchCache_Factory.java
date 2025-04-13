package com.yandex.div.core.downloader;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivPatchCache_Factory implements Factory<DivPatchCache> {

    public static final class InstanceHolder {

        /* renamed from: a */
        public static final DivPatchCache_Factory f31159a = new DivPatchCache_Factory();
    }

    /* renamed from: a */
    public static DivPatchCache_Factory m16667a() {
        return InstanceHolder.f31159a;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivPatchCache();
    }
}
