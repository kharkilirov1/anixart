package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.android.beacon.SendBeaconConfiguration;
import com.yandex.android.beacon.SendBeaconManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivKitModule_ProvideSendBeaconManagerFactory implements Factory<SendBeaconManager> {

    /* renamed from: a */
    public final Provider<Context> f31151a;

    /* renamed from: b */
    public final Provider<SendBeaconConfiguration> f31152b;

    public DivKitModule_ProvideSendBeaconManagerFactory(Provider<Context> provider, Provider<SendBeaconConfiguration> provider2) {
        this.f31151a = provider;
        this.f31152b = provider2;
    }

    @Override // javax.inject.Provider
    @Nullable
    public Object get() {
        Context context = this.f31151a.get();
        SendBeaconConfiguration sendBeaconConfiguration = this.f31152b.get();
        Intrinsics.m32179h(context, "context");
        if (sendBeaconConfiguration == null) {
            return null;
        }
        return new SendBeaconManager(context, sendBeaconConfiguration);
    }
}
