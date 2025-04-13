package com.google.android.gms.internal.p040authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes.dex */
public class zza implements IInterface {

    /* renamed from: a */
    public final IBinder f15997a;

    public zza(IBinder iBinder) {
        this.f15997a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15997a;
    }

    /* renamed from: i */
    public final Parcel m8314i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return obtain;
    }

    /* renamed from: q */
    public final void m8315q(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15997a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
