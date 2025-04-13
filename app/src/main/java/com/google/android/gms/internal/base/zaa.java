package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class zaa implements IInterface {

    /* renamed from: a */
    public final IBinder f16207a;

    /* renamed from: b */
    public final String f16208b;

    public zaa(IBinder iBinder, String str) {
        this.f16207a = iBinder;
        this.f16208b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16207a;
    }

    /* renamed from: i */
    public final Parcel m8534i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f16208b);
        return obtain;
    }

    /* renamed from: q */
    public final void m8535q(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f16207a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
