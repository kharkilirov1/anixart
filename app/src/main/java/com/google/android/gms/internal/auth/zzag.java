package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzag extends BaseImplementation.ApiMethodImpl<Result, zzam> {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7882a(Object obj) {
        mo7882a((Result) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final Result mo7880d(Status status) {
        return new zzak(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo7881l(zzam zzamVar) throws RemoteException {
        ((com.google.android.gms.auth.account.zze) zzamVar.m8111y()).mo7837j2(new zzaf(this), null);
    }
}
