package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    /* renamed from: i */
    public final boolean mo7832i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            int i4 = com.google.android.gms.internal.auth.zzc.f16060a;
            mo7833W0(parcel.readInt() != 0);
        } else {
            mo7834g2((Account) com.google.android.gms.internal.auth.zzc.m8337a(parcel, Account.CREATOR));
        }
        return true;
    }
}
