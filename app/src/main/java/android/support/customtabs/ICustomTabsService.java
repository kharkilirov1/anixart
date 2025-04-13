package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import java.util.List;

/* loaded from: classes.dex */
public interface ICustomTabsService extends IInterface {

    public static class Default implements ICustomTabsService {
        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: Q0 */
        public boolean mo40Q0(long j2) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ICustomTabsService {

        /* renamed from: a */
        public static final /* synthetic */ int f2a = 0;

        public static class Proxy implements ICustomTabsService {

            /* renamed from: a */
            public IBinder f3a;

            @Override // android.support.customtabs.ICustomTabsService
            /* renamed from: Q0 */
            public boolean mo40Q0(long j2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j2);
                    if (!this.f3a.transact(2, obtain, obtain2, 0)) {
                        int i2 = Stub.f2a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3a;
            }
        }

        public Stub() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsService");
                return true;
            }
            switch (i2) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean mo40Q0 = mo40Q0(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo40Q0 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean mo45w1 = mo45w1(ICustomTabsCallback.Stub.m36i(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(mo45w1 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean mo38P = mo38P(ICustomTabsCallback.Stub.m36i(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(mo38P ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    Bundle mo47z0 = mo47z0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (mo47z0 != null) {
                        parcel2.writeInt(1);
                        mo47z0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean mo39P1 = mo39P1(ICustomTabsCallback.Stub.m36i(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo39P1 ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean mo42U1 = mo42U1(ICustomTabsCallback.Stub.m36i(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo42U1 ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    int mo44s1 = mo44s1(ICustomTabsCallback.Stub.m36i(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo44s1);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean mo41S = mo41S(ICustomTabsCallback.Stub.m36i(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo41S ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean mo37B1 = mo37B1(ICustomTabsCallback.Stub.m36i(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo37B1 ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean mo46y1 = mo46y1(ICustomTabsCallback.Stub.m36i(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo46y1 ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean mo43f0 = mo43f0(ICustomTabsCallback.Stub.m36i(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo43f0 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    /* renamed from: B1 */
    boolean mo37B1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

    /* renamed from: P */
    boolean mo38P(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* renamed from: P1 */
    boolean mo39P1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

    /* renamed from: Q0 */
    boolean mo40Q0(long j2) throws RemoteException;

    /* renamed from: S */
    boolean mo41S(ICustomTabsCallback iCustomTabsCallback, int i2, Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: U1 */
    boolean mo42U1(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException;

    /* renamed from: f0 */
    boolean mo43f0(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i2, Bundle bundle) throws RemoteException;

    /* renamed from: s1 */
    int mo44s1(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException;

    /* renamed from: w1 */
    boolean mo45w1(ICustomTabsCallback iCustomTabsCallback) throws RemoteException;

    /* renamed from: y1 */
    boolean mo46y1(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: z0 */
    Bundle mo47z0(String str, Bundle bundle) throws RemoteException;
}
