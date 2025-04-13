package com.google.android.gms.internal.p039authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public class zba implements IInterface {

    /* renamed from: a */
    public final IBinder f16006a;

    /* renamed from: b */
    public final String f16007b;

    public zba(IBinder iBinder, String str) {
        this.f16006a = iBinder;
        this.f16007b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16006a;
    }

    /* renamed from: i */
    public final Parcel m8320i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f16007b);
        return obtain;
    }

    /* renamed from: q */
    public final void m8321q(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f16006a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
