package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
abstract class zzbi extends BaseImplementation.ApiMethodImpl<ProxyApi.ProxyResult, zzbe> {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7882a(Object obj) {
        mo7882a((Result) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Result mo7880d(Status status) {
        return new zzbu(status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: l */
    public final void mo7881l(zzbe zzbeVar) throws RemoteException {
        zzbe zzbeVar2 = zzbeVar;
        mo8335o(zzbeVar2.f15659i, (zzbh) zzbeVar2.m8111y());
    }

    /* renamed from: o */
    public abstract void mo8335o(Context context, zzbh zzbhVar) throws RemoteException;
}
