package com.yandex.div.core;

import com.yandex.android.beacon.SendBeaconConfiguration;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.jetbrains.annotations.Nullable;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivKitConfiguration_SendBeaconConfigurationFactory implements Factory<SendBeaconConfiguration> {

    /* renamed from: a */
    public final DivKitConfiguration f30969a;

    public DivKitConfiguration_SendBeaconConfigurationFactory(DivKitConfiguration divKitConfiguration) {
        this.f30969a = divKitConfiguration;
    }

    @Override // javax.inject.Provider
    @Nullable
    public Object get() {
        Provider<SendBeaconConfiguration> provider = this.f30969a.f30962a;
        if (provider == null) {
            return null;
        }
        return provider.get();
    }
}
