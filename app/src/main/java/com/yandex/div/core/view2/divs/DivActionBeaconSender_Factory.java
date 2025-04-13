package com.yandex.div.core.view2.divs;

import com.yandex.android.beacon.SendBeaconManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivActionBeaconSender_Factory implements Factory<DivActionBeaconSender> {

    /* renamed from: a */
    public final Provider<SendBeaconManager> f31822a;

    /* renamed from: b */
    public final Provider<Boolean> f31823b;

    /* renamed from: c */
    public final Provider<Boolean> f31824c;

    public DivActionBeaconSender_Factory(Provider<SendBeaconManager> provider, Provider<Boolean> provider2, Provider<Boolean> provider3) {
        this.f31822a = provider;
        this.f31823b = provider2;
        this.f31824c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivActionBeaconSender(DoubleCheck.m30790a(this.f31822a), this.f31823b.get().booleanValue(), this.f31824c.get().booleanValue());
    }
}
