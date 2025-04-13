package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.yandex.metrica.identifiers.impl.t */
/* loaded from: classes2.dex */
class C3151t implements InterfaceC3153v {

    /* renamed from: a */
    public IBinder f42510a;

    public C3151t(IBinder iBinder) {
        this.f42510a = iBinder;
    }

    @Override // com.yandex.metrica.identifiers.impl.InterfaceC3153v
    /* renamed from: a */
    public String mo17801a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f42510a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f42510a;
    }

    @Override // com.yandex.metrica.identifiers.impl.InterfaceC3153v
    /* renamed from: c */
    public boolean mo17802c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f42510a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
