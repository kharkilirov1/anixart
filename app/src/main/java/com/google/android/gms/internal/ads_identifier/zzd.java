package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder);
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    /* renamed from: d0 */
    public final boolean mo8307d0(boolean z) throws RemoteException {
        Parcel m8305i = m8305i();
        int i2 = zzc.f15977a;
        m8305i.writeInt(1);
        Parcel m8306q = m8306q(2, m8305i);
        boolean z2 = m8306q.readInt() != 0;
        m8306q.recycle();
        return z2;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    /* renamed from: v */
    public final String mo8308v() throws RemoteException {
        Parcel m8306q = m8306q(1, m8305i());
        String readString = m8306q.readString();
        m8306q.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    /* renamed from: x */
    public final boolean mo8309x() throws RemoteException {
        Parcel m8306q = m8306q(6, m8305i());
        int i2 = zzc.f15977a;
        boolean z = m8306q.readInt() != 0;
        m8306q.recycle();
        return z;
    }
}
