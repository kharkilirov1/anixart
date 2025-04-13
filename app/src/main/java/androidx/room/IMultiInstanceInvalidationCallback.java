package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationClient;

/* loaded from: classes.dex */
public interface IMultiInstanceInvalidationCallback extends IInterface {

    public static class Default implements IMultiInstanceInvalidationCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationCallback
        /* renamed from: b0 */
        public void mo4054b0(String[] strArr) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationCallback {

        /* renamed from: a */
        public static final /* synthetic */ int f5772a = 0;

        public static class Proxy implements IMultiInstanceInvalidationCallback {

            /* renamed from: a */
            public IBinder f5773a;

            public Proxy(IBinder iBinder) {
                this.f5773a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5773a;
            }

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            /* renamed from: b0 */
            public void mo4054b0(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (!this.f5773a.transact(1, obtain, null, 1)) {
                        int i2 = Stub.f5772a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: i */
        public static IMultiInstanceInvalidationCallback m4055i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) ? new Proxy(iBinder) : (IMultiInstanceInvalidationCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 != 1) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            ((MultiInstanceInvalidationClient.BinderC05471) this).mo4054b0(parcel.createStringArray());
            return true;
        }
    }

    /* renamed from: b0 */
    void mo4054b0(String[] strArr) throws RemoteException;
}
