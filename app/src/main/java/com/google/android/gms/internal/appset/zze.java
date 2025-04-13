package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public abstract class zze extends zzb implements zzf {
    @Override // com.google.android.gms.internal.appset.zzb
    /* renamed from: i */
    public final boolean mo8310i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i4 = zzc.f15981a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        com.google.android.gms.appset.zzc createFromParcel2 = parcel.readInt() == 0 ? null : com.google.android.gms.appset.zzc.CREATOR.createFromParcel(parcel);
        TaskUtil.m8010a(createFromParcel, createFromParcel2 != null ? new AppSetIdInfo(createFromParcel2.f15014b, createFromParcel2.f15015c) : null, ((zzo) this).f15990a);
        return true;
    }
}
