package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface ICustomTabsCallback extends IInterface {

    public static class Default implements ICustomTabsCallback {
        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: C1 */
        public void mo30C1(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: R1 */
        public void mo31R1(int i2, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: n2 */
        public void mo32n2(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: u2 */
        public void mo33u2(Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: w0 */
        public Bundle mo34w0(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: w2 */
        public void mo35w2(int i2, Uri uri, boolean z, Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICustomTabsCallback {

        /* renamed from: a */
        public static final /* synthetic */ int f0a = 0;

        public static class Proxy implements ICustomTabsCallback {

            /* renamed from: a */
            public IBinder f1a;

            public Proxy(IBinder iBinder) {
                this.f1a = iBinder;
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            /* renamed from: C1 */
            public void mo30C1(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f1a.transact(3, obtain, obtain2, 0)) {
                        int i2 = Stub.f0a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            /* renamed from: R1 */
            public void mo31R1(int i2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f1a.transact(2, obtain, obtain2, 0)) {
                        int i3 = Stub.f0a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1a;
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            /* renamed from: n2 */
            public void mo32n2(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f1a.transact(5, obtain, obtain2, 0)) {
                        int i2 = Stub.f0a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            /* renamed from: u2 */
            public void mo33u2(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f1a.transact(4, obtain, obtain2, 0)) {
                        int i2 = Stub.f0a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            /* renamed from: w0 */
            public Bundle mo34w0(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f1a.transact(7, obtain, obtain2, 0)) {
                        int i2 = Stub.f0a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            /* renamed from: w2 */
            public void mo35w2(int i2, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i2);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f1a.transact(6, obtain, obtain2, 0)) {
                        int i3 = Stub.f0a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        /* renamed from: i */
        public static ICustomTabsCallback m36i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICustomTabsCallback)) ? new Proxy(iBinder) : (ICustomTabsCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            switch (i2) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo31R1(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo30C1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo33u2(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo32n2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo35w2(parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    Bundle mo34w0 = mo34w0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (mo34w0 != null) {
                        parcel2.writeInt(1);
                        mo34w0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    /* renamed from: C1 */
    void mo30C1(String str, Bundle bundle) throws RemoteException;

    /* renamed from: R1 */
    void mo31R1(int i2, Bundle bundle) throws RemoteException;

    /* renamed from: n2 */
    void mo32n2(String str, Bundle bundle) throws RemoteException;

    /* renamed from: u2 */
    void mo33u2(Bundle bundle) throws RemoteException;

    /* renamed from: w0 */
    Bundle mo34w0(String str, Bundle bundle) throws RemoteException;

    /* renamed from: w2 */
    void mo35w2(int i2, Uri uri, boolean z, Bundle bundle) throws RemoteException;
}
