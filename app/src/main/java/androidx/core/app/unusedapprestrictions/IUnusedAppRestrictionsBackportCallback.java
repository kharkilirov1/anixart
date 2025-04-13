package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportCallback extends IInterface {

    public static class Default implements IUnusedAppRestrictionsBackportCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {

        public static class Proxy implements IUnusedAppRestrictionsBackportCallback {

            /* renamed from: a */
            public IBinder f3285a;

            public Proxy(IBinder iBinder) {
                this.f3285a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3285a;
            }
        }

        public Stub() {
            attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                mo1663Y1(parcel.readInt() != 0, parcel.readInt() != 0);
                throw null;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            return true;
        }
    }

    /* renamed from: Y1 */
    void mo1663Y1(boolean z, boolean z2) throws RemoteException;
}
