package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zad extends zaa {

    /* renamed from: a */
    public final BaseImplementation.ResultHolder<Status> f15752a;

    public zad(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f15752a = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    /* renamed from: N0 */
    public final void mo8177N0(int i2) throws RemoteException {
        this.f15752a.mo7882a(new Status(i2, null));
    }
}
