package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a */
    public final /* synthetic */ zaaw f15476a;

    public /* synthetic */ zaat(zaaw zaawVar) {
        this.f15476a = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    /* renamed from: i */
    public final void mo7980i(int i2) {
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    /* renamed from: q */
    public final void mo8006q(@NonNull ConnectionResult connectionResult) {
        this.f15476a.f15479b.lock();
        try {
            if (this.f15476a.f15489l && !connectionResult.m7913m()) {
                this.f15476a.m8028f();
                this.f15476a.m8033k();
            } else {
                this.f15476a.m8031i(connectionResult);
            }
        } finally {
            this.f15476a.f15479b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    /* renamed from: t */
    public final void mo7981t(@Nullable Bundle bundle) {
        Objects.requireNonNull(this.f15476a.f15495r, "null reference");
        com.google.android.gms.signin.zae zaeVar = this.f15476a.f15488k;
        Objects.requireNonNull(zaeVar, "null reference");
        zaeVar.mo9686k(new zaar(this.f15476a));
    }
}
