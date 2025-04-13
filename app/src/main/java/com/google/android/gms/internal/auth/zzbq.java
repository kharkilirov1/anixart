package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzbq extends zzbi {
    @Override // com.google.android.gms.internal.auth.zzbi
    /* renamed from: o */
    public final void mo8335o(Context context, zzbh zzbhVar) throws RemoteException {
        zzbp zzbpVar = new zzbp(this);
        Parcel m8329i = zzbhVar.m8329i();
        zzc.m8339c(m8329i, zzbpVar);
        zzc.m8338b(m8329i, null);
        zzbhVar.m8330q(1, m8329i);
    }
}
