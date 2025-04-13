package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzn extends zzk implements zzp {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.zzp
    /* renamed from: j1 */
    public final void mo10915j1(String str, Bundle bundle, zzr zzrVar) throws RemoteException {
        Parcel m10912i = m10912i();
        m10912i.writeString(str);
        int i2 = zzm.f20158a;
        m10912i.writeInt(1);
        bundle.writeToParcel(m10912i, 0);
        m10912i.writeStrongBinder(zzrVar);
        m10913q(2, m10912i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.zzp
    /* renamed from: o2 */
    public final void mo10916o2(String str, Bundle bundle, zzr zzrVar) throws RemoteException {
        Parcel m10912i = m10912i();
        m10912i.writeString(str);
        int i2 = zzm.f20158a;
        m10912i.writeInt(1);
        bundle.writeToParcel(m10912i, 0);
        m10912i.writeStrongBinder(zzrVar);
        m10913q(3, m10912i);
    }
}
