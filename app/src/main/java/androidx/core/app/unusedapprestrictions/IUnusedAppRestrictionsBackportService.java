package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

/* loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportService extends IInterface {

    public static class Default implements IUnusedAppRestrictionsBackportService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        /* renamed from: t0 */
        public void mo1664t0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {

        /* renamed from: a */
        public static final /* synthetic */ int f3286a = 0;

        public static class Proxy implements IUnusedAppRestrictionsBackportService {

            /* renamed from: a */
            public IBinder f3287a;

            public Proxy(IBinder iBinder) {
                this.f3287a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3287a;
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            /* renamed from: t0 */
            public void mo1664t0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
                    obtain.writeStrongBinder(iUnusedAppRestrictionsBackportCallback.asBinder());
                    if (!this.f3287a.transact(1, obtain, null, 1)) {
                        int i2 = Stub.f3286a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        }

        /* renamed from: i */
        public static IUnusedAppRestrictionsBackportService m1665i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUnusedAppRestrictionsBackportService)) ? new Proxy(iBinder) : (IUnusedAppRestrictionsBackportService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            IUnusedAppRestrictionsBackportCallback proxy;
            if (i2 != 1) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
                return true;
            }
            parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                proxy = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                proxy = (queryLocalInterface == null || !(queryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback)) ? new IUnusedAppRestrictionsBackportCallback.Stub.Proxy(readStrongBinder) : (IUnusedAppRestrictionsBackportCallback) queryLocalInterface;
            }
            mo1664t0(proxy);
            return true;
        }
    }

    /* renamed from: t0 */
    void mo1664t0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws RemoteException;
}
