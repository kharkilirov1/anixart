package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zai implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    public final /* synthetic */ OnConnectionFailedListener f15764a;

    public zai(OnConnectionFailedListener onConnectionFailedListener) {
        this.f15764a = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    /* renamed from: q */
    public final void mo8114q(@NonNull ConnectionResult connectionResult) {
        this.f15764a.mo8006q(connectionResult);
    }
}
