package com.google.android.gms.internal.p039authapi;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
final class zbg extends zbm {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final /* synthetic */ Result mo7880d(Status status) {
        return new zbe(status, null);
    }

    @Override // com.google.android.gms.internal.p039authapi.zbm
    /* renamed from: o */
    public final void mo8328o(Context context, zbt zbtVar) throws RemoteException {
        zbf zbfVar = new zbf(this);
        Parcel m8320i = zbtVar.m8320i();
        zbc.m8325d(m8320i, zbfVar);
        zbc.m8324c(m8320i, null);
        zbtVar.m8321q(1, m8320i);
    }
}
