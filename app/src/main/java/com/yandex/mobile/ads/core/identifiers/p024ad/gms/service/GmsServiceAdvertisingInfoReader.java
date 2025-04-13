package com.yandex.mobile.ads.core.identifiers.p024ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.n60;

/* loaded from: classes2.dex */
class GmsServiceAdvertisingInfoReader implements InterfaceC4658a, IInterface {

    /* renamed from: a */
    @NonNull
    private final IBinder f47799a;

    public GmsServiceAdvertisingInfoReader(@NonNull IBinder iBinder) {
        this.f47799a = iBinder;
    }

    @Override // android.os.IInterface
    @NonNull
    public IBinder asBinder() {
        return this.f47799a;
    }

    @Override // com.yandex.mobile.ads.core.identifiers.p024ad.gms.service.InterfaceC4658a
    @Nullable
    public Boolean readAdTrackingLimited() {
        Boolean bool;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean z = true;
            obtain.writeInt(1);
            this.f47799a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } catch (Throwable th) {
            try {
                n60.m26808a(th, "Exception during advertising if usage flag read from GMS service", new Object[0]);
                bool = null;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        return bool;
    }

    @Override // com.yandex.mobile.ads.core.identifiers.p024ad.gms.service.InterfaceC4658a
    @Nullable
    public String readAdvertisingId() {
        String str;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f47799a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            str = obtain2.readString();
        } catch (Throwable th) {
            try {
                n60.m26808a(th, "Exception during advertising id read from GMS service", new Object[0]);
                str = null;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        return str;
    }
}
