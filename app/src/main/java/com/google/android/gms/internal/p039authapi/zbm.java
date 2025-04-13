package com.google.android.gms.internal.p039authapi;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
abstract class zbm extends BaseImplementation.ApiMethodImpl {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7882a(Object obj) {
        mo7882a((Result) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: l */
    public final void mo7881l(Api.AnyClient anyClient) throws RemoteException {
        zbo zboVar = (zbo) anyClient;
        mo8328o(zboVar.f15659i, (zbt) zboVar.m8111y());
    }

    /* renamed from: o */
    public abstract void mo8328o(Context context, zbt zbtVar) throws DeadObjectException, RemoteException;
}
