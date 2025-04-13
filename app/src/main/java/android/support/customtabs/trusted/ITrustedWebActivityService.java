package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface ITrustedWebActivityService extends IInterface {

    public static class Default implements ITrustedWebActivityService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ITrustedWebActivityService {

        public static class Proxy implements ITrustedWebActivityService {

            /* renamed from: a */
            public IBinder f7a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7a;
            }
        }

        public Stub() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 9) {
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                mo55K0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            }
            if (i2 == 1598968902) {
                parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityService");
                return true;
            }
            switch (i2) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle mo54J1 = mo54J1(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    mo54J1.writeToParcel(parcel2, 1);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    mo53G1(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    int mo57h1 = mo57h1();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo57h1);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle mo56W = mo56W();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    mo56W.writeToParcel(parcel2, 1);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle mo59r1 = mo59r1(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    mo59r1.writeToParcel(parcel2, 1);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle mo58l1 = mo58l1();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    mo58l1.writeToParcel(parcel2, 1);
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    /* renamed from: G1 */
    void mo53G1(Bundle bundle) throws RemoteException;

    /* renamed from: J1 */
    Bundle mo54J1(Bundle bundle) throws RemoteException;

    /* renamed from: K0 */
    Bundle mo55K0(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    /* renamed from: W */
    Bundle mo56W() throws RemoteException;

    /* renamed from: h1 */
    int mo57h1() throws RemoteException;

    /* renamed from: l1 */
    Bundle mo58l1() throws RemoteException;

    /* renamed from: r1 */
    Bundle mo59r1(Bundle bundle) throws RemoteException;
}
