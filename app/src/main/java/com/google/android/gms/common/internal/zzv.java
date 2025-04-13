package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzv extends com.google.android.gms.internal.common.zza implements IAccountAccessor {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    /* renamed from: w */
    public final Account mo8085w() throws RemoteException {
        Parcel m8542i = m8542i(2, m8543q());
        Account account = (Account) com.google.android.gms.internal.common.zzc.m8558a(m8542i, Account.CREATOR);
        m8542i.recycle();
        return account;
    }
}
