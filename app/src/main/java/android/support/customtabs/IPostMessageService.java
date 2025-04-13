package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;

/* loaded from: classes.dex */
public interface IPostMessageService extends IInterface {

    public static class Default implements IPostMessageService {
        @Override // android.support.customtabs.IPostMessageService
        /* renamed from: M0 */
        public void mo48M0(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IPostMessageService {

        /* renamed from: a */
        public static final /* synthetic */ int f4a = 0;

        public static class Proxy implements IPostMessageService {

            /* renamed from: a */
            public IBinder f5a;

            public Proxy(IBinder iBinder) {
                this.f5a = iBinder;
            }

            @Override // android.support.customtabs.IPostMessageService
            /* renamed from: M0 */
            public void mo48M0(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.IPostMessageService");
                    obtain.writeStrongBinder(iCustomTabsCallback != null ? iCustomTabsCallback.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f5a.transact(2, obtain, obtain2, 0)) {
                        int i2 = Stub.f4a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5a;
            }
        }

        public Stub() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        /* renamed from: i */
        public static IPostMessageService m50i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.IPostMessageService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPostMessageService)) ? new Proxy(iBinder) : (IPostMessageService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 2) {
                parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                mo48M0(ICustomTabsCallback.Stub.m36i(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i2 != 3) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("android.support.customtabs.IPostMessageService");
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.IPostMessageService");
            mo49a1(ICustomTabsCallback.Stub.m36i(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: M0 */
    void mo48M0(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

    /* renamed from: a1 */
    void mo49a1(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException;
}
