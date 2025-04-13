package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaal implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* renamed from: a */
    public final WeakReference<zaaw> f15463a;

    /* renamed from: b */
    public final Api<?> f15464b;

    /* renamed from: c */
    public final boolean f15465c;

    public zaal(zaaw zaawVar, Api<?> api, boolean z) {
        this.f15463a = new WeakReference<>(zaawVar);
        this.f15464b = api;
        this.f15465c = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    /* renamed from: a */
    public final void mo8025a(@NonNull ConnectionResult connectionResult) {
        zaaw zaawVar = this.f15463a.get();
        if (zaawVar == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(zaawVar.f15478a.f15514h);
        Preconditions.m8134i(myLooper == null, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zaawVar.f15479b.lock();
        try {
            zaawVar.m8034l(0);
            if (!connectionResult.m7914n()) {
                zaawVar.m8032j(connectionResult, this.f15464b, this.f15465c);
            }
            if (zaawVar.m8035m()) {
                zaawVar.m8033k();
            }
        } finally {
            zaawVar.f15479b.unlock();
        }
    }
}
