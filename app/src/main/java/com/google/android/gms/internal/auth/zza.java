package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public class zza implements IInterface {

    /* renamed from: a */
    public final IBinder f16024a;

    /* renamed from: b */
    public final String f16025b;

    public zza(IBinder iBinder, String str) {
        this.f16024a = iBinder;
        this.f16025b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16024a;
    }

    /* renamed from: i */
    public final Parcel m8329i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f16025b);
        return obtain;
    }

    /* renamed from: q */
    public final void m8330q(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f16024a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
