package com.google.android.gms.internal.safetynet;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class zzb extends Binder implements IInterface {
    public zzb(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    /* renamed from: i */
    public boolean mo9664i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        boolean z;
        if (i2 > 16777215) {
            z = super.onTransact(i2, parcel, parcel2, i3);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo9664i(i2, parcel, parcel2, i3);
    }
}
