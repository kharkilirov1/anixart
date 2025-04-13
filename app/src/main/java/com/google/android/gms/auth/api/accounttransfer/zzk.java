package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.auth.zzap;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
abstract class zzk<T> extends TaskApiCall<zzap, T> {

    /* renamed from: d */
    public TaskCompletionSource<T> f15055d;

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7844b(zzap zzapVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.f15055d = taskCompletionSource;
        mo7840c((zzau) zzapVar.m8111y());
    }

    /* renamed from: c */
    public abstract void mo7840c(zzau zzauVar) throws RemoteException;
}
