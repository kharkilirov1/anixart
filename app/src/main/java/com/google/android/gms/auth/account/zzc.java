package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzc extends com.google.android.gms.internal.auth.zza implements zze {
    public zzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.zze
    /* renamed from: V1 */
    public final void mo7835V1(boolean z) throws RemoteException {
        Parcel m8329i = m8329i();
        int i2 = com.google.android.gms.internal.auth.zzc.f16060a;
        m8329i.writeInt(z ? 1 : 0);
        m8330q(1, m8329i);
    }

    @Override // com.google.android.gms.auth.account.zze
    /* renamed from: c2 */
    public final void mo7836c2(zzb zzbVar, String str) throws RemoteException {
        Parcel m8329i = m8329i();
        com.google.android.gms.internal.auth.zzc.m8339c(m8329i, zzbVar);
        m8329i.writeString(null);
        m8330q(2, m8329i);
    }

    @Override // com.google.android.gms.auth.account.zze
    /* renamed from: j2 */
    public final void mo7837j2(zzb zzbVar, Account account) throws RemoteException {
        Parcel m8329i = m8329i();
        com.google.android.gms.internal.auth.zzc.m8339c(m8329i, zzbVar);
        com.google.android.gms.internal.auth.zzc.m8338b(m8329i, null);
        m8330q(3, m8329i);
    }
}
