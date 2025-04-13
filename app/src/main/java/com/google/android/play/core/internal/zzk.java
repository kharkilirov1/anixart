package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class zzk implements IInterface {

    /* renamed from: a */
    public final IBinder f20156a;

    /* renamed from: b */
    public final String f20157b;

    public zzk(IBinder iBinder, String str) {
        this.f20156a = iBinder;
        this.f20157b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20156a;
    }

    /* renamed from: i */
    public final Parcel m10912i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20157b);
        return obtain;
    }

    /* renamed from: q */
    public final void m10913q(int i2, Parcel parcel) throws RemoteException {
        try {
            this.f20156a.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
