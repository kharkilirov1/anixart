package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzj extends zza implements zzi {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    @Override // com.google.android.gms.internal.safetynet.zzi
    /* renamed from: W1 */
    public final void mo9673W1(zzg zzgVar) throws RemoteException {
        Parcel m9662i = m9662i();
        zzc.m9666b(m9662i, null);
        m9663q(4, m9662i);
    }

    @Override // com.google.android.gms.internal.safetynet.zzi
    /* renamed from: a2 */
    public final void mo9674a2(zzg zzgVar, String str) throws RemoteException {
        Parcel m9662i = m9662i();
        zzc.m9666b(m9662i, null);
        m9662i.writeString(null);
        m9663q(6, m9662i);
    }

    @Override // com.google.android.gms.internal.safetynet.zzi
    /* renamed from: e0 */
    public final void mo9675e0(zzg zzgVar) throws RemoteException {
        Parcel m9662i = m9662i();
        zzc.m9666b(m9662i, null);
        m9663q(5, m9662i);
    }

    @Override // com.google.android.gms.internal.safetynet.zzi
    /* renamed from: f1 */
    public final void mo9676f1(zzg zzgVar) throws RemoteException {
        Parcel m9662i = m9662i();
        zzc.m9666b(m9662i, zzgVar);
        m9663q(12, m9662i);
    }

    @Override // com.google.android.gms.internal.safetynet.zzi
    /* renamed from: p0 */
    public final void mo9677p0(zzg zzgVar, byte[] bArr, String str) throws RemoteException {
        Parcel m9662i = m9662i();
        zzc.m9666b(m9662i, null);
        m9662i.writeByteArray(null);
        m9662i.writeString(str);
        m9663q(7, m9662i);
    }

    @Override // com.google.android.gms.internal.safetynet.zzi
    /* renamed from: t2 */
    public final void mo9678t2(zzg zzgVar) throws RemoteException {
        Parcel m9662i = m9662i();
        zzc.m9666b(m9662i, null);
        m9663q(14, m9662i);
    }

    @Override // com.google.android.gms.internal.safetynet.zzi
    /* renamed from: w */
    public final void mo9679w() throws RemoteException {
        m9663q(13, m9662i());
    }
}
