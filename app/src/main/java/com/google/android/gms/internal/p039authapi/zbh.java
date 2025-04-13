package com.google.android.gms.internal.p039authapi;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
final class zbh extends zbm {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Result mo7880d(Status status) {
        return status;
    }

    @Override // com.google.android.gms.internal.p039authapi.zbm
    /* renamed from: o */
    public final void mo8328o(Context context, zbt zbtVar) throws RemoteException {
        zbk zbkVar = new zbk(this);
        zbu zbuVar = new zbu(null);
        Parcel m8320i = zbtVar.m8320i();
        zbc.m8325d(m8320i, zbkVar);
        zbc.m8324c(m8320i, zbuVar);
        zbtVar.m8321q(2, m8320i);
    }
}
