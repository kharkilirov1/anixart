package com.yandex.div.core.extension;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.List;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivExtensionController_Factory implements Factory<DivExtensionController> {

    /* renamed from: a */
    public final Provider<List<? extends DivExtensionHandler>> f31270a;

    public DivExtensionController_Factory(Provider<List<? extends DivExtensionHandler>> provider) {
        this.f31270a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivExtensionController(this.f31270a.get());
    }
}
