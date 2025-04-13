package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zac extends zaf {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: l */
    public final void mo7881l(zah zahVar) throws RemoteException {
        zal zalVar = (zal) zahVar.m8111y();
        zad zadVar = new zad(this);
        Parcel m8534i = zalVar.m8534i();
        com.google.android.gms.internal.base.zac.m8538c(m8534i, zadVar);
        try {
            zalVar.f16207a.transact(1, m8534i, null, 1);
        } finally {
            m8534i.recycle();
        }
    }
}
