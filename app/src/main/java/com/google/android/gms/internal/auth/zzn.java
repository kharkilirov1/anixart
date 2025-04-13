package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public abstract class zzn extends zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    /* renamed from: i */
    public final boolean mo7832i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 2) {
            return false;
        }
        zzab.m8332e((Status) zzc.m8337a(parcel, Status.CREATOR), (Bundle) zzc.m8337a(parcel, Bundle.CREATOR), ((zzw) this).f16203a);
        return true;
    }
}
