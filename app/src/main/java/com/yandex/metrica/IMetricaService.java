package com.yandex.metrica;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface IMetricaService extends IInterface {
    /* renamed from: a */
    void mo17765a(int i2, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo17766a(Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo17767b(Bundle bundle) throws RemoteException;

    void reportData(Bundle bundle) throws RemoteException;

    /* renamed from: com.yandex.metrica.IMetricaService$a */
    public static abstract class AbstractBinderC3080a extends Binder implements IMetricaService {

        /* renamed from: a */
        public static final /* synthetic */ int f42244a = 0;

        public AbstractBinderC3080a() {
            attachInterface(this, "com.yandex.metrica.IMetricaService");
        }

        /* renamed from: i */
        public static IMetricaService m17768i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.metrica.IMetricaService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMetricaService)) ? new a(iBinder) : (IMetricaService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString("com.yandex.metrica.IMetricaService");
                return true;
            }
            if (i2 == 1) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f42246d.mo17870a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f42246d.reportData(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i2 == 3) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f42246d.mo17873b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i2 == 4) {
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                MetricaService.f42246d.mo17867a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i2 != 5) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
            MetricaService.f42246d.mo17863a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }

        /* renamed from: com.yandex.metrica.IMetricaService$a$a */
        public static class a implements IMetricaService {

            /* renamed from: a */
            public IBinder f42245a;

            public a(IBinder iBinder) {
                this.f42245a = iBinder;
            }

            @Override // com.yandex.metrica.IMetricaService
            /* renamed from: a */
            public void mo17766a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f42245a.transact(4, obtain, null, 1)) {
                        int i2 = AbstractBinderC3080a.f42244a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f42245a;
            }

            @Override // com.yandex.metrica.IMetricaService
            /* renamed from: b */
            public void mo17767b(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f42245a.transact(3, obtain, null, 1)) {
                        int i2 = AbstractBinderC3080a.f42244a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.yandex.metrica.IMetricaService
            public void reportData(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f42245a.transact(2, obtain, null, 1)) {
                        int i2 = AbstractBinderC3080a.f42244a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.yandex.metrica.IMetricaService
            /* renamed from: a */
            public void mo17765a(int i2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f42245a.transact(5, obtain, null, 1)) {
                        int i3 = AbstractBinderC3080a.f42244a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
