package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzx extends com.google.android.gms.internal.common.zza implements zzz {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzz
    /* renamed from: v */
    public final int mo8202v() throws RemoteException {
        Parcel m8542i = m8542i(2, m8543q());
        int readInt = m8542i.readInt();
        m8542i.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.zzz
    /* renamed from: x */
    public final IObjectWrapper mo8203x() throws RemoteException {
        Parcel m8542i = m8542i(1, m8543q());
        IObjectWrapper m8283q = IObjectWrapper.Stub.m8283q(m8542i.readStrongBinder());
        m8542i.recycle();
        return m8283q;
    }
}
