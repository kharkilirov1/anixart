package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zah implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a */
    public final /* synthetic */ ConnectionCallbacks f15763a;

    public zah(ConnectionCallbacks connectionCallbacks) {
        this.f15763a = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: i */
    public final void mo8112i(int i2) {
        this.f15763a.mo7980i(i2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: t */
    public final void mo8113t(@Nullable Bundle bundle) {
        this.f15763a.mo7981t(null);
    }
}
