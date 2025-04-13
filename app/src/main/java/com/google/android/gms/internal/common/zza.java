package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public class zza implements IInterface {

    /* renamed from: a */
    public final IBinder f16236a;

    /* renamed from: b */
    public final String f16237b;

    public zza(IBinder iBinder, String str) {
        this.f16236a = iBinder;
        this.f16237b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16236a;
    }

    /* renamed from: i */
    public final Parcel m8542i(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f16236a.transact(i2, parcel, obtain, 0);
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

    /* renamed from: q */
    public final Parcel m8543q() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f16237b);
        return obtain;
    }
}
