package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class zza implements IInterface {

    /* renamed from: a */
    public final IBinder f17172a;

    /* renamed from: b */
    public final String f17173b;

    public zza(IBinder iBinder, String str) {
        this.f17172a = iBinder;
        this.f17173b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f17172a;
    }

    /* renamed from: i */
    public final Parcel m9662i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f17173b);
        return obtain;
    }

    /* renamed from: q */
    public final void m9663q(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f17172a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
