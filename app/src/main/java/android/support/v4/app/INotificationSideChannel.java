package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface INotificationSideChannel extends IInterface {

    public static class Default implements INotificationSideChannel {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        /* renamed from: p1 */
        public void mo60p1(String str, int i2, String str2) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        /* renamed from: q0 */
        public void mo61q0(String str) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        /* renamed from: v2 */
        public void mo62v2(String str, int i2, String str2, Notification notification) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INotificationSideChannel {

        /* renamed from: a */
        public static final /* synthetic */ int f8a = 0;

        public static class Proxy implements INotificationSideChannel {

            /* renamed from: a */
            public IBinder f9a;

            public Proxy(IBinder iBinder) {
                this.f9a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9a;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            /* renamed from: p1 */
            public void mo60p1(String str, int i2, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (!this.f9a.transact(2, obtain, null, 1)) {
                        int i3 = Stub.f8a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            /* renamed from: q0 */
            public void mo61q0(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (!this.f9a.transact(3, obtain, null, 1)) {
                        int i2 = Stub.f8a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            /* renamed from: v2 */
            public void mo62v2(String str, int i2, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(null);
                    obtain.writeInt(i2);
                    obtain.writeString(null);
                    obtain.writeInt(0);
                    if (!this.f9a.transact(1, obtain, null, 1)) {
                        int i3 = Stub.f8a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "android.support.v4.app.INotificationSideChannel");
        }

        /* renamed from: i */
        public static INotificationSideChannel m63i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) ? new Proxy(iBinder) : (INotificationSideChannel) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo62v2(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo60p1(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            }
            if (i2 == 3) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo61q0(parcel.readString());
                return true;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("android.support.v4.app.INotificationSideChannel");
            return true;
        }
    }

    /* renamed from: p1 */
    void mo60p1(String str, int i2, String str2) throws RemoteException;

    /* renamed from: q0 */
    void mo61q0(String str) throws RemoteException;

    /* renamed from: v2 */
    void mo62v2(String str, int i2, String str2, Notification notification) throws RemoteException;
}
