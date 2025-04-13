package com.google.android.gms.internal.p040authapiphone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    @Override // com.google.android.gms.internal.p040authapiphone.zzb
    /* renamed from: i */
    public final boolean mo8317i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        TaskUtil.m8010a((Status) zzc.m8318a(parcel, Status.CREATOR), Boolean.valueOf(parcel.readInt() != 0), ((zzq) this).f16003a);
        return true;
    }
}
