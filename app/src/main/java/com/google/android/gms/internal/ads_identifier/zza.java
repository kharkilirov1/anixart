package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
public class zza implements IInterface {

    /* renamed from: a */
    public final IBinder f15976a;

    public zza(IBinder iBinder) {
        this.f15976a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15976a;
    }

    /* renamed from: i */
    public final Parcel m8305i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return obtain;
    }

    /* renamed from: q */
    public final Parcel m8306q(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f15976a.transact(i2, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }
}
