package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a */
    @Nullable
    public zau f15601a;

    /* renamed from: a */
    public final zau m8082a() {
        Preconditions.m8132g(this.f15601a, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f15601a;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    /* renamed from: i */
    public final void mo7980i(int i2) {
        m8082a().mo7980i(i2);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    /* renamed from: q */
    public final void mo8006q(@NonNull ConnectionResult connectionResult) {
        m8082a().mo8043S0(connectionResult, null, false);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    /* renamed from: t */
    public final void mo7981t(@Nullable Bundle bundle) {
        m8082a().mo7981t(bundle);
    }
}
