package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zacc extends zap {
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: f */
    public final void mo7998f() {
        new CancellationException("Host activity was destroyed before Google Play services could be made available.");
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    /* renamed from: l */
    public final void mo8017l(ConnectionResult connectionResult, int i2) {
        String str = connectionResult.f15317e;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        new ApiException(new Status(1, connectionResult.f15315c, str, connectionResult.f15316d, connectionResult));
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    /* renamed from: m */
    public final void mo8018m() {
        Activity mo8005v1 = this.f15430b.mo8005v1();
        if (mo8005v1 == null) {
            new ApiException(new Status(8, null));
            throw null;
        }
        if (this.f15599f.mo7917c(mo8005v1, GoogleApiAvailabilityLight.f15327a) != 0) {
            throw null;
        }
        throw null;
    }
}
