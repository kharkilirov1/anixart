package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.p007a.BinderC0895b;
import com.google.android.p007a.C0894a;
import com.google.android.p007a.C0896c;

/* loaded from: classes.dex */
public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends BinderC0895b implements IGetInstallReferrerService {

        /* renamed from: a */
        public static final /* synthetic */ int f15004a = 0;

        public static class Proxy extends C0894a implements IGetInstallReferrerService {
            public Proxy(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            /* renamed from: E0 */
            public final Bundle mo7829E0(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i2 = C0896c.f8946a;
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                obtain = Parcel.obtain();
                try {
                    this.f8945a.transact(1, obtain, obtain, 0);
                    obtain.readException();
                    obtain.recycle();
                    return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
                } catch (RuntimeException e2) {
                    throw e2;
                } finally {
                    obtain.recycle();
                }
            }
        }

        @Override // com.google.android.p007a.BinderC0895b
        /* renamed from: i */
        public final boolean mo5395i(int i2, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i2 != 1) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i3 = C0896c.f8946a;
            Bundle mo7829E0 = mo7829E0((Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel)));
            parcel2.writeNoException();
            if (mo7829E0 == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                mo7829E0.writeToParcel(parcel2, 1);
            }
            return true;
        }
    }

    /* renamed from: E0 */
    Bundle mo7829E0(Bundle bundle) throws RemoteException;
}
