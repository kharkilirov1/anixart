package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes.dex */
public interface IResultReceiver extends IInterface {

    public static class Default implements IResultReceiver {
        @Override // android.support.v4.os.IResultReceiver
        /* renamed from: C2 */
        public void mo299C2(int i2, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IResultReceiver {

        /* renamed from: a */
        public static final /* synthetic */ int f194a = 0;

        public static class Proxy implements IResultReceiver {

            /* renamed from: a */
            public IBinder f195a;

            public Proxy(IBinder iBinder) {
                this.f195a = iBinder;
            }

            @Override // android.support.v4.os.IResultReceiver
            /* renamed from: C2 */
            public void mo299C2(int i2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f195a.transact(1, obtain, null, 1)) {
                        int i3 = Stub.f194a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f195a;
            }
        }

        public Stub() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                ((ResultReceiver.MyResultReceiver) this).mo299C2(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }

    /* renamed from: C2 */
    void mo299C2(int i2, Bundle bundle) throws RemoteException;
}
