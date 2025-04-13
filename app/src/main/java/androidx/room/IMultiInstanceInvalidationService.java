package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public interface IMultiInstanceInvalidationService extends IInterface {

    public static class Default implements IMultiInstanceInvalidationService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        /* renamed from: q2 */
        public void mo4056q2(int i2, String[] strArr) throws RemoteException {
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        /* renamed from: s0 */
        public int mo4057s0(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) throws RemoteException {
            return 0;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        /* renamed from: z2 */
        public void mo4058z2(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationService {

        /* renamed from: a */
        public static final /* synthetic */ int f5774a = 0;

        public static class Proxy implements IMultiInstanceInvalidationService {

            /* renamed from: a */
            public IBinder f5775a;

            public Proxy(IBinder iBinder) {
                this.f5775a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5775a;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            /* renamed from: q2 */
            public void mo4056q2(int i2, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i2);
                    obtain.writeStringArray(strArr);
                    if (!this.f5775a.transact(3, obtain, null, 1)) {
                        int i3 = Stub.f5774a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            /* renamed from: s0 */
            public int mo4057s0(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(iMultiInstanceInvalidationCallback != null ? iMultiInstanceInvalidationCallback.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.f5775a.transact(1, obtain, obtain2, 0)) {
                        int i2 = Stub.f5774a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            /* renamed from: z2 */
            public void mo4058z2(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(iMultiInstanceInvalidationCallback != null ? iMultiInstanceInvalidationCallback.asBinder() : null);
                    obtain.writeInt(i2);
                    if (!this.f5775a.transact(2, obtain, obtain2, 0)) {
                        int i3 = Stub.f5774a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int mo4057s0 = ((MultiInstanceInvalidationService.BinderC05532) this).mo4057s0(IMultiInstanceInvalidationCallback.Stub.m4055i(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(mo4057s0);
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                ((MultiInstanceInvalidationService.BinderC05532) this).mo4058z2(IMultiInstanceInvalidationCallback.Stub.m4055i(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i2 != 3) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.BinderC05532) this).mo4056q2(parcel.readInt(), parcel.createStringArray());
            return true;
        }
    }

    /* renamed from: q2 */
    void mo4056q2(int i2, String[] strArr) throws RemoteException;

    /* renamed from: s0 */
    int mo4057s0(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) throws RemoteException;

    /* renamed from: z2 */
    void mo4058z2(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) throws RemoteException;
}
