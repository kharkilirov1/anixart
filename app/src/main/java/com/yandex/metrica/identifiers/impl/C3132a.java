package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.yandex.metrica.identifiers.impl.a */
/* loaded from: classes2.dex */
class C3132a implements InterfaceC3134c {

    /* renamed from: a */
    public IBinder f42484a;

    public C3132a(IBinder iBinder) {
        this.f42484a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f42484a;
    }

    @Override // com.yandex.metrica.identifiers.impl.InterfaceC3134c
    /* renamed from: b */
    public String mo17795b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            if (!this.f42484a.transact(1, obtain, obtain2, 0)) {
                int i2 = AbstractBinderC3133b.f42485a;
            }
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.yandex.metrica.identifiers.impl.InterfaceC3134c
    /* renamed from: d */
    public boolean mo17796d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            if (!this.f42484a.transact(2, obtain, obtain2, 0)) {
                int i2 = AbstractBinderC3133b.f42485a;
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
