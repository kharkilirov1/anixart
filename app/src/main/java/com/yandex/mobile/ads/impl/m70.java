package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class m70 implements x80 {

    /* renamed from: a */
    @NonNull
    private final z80 f52587a;

    /* renamed from: b */
    @NonNull
    private final i51 f52588b;

    /* renamed from: c */
    @Nullable
    private final LocationManager f52589c;

    public m70(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
        this.f52589c = locationManager;
        this.f52588b = new i51(applicationContext, locationManager);
        this.f52587a = new z80();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.yandex.mobile.ads.impl.x80
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.location.Location mo26585a() {
        /*
            r4 = this;
            r0 = 0
            android.location.LocationManager r1 = r4.f52589c     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L13
            java.util.List r1 = r1.getAllProviders()     // Catch: java.lang.Throwable -> La
            goto L14
        La:
            r1 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Something went wrong while getting location providers"
            com.yandex.mobile.ads.impl.n60.m26808a(r1, r3, r2)
        L13:
            r1 = r0
        L14:
            if (r1 == 0) goto L3d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.yandex.mobile.ads.impl.i51 r3 = r4.f52588b
            android.location.Location r2 = r3.m25451a(r2)
            if (r2 == 0) goto L1f
            r0.add(r2)
            goto L1f
        L37:
            com.yandex.mobile.ads.impl.z80 r1 = r4.f52587a
            android.location.Location r0 = r1.m30074a(r0)
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.m70.mo26585a():android.location.Location");
    }
}
