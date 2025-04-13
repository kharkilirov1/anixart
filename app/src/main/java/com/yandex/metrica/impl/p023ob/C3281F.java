package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.F */
/* loaded from: classes2.dex */
public class C3281F {

    /* renamed from: a */
    @Nullable
    private final LocationManager f42852a;

    public C3281F(@NonNull Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<java.lang.String> m18021a() {
        /*
            r3 = this;
            android.location.LocationManager r0 = r3.f42852a
            java.util.List r1 = java.util.Collections.emptyList()
            if (r0 == 0) goto Le
            r2 = 1
            java.util.List r0 = r0.getProviders(r2)     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L12
            goto L13
        L12:
            r1 = r0
        L13:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3281F.m18021a():java.util.List");
    }

    @VisibleForTesting
    public C3281F(@Nullable LocationManager locationManager) {
        this.f42852a = locationManager;
    }
}
