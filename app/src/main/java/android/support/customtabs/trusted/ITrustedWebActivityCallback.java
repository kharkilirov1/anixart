package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface ITrustedWebActivityCallback extends IInterface {

    public static class Default implements ITrustedWebActivityCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ITrustedWebActivityCallback {

        public static class Proxy implements ITrustedWebActivityCallback {

            /* renamed from: a */
            public IBinder f6a;

            public Proxy(IBinder iBinder) {
                this.f6a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6a;
            }
        }

        public Stub() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityCallback");
        }

        /* renamed from: i */
        public static ITrustedWebActivityCallback m52i(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITrustedWebActivityCallback)) ? new Proxy(iBinder) : (ITrustedWebActivityCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 2) {
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
                mo51s2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                throw null;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            return true;
        }
    }

    /* renamed from: s2 */
    void mo51s2(String str, Bundle bundle) throws RemoteException;
}
