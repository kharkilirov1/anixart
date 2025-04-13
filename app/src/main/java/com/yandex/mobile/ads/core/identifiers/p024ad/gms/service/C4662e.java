package com.yandex.mobile.ads.core.identifiers.p024ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C6061y7;
import com.yandex.mobile.ads.impl.C6110z7;
import com.yandex.mobile.ads.impl.n60;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.gms.service.e */
/* loaded from: classes2.dex */
final class C4662e {

    /* renamed from: a */
    @NonNull
    private final C6110z7 f47805a = new C6110z7();

    /* renamed from: b */
    @NonNull
    private final C4659b f47806b = new C4659b();

    @Nullable
    /* renamed from: a */
    public final C6061y7 m21972a(@NonNull ServiceConnectionC4660c serviceConnectionC4660c) {
        C6061y7 c6061y7 = null;
        try {
            IBinder m21970a = serviceConnectionC4660c.m21970a();
            if (m21970a != null) {
                Objects.requireNonNull(this.f47806b);
                IInterface queryLocalInterface = m21970a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                InterfaceC4658a gmsServiceAdvertisingInfoReader = queryLocalInterface instanceof InterfaceC4658a ? (InterfaceC4658a) queryLocalInterface : new GmsServiceAdvertisingInfoReader(m21970a);
                String readAdvertisingId = gmsServiceAdvertisingInfoReader.readAdvertisingId();
                Boolean readAdTrackingLimited = gmsServiceAdvertisingInfoReader.readAdTrackingLimited();
                Objects.requireNonNull(this.f47805a);
                if (readAdTrackingLimited != null && readAdvertisingId != null) {
                    c6061y7 = new C6061y7(readAdvertisingId, readAdTrackingLimited.booleanValue());
                }
                n60.m26809b("Advertising ID fetched successfully", new Object[0]);
            }
        } catch (InterruptedException e2) {
            n60.m26808a(e2, "Exception during advertising info reading from GMS service", new Object[0]);
        }
        return c6061y7;
    }
}
