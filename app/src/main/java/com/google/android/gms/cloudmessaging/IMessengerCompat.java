package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
interface IMessengerCompat extends IInterface {

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static class Impl extends Binder implements IMessengerCompat {
        @Override // android.os.IInterface
        @NonNull
        public IBinder asBinder() {
            throw null;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, @NonNull Parcel parcel, @Nullable Parcel parcel2, int i3) throws RemoteException {
            throw null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static class Proxy implements IMessengerCompat {

        /* renamed from: a */
        public final IBinder f15256a;

        @Override // android.os.IInterface
        @NonNull
        public IBinder asBinder() {
            return this.f15256a;
        }
    }
}
