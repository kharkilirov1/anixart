package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.identifiers.impl.k */
/* loaded from: classes2.dex */
public final class C3142k implements InterfaceC3140i {
    @Override // com.yandex.metrica.identifiers.impl.InterfaceC3140i
    @NotNull
    /* renamed from: a */
    public C3138g mo17799a(@NotNull Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            Intrinsics.m32178g(advertisingIdInfo, "AdvertisingIdClient.getAdvertisingIdInfo(context)");
            return new C3138g(EnumC3143l.f42500c, new C3137f("google", advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), null, 4);
        } catch (GooglePlayServicesNotAvailableException unused) {
            return new C3138g(EnumC3143l.f42501d, null, "could not resolve google services", 2);
        } catch (Throwable th) {
            EnumC3143l enumC3143l = EnumC3143l.f42502e;
            StringBuilder m24u = C0000a.m24u("exception while fetching google adv_id: ");
            m24u.append(th.getMessage());
            return new C3138g(enumC3143l, null, m24u.toString(), 2);
        }
    }
}
