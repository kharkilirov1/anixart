package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
final class zbg extends zbl {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final /* synthetic */ Result mo7880d(Status status) {
        return new GoogleSignInResult(null, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: l */
    public final void mo7881l(Api.AnyClient anyClient) throws RemoteException {
        zbs zbsVar = (zbs) ((zbe) anyClient).m8111y();
        zbf zbfVar = new zbf(this);
        Parcel m8320i = zbsVar.m8320i();
        com.google.android.gms.internal.p039authapi.zbc.m8325d(m8320i, zbfVar);
        com.google.android.gms.internal.p039authapi.zbc.m8324c(m8320i, null);
        zbsVar.m8321q(101, m8320i);
    }
}
