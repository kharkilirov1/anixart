package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzac implements IGmsServiceBroker {

    /* renamed from: a */
    public final IBinder f15788a;

    public zzac(IBinder iBinder) {
        this.f15788a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15788a;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    /* renamed from: j0 */
    public final void mo8122j0(IGmsCallbacks iGmsCallbacks, @Nullable GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(iGmsCallbacks.asBinder());
            obtain.writeInt(1);
            zzm.m8200a(getServiceRequest, obtain, 0);
            this.f15788a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
