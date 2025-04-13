package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzad extends com.google.android.gms.internal.common.zza implements zzaf {
    public zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzaf
    /* renamed from: P0 */
    public final boolean mo8196P0(com.google.android.gms.common.zzs zzsVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m8543q = m8543q();
        int i2 = com.google.android.gms.internal.common.zzc.f16248a;
        m8543q.writeInt(1);
        zzsVar.writeToParcel(m8543q, 0);
        com.google.android.gms.internal.common.zzc.m8559b(m8543q, iObjectWrapper);
        Parcel m8542i = m8542i(5, m8543q);
        boolean z = m8542i.readInt() != 0;
        m8542i.recycle();
        return z;
    }
}
