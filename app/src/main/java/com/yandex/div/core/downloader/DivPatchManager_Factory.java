package com.yandex.div.core.downloader;

import com.yandex.div.core.view2.Div2Builder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivPatchManager_Factory implements Factory<DivPatchManager> {

    /* renamed from: a */
    public final Provider<DivPatchCache> f31162a;

    /* renamed from: b */
    public final Provider<Div2Builder> f31163b;

    public DivPatchManager_Factory(Provider<DivPatchCache> provider, Provider<Div2Builder> provider2) {
        this.f31162a = provider;
        this.f31163b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivPatchManager(this.f31162a.get(), this.f31163b);
    }
}
